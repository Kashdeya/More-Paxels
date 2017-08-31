package com.kashdeya.morepaxels.paxels.disabled;

import com.kashdeya.morepaxels.handlers.ConfigHandler;
import com.kashdeya.morepaxels.paxels.MainPaxels;

public class ObsidioritePaxel extends MainPaxels {
	
	public ObsidioritePaxel(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName("ObsidioritePaxel");
		this.setMaxDamage(ConfigHandler.ObsidioriteDamage);
	}
	/*
    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        ItemStack mat = new ItemStack(Items.obsidioriteIngot);
        if (mat != null && net.minecraftforge.oredict.OreDictionary.itemMatches(mat, repair, false)) return true;
        return super.getIsRepairable(toRepair, repair);
    }
	*/
}