package me.drkmatr1984.RPGAdditions.items.hoes;

import me.drkmatr1984.RPGAdditions.RPGAdditions;
import me.drkmatr1984.RPGAdditions.customitemtypes.CustomHoe;
import us.fihgu.toolbox.item.DamageableItem;

public class SilverHoe extends CustomHoe {
	
	public SilverHoe() {
		super(DamageableItem.IRON_HOE, 502, 0.25,  "silver_hoe", "Silver Hoe");
		addAttackDamage(1.5);
		if(RPGAdditions.getInstance().isWerewolf()) {
			for(String s : RPGAdditions.getInstance().getWerewolfPluginManager().getSilverLore()) {
				if(s.contains("sword")){
					s = s.replace("sword", "hoe");
				}
				if(s.contains("Sword")) {
					s = s.replace("Sword", "Hoe");
				}
				addLoreLine(s);
			}
		}
	}
}