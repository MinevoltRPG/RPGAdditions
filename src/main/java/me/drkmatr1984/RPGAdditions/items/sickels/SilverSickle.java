package me.drkmatr1984.RPGAdditions.items.sickels;

import me.drkmatr1984.RPGAdditions.customitemtypes.CustomSickle;
import us.fihgu.toolbox.item.DamageableItem;

public class SilverSickle extends CustomSickle {
	
	public SilverSickle() {
		super(DamageableItem.DIAMOND_HOE, 502, 5, 0.25,  "silver_sickle", "Silver Silver");
		addAttackDamage(1.5);		
	}
}