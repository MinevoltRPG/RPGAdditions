package me.drkmatr1984.RPGAdditions.items.daggers;

import me.drkmatr1984.RPGAdditions.customitemtypes.CustomDagger;
import us.fihgu.toolbox.item.DamageableItem;

public class SapphireDagger extends CustomDagger {
	
	public SapphireDagger() {
		super(DamageableItem.DIAMOND_SWORD, 1932, "sapphire_dagger", "Sapphire Dagger");
		addAttackDamage(4.0);    //Attack Damage
	}
}