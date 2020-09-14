package me.jurre.tcs.listener;

import me.jurre.tcs.Tcs;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

import java.util.Random;

public class MonsterKillListener implements Listener {

    private Tcs plugin;

    public MonsterKillListener(Tcs plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onEntityKill(EntityDeathEvent e) {
        EntityType entityType = e.getEntity().getType();

        Random random = new Random();
        float chance = random.nextFloat();

        switch (entityType) {

            // Common
            case PIG:
                if (chance <= 0.05f) {
                    e.getDrops().add(plugin.getCustomItems().pigHead);
                }
                break;
            case COW:
                if (chance <= 0.05f) {
                    e.getDrops().add(plugin.getCustomItems().cowHead);
                }
                break;
            case CHICKEN:
                if (chance <= 0.05f) {
                    e.getDrops().add(plugin.getCustomItems().chickenHead);
                }
                break;
            case SHEEP:
                if (chance <= 0.05f) {
                    e.getDrops().add(plugin.getCustomItems().sheepHead);
                }
                break;
            case SQUID:
                if (chance <= 0.05f) {
                    e.getDrops().add(plugin.getCustomItems().squidHead);
                }
                break;

            // Rare
            case SKELETON:
                if (chance <= 0.03f) {
                    e.getDrops().add(plugin.getCustomItems().skeletonHead);
                }
                break;
            case ZOMBIE:
                if (chance <= 0.03f) {
                    e.getDrops().add(plugin.getCustomItems().zombieHead);
                }
                break;
            case WITCH:
                if (chance <= 0.03f) {
                    e.getDrops().add(plugin.getCustomItems().witchHead);
                }
                break;
            case ENDERMAN:
                if (chance <= 0.01f) {
                    e.getDrops().add(plugin.getCustomItems().endermanHead);
                }
                break;
            case OCELOT:
                if (chance <= 0.03f) {
                    e.getDrops().add(plugin.getCustomItems().ocelotHead);
                }
                break;
            case DROWNED:
                if (chance <= 0.03f) {
                    e.getDrops().add(plugin.getCustomItems().drownedHead);
                }
                break;

            // Epic
            case VILLAGER:
                if (chance <= 0.01f) {
                    e.getDrops().add(plugin.getCustomItems().villagerHead);
                }
                break;
            case SLIME:
                if (chance <= 0.01f) {
                    e.getDrops().add(plugin.getCustomItems().slimeHead);
                }
                break;
            case MAGMA_CUBE:
                if (chance <= 0.01f) {
                    e.getDrops().add(plugin.getCustomItems().magmaCubeHead);
                }
                break;
            case BLAZE:
                if (chance <= 0.01f) {
                    e.getDrops().add(plugin.getCustomItems().blazeHead);
                }
                break;
            case GUARDIAN:
                if (chance <= 0.01f) {
                    e.getDrops().add(plugin.getCustomItems().guardianHead);
                }
                break;
            case CAVE_SPIDER:
                if (chance <= 0.01f) {
                    e.getDrops().add(plugin.getCustomItems().caveSpiderHead);
                }
                break;

            // Legendary
            case ELDER_GUARDIAN:
                if (chance <= 0.003f) {
                    e.getDrops().add(plugin.getCustomItems().elderGuardianHead);
                }
                break;
            case WITHER:
                if (chance <= 0.003f) {
                    e.getDrops().add(plugin.getCustomItems().witherHead);
                }
                break;
            case IRON_GOLEM:
                if (chance <= 0.003f) {
                    e.getDrops().add(plugin.getCustomItems().ironGolemHead);
                }
                break;
            case GHAST:
                if (chance <= 0.003f) {
                    e.getDrops().add(plugin.getCustomItems().ghastHead);
                }
                break;
        }
    }
}