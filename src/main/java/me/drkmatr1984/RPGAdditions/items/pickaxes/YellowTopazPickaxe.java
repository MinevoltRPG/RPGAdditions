package me.drkmatr1984.RPGAdditions.items.pickaxes;

import me.drkmatr1984.RPGAdditions.customitemtypes.CustomPickaxe;
import us.fihgu.toolbox.item.DamageableItem;

public class YellowTopazPickaxe extends CustomPickaxe {
	
	public YellowTopazPickaxe() {
		super(DamageableItem.DIAMOND_PICKAXE, 2048, "yellow_topaz_pickaxe", "Topaz Pickaxe");
		addAttackDamage(6.0);		
	}
}