package me.drkmatr1984.RPGAdditions.items.doubleaxes;

import me.drkmatr1984.RPGAdditions.customitemtypes.CustomDoubleAxe;
import us.fihgu.toolbox.item.DamageableItem;

public class YellowTopazDoubleAxe extends CustomDoubleAxe {
	
	public YellowTopazDoubleAxe() {
		super(DamageableItem.DIAMOND_AXE, 2048, 1.1,  "yellow_topaz_double_axe", "Topaz Double Axe");
		addAttackDamage(10.0);		
	}
}