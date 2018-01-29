package me.drkmatr1984.RPGAdditions.items.axes;

import me.drkmatr1984.RPGAdditions.customitemtypes.CustomAxe;
import us.fihgu.toolbox.item.DamageableItem;

public class RubyAxe extends CustomAxe {
	
	public RubyAxe() {
		super(DamageableItem.DIAMOND_AXE, 2048, 1.1,  "ruby_axe", "Ruby Axe");
		addAttackDamage(10.0);		
	}
}