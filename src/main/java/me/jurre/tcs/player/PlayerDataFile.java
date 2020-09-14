package me.jurre.tcs.player;

import me.jurre.tcs.Tcs;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class PlayerDataFile {

    private final Tcs plugin;
    private static File file;
    private static FileConfiguration fileConfiguration;

    public PlayerDataFile(Tcs plugin) {
        this.plugin = plugin;
    }

    public void setup() {
        file = new File(plugin.getDataFolder(), "player-data.yml");

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                plugin.getServer().getConsoleSender().sendMessage("§4ERROR: Couldn't create player-data file!");
            }
        }

        fileConfiguration = YamlConfiguration.loadConfiguration(file);
    }

    public File getFile() {
        return file;
    }

    public FileConfiguration getFileConfiguration() {
        return fileConfiguration;
    }

    public void save() {
        try {
            fileConfiguration.save(file);
        } catch (IOException e) {
            plugin.getServer().getConsoleSender().sendMessage("§4ERROR: Couldn't save player-data file!");
        }
    }

    public void reload() {
        fileConfiguration = YamlConfiguration.loadConfiguration(file);
    }

    public boolean containsData(UUID uuid) {
        return fileConfiguration.getKeys(false).contains(uuid.toString());
    }

    public TcsPlayer getTcsPlayerData(Player player) {
        UUID uuid = player.getUniqueId();
        TcsPlayer tcsPlayer = new TcsPlayer(player, plugin);

        if (fileConfiguration.getConfigurationSection(uuid.toString()).contains("donator") && fileConfiguration.getConfigurationSection(uuid.toString()).contains("coins")) {
            tcsPlayer.setCoins(fileConfiguration.getConfigurationSection(uuid.toString()).getInt(".coins"));
            tcsPlayer.setDonator(fileConfiguration.getConfigurationSection(uuid.toString()).getBoolean(".donator"));
            tcsPlayer.setNickname(fileConfiguration.getConfigurationSection(uuid.toString()).getString(".nickname"));
        }

        return tcsPlayer;
    }

    public TcsPlayer createPlayerData(Player player) {
        UUID uuid = player.getUniqueId();
        if (!containsData(uuid)) {
            fileConfiguration.set(uuid.toString() + ".name", player.getName());
            fileConfiguration.set(uuid.toString() + ".coins", 0);
            fileConfiguration.set(uuid.toString() + ".donator", false);
            fileConfiguration.set(uuid.toString() + ".nickname", null);

            TcsPlayer tcsPlayer = new TcsPlayer(player, plugin);
            tcsPlayer.setCoins(0);
            tcsPlayer.setDonator(false);
            tcsPlayer.setNickname(null);
            save();
            return tcsPlayer;
        } else {
            return getTcsPlayerData(player);
        }
    }

    public void savePlayerData(Player player, TcsPlayer tcsPlayer) {
        UUID uuid = player.getUniqueId();
        fileConfiguration.set(uuid.toString() + ".name", player.getName());
        fileConfiguration.set(uuid.toString() + ".coins", tcsPlayer.getCoins());
        fileConfiguration.set(uuid.toString() + ".donator", tcsPlayer.isDonator());
        fileConfiguration.set(uuid.toString() + ".nickname", tcsPlayer.getNickname());

        save();
    }
}