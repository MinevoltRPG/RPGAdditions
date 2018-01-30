package me.drkmatr1984.RPGAdditions.items.shovels;

import me.drkmatr1984.RPGAdditions.customitemtypes.CustomShovel;
import us.fihgu.toolbox.item.DamageableItem;

public class AmethystShovel extends CustomShovel {
	
	public AmethystShovel() {
		super(DamageableItem.DIAMOND_SHOVEL, 2048, "amethyst_shovel", "Amethyst Shovel");
		addAttackDamage(6.5);		
	}
}