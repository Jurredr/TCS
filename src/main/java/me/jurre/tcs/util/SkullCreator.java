package me.jurre.tcs.util;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import org.bukkit.Bukkit;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.net.URL;
import java.util.Base64;
import java.util.UUID;


public class SkullCreator {

    private static class Skin {
        public final UUID uuid;
        public final String uuidTrimmed;
        public final String name;
        public final String textureValue;

        private Skin(UUID uuid, String uuidTrimmed, String name, String textureValue) {
            this.uuid = uuid;
            this.uuidTrimmed = uuidTrimmed;
            this.name = name;
            this.textureValue = textureValue;
        }
    }

    private static final JsonParser parser = new JsonParser();

    // Based on https://www.spigotmc.org/threads/how-to-create-heads-with-custom-base64-texture.352562/
    public static void setTexture(ItemStack item, String owner) {
        try {
            Skin skin = fetchSkin(owner);

            // Create a custom GameProfile. This way we can keep the existing metadata and only replace the texture.
            SkullMeta headMeta = (SkullMeta) item.getItemMeta();
            GameProfile profile = new GameProfile(skin.uuid, skin.name);
            profile.getProperties().put("textures", new Property("textures", skin.textureValue));

            Field profileField;
            assert headMeta != null;
            profileField = headMeta.getClass().getDeclaredField("profile");
            profileField.setAccessible(true);
            profileField.set(headMeta, profile);

            item.setItemMeta(headMeta);
        } catch (Exception | AssertionError e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("deprecation")
    private static Skin fetchSkin(String name) throws Exception {
        UUID uuid = Bukkit.getOfflinePlayer(name).getUniqueId();

        // Get Player
        String player = fetchPlayer(uuid);
        JsonObject playerObject = parser.parse(player).getAsJsonObject();

        String uuidTrimmed = playerObject.get("id").getAsString();

        // Remove "timestamp" from texture, as this will change the nbt after each reload
        String skinTexture = playerObject.get("properties").getAsJsonArray().get(0).getAsJsonObject().get("value").getAsString();
        String skinDecoded = new String(Base64.getDecoder().decode(skinTexture));
        JsonObject skinObject = parser.parse(skinDecoded).getAsJsonObject();
        skinObject.remove("timestamp");

        String textureValue = Base64.getEncoder().encodeToString(skinObject.toString().getBytes());

        return new Skin(uuid, uuidTrimmed, name, textureValue);
    }

    // Based on https://www.spigotmc.org/threads/offlineplayer-game-profile.234998/#post-2373355
    private static String fetchPlayer(UUID uuid) throws Exception {
        URL url = new URL("https://sessionserver.mojang.com/session/minecraft/profile/" + uuid);
        HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();

        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));

        StringBuilder allLines = new StringBuilder();
        String inputLine;
        while ((inputLine = br.readLine()) != null) {
            allLines.append(inputLine);
        }
        br.close();

        if (allLines.length() > 0) {
            return allLines.toString();
        } else {
            throw new Exception("Player not found");
        }
    }
}
