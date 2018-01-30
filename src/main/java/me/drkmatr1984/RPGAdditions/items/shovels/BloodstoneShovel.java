package me.drkmatr1984.RPGAdditions.items.shovels;

import me.drkmatr1984.RPGAdditions.customitemtypes.CustomShovel;
import us.fihgu.toolbox.item.DamageableItem;

public class BloodstoneShovel extends CustomShovel {
	
	public BloodstoneShovel() {
		super(DamageableItem.DIAMOND_SHOVEL, 2048, "bloodstone_shovel", "Bloodstone Shovel");
		addAttackDamage(6.5);		
	}
}