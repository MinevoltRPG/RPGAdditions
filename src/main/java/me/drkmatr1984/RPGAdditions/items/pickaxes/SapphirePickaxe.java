package me.drkmatr1984.RPGAdditions.items.pickaxes;

import me.drkmatr1984.RPGAdditions.customitemtypes.CustomPickaxe;
import us.fihgu.toolbox.item.DamageableItem;

public class SapphirePickaxe extends CustomPickaxe {
	
	public SapphirePickaxe() {
		super(DamageableItem.DIAMOND_PICKAXE, 2048, "sapphire_pickaxe", "Sapphire Pickaxe");
		addAttackDamage(6.0);		
	}
}