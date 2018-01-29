package me.drkmatr1984.RPGAdditions.items.axes;

import me.drkmatr1984.RPGAdditions.customitemtypes.CustomAxe;
import us.fihgu.toolbox.item.DamageableItem;

public class BloodstoneAxe extends CustomAxe {
	
	public BloodstoneAxe() {
		super(DamageableItem.STONE_AXE, 2048, 1.1,  "bloodstone_axe", "Bloodstone Axe");
		addAttackDamage(10.0);		
	}
}