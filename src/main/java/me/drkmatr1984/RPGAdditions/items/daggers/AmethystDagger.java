package me.drkmatr1984.RPGAdditions.items.daggers;

import me.drkmatr1984.RPGAdditions.customitemtypes.CustomDagger;
import us.fihgu.toolbox.item.DamageableItem;

public class AmethystDagger extends CustomDagger {
	
	public AmethystDagger() {
		super(DamageableItem.DIAMOND_SWORD, 1932, "amethyst_dagger", "Amethyst Dagger");
		addAttackDamage(4.0);    //Attack Damage
	}
}