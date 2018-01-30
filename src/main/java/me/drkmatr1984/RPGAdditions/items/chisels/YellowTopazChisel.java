package me.drkmatr1984.RPGAdditions.items.chisels;

import me.drkmatr1984.RPGAdditions.customitemtypes.CustomChisel;
import us.fihgu.toolbox.item.DamageableItem;

public class YellowTopazChisel extends CustomChisel {
	
	public YellowTopazChisel() {
		super(DamageableItem.DIAMOND_PICKAXE, 2048, "yellow_topaz_chisel", "Topaz Chisel");
		addAttackDamage(6.0);		
	}
}