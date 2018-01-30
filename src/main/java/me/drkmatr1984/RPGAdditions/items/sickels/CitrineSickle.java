package me.drkmatr1984.RPGAdditions.items.sickels;

import me.drkmatr1984.RPGAdditions.customitemtypes.CustomSickle;
import us.fihgu.toolbox.item.DamageableItem;

public class CitrineSickle extends CustomSickle {
	
	public CitrineSickle() {
		super(DamageableItem.DIAMOND_HOE, 2048, 5, 0.25,  "citrine_sickle", "Citrine Sickle");
		addAttackDamage(1.5);		
	}
}