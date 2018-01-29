package me.drkmatr1984.RPGAdditions.items.daggers;

import me.drkmatr1984.RPGAdditions.customitemtypes.CustomDagger;
import us.fihgu.toolbox.item.DamageableItem;

public class CitrineDagger extends CustomDagger {
	
	public CitrineDagger() {
		super(DamageableItem.DIAMOND_SWORD, 1932, "citrine_dagger", "Citrine Dagger");
		addAttackDamage(4.0);    //Attack Damage
	}
}