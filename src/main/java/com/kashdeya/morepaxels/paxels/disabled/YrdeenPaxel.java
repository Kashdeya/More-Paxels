package com.kashdeya.morepaxels.paxels.disabled;

import com.kashdeya.morepaxels.handlers.ConfigHandler;
import com.kashdeya.morepaxels.paxels.MainPaxels;

public class YrdeenPaxel extends MainPaxels {
	
	public YrdeenPaxel(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName("YrdeenPaxel");
		this.setMaxDamage(ConfigHandler.YrdeenDamage);
	}
	/*
    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        ItemStack mat = new ItemStack(Items.yrdeenIngot);
        if (mat != null && net.minecraftforge.oredict.OreDictionary.itemMatches(mat, repair, false)) return true;
        return super.getIsRepairable(toRepair, repair);
    }
	*/
}