package me.jurre.tcs.listener;

import me.jurre.tcs.util.ItemStackBuilder;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.Random;

public class MonsterKillListener implements Listener {

    @EventHandler
    public void onEntityKill(EntityDeathEvent e) {
        EntityType entityType = e.getEntity().getType();

        Random random = new Random();
        float chance = random.nextFloat();

        // Common
        ItemStack pigHead = ItemStackBuilder.buildHead("§ePig Head", new ArrayList() {{
            add("§7The head of a pig.");
            add("§7Rarity: §fCommon");
        }}, "MHF_Pig");

        ItemStack cowHead = ItemStackBuilder.buildHead("§eCow Head", new ArrayList() {{
            add("§7The head of a cow.");
            add("§7Rarity: §fCommon");
        }}, "MHF_Cow");

        ItemStack chickenHead = ItemStackBuilder.buildHead("§eChicken Head", new ArrayList() {{
            add("§7The head of a chicken.");
            add("§7Rarity: §fCommon");
        }}, "MHF_Chicken");

        ItemStack sheepHead = ItemStackBuilder.buildHead("§eSheep Head", new ArrayList() {{
            add("§7The head of a sheep.");
            add("§7Rarity: §fCommon");
        }}, "MHF_Sheep");

        ItemStack squidHead = ItemStackBuilder.buildHead("§eSquid Head", new ArrayList() {{
            add("§7The head of a squid.");
            add("§7Rarity: §fCommon");
        }}, "MHF_Squid");

        // Rare
        ItemStack skeletonHead = ItemStackBuilder.buildHead("§eSkeleton Head", new ArrayList() {{
            add("§7The head of a skeleton.");
            add("§7Rarity: §bRare");
        }}, "MHF_Skeleton");

        ItemStack zombieHead = ItemStackBuilder.buildHead("§eZombie Head", new ArrayList() {{
            add("§7The head of a zombie.");
            add("§7Rarity: §bRare");
        }}, "MHF_Zombie");

        ItemStack witchHead = ItemStackBuilder.buildHead("§eWitch Head", new ArrayList() {{
            add("§7The head of a witch.");
            add("§7Rarity: §bRare");
        }}, "MHF_Witch");

        ItemStack endermanHead = ItemStackBuilder.buildHead("§eEnderman Head", new ArrayList() {{
            add("§7The head of an enderman.");
            add("§7Rarity: §bRare");
        }}, "MHF_Enderman");

        ItemStack ocelotHead = ItemStackBuilder.buildHead("§eOcelot Head", new ArrayList() {{
            add("§7The head of an ocelot.");
            add("§7Rarity: §bRare");
        }}, "MHF_Ocelot");

        // Epic
        ItemStack villagerHead = ItemStackBuilder.buildHead("§eVillager Head", new ArrayList() {{
            add("§7The head of a villager.");
            add("§7Rarity: §5Epic");
        }}, "MHF_Villager");

        ItemStack slimeHead = ItemStackBuilder.buildHead("§eSlime Head", new ArrayList() {{
            add("§7The head of a slime.");
            add("§7Rarity: §5Epic");
        }}, "MHF_Slime");

        ItemStack magmaCubeHead = ItemStackBuilder.buildHead("§eMagma Cube Head", new ArrayList() {{
            add("§7The head of a magma cube.");
            add("§7Rarity: §5Epic");
        }}, "MHF_LavaSlime");

        ItemStack blazeHead = ItemStackBuilder.buildHead("§eBlaze Head", new ArrayList() {{
            add("§7The head of a blaze.");
            add("§7Rarity: §5Epic");
        }}, "MHF_Blaze");

        ItemStack guardianHead = ItemStackBuilder.buildHead("§eGuardian Head", new ArrayList() {{
            add("§7The head of a guardian.");
            add("§7Rarity: §5Epic");
        }}, "MHF_Guardian");

        ItemStack caveSpiderHead = ItemStackBuilder.buildHead("§eCave Spider Head", new ArrayList() {{
            add("§7The head of a cave spider.");
            add("§7Rarity: §5Epic");
        }}, "GrinningSkeleton");

        // Legendary
        ItemStack elderGuardianHead = ItemStackBuilder.buildHead("§eElder Guardian Head", new ArrayList() {{
            add("§7The head of an elder guardian.");
            add("§7Rarity: §aLegendary");
        }}, "MHF_EGuardian");

        ItemStack witherHead = ItemStackBuilder.buildHead("§eWither Head", new ArrayList() {{
            add("§7The head of a wither.");
            add("§7Rarity: §aLegendary");
        }}, "MHF_Wither");

        ItemStack ironGolemHead = ItemStackBuilder.buildHead("§eIron Golem Head", new ArrayList() {{
            add("§7The head of an iron golem.");
            add("§7Rarity: §aLegendary");
        }}, "MHF_Golem");

        ItemStack ghastHead = ItemStackBuilder.buildHead("§eGhast Head", new ArrayList() {{
            add("§7The head of a ghast.");
            add("§7Rarity: §aLegendary");
        }}, "MHF_Ghast");

        switch (entityType) {

            // Common
            case PIG:
                if (chance <= 0.05f) {
                    e.getDrops().add(pigHead);
                }
                break;
            case COW:
                if (chance <= 0.05f) {
                    e.getDrops().add(cowHead);
                }
                break;
            case CHICKEN:
                if (chance <= 0.05f) {
                    e.getDrops().add(chickenHead);
                }
                break;
            case SHEEP:
                if (chance <= 0.05f) {
                    e.getDrops().add(sheepHead);
                }
                break;
            case SQUID:
                if (chance <= 0.05f) {
                    e.getDrops().add(squidHead);
                }
                break;

            // Rare
            case SKELETON:
                if (chance <= 0.03f) {
                    e.getDrops().add(skeletonHead);
                }
                break;
            case ZOMBIE:
                if (chance <= 0.03f) {
                    e.getDrops().add(zombieHead);
                }
                break;
            case WITCH:
                if (chance <= 0.03f) {
                    e.getDrops().add(witchHead);
                }
                break;
            case ENDERMAN:
                if (chance <= 0.01f) {
                    e.getDrops().add(endermanHead);
                }
                break;
            case OCELOT:
                if (chance <= 0.03f) {
                    e.getDrops().add(ocelotHead);
                }
                break;

            // Epic
            case VILLAGER:
                if (chance <= 0.01f) {
                    e.getDrops().add(villagerHead);
                }
                break;
            case SLIME:
                if (chance <= 0.01f) {
                    e.getDrops().add(slimeHead);
                }
                break;
            case MAGMA_CUBE:
                if (chance <= 0.01f) {
                    e.getDrops().add(magmaCubeHead);
                }
                break;
            case BLAZE:
                if (chance <= 0.01f) {
                    e.getDrops().add(blazeHead);
                }
                break;
            case GUARDIAN:
                if (chance <= 0.01f) {
                    e.getDrops().add(guardianHead);
                }
                break;
            case CAVE_SPIDER:
                if (chance <= 0.01f) {
                    e.getDrops().add(caveSpiderHead);
                }
                break;

            // Legendary
            case ELDER_GUARDIAN:
                if (chance <= 0.003f) {
                    e.getDrops().add(elderGuardianHead);
                }
                break;
            case WITHER:
                if (chance <= 0.003f) {
                    e.getDrops().add(witherHead);
                }
                break;
            case IRON_GOLEM:
                if (chance <= 0.003f) {
                    e.getDrops().add(ironGolemHead);
                }
                break;
            case GHAST:
                if (chance <= 0.003f) {
                    e.getDrops().add(ghastHead);
                }
                break;
        }
    }
}