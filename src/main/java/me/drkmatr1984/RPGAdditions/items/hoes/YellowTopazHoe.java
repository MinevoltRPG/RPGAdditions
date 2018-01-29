package me.drkmatr1984.RPGAdditions.items.hoes;

import me.drkmatr1984.RPGAdditions.customitemtypes.CustomHoe;
import us.fihgu.toolbox.item.DamageableItem;

public class YellowTopazHoe extends CustomHoe {
	
	public YellowTopazHoe() {
		super(DamageableItem.DIAMOND_HOE, 2048, 0.25,  "yellow_topaz_hoe", "Topaz Hoe");
		addAttackDamage(1.5);		
	}
}