package me.drkmatr1984.RPGAdditions.items.chisels;

import me.drkmatr1984.RPGAdditions.customitemtypes.CustomChisel;
import us.fihgu.toolbox.item.DamageableItem;

public class AmethystChisel extends CustomChisel {
	
	public AmethystChisel() {
		super(DamageableItem.DIAMOND_PICKAXE, 2048, "amethyst_chisel", "Amethyst Chisel");
		addAttackDamage(6.0);		
	}
}