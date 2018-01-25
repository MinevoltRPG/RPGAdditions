package me.drkmatr1984.RPGAdditions.daggers;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;

import com.chrismin13.additionsapi.items.textured.CustomTexturedTool;
import com.chrismin13.additionsapi.recipes.CustomShapedRecipe;

import us.fihgu.toolbox.item.DamageableItem;

/**
 * The class of the DiamondDagger. It extends CustomTexturedTool, which
 * means that this will be of type Custom Textured Tool.
 * 
 * @author chrismin13
 *
 */
public class DiamondDagger extends CustomTexturedTool {

	// This is required.
	public DiamondDagger() {
		/*
		 * Original values of the Custom Items. I will base it on the Diamond
		 * Sword as it has a lot of durability points free. Next is the ID Name.
		 * This is just a unique identifier for the Custom Item. It is of the
		 * form "plugin_name:item_name". THe first part of it will be used to
		 * get the folder for the texture from the Resource Pack.
		 * "obsidian_sword_1" is the default texture that will be used from the
		 * Resource Pack. This will be the texture that you'll get when you
		 * craft the item.
		 */
		super(DamageableItem.DIAMOND_SWORD, "rpg_additions:diamond_dagger", "diamond_dagger");

		/*
		 * Add all the textures required for the Custom Item so that we can use
		 * them later.
		 
		addTexture("obsidian_sword_2");
		addTexture("obsidian_sword_3");
		addTexture("obsidian_sword_4");
		addTexture("obsidian_sword_5");
		addTexture("obsidian_sword_6");
        */
		/*
		 * Setting some Required values
		 */
		setUnbreakable(true); // Required, so we can set Custom Fake Durability
								// later
		setUnbreakableVisibility(false); // Hides the "Unbreakable" text found
											// when the item is unbreakable.
		addAttackDamage(4.0); // This will set the Attack Damage to 4.
		addAttackSpeed(2.1); // This will set the Attack Speed to 1.6.
		setToolLikeAttributes(true); // This will add Lore Text for Attack Speed
										// and Damage
		setAttributeVisibility(false); // This will hide the extra Attack Speed
										// and Attack Damage text

		setDisplayName("Diamond Dagger"); // This will set the name.
		setFakeDurability(1494); // This will set the maximum durability

		// This will get the Crafting Recipe for the Sword and set the materials
		// for crafting to Obsidian and Redstone Torch.
		List<CustomShapedRecipe> list = new ArrayList<CustomShapedRecipe>();
		list.add(new CustomShapedRecipe().setShape("xxx", "xdx", "sxx").setIngredient('x', Material.AIR)
				.setIngredient('d', Material.DIAMOND).setIngredient('s', Material.STICK));
		list.add(new CustomShapedRecipe().setShape("xxx", "xdx", "xxs").setIngredient('x', Material.AIR)
				.setIngredient('d', Material.DIAMOND).setIngredient('s', Material.STICK));
		addAllCustomRecipes(list);
	}

}