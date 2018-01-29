package me.drkmatr1984.RPGAdditions.customitemtypes;

import com.chrismin13.additionsapi.items.textured.CustomTexturedTool;
import us.fihgu.toolbox.item.DamageableItem;

public class CustomAxe extends CustomTexturedTool {
	
	public CustomAxe(DamageableItem damageable, int durability, double attackSpeed, String identifier, String name) {
		super(damageable, "rpg_additions:" + identifier, identifier);
		setUnbreakable(true); 
		setUnbreakableVisibility(false);
		addAttackSpeed(attackSpeed);     //Attack Speed
		setFakeDurability(durability);
		setToolLikeAttributes(true);
		setAttributeVisibility(false);
		setDisplayName(name);
	}
}