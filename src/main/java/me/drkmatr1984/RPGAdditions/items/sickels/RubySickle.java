package me.drkmatr1984.RPGAdditions.items.sickels;

import me.drkmatr1984.RPGAdditions.customitemtypes.CustomSickle;
import us.fihgu.toolbox.item.DamageableItem;

public class RubySickle extends CustomSickle {
	
	public RubySickle() {
		super(DamageableItem.DIAMOND_HOE, 2048, 5, 0.25,  "ruby_sickle", "Ruby Sickle");
		addAttackDamage(1.5);		
	}
}