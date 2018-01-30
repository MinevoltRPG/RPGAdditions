package me.drkmatr1984.RPGAdditions.items.pickaxes;

import me.drkmatr1984.RPGAdditions.customitemtypes.CustomPickaxe;
import us.fihgu.toolbox.item.DamageableItem;

public class CitrinePickaxe extends CustomPickaxe {
	
	public CitrinePickaxe() {
		super(DamageableItem.DIAMOND_PICKAXE, 2048, "citrine_pickaxe", "Citrine Pickaxe");
		addAttackDamage(6.0);		
	}
}