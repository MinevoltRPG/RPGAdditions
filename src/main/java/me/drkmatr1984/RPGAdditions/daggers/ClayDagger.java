package me.drkmatr1984.RPGAdditions.daggers;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import com.chrismin13.additionsapi.items.textured.CustomTexturedTool;
import com.chrismin13.additionsapi.recipes.CustomShapedRecipe;
import us.fihgu.toolbox.item.DamageableItem;

public class ClayDagger extends CustomTexturedTool {

	
	public ClayDagger() {
		super(DamageableItem.DIAMOND_SWORD, "rpg_additions:clay_dagger", "clay_dagger");

		setUnbreakable(true); 
		setUnbreakableVisibility(false); 
		addAttackDamage(2.0);    //Attack Damage
		addAttackSpeed(2.1);     //Attack Speed
		setToolLikeAttributes(true);
		setAttributeVisibility(false);
		setDisplayName("Clay Dagger");
		setFakeDurability(25);   //Durability

		//Crafting Recipe
		
		//Will have to update RecipeIngredient to Data Identifiers instead of numbers in the next
		//version
		List<CustomShapedRecipe> list = new ArrayList<CustomShapedRecipe>();
		list.add(new CustomShapedRecipe().setShape("xxx", "xdx", "sxx").setIngredient('x', Material.AIR)
				.setIngredient('d', Material.CLAY_BALL).setIngredient('s', Material.STICK));
		list.add(new CustomShapedRecipe().setShape("xxx", "xdx", "xxs").setIngredient('x', Material.AIR)
				.setIngredient('d', Material.CLAY_BALL).setIngredient('s', Material.STICK));
		addAllCustomRecipes(list);
	}

}