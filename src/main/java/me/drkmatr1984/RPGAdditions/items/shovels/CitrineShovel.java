package me.drkmatr1984.RPGAdditions.items.shovels;

import me.drkmatr1984.RPGAdditions.customitemtypes.CustomShovel;
import us.fihgu.toolbox.item.DamageableItem;

public class CitrineShovel extends CustomShovel {
	
	public CitrineShovel() {
		super(DamageableItem.DIAMOND_SHOVEL, 2048, "citrine_shovel", "Citrine Shovel");
		addAttackDamage(6.5);		
	}
}