package me.drkmatr1984.RPGAdditions.items.chisels;

import me.drkmatr1984.RPGAdditions.customitemtypes.CustomChisel;
import us.fihgu.toolbox.item.DamageableItem;

public class SilverChisel extends CustomChisel {
	
	public SilverChisel() {
		super(DamageableItem.IRON_PICKAXE, 502, "silver_chisel", "Silver Chisel");
		addAttackDamage(6.0);		
	}
}