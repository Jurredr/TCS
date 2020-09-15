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

        TcsPlayer tcsPlayer;
        if (plugin.getPlayerDataFile().containsData(uuid)) {
            tcsPlayer = plugin.getPlayerDataFile().getTcsPlayerData(player);
            plugin.getPlayerDataManager().addOnlineTcsPlayer(uuid, tcsPlayer);
        } else {
            tcsPlayer = plugin.getPlayerDataFile().createPlayerData(player);
            plugin.getPlayerDataManager().addOnlineTcsPlayer(uuid, tcsPlayer);
        }

        String name = player.getName();
        if (tcsPlayer.hasNickname()) {
            name = player.getName() + " (" + tcsPlayer.getNickname() + ")";
        }

        if (player.hasPlayedBefore()) {
            e.setJoinMessage("§8[§a+§8] §7" + name);
        } else {
            e.setJoinMessage("§8[§a+§8] §7Welcome to the TCS server for the first time §a" + name + "§7!");
        }

    }

    @EventHandler
    public void onQuit(PlayerQuitEvent e) {
        Player player = e.getPlayer();
        String name = player.getName();

        if (plugin.getPlayerDataManager().isOnlineTcsPlayer(player.getUniqueId())) {
            if (plugin.getPlayerDataManager().getOnlineTcsPlayer(player.getUniqueId()).hasNickname()) {
                name = player.getName() + " (" + plugin.getPlayerDataManager().getOnlineTcsPlayer(player.getUniqueId()).getNickname() + ")";
            }

            plugin.getPlayerDataManager().onPlayerQuit(player);
        } else {
            plugin.getServer().getConsoleSender().sendMessage("§4ERROR: Couldn't save player-data for player " + player.getName() + "!");
        }

        e.setQuitMessage("§8[§c-§8] §7" + name);
    }
}