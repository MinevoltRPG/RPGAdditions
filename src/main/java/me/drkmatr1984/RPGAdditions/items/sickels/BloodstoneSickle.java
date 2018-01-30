package me.drkmatr1984.RPGAdditions.items.sickels;

import me.drkmatr1984.RPGAdditions.customitemtypes.CustomSickle;
import us.fihgu.toolbox.item.DamageableItem;

public class BloodstoneSickle extends CustomSickle {
	
	public BloodstoneSickle() {
		super(DamageableItem.DIAMOND_HOE, 2048, 5, 0.25,  "bloodstone_sickle", "Bloodstone Sickle");
		addAttackDamage(1.5);		
	}
}