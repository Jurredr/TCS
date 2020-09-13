package me.jurre.tcs;

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
        pigEgg.shape("EEE", "EHE", "EEE");
        pigEgg.setIngredient('E', new RecipeChoice.ExactChoice(plugin.getCustomItems().powerEgg));
        pigEgg.setIngredient('H', new RecipeChoice.ExactChoice(plugin.getCustomItems().cowHead));
        plugin.getServer().addRecipe(cowEgg);

        ShapedRecipe chickenEgg = new ShapedRecipe(new NamespacedKey(plugin, "chickenEgg"), new ItemStack(Material.CHICKEN_SPAWN_EGG));
        pigEgg.shape("EEE", "EHE", "EEE");
        pigEgg.setIngredient('E', new RecipeChoice.ExactChoice(plugin.getCustomItems().powerEgg));
        pigEgg.setIngredient('H', new RecipeChoice.ExactChoice(plugin.getCustomItems().chickenHead));
        plugin.getServer().addRecipe(chickenEgg);

        ShapedRecipe sheepEgg = new ShapedRecipe(new NamespacedKey(plugin, "sheepEgg"), new ItemStack(Material.SHEEP_SPAWN_EGG));
        pigEgg.shape("EEE", "EHE", "EEE");
        pigEgg.setIngredient('E', new RecipeChoice.ExactChoice(plugin.getCustomItems().powerEgg));
        pigEgg.setIngredient('H', new RecipeChoice.ExactChoice(plugin.getCustomItems().sheepHead));
        plugin.getServer().addRecipe(sheepEgg);

        ShapedRecipe squidEgg = new ShapedRecipe(new NamespacedKey(plugin, "squidEgg"), new ItemStack(Material.SQUID_SPAWN_EGG));
        pigEgg.shape("EEE", "EHE", "EEE");
        pigEgg.setIngredient('E', new RecipeChoice.ExactChoice(plugin.getCustomItems().powerEgg));
        pigEgg.setIngredient('H', new RecipeChoice.ExactChoice(plugin.getCustomItems().squidHead));
        plugin.getServer().addRecipe(squidEgg);

        ShapedRecipe skeletonEgg = new ShapedRecipe(new NamespacedKey(plugin, "skeletonEgg"), new ItemStack(Material.SKELETON_SPAWN_EGG));
        pigEgg.shape("EEE", "EHE", "EEE");
        pigEgg.setIngredient('E', new RecipeChoice.ExactChoice(plugin.getCustomItems().powerEgg));
        pigEgg.setIngredient('H', new RecipeChoice.ExactChoice(plugin.getCustomItems().skeletonHead));
        plugin.getServer().addRecipe(skeletonEgg);

        ShapedRecipe zombieEgg = new ShapedRecipe(new NamespacedKey(plugin, "zombieEgg"), new ItemStack(Material.ZOMBIE_SPAWN_EGG));
        pigEgg.shape("EEE", "EHE", "EEE");
        pigEgg.setIngredient('E', new RecipeChoice.ExactChoice(plugin.getCustomItems().powerEgg));
        pigEgg.setIngredient('H', new RecipeChoice.ExactChoice(plugin.getCustomItems().zombieHead));
        plugin.getServer().addRecipe(zombieEgg);

        ShapedRecipe witchEgg = new ShapedRecipe(new NamespacedKey(plugin, "witchEgg"), new ItemStack(Material.WITCH_SPAWN_EGG));
        pigEgg.shape("EEE", "EHE", "EEE");
        pigEgg.setIngredient('E', new RecipeChoice.ExactChoice(plugin.getCustomItems().powerEgg));
        pigEgg.setIngredient('H', new RecipeChoice.ExactChoice(plugin.getCustomItems().witchHead));
        plugin.getServer().addRecipe(witchEgg);

        ShapedRecipe endermanEgg = new ShapedRecipe(new NamespacedKey(plugin, "endermanEgg"), new ItemStack(Material.ENDERMAN_SPAWN_EGG));
        pigEgg.shape("EEE", "EHE", "EEE");
        pigEgg.setIngredient('E', new RecipeChoice.ExactChoice(plugin.getCustomItems().powerEgg));
        pigEgg.setIngredient('H', new RecipeChoice.ExactChoice(plugin.getCustomItems().endermanHead));
        plugin.getServer().addRecipe(endermanEgg);

        ShapedRecipe ocelotEgg = new ShapedRecipe(new NamespacedKey(plugin, "ocelotEgg"), new ItemStack(Material.OCELOT_SPAWN_EGG));
        pigEgg.shape("EEE", "EHE", "EEE");
        pigEgg.setIngredient('E', new RecipeChoice.ExactChoice(plugin.getCustomItems().powerEgg));
        pigEgg.setIngredient('H', new RecipeChoice.ExactChoice(plugin.getCustomItems().ocelotHead));
        plugin.getServer().addRecipe(ocelotEgg);

        ShapedRecipe villagerEgg = new ShapedRecipe(new NamespacedKey(plugin, "villagerEgg"), new ItemStack(Material.VILLAGER_SPAWN_EGG));
        pigEgg.shape("EEE", "EHE", "EEE");
        pigEgg.setIngredient('E', new RecipeChoice.ExactChoice(plugin.getCustomItems().powerEgg));
        pigEgg.setIngredient('H', new RecipeChoice.ExactChoice(plugin.getCustomItems().villagerHead));
        plugin.getServer().addRecipe(villagerEgg);

        ShapedRecipe slimeEgg = new ShapedRecipe(new NamespacedKey(plugin, "slimeEgg"), new ItemStack(Material.SLIME_SPAWN_EGG));
        pigEgg.shape("EEE", "EHE", "EEE");
        pigEgg.setIngredient('E', new RecipeChoice.ExactChoice(plugin.getCustomItems().powerEgg));
        pigEgg.setIngredient('H', new RecipeChoice.ExactChoice(plugin.getCustomItems().slimeHead));
        plugin.getServer().addRecipe(slimeEgg);

        ShapedRecipe magmaCubeEgg = new ShapedRecipe(new NamespacedKey(plugin, "magmaCubeEgg"), new ItemStack(Material.MAGMA_CUBE_SPAWN_EGG));
        pigEgg.shape("EEE", "EHE", "EEE");
        pigEgg.setIngredient('E', new RecipeChoice.ExactChoice(plugin.getCustomItems().powerEgg));
        pigEgg.setIngredient('H', new RecipeChoice.ExactChoice(plugin.getCustomItems().magmaCubeHead));
        plugin.getServer().addRecipe(magmaCubeEgg);

        ShapedRecipe blazeEgg = new ShapedRecipe(new NamespacedKey(plugin, "blazeEgg"), new ItemStack(Material.BLAZE_SPAWN_EGG));
        pigEgg.shape("EEE", "EHE", "EEE");
        pigEgg.setIngredient('E', new RecipeChoice.ExactChoice(plugin.getCustomItems().powerEgg));
        pigEgg.setIngredient('H', new RecipeChoice.ExactChoice(plugin.getCustomItems().blazeHead));
        plugin.getServer().addRecipe(blazeEgg);

        ShapedRecipe guardianEgg = new ShapedRecipe(new NamespacedKey(plugin, "guardianEgg"), new ItemStack(Material.GUARDIAN_SPAWN_EGG));
        pigEgg.shape("EEE", "EHE", "EEE");
        pigEgg.setIngredient('E', new RecipeChoice.ExactChoice(plugin.getCustomItems().powerEgg));
        pigEgg.setIngredient('H', new RecipeChoice.ExactChoice(plugin.getCustomItems().guardianHead));
        plugin.getServer().addRecipe(guardianEgg);

        ShapedRecipe caveSpiderEgg = new ShapedRecipe(new NamespacedKey(plugin, "caveSpiderEgg"), new ItemStack(Material.CAVE_SPIDER_SPAWN_EGG));
        pigEgg.shape("EEE", "EHE", "EEE");
        pigEgg.setIngredient('E', new RecipeChoice.ExactChoice(plugin.getCustomItems().powerEgg));
        pigEgg.setIngredient('H', new RecipeChoice.ExactChoice(plugin.getCustomItems().caveSpiderHead));
        plugin.getServer().addRecipe(caveSpiderEgg);

        ShapedRecipe elderGuardianEgg = new ShapedRecipe(new NamespacedKey(plugin, "elderGuardianEgg"), new ItemStack(Material.ELDER_GUARDIAN_SPAWN_EGG));
        pigEgg.shape("EEE", "EHE", "EEE");
        pigEgg.setIngredient('E', new RecipeChoice.ExactChoice(plugin.getCustomItems().powerEgg));
        pigEgg.setIngredient('H', new RecipeChoice.ExactChoice(plugin.getCustomItems().elderGuardianHead));
        plugin.getServer().addRecipe(elderGuardianEgg);

        ShapedRecipe witherEgg = new ShapedRecipe(new NamespacedKey(plugin, "witherEgg"), new ItemStack(Material.WITHER_SKELETON_SPAWN_EGG));
        pigEgg.shape("EEE", "EHE", "EEE");
        pigEgg.setIngredient('E', new RecipeChoice.ExactChoice(plugin.getCustomItems().powerEgg));
        pigEgg.setIngredient('H', new RecipeChoice.ExactChoice(plugin.getCustomItems().witherHead));
        plugin.getServer().addRecipe(witherEgg);

        ShapedRecipe ironGolemEgg = new ShapedRecipe(new NamespacedKey(plugin, "ironGolemEgg"), new ItemStack(Material.EVOKER_SPAWN_EGG));
        pigEgg.shape("EEE", "EHE", "EEE");
        pigEgg.setIngredient('E', new RecipeChoice.ExactChoice(plugin.getCustomItems().powerEgg));
        pigEgg.setIngredient('H', new RecipeChoice.ExactChoice(plugin.getCustomItems().ironGolemHead));
        plugin.getServer().addRecipe(ironGolemEgg);

        ShapedRecipe ghastEgg = new ShapedRecipe(new NamespacedKey(plugin, "ghastEgg"), new ItemStack(Material.GHAST_SPAWN_EGG));
        pigEgg.shape("EEE", "EHE", "EEE");
        pigEgg.setIngredient('E', new RecipeChoice.ExactChoice(plugin.getCustomItems().powerEgg));
        pigEgg.setIngredient('H', new RecipeChoice.ExactChoice(plugin.getCustomItems().ghastHead));
        plugin.getServer().addRecipe(ghastEgg);
    }
}