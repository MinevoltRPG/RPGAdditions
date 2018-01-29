package me.drkmatr1984.RPGAdditions.items.pickaxes;

import me.drkmatr1984.RPGAdditions.customitemtypes.CustomPickaxe;
import us.fihgu.toolbox.item.DamageableItem;

public class AmethystPickaxe extends CustomPickaxe {
	
	public AmethystPickaxe() {
		super(DamageableItem.DIAMOND_PICKAXE, 2048, "amethyst_hoe", "Amethyst Hoe");
		addAttackDamage(6.0);		
	}
}