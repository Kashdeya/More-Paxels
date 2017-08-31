package com.kashdeya.morepaxels.paxels.disabled;

import com.kashdeya.morepaxels.handlers.ConfigHandler;
import com.kashdeya.morepaxels.paxels.MainPaxels;

public class LumixPaxel extends MainPaxels {
	
	public LumixPaxel(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName("LumixPaxel");
		this.setMaxDamage(ConfigHandler.LumixDamage);
	}
	/*
    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        ItemStack mat = new ItemStack(Items.lumixIngot);
        if (mat != null && net.minecraftforge.oredict.OreDictionary.itemMatches(mat, repair, false)) return true;
        return super.getIsRepairable(toRepair, repair);
    }
	*/
}