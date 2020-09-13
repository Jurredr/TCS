package me.jurre.tcs.listener;

import me.jurre.tcs.Tcs;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class AsyncChatListener implements Listener {

    private Tcs plugin;

    public AsyncChatListener(Tcs plugin) {
        this.plugin = plugin;
    }

    // TODO: [⭐] Ruitertjes >> for donators

    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent e) {
        Player player = e.getPlayer();
        Location location = player.getLocation();

        e.setFormat("§7" + player.getDisplayName() + ": §r%2$s");

        if (e.getMessage().contains("@coords")) {
            e.setMessage(e.getMessage().replace("@coords", ChatColor.YELLOW + "" + location.getBlockX() + ", " + location.getBlockY()
                    + ", " + location.getBlockZ() + ChatColor.RESET));
        }

        for (Player p : Bukkit.getOnlinePlayers()) {
            if (e.getMessage().contains(p.getName()) && player != p) {
                p.playSound(p.getLocation(), Sound.BLOCK_NOTE_BLOCK_PLING, 1.0F, 12.0F);

                e.getRecipients().remove(p);
                String personalizedMessage = e.getMessage().replace(p.getName(), ChatColor.YELLOW + p.getName() + ChatColor.RESET);
                p.sendMessage("§7" + player.getDisplayName() + ":§r " + personalizedMessage);
            }
        }
    }
}