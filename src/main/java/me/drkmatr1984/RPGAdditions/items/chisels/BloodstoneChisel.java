package me.drkmatr1984.RPGAdditions.items.chisels;

import me.drkmatr1984.RPGAdditions.customitemtypes.CustomChisel;
import us.fihgu.toolbox.item.DamageableItem;

public class BloodstoneChisel extends CustomChisel {
	
	public BloodstoneChisel() {
		super(DamageableItem.DIAMOND_PICKAXE, 2048, "bloodstone_chisel", "Bloodstone Chisel");
		addAttackDamage(6.0);		
	}
}