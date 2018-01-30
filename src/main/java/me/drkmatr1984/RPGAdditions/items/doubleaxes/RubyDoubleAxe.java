package me.drkmatr1984.RPGAdditions.items.doubleaxes;

import me.drkmatr1984.RPGAdditions.customitemtypes.CustomDoubleAxe;
import us.fihgu.toolbox.item.DamageableItem;

public class RubyDoubleAxe extends CustomDoubleAxe {
	
	public RubyDoubleAxe() {
		super(DamageableItem.DIAMOND_AXE, 2048, 1.1,  "ruby_double_axe", "Ruby Double Axe");
		addAttackDamage(10.0);		
	}
}