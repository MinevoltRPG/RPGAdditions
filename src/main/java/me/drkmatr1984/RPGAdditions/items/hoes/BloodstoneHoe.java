package me.drkmatr1984.RPGAdditions.items.hoes;

import me.drkmatr1984.RPGAdditions.customitemtypes.CustomHoe;
import us.fihgu.toolbox.item.DamageableItem;

public class BloodstoneHoe extends CustomHoe {
	
	public BloodstoneHoe() {
		super(DamageableItem.DIAMOND_HOE, 2048, 0.25,  "bloodstone_hoe", "Bloodstone Hoe");
		addAttackDamage(1.5);		
	}
}