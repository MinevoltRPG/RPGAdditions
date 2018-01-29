package me.drkmatr1984.RPGAdditions.customitemtypes;

import org.bukkit.Material;
import org.bukkit.material.MaterialData;

import com.chrismin13.additionsapi.recipes.CustomShapedRecipe;
import com.chrismin13.additionsapi.recipes.RecipeIngredient;

import us.fihgu.toolbox.item.DamageableItem;

public class Pickaxe extends CustomPickaxe {
	
	@SuppressWarnings("deprecation")
	public Pickaxe(DamageableItem damageable, int durability, String identifier, String name, MaterialData blade, MaterialData handle) {
		super(damageable, durability, identifier, name);
		addCustomRecipe(new CustomShapedRecipe().setShape("ddd", "xsx", "xsx").setIngredient('x', Material.AIR)
				.setIngredient('d', new RecipeIngredient(blade.getItemType(), blade.getData())).setIngredient('s', new RecipeIngredient(handle.getItemType(), handle.getData())));
	}
}