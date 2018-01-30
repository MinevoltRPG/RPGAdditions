package me.drkmatr1984.RPGAdditions.items.sickels;

import me.drkmatr1984.RPGAdditions.customitemtypes.CustomSickle;
import us.fihgu.toolbox.item.DamageableItem;

public class AmethystSickle extends CustomSickle {
	
	public AmethystSickle() {
		super(DamageableItem.DIAMOND_HOE, 2048, 5, 0.25,  "amethyst_sickle", "Amethyst Sickle");
		addAttackDamage(1.5);		
	}
}