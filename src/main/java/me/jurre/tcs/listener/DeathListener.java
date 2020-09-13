package me.jurre.tcs.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class DeathListener implements Listener {

    @EventHandler
    public void onDeath(PlayerDeathEvent e) {
        e.setDeathMessage("§8[§c☠§8] §7" + e.getDeathMessage().replace(e.getEntity().getDisplayName(), "§c" + e.getEntity().getDisplayName() + "§7"));
    }
}