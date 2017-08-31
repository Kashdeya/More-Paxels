package com.kashdeya.morepaxels.paxels.disabled;

import com.kashdeya.morepaxels.handlers.ConfigHandler;
import com.kashdeya.morepaxels.paxels.MainPaxels;

public class IoxPaxel extends MainPaxels {
	
	public IoxPaxel(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName("IoxPaxel");
		this.setMaxDamage(ConfigHandler.IoxDamage);
	}
	/*
    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        ItemStack mat = new ItemStack(Items.ioxIngot);
        if (mat != null && net.minecraftforge.oredict.OreDictionary.itemMatches(mat, repair, false)) return true;
        return super.getIsRepairable(toRepair, repair);
    }
	*/
}