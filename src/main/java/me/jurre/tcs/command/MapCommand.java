package me.jurre.tcs.command;

import me.jurre.tcs.Tcs;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;
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

        TextComponent message = new TextComponent( "§7View the Dynmap here: ");
        TextComponent messageClick = new TextComponent("§f§nhttp://51.254.149.249:8189/");
        messageClick.setClickEvent( new ClickEvent( ClickEvent.Action.OPEN_URL, "http://51.254.149.249:8189/" ) );
        message.addExtra(messageClick);
        player.spigot().sendMessage(message);
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