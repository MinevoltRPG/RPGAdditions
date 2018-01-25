package me.drkmatr1984.RPGAdditions.daggers;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import com.chrismin13.additionsapi.items.textured.CustomTexturedTool;
import com.chrismin13.additionsapi.recipes.CustomShapedRecipe;
import us.fihgu.toolbox.item.DamageableItem;

public class RedstoneDagger extends CustomTexturedTool {

	
	public RedstoneDagger() {
		super(DamageableItem.DIAMOND_SWORD, "rpg_additions:redstone_dagger", "redstone_dagger");

		setUnbreakable(true); 
		setUnbreakableVisibility(false); 
		addAttackDamage(2.5);    //Attack Damage
		addAttackSpeed(2.1);     //Attack Speed
		setToolLikeAttributes(true);
		setAttributeVisibility(false);
		setDisplayName("Redstone Dagger");
		setFakeDurability(109);   //Durability

		//Crafting Recipe
		
		//Will have to update RecipeIngredient to Data Identifiers instead of numbers in the next
		//version
		List<CustomShapedRecipe> list = new ArrayList<CustomShapedRecipe>();
		list.add(new CustomShapedRecipe().setShape("xxx", "xdx", "sxx").setIngredient('x', Material.AIR)
				.setIngredient('d', Material.REDSTONE).setIngredient('s', Material.STICK));
		list.add(new CustomShapedRecipe().setShape("xxx", "xdx", "xxs").setIngredient('x', Material.AIR)
				.setIngredient('d', Material.REDSTONE).setIngredient('s', Material.STICK));
		addAllCustomRecipes(list);
	}

}