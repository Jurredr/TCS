package me.jurre.tcs.command;

import me.jurre.tcs.Tcs;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class MapCommand implements TabExecutor {

    private Tcs plugin;

    public MapCommand(Tcs plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        player.sendMessage("§7View the Dynmap here here: §f§nhttp://51.254.149.249:8189/");
        return true;
    }


    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        for (String ignored : args) {
            return new ArrayList<>();
        }
        return null;
    }
}