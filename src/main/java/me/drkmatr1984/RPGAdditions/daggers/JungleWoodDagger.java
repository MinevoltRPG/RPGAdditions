package me.drkmatr1984.RPGAdditions.daggers;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.TreeSpecies;

import com.chrismin13.additionsapi.items.textured.CustomTexturedTool;
import com.chrismin13.additionsapi.recipes.CustomShapedRecipe;
import com.chrismin13.additionsapi.recipes.RecipeIngredient;

import us.fihgu.toolbox.item.DamageableItem;

public class JungleWoodDagger extends CustomTexturedTool {

	
	@SuppressWarnings("deprecation")
	public JungleWoodDagger() {
		super(DamageableItem.DIAMOND_SWORD, "rpg_additions:jungle_wood_dagger", "jungle_wood_dagger");

		setUnbreakable(true); 
		setUnbreakableVisibility(false); 
		addAttackDamage(2.0);    //Attack Damage
		addAttackSpeed(2.1);     //Attack Speed
		setToolLikeAttributes(true);
		setAttributeVisibility(false);
		setDisplayName("Jungle Wood Dagger");
		setFakeDurability(50);   //Durability

		//Crafting Recipe
		
		//Will have to update RecipeIngredient to Data Identifiers instead of numbers in the next
		//version
		List<CustomShapedRecipe> list = new ArrayList<CustomShapedRecipe>();
		list.add(new CustomShapedRecipe().setShape("xxx", "xdx", "sxx").setIngredient('x', Material.AIR)
				.setIngredient('d', new RecipeIngredient(Material.WOOD, TreeSpecies.JUNGLE.getData())).setIngredient('s', Material.STICK));
		list.add(new CustomShapedRecipe().setShape("xxx", "xdx", "xxs").setIngredient('x', Material.AIR)
				.setIngredient('d', new RecipeIngredient(Material.WOOD, TreeSpecies.JUNGLE.getData())).setIngredient('s', Material.STICK));
		addAllCustomRecipes(list);
	}

}