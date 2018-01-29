package me.drkmatr1984.RPGAdditions.items.daggers;

import me.drkmatr1984.RPGAdditions.customitemtypes.CustomDagger;
import us.fihgu.toolbox.item.DamageableItem;

public class OnyxDagger extends CustomDagger {
	
	public OnyxDagger() {
		super(DamageableItem.DIAMOND_SWORD, 1932, "onyx_dagger", "Onyx Dagger");
		addAttackDamage(4.0);    //Attack Damage
	}
}