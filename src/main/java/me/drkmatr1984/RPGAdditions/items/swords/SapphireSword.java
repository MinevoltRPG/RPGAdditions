package me.drkmatr1984.RPGAdditions.items.swords;

import me.drkmatr1984.RPGAdditions.customitemtypes.CustomSword;
import us.fihgu.toolbox.item.DamageableItem;

public class SapphireSword extends CustomSword {
	
	public SapphireSword() {
		super(DamageableItem.DIAMOND_SWORD, 2048, "sapphire_sword", "Sapphire Sword");
		addAttackDamage(8.0);		
	}
}