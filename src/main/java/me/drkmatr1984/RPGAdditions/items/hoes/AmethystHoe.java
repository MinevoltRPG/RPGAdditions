package me.drkmatr1984.RPGAdditions.items.hoes;

import me.drkmatr1984.RPGAdditions.customitemtypes.CustomHoe;
import us.fihgu.toolbox.item.DamageableItem;

public class AmethystHoe extends CustomHoe {
	
	public AmethystHoe() {
		super(DamageableItem.DIAMOND_HOE, 2048, 0.25,  "amethyst_hoe", "Amethyst Hoe");
		addAttackDamage(1.5);		
	}
}