package me.drkmatr1984.RPGAdditions.swords;

import me.drkmatr1984.RPGAdditions.customitemtypes.CustomSword;
import us.fihgu.toolbox.item.DamageableItem;

public class AmethystSword extends CustomSword {
	
	public AmethystSword() {
		super(DamageableItem.DIAMOND_SWORD, 2048, "amethyst_sword", "Amethyst Sword");
		addAttackDamage(8.0);		
	}
}