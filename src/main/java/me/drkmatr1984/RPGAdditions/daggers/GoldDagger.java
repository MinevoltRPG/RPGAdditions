package me.drkmatr1984.RPGAdditions.daggers;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;

import com.chrismin13.additionsapi.items.textured.CustomTexturedTool;
import com.chrismin13.additionsapi.recipes.CustomShapedRecipe;

import us.fihgu.toolbox.item.DamageableItem;

public class GoldDagger extends CustomTexturedTool {

	public GoldDagger() {
		super(DamageableItem.DIAMOND_SWORD, "rpg_additions:gold_dagger", "gold_dagger");

		setUnbreakable(true); 
		setUnbreakableVisibility(false); 
		addAttackDamage(2.0);    //Attack Damage
		addAttackSpeed(2.1);     //Attack Speed
		setToolLikeAttributes(true);
		setAttributeVisibility(false);
		setDisplayName("Gold Dagger");
		setFakeDurability(30);   //Durability

		// This will get the Crafting Recipe for the Sword and set the materials
		// for crafting to Obsidian and Redstone Torch.
		List<CustomShapedRecipe> list = new ArrayList<CustomShapedRecipe>();
		list.add(new CustomShapedRecipe().setShape("xxx", "xdx", "sxx").setIngredient('x', Material.AIR)
				.setIngredient('d', Material.GOLD_INGOT).setIngredient('s', Material.STICK));
		list.add(new CustomShapedRecipe().setShape("xxx", "xdx", "xxs").setIngredient('x', Material.AIR)
				.setIngredient('d', Material.GOLD_INGOT).setIngredient('s', Material.STICK));
		addAllCustomRecipes(list);
	}

}