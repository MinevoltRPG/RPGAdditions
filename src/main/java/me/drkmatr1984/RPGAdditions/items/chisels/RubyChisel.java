package me.drkmatr1984.RPGAdditions.items.chisels;

import me.drkmatr1984.RPGAdditions.customitemtypes.CustomChisel;
import us.fihgu.toolbox.item.DamageableItem;

public class RubyChisel extends CustomChisel {
	
	public RubyChisel() {
		super(DamageableItem.DIAMOND_PICKAXE, 2048, "ruby_chisel", "Ruby Chisel");
		addAttackDamage(6.0);		
	}
}