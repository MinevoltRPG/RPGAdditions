package me.drkmatr1984.RPGAdditions.items.pickaxes;

import me.drkmatr1984.RPGAdditions.customitemtypes.CustomPickaxe;
import us.fihgu.toolbox.item.DamageableItem;

public class RubyPickaxe extends CustomPickaxe {
	
	public RubyPickaxe() {
		super(DamageableItem.DIAMOND_PICKAXE, 2048, "ruby_pickaxe", "Ruby Pickaxe");
		addAttackDamage(6.0);		
	}
}