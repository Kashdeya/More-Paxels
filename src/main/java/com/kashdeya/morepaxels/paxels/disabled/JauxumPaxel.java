package com.kashdeya.morepaxels.paxels.disabled;

import com.kashdeya.morepaxels.handlers.ConfigHandler;
import com.kashdeya.morepaxels.paxels.MainPaxels;

public class JauxumPaxel extends MainPaxels {
	
	public JauxumPaxel(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName("JauxumPaxel");
		this.setMaxDamage(ConfigHandler.JauxumDamage);
	}
	/*
    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        ItemStack mat = new ItemStack(Items.jauxumIngot);
        if (mat != null && net.minecraftforge.oredict.OreDictionary.itemMatches(mat, repair, false)) return true;
        return super.getIsRepairable(toRepair, repair);
    }
	*/
}