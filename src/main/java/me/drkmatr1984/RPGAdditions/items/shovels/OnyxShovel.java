package me.drkmatr1984.RPGAdditions.items.shovels;

import me.drkmatr1984.RPGAdditions.customitemtypes.CustomShovel;
import us.fihgu.toolbox.item.DamageableItem;

public class OnyxShovel extends CustomShovel {
	
	public OnyxShovel() {
		super(DamageableItem.DIAMOND_SHOVEL, 2048, "onyx_shovel", "Onyx Shovel");
		addAttackDamage(6.5);		
	}
}