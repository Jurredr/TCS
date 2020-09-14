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

public class NicknameCommand implements TabExecutor {

    private Tcs plugin;

    public NicknameCommand(Tcs plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;

        if (!plugin.getPlayerDataManager().isOnlineTcsPlayer(player.getUniqueId())) {
            player.sendMessage("§cTCSPLAYER ERROR, report this to Jurre!");
            return true;
        }
        TcsPlayer tcsPlayer = plugin.getPlayerDataManager().getOnlineTcsPlayer(player.getUniqueId());

        if (!tcsPlayer.isDonator()) {
            player.sendMessage("§cYou have to donate to the server in order to use nicknames!");
            return true;
        }

        if (args.length == 0) {
            if (tcsPlayer.hasNickname()) {
                player.sendMessage("§7You are currently using the nickname: §f" + tcsPlayer.getNickname());
            } else {
                player.sendMessage("§7You currently have no nickname");
            }
            return true;
        } else if (args.length == 1) {
            if (args[0].equalsIgnoreCase("off")) {
                if (tcsPlayer.hasNickname()) {
                    tcsPlayer.removeNickname();
                    player.sendMessage("§7Nickname has been §cdisabled§7!");
                } else {
                    player.sendMessage("§cYou currently have no nickname");
                }
            } else {
                if (args[0].length() <= 32) {
                    tcsPlayer.setNickname(args[0]);
                    player.sendMessage("§7Your nickname is now: §f" + args[0] + "§7!");
                } else {
                    player.sendMessage("§cPlease use <= 32 characters!");
                }
            }
            return true;
        } else {
            player.sendMessage("§cInvalid usage!");
            return false;
        }
    }

    private final List<String> COMMANDS = Arrays.asList("off", "<name>");

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        if (args.length == 1) {
            return StringUtil.copyPartialMatches(args[0], COMMANDS, new ArrayList<>());
        } else {
            for (String ignored : args) {
                return new ArrayList<>();
            }
        }
        return null;
    }
}