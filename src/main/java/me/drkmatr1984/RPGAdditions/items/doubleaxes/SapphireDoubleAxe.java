package me.drkmatr1984.RPGAdditions.items.doubleaxes;

import me.drkmatr1984.RPGAdditions.customitemtypes.CustomDoubleAxe;
import us.fihgu.toolbox.item.DamageableItem;

public class SapphireDoubleAxe extends CustomDoubleAxe {
	
	public SapphireDoubleAxe() {
		super(DamageableItem.DIAMOND_AXE, 2048, 1.1,  "sapphire_double_axe", "Sapphire Double Axe");
		addAttackDamage(10.0);		
	}
}