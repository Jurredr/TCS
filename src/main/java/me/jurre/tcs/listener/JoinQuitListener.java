package me.jurre.tcs.listener;

import me.jurre.tcs.Tcs;
import me.jurre.tcs.player.TcsPlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import java.util.UUID;

public class JoinQuitListener implements Listener {

    private Tcs plugin;

    public JoinQuitListener(Tcs plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player player = e.getPlayer();
        UUID uuid = player.getUniqueId();

        if (player.hasPlayedBefore()) {
            e.setJoinMessage("§8[§a+§8] §7" + player.getDisplayName());
        } else {
            e.setJoinMessage("§8[§a+§8] §7Welcome to the TCS server for the first time §a" + player.getDisplayName() + "§7!");
        }

        if (plugin.getPlayerDataFile().containsData(uuid)) {
            TcsPlayer tcsPlayer = plugin.getPlayerDataFile().getTcsPlayerData(player);
            plugin.getPlayerDataManager().addOnlineTcsPlayer(uuid, tcsPlayer);
        } else {
            TcsPlayer tcsPlayer = plugin.getPlayerDataFile().createPlayerData(player);
            plugin.getPlayerDataManager().addOnlineTcsPlayer(uuid, tcsPlayer);
        }
    }

    @EventHandler
    public void onQuit(PlayerQuitEvent e) {
        Player player = e.getPlayer();
        e.setQuitMessage("§8[§c-§8] §7" + player.getDisplayName());

        if (plugin.getPlayerDataManager().isOnlineTcsPlayer(player.getUniqueId())) {
            plugin.getPlayerDataManager().onPlayerQuit(player);
        } else {
            plugin.getServer().getConsoleSender().sendMessage("§4ERROR: Couldn't save player-data for player " + player.getName() + "!");
        }
    }
}