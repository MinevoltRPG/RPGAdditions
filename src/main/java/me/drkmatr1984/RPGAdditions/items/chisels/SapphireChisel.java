package me.drkmatr1984.RPGAdditions.items.chisels;

import me.drkmatr1984.RPGAdditions.customitemtypes.CustomChisel;
import us.fihgu.toolbox.item.DamageableItem;

public class SapphireChisel extends CustomChisel {
	
	public SapphireChisel() {
		super(DamageableItem.DIAMOND_PICKAXE, 2048, "sapphire_chisel", "Sapphire Chisel");
		addAttackDamage(6.0);		
	}
}