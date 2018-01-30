package me.drkmatr1984.RPGAdditions.items.sickels;

import me.drkmatr1984.RPGAdditions.customitemtypes.CustomSickle;
import us.fihgu.toolbox.item.DamageableItem;

public class SapphireSickle extends CustomSickle {
	
	public SapphireSickle() {
		super(DamageableItem.DIAMOND_HOE, 2048, 5, 0.25,  "sapphire_sickle", "Sapphire Sickle");
		addAttackDamage(1.5);		
	}
}