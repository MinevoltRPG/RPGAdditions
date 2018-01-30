package me.drkmatr1984.RPGAdditions.items.sickels;

import me.drkmatr1984.RPGAdditions.customitemtypes.CustomSickle;
import us.fihgu.toolbox.item.DamageableItem;

public class YellowTopazSickle extends CustomSickle {
	
	public YellowTopazSickle() {
		super(DamageableItem.DIAMOND_HOE, 2048, 5, 0.25,  "yellow_topaz_sickle", "Topaz Sickle");
		addAttackDamage(1.5);		
	}
}