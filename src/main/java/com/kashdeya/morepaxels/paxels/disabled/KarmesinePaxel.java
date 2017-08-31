package com.kashdeya.morepaxels.paxels.disabled;

import com.kashdeya.morepaxels.handlers.ConfigHandler;
import com.kashdeya.morepaxels.paxels.MainPaxels;

public class KarmesinePaxel extends MainPaxels {
	
	public KarmesinePaxel(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName("KarmesinePaxel");
		this.setMaxDamage(ConfigHandler.KarmesineDamage);
	}
	/*
    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        ItemStack mat = new ItemStack(Items.karmesineIngot);
        if (mat != null && net.minecraftforge.oredict.OreDictionary.itemMatches(mat, repair, false)) return true;
        return super.getIsRepairable(toRepair, repair);
    }
	*/
}