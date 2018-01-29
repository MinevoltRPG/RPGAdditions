package me.drkmatr1984.RPGAdditions.items.hoes;

import me.drkmatr1984.RPGAdditions.customitemtypes.CustomHoe;
import us.fihgu.toolbox.item.DamageableItem;

public class OnyxHoe extends CustomHoe {
	
	public OnyxHoe() {
		super(DamageableItem.DIAMOND_HOE, 2048, 0.25,  "onyx_hoe", "Onyx Hoe");
		addAttackDamage(1.5);		
	}
}