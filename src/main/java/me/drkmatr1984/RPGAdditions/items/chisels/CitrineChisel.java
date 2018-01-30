package me.drkmatr1984.RPGAdditions.items.chisels;

import me.drkmatr1984.RPGAdditions.customitemtypes.CustomChisel;
import us.fihgu.toolbox.item.DamageableItem;

public class CitrineChisel extends CustomChisel {
	
	public CitrineChisel() {
		super(DamageableItem.DIAMOND_PICKAXE, 2048, "citrine_chisel", "Citrine Chisel");
		addAttackDamage(6.0);		
	}
}