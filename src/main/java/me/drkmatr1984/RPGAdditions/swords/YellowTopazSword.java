package me.drkmatr1984.RPGAdditions.swords;

import me.drkmatr1984.RPGAdditions.customitemtypes.CustomSword;
import us.fihgu.toolbox.item.DamageableItem;

public class YellowTopazSword extends CustomSword {
	
	public YellowTopazSword() {
		super(DamageableItem.DIAMOND_SWORD, 2048, "yellow_topaz_sword", "Topaz Sword");
		addAttackDamage(8.0);		
	}
}