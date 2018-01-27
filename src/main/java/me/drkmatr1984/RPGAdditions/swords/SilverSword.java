package me.drkmatr1984.RPGAdditions.swords;

import us.fihgu.toolbox.item.DamageableItem;

public class SilverSword extends CustomSword {
	
	public SilverSword() {
		super(DamageableItem.IRON_SWORD, 251, "silver_sword", "Silver Sword");
		addAttackDamage(6.0);
	}
}