package me.drkmatr1984.RPGAdditions.items.daggers;

import me.drkmatr1984.RPGAdditions.customitemtypes.CustomDagger;
import us.fihgu.toolbox.item.DamageableItem;

public class RubyDagger extends CustomDagger {
	
	public RubyDagger() {
		super(DamageableItem.DIAMOND_SWORD, 1932, "ruby_dagger", "Ruby Dagger");
		addAttackDamage(4.0);    //Attack Damage
	}
}