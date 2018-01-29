package me.drkmatr1984.RPGAdditions.items.hoes;

import me.drkmatr1984.RPGAdditions.customitemtypes.CustomHoe;
import us.fihgu.toolbox.item.DamageableItem;

public class CitrineHoe extends CustomHoe {
	
	public CitrineHoe() {
		super(DamageableItem.DIAMOND_HOE, 2048, 0.25,  "citrine_hoe", "Citrine Hoe");
		addAttackDamage(1.5);		
	}
}