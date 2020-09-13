package me.jurre.tcs.util;

import org.bukkit.entity.Player;

public class EyeDirection {

    public static String getCardinalDirection(Player player) {
        double rotation = (player.getLocation().getYaw() - 90.0F) % 360.0F;
        if (rotation < 0.0D) {
            rotation += 360.0D;
        }
        if ((0.0D <= rotation) && (rotation < 22.5D)) {
            return "W";
        }
        if ((22.5D <= rotation) && (rotation < 67.5D)) {
            return "NW";
        }
        if ((67.5D <= rotation) && (rotation < 112.5D)) {
            return "N";
        }
        if ((112.5D <= rotation) && (rotation < 157.5D)) {
            return "NE";
        }
        if ((157.5D <= rotation) && (rotation < 202.5D)) {
            return "E";
        }
        if ((202.5D <= rotation) && (rotation < 247.5D)) {
            return "SE";
        }
        if ((247.5D <= rotation) && (rotation < 292.5D)) {
            return "S";
        }
        if ((292.5D <= rotation) && (rotation < 337.5D)) {
            return "SW";
        }
        if ((337.5D <= rotation) && (rotation < 360.0D)) {
            return "W";
        }
        return null;
    }
}