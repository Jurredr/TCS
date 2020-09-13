package me.jurre.tcs.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class JoinQuitListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player player = e.getPlayer();
        if (player.hasPlayedBefore()) {
            e.setJoinMessage("§8[§a+§8] §7" + player.getDisplayName());
        } else {
            e.setJoinMessage("§8[§a+§8] §7Welcome to the TCS server for the first time §a" + player.getDisplayName() + "§7!");
        }
    }

    @EventHandler
    public void onQuit(PlayerQuitEvent e) {
        Player player = e.getPlayer();
        e.setQuitMessage("§8[§c-§8] §7" + player.getDisplayName());
    }
}