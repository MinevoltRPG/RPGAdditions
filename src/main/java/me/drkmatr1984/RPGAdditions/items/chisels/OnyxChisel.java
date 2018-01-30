package me.drkmatr1984.RPGAdditions.items.chisels;

import me.drkmatr1984.RPGAdditions.customitemtypes.CustomChisel;
import us.fihgu.toolbox.item.DamageableItem;

public class OnyxChisel extends CustomChisel {
	
	public OnyxChisel() {
		super(DamageableItem.DIAMOND_PICKAXE, 2048, "onyx_chisel", "Onyx Chisel");
		addAttackDamage(6.0);		
	}
}