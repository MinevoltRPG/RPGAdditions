package me.drkmatr1984.RPGAdditions.swords;

import me.drkmatr1984.RPGAdditions.customitemtypes.CustomSword;
import us.fihgu.toolbox.item.DamageableItem;

public class BloodstoneSword extends CustomSword {
	
	public BloodstoneSword() {
		super(DamageableItem.STONE_SWORD, 2048, "bloodstone_sword", "Bloodstone Sword");
		addAttackDamage(8.0);		
	}
}