package com.kashdeya.morepaxels.paxels.disabled;

import com.kashdeya.morepaxels.handlers.ConfigHandler;
import com.kashdeya.morepaxels.paxels.MainPaxels;

public class ProxiiPaxel extends MainPaxels {
	
	public ProxiiPaxel(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName("ProxiiPaxel");
		this.setMaxDamage(ConfigHandler.ProxiiDamage);
	}
	/*
    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        ItemStack mat = new ItemStack(Items.proxiiIngot);
        if (mat != null && net.minecraftforge.oredict.OreDictionary.itemMatches(mat, repair, false)) return true;
        return super.getIsRepairable(toRepair, repair);
    }
	*/
}