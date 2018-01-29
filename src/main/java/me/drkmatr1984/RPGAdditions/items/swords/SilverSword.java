package me.drkmatr1984.RPGAdditions.items.swords;

import me.drkmatr1984.RPGAdditions.customitemtypes.CustomSword;
import us.fihgu.toolbox.item.DamageableItem;

public class SilverSword extends CustomSword {
	
	public SilverSword() {
		super(DamageableItem.IRON_SWORD, 502, "silver_sword", "Silver Sword");
		addAttackDamage(8.0);
	}
}