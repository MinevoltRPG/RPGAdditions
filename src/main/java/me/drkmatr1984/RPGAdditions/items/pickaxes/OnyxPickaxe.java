package me.drkmatr1984.RPGAdditions.items.pickaxes;

import me.drkmatr1984.RPGAdditions.customitemtypes.CustomPickaxe;
import us.fihgu.toolbox.item.DamageableItem;

public class OnyxPickaxe extends CustomPickaxe {
	
	public OnyxPickaxe() {
		super(DamageableItem.DIAMOND_PICKAXE, 2048, "onyx_pickaxe", "Onyx Pickaxe");
		addAttackDamage(6.0);		
	}
}