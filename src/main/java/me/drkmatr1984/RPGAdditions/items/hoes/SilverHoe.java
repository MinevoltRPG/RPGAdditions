package me.drkmatr1984.RPGAdditions.items.hoes;

import me.drkmatr1984.RPGAdditions.customitemtypes.CustomHoe;
import us.fihgu.toolbox.item.DamageableItem;

public class SilverHoe extends CustomHoe {
	
	public SilverHoe() {
		super(DamageableItem.DIAMOND_HOE, 502, 0.25,  "silver_hoe", "Silver Hoe");
		addAttackDamage(1.5);		
	}
}