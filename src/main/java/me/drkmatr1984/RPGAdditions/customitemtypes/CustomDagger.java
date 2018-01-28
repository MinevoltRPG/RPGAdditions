package me.drkmatr1984.RPGAdditions.customitemtypes;

import com.chrismin13.additionsapi.items.textured.CustomTexturedTool;
import us.fihgu.toolbox.item.DamageableItem;

public class CustomDagger extends CustomTexturedTool {
	
	public CustomDagger(DamageableItem damageable, int durability, String identifier, String name) {
		super(damageable, "rpg_additions:" + identifier, identifier);
		setUnbreakable(true); 
		setUnbreakableVisibility(false);
		addAttackSpeed(2.1);     //Attack Speed
		setFakeDurability(durability);
		setToolLikeAttributes(true);
		setAttributeVisibility(false);
		setDisplayName(name);
	}
	
}