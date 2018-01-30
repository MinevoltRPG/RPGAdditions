package me.drkmatr1984.RPGAdditions.items.doubleaxes;

import me.drkmatr1984.RPGAdditions.customitemtypes.CustomDoubleAxe;
import us.fihgu.toolbox.item.DamageableItem;

public class AmethystDoubleAxe extends CustomDoubleAxe {
	
	public AmethystDoubleAxe() {
		super(DamageableItem.DIAMOND_AXE, 2048, 1.1,  "amethyst_double_axe", "Amethyst Double Axe");
		addAttackDamage(10.0);		
	}
}