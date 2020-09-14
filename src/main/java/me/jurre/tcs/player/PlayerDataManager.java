package me.jurre.tcs.player;

import me.jurre.tcs.Tcs;
import org.bukkit.entity.Player;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.UUID;

public class PlayerDataManager {
    private final Tcs plugin;

    private HashMap<UUID, TcsPlayer> onlineTcsPlayers;

    public PlayerDataManager(Tcs plugin) {
        this.plugin = plugin;
        onlineTcsPlayers = new HashMap<>();
    }

    public TcsPlayer getOnlineTcsPlayer(UUID uuid) {
        return onlineTcsPlayers.get(uuid);
    }

    public Collection<TcsPlayer> getOnlineTcsPlayers() {
        return onlineTcsPlayers.values();
    }

    public Set<UUID> getOnlineUUIDs() {
        return onlineTcsPlayers.keySet();
    }

    public boolean isOnlineTcsPlayer(UUID uuid) {
        return onlineTcsPlayers.containsKey(uuid);
    }

    public void addOnlineTcsPlayer(UUID uuid, TcsPlayer rpgPlayer) {
        onlineTcsPlayers.put(uuid, rpgPlayer);
    }

    public void clearCurrentDataWithoutSaving(UUID uuid) {
        onlineTcsPlayers.remove(uuid);
    }

    public void onPlayerQuit(Player player) {
        UUID uuid = player.getUniqueId();
        if (isOnlineTcsPlayer(uuid)) {
            plugin.getPlayerDataFile().savePlayerData(player, onlineTcsPlayers.get(uuid));
            onlineTcsPlayers.remove(uuid);
        }
    }
}