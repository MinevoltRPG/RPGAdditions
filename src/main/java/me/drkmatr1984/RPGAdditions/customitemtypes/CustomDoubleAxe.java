package me.drkmatr1984.RPGAdditions.customitemtypes;

import com.chrismin13.additionsapi.items.textured.CustomTexturedTool;
import com.chrismin13.vanillaadditions.abilities.DoubleAxeAbilities;

import us.fihgu.toolbox.item.DamageableItem;

public class CustomDoubleAxe extends CustomTexturedTool implements DoubleAxeAbilities{
	
	public CustomDoubleAxe(DamageableItem damageable, int durability, double attackSpeed, String identifier, String name) {
		super(damageable, "rpg_additions:" + identifier, identifier);
		addAttackSpeed(attackSpeed);     //Attack Speed
		setFakeDurability(durability);
		setToolLikeAttributes(true);
		setAttributeVisibility(false);
		setDisplayName(name);
	}
	
}