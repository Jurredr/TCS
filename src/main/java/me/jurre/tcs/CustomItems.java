package me.jurre.tcs;

import me.jurre.tcs.util.ItemStackBuilder;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;

public class CustomItems {

    private Tcs plugin;

    public CustomItems(Tcs plugin) {
        this.plugin = plugin;
    }

    // Common
    public ItemStack pigHead = ItemStackBuilder.buildHead("§ePig Head", new ArrayList() {{
        add("§7The head of a pig.");
        add("§7Rarity: §fCommon");
    }}, "MHF_Pig");

    public ItemStack cowHead = ItemStackBuilder.buildHead("§eCow Head", new ArrayList() {{
        add("§7The head of a cow.");
        add("§7Rarity: §fCommon");
    }}, "MHF_Cow");

    public ItemStack chickenHead = ItemStackBuilder.buildHead("§eChicken Head", new ArrayList() {{
        add("§7The head of a chicken.");
        add("§7Rarity: §fCommon");
    }}, "MHF_Chicken");

    public ItemStack sheepHead = ItemStackBuilder.buildHead("§eSheep Head", new ArrayList() {{
        add("§7The head of a sheep.");
        add("§7Rarity: §fCommon");
    }}, "MHF_Sheep");

    public ItemStack squidHead = ItemStackBuilder.buildHead("§eSquid Head", new ArrayList() {{
        add("§7The head of a squid.");
        add("§7Rarity: §fCommon");
    }}, "MHF_Squid");

    // Rare
    public ItemStack skeletonHead = ItemStackBuilder.buildHead("§eSkeleton Head", new ArrayList() {{
        add("§7The head of a skeleton.");
        add("§7Rarity: §bRare");
    }}, "MHF_Skeleton");

    public ItemStack zombieHead = ItemStackBuilder.buildHead("§eZombie Head", new ArrayList() {{
        add("§7The head of a zombie.");
        add("§7Rarity: §bRare");
    }}, "MHF_Zombie");

    public ItemStack witchHead = ItemStackBuilder.buildHead("§eWitch Head", new ArrayList() {{
        add("§7The head of a witch.");
        add("§7Rarity: §bRare");
    }}, "MHF_Witch");

    public ItemStack endermanHead = ItemStackBuilder.buildHead("§eEnderman Head", new ArrayList() {{
        add("§7The head of an enderman.");
        add("§7Rarity: §bRare");
    }}, "MHF_Enderman");

    public ItemStack ocelotHead = ItemStackBuilder.buildHead("§eOcelot Head", new ArrayList() {{
        add("§7The head of an ocelot.");
        add("§7Rarity: §bRare");
    }}, "MHF_Ocelot");

    // Epic
    public ItemStack villagerHead = ItemStackBuilder.buildHead("§eVillager Head", new ArrayList() {{
        add("§7The head of a villager.");
        add("§7Rarity: §5Epic");
    }}, "MHF_Villager");

    public ItemStack slimeHead = ItemStackBuilder.buildHead("§eSlime Head", new ArrayList() {{
        add("§7The head of a slime.");
        add("§7Rarity: §5Epic");
    }}, "MHF_Slime");

    public ItemStack magmaCubeHead = ItemStackBuilder.buildHead("§eMagma Cube Head", new ArrayList() {{
        add("§7The head of a magma cube.");
        add("§7Rarity: §5Epic");
    }}, "MHF_LavaSlime");

    public ItemStack blazeHead = ItemStackBuilder.buildHead("§eBlaze Head", new ArrayList() {{
        add("§7The head of a blaze.");
        add("§7Rarity: §5Epic");
    }}, "MHF_Blaze");

    public ItemStack guardianHead = ItemStackBuilder.buildHead("§eGuardian Head", new ArrayList() {{
        add("§7The head of a guardian.");
        add("§7Rarity: §5Epic");
    }}, "MHF_Guardian");

    public ItemStack caveSpiderHead = ItemStackBuilder.buildHead("§eCave Spider Head", new ArrayList() {{
        add("§7The head of a cave spider.");
        add("§7Rarity: §5Epic");
    }}, "GrinningSkeleton");

    // Legendary
    public ItemStack elderGuardianHead = ItemStackBuilder.buildHead("§eElder Guardian Head", new ArrayList() {{
        add("§7The head of an elder guardian.");
        add("§7Rarity: §aLegendary");
    }}, "MHF_EGuardian");

    public ItemStack witherHead = ItemStackBuilder.buildHead("§eWither Head", new ArrayList() {{
        add("§7The head of a wither.");
        add("§7Rarity: §aLegendary");
    }}, "MHF_Wither");

    public ItemStack ironGolemHead = ItemStackBuilder.buildHead("§eIron Golem Head", new ArrayList() {{
        add("§7The head of an iron golem.");
        add("§7Rarity: §aLegendary");
    }}, "MHF_Golem");

    public ItemStack ghastHead = ItemStackBuilder.buildHead("§eGhast Head", new ArrayList() {{
        add("§7The head of a ghast.");
        add("§7Rarity: §aLegendary");
    }}, "MHF_Ghast");
}