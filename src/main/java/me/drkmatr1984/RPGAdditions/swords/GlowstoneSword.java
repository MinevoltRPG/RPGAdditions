package me.drkmatr1984.RPGAdditions.swords;

import org.bukkit.Material;

import com.chrismin13.additionsapi.enums.ToolType;
import com.chrismin13.additionsapi.items.textured.CustomTexturedTool;

import us.fihgu.toolbox.item.DamageableItem;

public class GlowstoneSword extends CustomTexturedTool {

	
	public GlowstoneSword() {
		super(DamageableItem.DIAMOND_SWORD, "rpg_additions:glowstone_sword", "glowstone_sword");

		setUnbreakable(true); 
		setUnbreakableVisibility(false); 
		addAttackDamage(6.0);    //Attack Damage
		addAttackSpeed(1.6);     //Attack Speed
		setToolLikeAttributes(true);
		setAttributeVisibility(false);
		setDisplayName("Glowstone Sword");
		setFakeDurability(59);   //Durability

		//Crafting Recipe
		
		//Will have to update RecipeIngredient to Data Identifiers instead of numbers in the next
		//version
		addAllCustomRecipes(ToolType.SWORD.getCustomShapedRecipe(
				Material.GLOWSTONE_DUST, Material.STICK));
	}
}