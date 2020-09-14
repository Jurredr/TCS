package me.jurre.tcs.command;

import me.jurre.tcs.Tcs;
import me.jurre.tcs.player.TcsPlayer;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.entity.Player;
import org.bukkit.util.StringUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DonatorCommand implements TabExecutor {

    private Tcs plugin;

    public DonatorCommand(Tcs plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;

        if (!player.hasPermission("tcs.admin")) {
            player.sendMessage("§cNo permission!");
            return true;
        }

        if (Bukkit.getPlayer(args[0]) == null) {
            player.sendMessage("§cInvalid player!");
            return true;
        }
        Player target = Bukkit.getPlayer(args[0]);

        if (!plugin.getPlayerDataManager().isOnlineTcsPlayer(target.getUniqueId())) {
            player.sendMessage("§cInvalid TCS player!");
            return true;
        }
        TcsPlayer tcsPlayer = plugin.getPlayerDataManager().getOnlineTcsPlayer(target.getUniqueId());

        if (args.length == 1) {
            player.sendMessage("§7Player §f" + target.getName() + " §7has donator flag: §f" + tcsPlayer.isDonator());
            return true;
        } else if (args.length == 2) {
            if (args[1].equalsIgnoreCase("true")) {
                if (tcsPlayer.isDonator()) {
                    player.sendMessage("§cPlayer is already a donator!");
                } else {
                    tcsPlayer.setDonator(true);
                    player.sendMessage("§7Player §f" + target.getName() + " §7is now a donator!");
                }
            } else if (args[1].equalsIgnoreCase("false")) {
                if (!tcsPlayer.isDonator()) {
                    player.sendMessage("§cPlayer is not a donator!");
                } else {
                    tcsPlayer.setDonator(false);
                    player.sendMessage("§7Player §f" + target.getName() + " §7is no longer a donator!");
                }
            } else {
                player.sendMessage("§cInvalid usage!");
            }
            return true;
        } else {
            player.sendMessage("§cInvalid usage!");
            return false;
        }
    }

    private final List<String> COMMANDS = Arrays.asList("true", "false");

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        if (args.length == 1) {
            return StringUtil.copyPartialMatches(args[0], getAllPlayerNames(), new ArrayList<>());
        } else if (args.length == 2 && sender.hasPermission("tcs.admin")) {
            return StringUtil.copyPartialMatches(args[1], COMMANDS, new ArrayList<>());
        } else {
            for (String ignored : args) {
                return new ArrayList<>();
            }
        }
        return null;
    }

    private List<String> getAllPlayerNames() {
        List<String> playerNames = new ArrayList<>();
        Player[] players = new Player[Bukkit.getServer().getOnlinePlayers().size()];
        Bukkit.getServer().getOnlinePlayers().toArray(players);
        for (Player player : players) {
            playerNames.add(player.getName());
        }
        return playerNames;
    }
}