package me.drkmatr1984.RPGAdditions.items.daggers;

import me.drkmatr1984.RPGAdditions.customitemtypes.CustomDagger;
import us.fihgu.toolbox.item.DamageableItem;

public class YellowTopazDagger extends CustomDagger {
	
	public YellowTopazDagger() {
		super(DamageableItem.DIAMOND_SWORD, 1932, "yellow_topaz_dagger", "Topaz Dagger");
		addAttackDamage(4.0);    //Attack Damage
	}
}