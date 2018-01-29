package me.drkmatr1984.RPGAdditions.items.hoes;

import me.drkmatr1984.RPGAdditions.customitemtypes.CustomHoe;
import us.fihgu.toolbox.item.DamageableItem;

public class RubyHoe extends CustomHoe {
	
	public RubyHoe() {
		super(DamageableItem.DIAMOND_HOE, 2048, 0.25,  "ruby_hoe", "Ruby Hoe");
		addAttackDamage(1.5);		
	}
}