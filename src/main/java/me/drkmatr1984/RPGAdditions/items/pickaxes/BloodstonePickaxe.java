package me.drkmatr1984.RPGAdditions.items.pickaxes;

import me.drkmatr1984.RPGAdditions.customitemtypes.CustomPickaxe;
import us.fihgu.toolbox.item.DamageableItem;

public class BloodstonePickaxe extends CustomPickaxe {
	
	public BloodstonePickaxe() {
		super(DamageableItem.DIAMOND_PICKAXE, 2048, "bloodstone_pickaxe", "Bloodstone Pickaxe");
		addAttackDamage(6.0);		
	}
}