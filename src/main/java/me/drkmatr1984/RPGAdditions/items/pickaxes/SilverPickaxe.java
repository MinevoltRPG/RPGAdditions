package me.drkmatr1984.RPGAdditions.items.pickaxes;

import me.drkmatr1984.RPGAdditions.RPGAdditions;
import me.drkmatr1984.RPGAdditions.customitemtypes.CustomPickaxe;
import us.fihgu.toolbox.item.DamageableItem;

public class SilverPickaxe extends CustomPickaxe {
	
	public SilverPickaxe() {
		super(DamageableItem.IRON_PICKAXE, 502, "silver_pickaxe", "Silver Pickaxe");
		addAttackDamage(6.0);
		if(RPGAdditions.getInstance().isWerewolf()) {
			for(String s : RPGAdditions.getInstance().getWerewolfPluginManager().getSilverLore()) {
				if(s.contains("sword")){
					s = s.replace("sword", "pickaxe");
				}
				if(s.contains("Sword")) {
					s = s.replace("Sword", "Pickaxe");
				}
				addLoreLine(s);
			}
		}
	}
}