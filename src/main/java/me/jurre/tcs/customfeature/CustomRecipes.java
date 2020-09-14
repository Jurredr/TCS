package me.jurre.tcs.customfeature;

import me.jurre.tcs.Tcs;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;

public class CustomRecipes {

    private Tcs plugin;

    public CustomRecipes(Tcs plugin) {
        this.plugin = plugin;
    }

    @SuppressWarnings("deprecation")
    public void loadRecipes() {

        ShapedRecipe powerEgg = new ShapedRecipe(new NamespacedKey(plugin, "powerEgg"), plugin.getCustomItems().powerEgg);
        powerEgg.shape("EEE", "EEE", "EEE");
        powerEgg.setIngredient('E', new RecipeChoice.ExactChoice(new ItemStack(Material.EGG)));
        plugin.getServer().addRecipe(powerEgg);

        ShapedRecipe pigEgg = new ShapedRecipe(new NamespacedKey(plugin, "pigEgg"), new ItemStack(Material.PIG_SPAWN_EGG));
        pigEgg.shape("EEE", "EHE", "EEE");
        pigEgg.setIngredient('E', new RecipeChoice.ExactChoice(plugin.getCustomItems().powerEgg));
        pigEgg.setIngredient('H', new RecipeChoice.ExactChoice(plugin.getCustomItems().pigHead));
        plugin.getServer().addRecipe(pigEgg);

        ShapedRecipe cowEgg = new ShapedRecipe(new NamespacedKey(plugin, "cowEgg"), new ItemStack(Material.COW_SPAWN_EGG));
        cowEgg.shape("EEE", "EHE", "EEE");
        cowEgg.setIngredient('E', new RecipeChoice.ExactChoice(plugin.getCustomItems().powerEgg));
        cowEgg.setIngredient('H', new RecipeChoice.ExactChoice(plugin.getCustomItems().cowHead));
        plugin.getServer().addRecipe(cowEgg);

        ShapedRecipe chickenEgg = new ShapedRecipe(new NamespacedKey(plugin, "chickenEgg"), new ItemStack(Material.CHICKEN_SPAWN_EGG));
        chickenEgg.shape("EEE", "EHE", "EEE");
        chickenEgg.setIngredient('E', new RecipeChoice.ExactChoice(plugin.getCustomItems().powerEgg));
        chickenEgg.setIngredient('H', new RecipeChoice.ExactChoice(plugin.getCustomItems().chickenHead));
        plugin.getServer().addRecipe(chickenEgg);

        ShapedRecipe sheepEgg = new ShapedRecipe(new NamespacedKey(plugin, "sheepEgg"), new ItemStack(Material.SHEEP_SPAWN_EGG));
        sheepEgg.shape("EEE", "EHE", "EEE");
        sheepEgg.setIngredient('E', new RecipeChoice.ExactChoice(plugin.getCustomItems().powerEgg));
        sheepEgg.setIngredient('H', new RecipeChoice.ExactChoice(plugin.getCustomItems().sheepHead));
        plugin.getServer().addRecipe(sheepEgg);

        ShapedRecipe squidEgg = new ShapedRecipe(new NamespacedKey(plugin, "squidEgg"), new ItemStack(Material.SQUID_SPAWN_EGG));
        squidEgg.shape("EEE", "EHE", "EEE");
        squidEgg.setIngredient('E', new RecipeChoice.ExactChoice(plugin.getCustomItems().powerEgg));
        squidEgg.setIngredient('H', new RecipeChoice.ExactChoice(plugin.getCustomItems().squidHead));
        plugin.getServer().addRecipe(squidEgg);

        ShapedRecipe skeletonEgg = new ShapedRecipe(new NamespacedKey(plugin, "skeletonEgg"), new ItemStack(Material.SKELETON_SPAWN_EGG));
        skeletonEgg.shape("EEE", "EHE", "EEE");
        skeletonEgg.setIngredient('E', new RecipeChoice.ExactChoice(plugin.getCustomItems().powerEgg));
        skeletonEgg.setIngredient('H', new RecipeChoice.ExactChoice(plugin.getCustomItems().skeletonHead));
        plugin.getServer().addRecipe(skeletonEgg);

        ShapedRecipe zombieEgg = new ShapedRecipe(new NamespacedKey(plugin, "zombieEgg"), new ItemStack(Material.ZOMBIE_SPAWN_EGG));
        zombieEgg.shape("EEE", "EHE", "EEE");
        zombieEgg.setIngredient('E', new RecipeChoice.ExactChoice(plugin.getCustomItems().powerEgg));
        zombieEgg.setIngredient('H', new RecipeChoice.ExactChoice(plugin.getCustomItems().zombieHead));
        plugin.getServer().addRecipe(zombieEgg);

        ShapedRecipe witchEgg = new ShapedRecipe(new NamespacedKey(plugin, "witchEgg"), new ItemStack(Material.WITCH_SPAWN_EGG));
        witchEgg.shape("EEE", "EHE", "EEE");
        witchEgg.setIngredient('E', new RecipeChoice.ExactChoice(plugin.getCustomItems().powerEgg));
        witchEgg.setIngredient('H', new RecipeChoice.ExactChoice(plugin.getCustomItems().witchHead));
        plugin.getServer().addRecipe(witchEgg);

        ShapedRecipe endermanEgg = new ShapedRecipe(new NamespacedKey(plugin, "endermanEgg"), new ItemStack(Material.ENDERMAN_SPAWN_EGG));
        endermanEgg.shape("EEE", "EHE", "EEE");
        endermanEgg.setIngredient('E', new RecipeChoice.ExactChoice(plugin.getCustomItems().powerEgg));
        endermanEgg.setIngredient('H', new RecipeChoice.ExactChoice(plugin.getCustomItems().endermanHead));
        plugin.getServer().addRecipe(endermanEgg);

        ShapedRecipe ocelotEgg = new ShapedRecipe(new NamespacedKey(plugin, "ocelotEgg"), new ItemStack(Material.OCELOT_SPAWN_EGG));
        ocelotEgg.shape("EEE", "EHE", "EEE");
        ocelotEgg.setIngredient('E', new RecipeChoice.ExactChoice(plugin.getCustomItems().powerEgg));
        ocelotEgg.setIngredient('H', new RecipeChoice.ExactChoice(plugin.getCustomItems().ocelotHead));
        plugin.getServer().addRecipe(ocelotEgg);

        ShapedRecipe drownedEgg = new ShapedRecipe(new NamespacedKey(plugin, "drownedEgg"), new ItemStack(Material.DROWNED_SPAWN_EGG));
        drownedEgg.shape("EEE", "EHE", "EEE");
        drownedEgg.setIngredient('E', new RecipeChoice.ExactChoice(plugin.getCustomItems().powerEgg));
        drownedEgg.setIngredient('H', new RecipeChoice.ExactChoice(plugin.getCustomItems().drownedHead));
        plugin.getServer().addRecipe(drownedEgg);

        ShapedRecipe villagerEgg = new ShapedRecipe(new NamespacedKey(plugin, "villagerEgg"), new ItemStack(Material.VILLAGER_SPAWN_EGG));
        villagerEgg.shape("EEE", "EHE", "EEE");
        villagerEgg.setIngredient('E', new RecipeChoice.ExactChoice(plugin.getCustomItems().powerEgg));
        villagerEgg.setIngredient('H', new RecipeChoice.ExactChoice(plugin.getCustomItems().villagerHead));
        plugin.getServer().addRecipe(villagerEgg);

        ShapedRecipe slimeEgg = new ShapedRecipe(new NamespacedKey(plugin, "slimeEgg"), new ItemStack(Material.SLIME_SPAWN_EGG));
        slimeEgg.shape("EEE", "EHE", "EEE");
        slimeEgg.setIngredient('E', new RecipeChoice.ExactChoice(plugin.getCustomItems().powerEgg));
        slimeEgg.setIngredient('H', new RecipeChoice.ExactChoice(plugin.getCustomItems().slimeHead));
        plugin.getServer().addRecipe(slimeEgg);

        ShapedRecipe magmaCubeEgg = new ShapedRecipe(new NamespacedKey(plugin, "magmaCubeEgg"), new ItemStack(Material.MAGMA_CUBE_SPAWN_EGG));
        magmaCubeEgg.shape("EEE", "EHE", "EEE");
        magmaCubeEgg.setIngredient('E', new RecipeChoice.ExactChoice(plugin.getCustomItems().powerEgg));
        magmaCubeEgg.setIngredient('H', new RecipeChoice.ExactChoice(plugin.getCustomItems().magmaCubeHead));
        plugin.getServer().addRecipe(magmaCubeEgg);

        ShapedRecipe blazeEgg = new ShapedRecipe(new NamespacedKey(plugin, "blazeEgg"), new ItemStack(Material.BLAZE_SPAWN_EGG));
        blazeEgg.shape("EEE", "EHE", "EEE");
        blazeEgg.setIngredient('E', new RecipeChoice.ExactChoice(plugin.getCustomItems().powerEgg));
        blazeEgg.setIngredient('H', new RecipeChoice.ExactChoice(plugin.getCustomItems().blazeHead));
        plugin.getServer().addRecipe(blazeEgg);

        ShapedRecipe guardianEgg = new ShapedRecipe(new NamespacedKey(plugin, "guardianEgg"), new ItemStack(Material.GUARDIAN_SPAWN_EGG));
        guardianEgg.shape("EEE", "EHE", "EEE");
        guardianEgg.setIngredient('E', new RecipeChoice.ExactChoice(plugin.getCustomItems().powerEgg));
        guardianEgg.setIngredient('H', new RecipeChoice.ExactChoice(plugin.getCustomItems().guardianHead));
        plugin.getServer().addRecipe(guardianEgg);

        ShapedRecipe caveSpiderEgg = new ShapedRecipe(new NamespacedKey(plugin, "caveSpiderEgg"), new ItemStack(Material.CAVE_SPIDER_SPAWN_EGG));
        caveSpiderEgg.shape("EEE", "EHE", "EEE");
        caveSpiderEgg.setIngredient('E', new RecipeChoice.ExactChoice(plugin.getCustomItems().powerEgg));
        caveSpiderEgg.setIngredient('H', new RecipeChoice.ExactChoice(plugin.getCustomItems().caveSpiderHead));
        plugin.getServer().addRecipe(caveSpiderEgg);

        ShapedRecipe elderGuardianEgg = new ShapedRecipe(new NamespacedKey(plugin, "elderGuardianEgg"), new ItemStack(Material.ELDER_GUARDIAN_SPAWN_EGG));
        elderGuardianEgg.shape("EEE", "EHE", "EEE");
        elderGuardianEgg.setIngredient('E', new RecipeChoice.ExactChoice(plugin.getCustomItems().powerEgg));
        elderGuardianEgg.setIngredient('H', new RecipeChoice.ExactChoice(plugin.getCustomItems().elderGuardianHead));
        plugin.getServer().addRecipe(elderGuardianEgg);

        ShapedRecipe witherEgg = new ShapedRecipe(new NamespacedKey(plugin, "witherEgg"), new ItemStack(Material.WITHER_SKELETON_SPAWN_EGG));
        witherEgg.shape("EEE", "EHE", "EEE");
        witherEgg.setIngredient('E', new RecipeChoice.ExactChoice(plugin.getCustomItems().powerEgg));
        witherEgg.setIngredient('H', new RecipeChoice.ExactChoice(plugin.getCustomItems().witherHead));
        plugin.getServer().addRecipe(witherEgg);

        ShapedRecipe ironGolemEgg = new ShapedRecipe(new NamespacedKey(plugin, "ironGolemEgg"), new ItemStack(Material.EVOKER_SPAWN_EGG));
        ironGolemEgg.shape("EEE", "EHE", "EEE");
        ironGolemEgg.setIngredient('E', new RecipeChoice.ExactChoice(plugin.getCustomItems().powerEgg));
        ironGolemEgg.setIngredient('H', new RecipeChoice.ExactChoice(plugin.getCustomItems().ironGolemHead));
        plugin.getServer().addRecipe(ironGolemEgg);

        ShapedRecipe ghastEgg = new ShapedRecipe(new NamespacedKey(plugin, "ghastEgg"), new ItemStack(Material.GHAST_SPAWN_EGG));
        ghastEgg.shape("EEE", "EHE", "EEE");
        ghastEgg.setIngredient('E', new RecipeChoice.ExactChoice(plugin.getCustomItems().powerEgg));
        ghastEgg.setIngredient('H', new RecipeChoice.ExactChoice(plugin.getCustomItems().ghastHead));
        plugin.getServer().addRecipe(ghastEgg);
    }
}