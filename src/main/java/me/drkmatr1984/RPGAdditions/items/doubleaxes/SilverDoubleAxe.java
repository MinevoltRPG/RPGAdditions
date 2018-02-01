package me.drkmatr1984.RPGAdditions.items.doubleaxes;

import me.drkmatr1984.RPGAdditions.RPGAdditions;
import me.drkmatr1984.RPGAdditions.customitemtypes.CustomDoubleAxe;
import us.fihgu.toolbox.item.DamageableItem;

public class SilverDoubleAxe extends CustomDoubleAxe {
	
	public SilverDoubleAxe() {
		super(DamageableItem.IRON_AXE, 502, 0.9,  "silver_double_axe", "Silver Double Axe");
		addAttackDamage(10.0);
		if(RPGAdditions.getInstance().isWerewolf()) {
			for(String s : RPGAdditions.getInstance().getWerewolfPluginManager().getSilverLore()) {
				addLoreLine(s);
			}
		}
	}
}