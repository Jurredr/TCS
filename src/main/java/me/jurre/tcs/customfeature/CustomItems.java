package me.jurre.tcs.customfeature;

import me.jurre.tcs.Tcs;
import me.jurre.tcs.util.ItemStackBuilder;
import me.jurre.tcs.util.SkullCreator;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;

@SuppressWarnings("deprecation")
public class CustomItems {

    private Tcs plugin;

    public CustomItems(Tcs plugin) {
        this.plugin = plugin;
    }

    public ItemStack powerEgg = ItemStackBuilder.build(Material.EGG, "§ePower Egg", true);

    // Common
    public ItemStack pigHead = SkullCreator.itemWithUuid("§ePig Head", new ArrayList() {{
        add("§7The head of a pig.");
        add("§7Rarity: §fCommon");
    }}, Bukkit.getOfflinePlayer("MHF_Pig").getUniqueId());

    public ItemStack cowHead = SkullCreator.itemWithUuid("§eCow Head", new ArrayList() {{
        add("§7The head of a cow.");
        add("§7Rarity: §fCommon");
    }}, Bukkit.getOfflinePlayer("MHF_Cow").getUniqueId());

    public ItemStack chickenHead = SkullCreator.itemWithUuid("§eChicken Head", new ArrayList() {{
        add("§7The head of a chicken.");
        add("§7Rarity: §fCommon");
    }}, Bukkit.getOfflinePlayer("MHF_Chicken").getUniqueId());

    public ItemStack sheepHead = SkullCreator.itemWithUuid("§eSheep Head", new ArrayList() {{
        add("§7The head of a sheep.");
        add("§7Rarity: §fCommon");
    }}, Bukkit.getOfflinePlayer("MHF_Sheep").getUniqueId());

    public ItemStack squidHead = SkullCreator.itemWithUuid("§eSquid Head", new ArrayList() {{
        add("§7The head of a squid.");
        add("§7Rarity: §fCommon");
    }}, Bukkit.getOfflinePlayer("MHF_Squid").getUniqueId());

    // Rare
    public ItemStack skeletonHead = SkullCreator.itemWithUuid("§eSkeleton Head", new ArrayList() {{
        add("§7The head of a skeleton.");
        add("§7Rarity: §bRare");
    }}, Bukkit.getOfflinePlayer("MHF_Skeleton").getUniqueId());

    public ItemStack zombieHead = SkullCreator.itemWithUuid("§eZombie Head", new ArrayList() {{
        add("§7The head of a zombie.");
        add("§7Rarity: §bRare");
    }}, Bukkit.getOfflinePlayer("MHF_Zombie").getUniqueId());

    public ItemStack witchHead = SkullCreator.itemWithUuid("§eWitch Head", new ArrayList() {{
        add("§7The head of a witch.");
        add("§7Rarity: §bRare");
    }}, Bukkit.getOfflinePlayer("MHF_Witch").getUniqueId());

    public ItemStack endermanHead = SkullCreator.itemWithUuid("§eEnderman Head", new ArrayList() {{
        add("§7The head of an enderman.");
        add("§7Rarity: §bRare");
    }}, Bukkit.getOfflinePlayer("MHF_Enderman").getUniqueId());

    public ItemStack ocelotHead = SkullCreator.itemWithUuid("§eOcelot Head", new ArrayList() {{
        add("§7The head of an ocelot.");
        add("§7Rarity: §bRare");
    }}, Bukkit.getOfflinePlayer("MHF_Ocelot").getUniqueId());

    public ItemStack drownedHead = SkullCreator.itemWithUuid("§eDrowned Head", new ArrayList() {{
        add("§7The head of a drowned.");
        add("§7Rarity: §bRare");
    }}, Bukkit.getOfflinePlayer("0l1v3_01l").getUniqueId());

    // Epic
    public ItemStack villagerHead = SkullCreator.itemWithUuid("§eVillager Head", new ArrayList() {{
        add("§7The head of a villager.");
        add("§7Rarity: §5Epic");
    }}, Bukkit.getOfflinePlayer("MHF_Villager").getUniqueId());

    public ItemStack slimeHead = SkullCreator.itemWithUuid("§eSlime Head", new ArrayList() {{
        add("§7The head of a slime.");
        add("§7Rarity: §5Epic");
    }}, Bukkit.getOfflinePlayer("MHF_Slime").getUniqueId());

    public ItemStack magmaCubeHead = SkullCreator.itemWithUuid("§eMagma Cube Head", new ArrayList() {{
        add("§7The head of a magma cube.");
        add("§7Rarity: §5Epic");
    }}, Bukkit.getOfflinePlayer("MHF_LavaSlime").getUniqueId());

    public ItemStack blazeHead = SkullCreator.itemWithUuid("§eBlaze Head", new ArrayList() {{
        add("§7The head of a blaze.");
        add("§7Rarity: §5Epic");
    }}, Bukkit.getOfflinePlayer("MHF_Blaze").getUniqueId());

    public ItemStack guardianHead = SkullCreator.itemWithUuid("§eGuardian Head", new ArrayList() {{
        add("§7The head of a guardian.");
        add("§7Rarity: §5Epic");
    }}, Bukkit.getOfflinePlayer("MHF_Guardian").getUniqueId());

    public ItemStack caveSpiderHead = SkullCreator.itemWithUuid("§eCave Spider Head", new ArrayList() {{
        add("§7The head of a cave spider.");
        add("§7Rarity: §5Epic");
    }}, Bukkit.getOfflinePlayer("GrinningSkeleton").getUniqueId());

    // Legendary
    public ItemStack elderGuardianHead = SkullCreator.itemWithUuid("§eElder Guardian Head", new ArrayList() {{
        add("§7The head of an elder guardian.");
        add("§7Rarity: §aLegendary");
    }}, Bukkit.getOfflinePlayer("MHF_EGuardian").getUniqueId());

    public ItemStack witherHead = SkullCreator.itemWithUuid("§eWither Head", new ArrayList() {{
        add("§7The head of a wither.");
        add("§7Rarity: §aLegendary");
    }}, Bukkit.getOfflinePlayer("MHF_Wither").getUniqueId());

    public ItemStack ironGolemHead = SkullCreator.itemWithUuid("§eIron Golem Head", new ArrayList() {{
        add("§7The head of an iron golem.");
        add("§7Rarity: §aLegendary");
    }}, Bukkit.getOfflinePlayer("MHF_Golem").getUniqueId());

    public ItemStack ghastHead = SkullCreator.itemWithUuid("§eGhast Head", new ArrayList() {{
        add("§7The head of a ghast.");
        add("§7Rarity: §aLegendary");
    }}, Bukkit.getOfflinePlayer("MHF_Ghast").getUniqueId());
}