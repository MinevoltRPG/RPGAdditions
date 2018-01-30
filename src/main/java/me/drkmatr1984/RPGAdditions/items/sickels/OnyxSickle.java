package me.drkmatr1984.RPGAdditions.items.sickels;

import me.drkmatr1984.RPGAdditions.customitemtypes.CustomSickle;
import us.fihgu.toolbox.item.DamageableItem;

public class OnyxSickle extends CustomSickle {
	
	public OnyxSickle() {
		super(DamageableItem.DIAMOND_HOE, 2048, 5, 0.25,  "onyx_sickle", "Onyx Sickle");
		addAttackDamage(1.5);		
	}
}