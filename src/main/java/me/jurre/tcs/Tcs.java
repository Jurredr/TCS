package me.jurre.tcs;

import me.jurre.tcs.command.DonatorCommand;
import me.jurre.tcs.command.NicknameCommand;
import me.jurre.tcs.customfeature.CustomItems;
import me.jurre.tcs.customfeature.CustomRecipes;
import me.jurre.tcs.listener.*;
import me.jurre.tcs.player.PlayerDataFile;
import me.jurre.tcs.player.PlayerDataManager;
import me.jurre.tcs.player.TcsPlayer;
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

    private PlayerDataFile playerDataFile;
    private PlayerDataManager playerDataManager;
    private CustomItems customItems;
    private CustomRecipes customRecipes;

    public PlayerDataFile getPlayerDataFile() {
        return playerDataFile;
    }
    public PlayerDataManager getPlayerDataManager() {
        return playerDataManager;
    }
    public CustomItems getCustomItems() {
        return customItems;
    }
    public CustomRecipes getCustomRecipes() {
        return customRecipes;
    }

    @Override
    public void onEnable() {
        getConfig().options().copyDefaults(true);
        saveConfig();

        this.playerDataFile = new PlayerDataFile(this);
        playerDataFile.setup();

        this.playerDataManager = new PlayerDataManager(this);

        registerEvents();
        registerCommands();

        this.customItems = new CustomItems(this);

        this.customRecipes = new CustomRecipes(this);
        customRecipes.loadRecipes();

        for (Player player : Bukkit.getOnlinePlayers()) {
            TcsPlayer tcsPlayer = getPlayerDataFile().getTcsPlayerData(player);
            getPlayerDataManager().addOnlineTcsPlayer(player.getUniqueId(), tcsPlayer);
        }

        getServer().getConsoleSender().sendMessage("[TCS] Plugin successfully enabled!");

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

    private void registerEvents() {
        getServer().getPluginManager().registerEvents(new DeathListener(), this);
        getServer().getPluginManager().registerEvents(new JoinQuitListener(this), this);
        getServer().getPluginManager().registerEvents(new AsyncChatListener(this), this);
        getServer().getPluginManager().registerEvents(new MonsterKillListener(this), this);
        getServer().getPluginManager().registerEvents(new ServerListPingListener(), this);
    }

    private void registerCommands() {
        getCommand("donator").setExecutor(new DonatorCommand(this));
        getCommand("nickname").setExecutor(new NicknameCommand(this));
    }

    @Override
    public void onDisable() {
        for (Player player : Bukkit.getOnlinePlayers()) {
            if (playerDataManager.isOnlineTcsPlayer(player.getUniqueId())) {
                playerDataManager.onPlayerQuit(player);
            }
        }

        getServer().getConsoleSender().sendMessage("[TCS] Plugin has been disabled!");
    }
}