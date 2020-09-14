package me.jurre.tcs.player;

import me.jurre.tcs.Tcs;
import org.bukkit.entity.Player;

public class TcsPlayer {

    private final Tcs plugin;
    private final Player player;

    private String nickname;
    private boolean donator;
    private int coins;

    public TcsPlayer(Player player, Tcs plugin) {
        this.plugin = plugin;
        this.player = player;

        this.donator = false;
        this.coins = 0;
    }

    public Player getPlayer() {
        return player;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public boolean hasNickname() {
        return this.nickname != null;
    }

    public void removeNickname() {
        this.nickname = null;
    }

    public boolean isDonator() {
        return donator;
    }

    public int getCoins() {
        return coins;
    }

    public void setDonator(boolean donator) {
        this.donator = donator;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }

    public void addCoins(int coins) {
        this.coins += coins;
    }

    public void takeCoins(int coins) {
        this.coins -= coins;
    }
}