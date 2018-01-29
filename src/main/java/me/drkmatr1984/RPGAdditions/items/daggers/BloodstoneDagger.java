package me.drkmatr1984.RPGAdditions.items.daggers;

import me.drkmatr1984.RPGAdditions.customitemtypes.CustomDagger;
import us.fihgu.toolbox.item.DamageableItem;

public class BloodstoneDagger extends CustomDagger {
	
	public BloodstoneDagger() {
		super(DamageableItem.STONE_SWORD, 1932, "bloodstone_dagger", "Bloodstone Dagger");
		addAttackDamage(4.0);    //Attack Damage
	}
}