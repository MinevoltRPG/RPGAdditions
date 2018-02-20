package me.drkmatr1984.RPGAdditions.customitemtypes;

import com.chrismin13.additionsapi.items.textured.CustomTexturedTool;
import com.chrismin13.vanillaadditions.abilities.ChiselAbilities;

import us.fihgu.toolbox.item.DamageableItem;

public class CustomChisel extends CustomTexturedTool implements ChiselAbilities{
	
	public CustomChisel(DamageableItem damageable, int durability, String identifier, String name) {
		super(damageable, "rpg_additions:" + identifier, identifier);
		addAttackSpeed(1.2);     //Attack Speed
		setFakeDurability(durability);
		setToolLikeAttributes(true);
		setAttributeVisibility(false);
		setDisplayName(name);
	}
	
}