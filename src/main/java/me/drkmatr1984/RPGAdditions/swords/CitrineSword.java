package me.drkmatr1984.RPGAdditions.swords;

import me.drkmatr1984.RPGAdditions.customitemtypes.CustomSword;
import us.fihgu.toolbox.item.DamageableItem;

public class CitrineSword extends CustomSword {
	
	public CitrineSword() {
		super(DamageableItem.DIAMOND_SWORD, 2048, "citrine_sword", "Citrine Sword");
		addAttackDamage(8.0);		
	}
}