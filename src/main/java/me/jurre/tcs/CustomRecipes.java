package me.jurre.tcs;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;

public class CustomRecipes {

    private Tcs plugin;

    public CustomRecipes(Tcs plugin) {
        this.plugin = plugin;
    }

    public void loadRecipes() {

        ShapedRecipe pigEgg = new ShapedRecipe(new ItemStack(Material.PIG_SPAWN_EGG));  //change from enchanted book to your custom one we setup above.

        pigEgg.shape("EEE","EHE","EEE");
        pigEgg.setIngredient('E', new RecipeChoice.ExactChoice(new ItemStack(Material.EGG, 16)));
        pigEgg.setIngredient('H', new RecipeChoice.ExactChoice(plugin.getCustomItems().pigHead));

        plugin.getServer().addRecipe(pigEgg);
    }
}