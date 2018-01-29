package me.drkmatr1984.RPGAdditions.swords;

import me.drkmatr1984.RPGAdditions.customitemtypes.CustomSword;
import us.fihgu.toolbox.item.DamageableItem;

public class RubySword extends CustomSword {
	
	public RubySword() {
		super(DamageableItem.DIAMOND_SWORD, 2048, "ruby_sword", "Ruby Sword");
		addAttackDamage(8.0);		
	}
}