package me.drkmatr1984.RPGAdditions.items.shovels;

import me.drkmatr1984.RPGAdditions.customitemtypes.CustomShovel;
import us.fihgu.toolbox.item.DamageableItem;

public class YellowTopazShovel extends CustomShovel {
	
	public YellowTopazShovel() {
		super(DamageableItem.DIAMOND_SHOVEL, 2048, "yellow_topaz_shovel", "Topaz Shovel");
		addAttackDamage(6.5);		
	}
}