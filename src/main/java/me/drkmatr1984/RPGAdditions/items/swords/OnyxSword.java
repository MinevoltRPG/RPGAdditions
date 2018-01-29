package me.drkmatr1984.RPGAdditions.items.swords;

import me.drkmatr1984.RPGAdditions.customitemtypes.CustomSword;
import us.fihgu.toolbox.item.DamageableItem;

public class OnyxSword extends CustomSword {
	
	public OnyxSword() {
		super(DamageableItem.DIAMOND_SWORD, 2048, "onyx_sword", "Onyx Sword");
		addAttackDamage(8.0);		
	}
}