package me.drkmatr1984.RPGAdditions.items.hoes;

import me.drkmatr1984.RPGAdditions.customitemtypes.CustomHoe;
import us.fihgu.toolbox.item.DamageableItem;

public class SapphireHoe extends CustomHoe {
	
	public SapphireHoe() {
		super(DamageableItem.DIAMOND_HOE, 2048, 0.25,  "sapphire_hoe", "Sapphire Hoe");
		addAttackDamage(1.5);		
	}
}