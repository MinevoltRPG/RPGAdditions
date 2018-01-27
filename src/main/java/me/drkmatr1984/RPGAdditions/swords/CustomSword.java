package me.drkmatr1984.RPGAdditions.swords;

import com.chrismin13.additionsapi.items.textured.CustomTexturedTool;
import us.fihgu.toolbox.item.DamageableItem;

public class CustomSword extends CustomTexturedTool {
	
	public CustomSword(DamageableItem damageable, int durability, String identifier, String name) {
		super(damageable, "rpg_additions:" + identifier, identifier);
		setUnbreakable(true); 
		setUnbreakableVisibility(false);
		addAttackSpeed(1.6);     //Attack Speed
		setFakeDurability(durability);
		setToolLikeAttributes(true);
		setAttributeVisibility(false);
		setDisplayName(name);
	}
}