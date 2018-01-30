package me.drkmatr1984.RPGAdditions.items.shovels;

import me.drkmatr1984.RPGAdditions.customitemtypes.CustomShovel;
import us.fihgu.toolbox.item.DamageableItem;

public class RubyShovel extends CustomShovel {
	
	public RubyShovel() {
		super(DamageableItem.DIAMOND_SHOVEL, 2048, "ruby_shovel", "Ruby Shovel");
		addAttackDamage(6.5);		
	}
}