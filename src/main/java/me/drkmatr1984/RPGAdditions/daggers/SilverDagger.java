package me.drkmatr1984.RPGAdditions.daggers;

import me.drkmatr1984.RPGAdditions.customitemtypes.CustomDagger;
import us.fihgu.toolbox.item.DamageableItem;

public class SilverDagger extends CustomDagger {
	
	public SilverDagger() {
		super(DamageableItem.IRON_SWORD, 219, "silver_dagger", "Silver Dagger");
		addAttackDamage(4.0);    //Attack Damage
	}
}