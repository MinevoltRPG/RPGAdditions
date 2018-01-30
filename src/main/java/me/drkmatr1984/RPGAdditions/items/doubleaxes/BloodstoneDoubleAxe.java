package me.drkmatr1984.RPGAdditions.items.doubleaxes;

import me.drkmatr1984.RPGAdditions.customitemtypes.CustomDoubleAxe;
import us.fihgu.toolbox.item.DamageableItem;

public class BloodstoneDoubleAxe extends CustomDoubleAxe {
	
	public BloodstoneDoubleAxe() {
		super(DamageableItem.STONE_AXE, 2048, 1.1,  "bloodstone_double_axe", "Bloodstone Double Axe");
		addAttackDamage(10.0);		
	}
}