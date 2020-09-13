package me.jurre.tcs;

import me.jurre.tcs.listener.*;
import me.jurre.tcs.util.EyeDirection;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public final class Tcs extends JavaPlugin {

    private CustomItems customItems;

    @Override
    public void onEnable() {
        getServer().getConsoleSender().sendMessage("[TCS] Plugin successfully enabled!");
        registerEvents();

        CustomRecipes customRecipes = new CustomRecipes(this);
        customRecipes.loadRecipes();

        this.customItems = new CustomItems(this);

        new BukkitRunnable() {
            @Override
            public void run() {
                for (Player player : Bukkit.getOnlinePlayers()) {
                    if (player.getInventory().getItemInMainHand().getType() == Material.COMPASS || player.getInventory().getItemInOffHand().getType() == Material.COMPASS) {
                        Date currentTime = new Date();
                        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
                        sdf.setTimeZone(TimeZone.getTimeZone("Europe/Amsterdam"));

                        String message = "§6XYZ: §f" + player.getLocation().getBlockX() + " " + player.getLocation().getBlockY() + " " + player.getLocation().getBlockZ() + "   §6" + EyeDirection.getCardinalDirection(player) + "   §6" + sdf.format(currentTime);
                        player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(message));
                    }
                }
            }
        }.runTaskTimerAsynchronously(this, 0L, 5L);
    }

    public CustomItems getCustomItems() {
        return customItems;
    }

    private void registerEvents() {
        getServer().getPluginManager().registerEvents(new DeathListener(), this);
        getServer().getPluginManager().registerEvents(new JoinQuitListener(), this);
        getServer().getPluginManager().registerEvents(new AsyncChatListener(this), this);
        getServer().getPluginManager().registerEvents(new MonsterKillListener(this), this);
        getServer().getPluginManager().registerEvents(new ServerListPingListener(), this);
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage("[TCS] Plugin has been disabled!");
    }
}