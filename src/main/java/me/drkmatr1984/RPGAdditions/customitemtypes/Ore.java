package me.drkmatr1984.RPGAdditions.customitemtypes;

import com.chrismin13.additionsapi.items.textured.CustomTexturedItem;
import us.fihgu.toolbox.item.DamageableItem;

public class Ore extends CustomTexturedItem {

	public Ore(String identifier, String name) {
		super(DamageableItem.DIAMOND_HOE,  "rpg_additions:" + identifier, identifier);
		setUnbreakable(true); 
		setUnbreakableVisibility(false); 
		setAttributeVisibility(false);
		setHoeAbilities(false);
		setDisplayName(name);
	}
}