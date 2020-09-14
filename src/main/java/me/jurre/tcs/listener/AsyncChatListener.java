package me.jurre.tcs.listener;

import me.jurre.tcs.Tcs;
import me.jurre.tcs.player.TcsPlayer;
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

    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent e) {
        Player player = e.getPlayer();
        Location location = player.getLocation();

        if (!plugin.getPlayerDataManager().isOnlineTcsPlayer(player.getUniqueId())) {
            plugin.getServer().getConsoleSender().sendMessage("§cInvalid TCS player tried to chat!");
        }
        TcsPlayer tcsPlayer = plugin.getPlayerDataManager().getOnlineTcsPlayer(player.getUniqueId());

        String nameToUse;
        if (tcsPlayer.hasNickname()) {
            nameToUse = "~" + tcsPlayer.getNickname();
        } else {
            nameToUse = player.getName();
        }

        if (tcsPlayer.isDonator()) {
            e.setFormat("§8[§e§l⭐§8] §7" + nameToUse + ": §r%2$s");
        } else {
            e.setFormat("§7" + nameToUse + ": §r%2$s");
        }

        if (e.getMessage().contains("@coords")) {
            e.setMessage(e.getMessage().replace("@coords", ChatColor.YELLOW + "" + location.getBlockX() + ", " + location.getBlockY()
                    + ", " + location.getBlockZ() + ChatColor.RESET));
        }

        for (Player p : Bukkit.getOnlinePlayers()) {
            if (!plugin.getPlayerDataManager().isOnlineTcsPlayer(p.getUniqueId())) {
                plugin.getServer().getConsoleSender().sendMessage("§cInvalid TCS player tried to chat!");
            }
            TcsPlayer tcsPlayer2 = plugin.getPlayerDataManager().getOnlineTcsPlayer(p.getUniqueId());

            if ((e.getMessage().contains(p.getName()) || (tcsPlayer2.hasNickname() && e.getMessage().contains(tcsPlayer2.getNickname()))) && player != p) {
                p.playSound(p.getLocation(), Sound.BLOCK_NOTE_BLOCK_PLING, 1.0F, 12.0F);

                e.getRecipients().remove(p);

                String personalizedMessage = e.getMessage().replace(p.getName(), ChatColor.YELLOW + p.getName() + ChatColor.RESET);
                if (tcsPlayer2.hasNickname()) {
                    personalizedMessage = personalizedMessage.replace(tcsPlayer2.getNickname(), ChatColor.YELLOW + tcsPlayer2.getNickname() + ChatColor.RESET);
                }

                if (tcsPlayer.isDonator()) {
                    p.sendMessage("§8[§e§l⭐§8] §7" + nameToUse + ":§r " + personalizedMessage);
                } else {
                    p.sendMessage("§7" + nameToUse + ":§r " + personalizedMessage);
                }
            }
        }
    }
}