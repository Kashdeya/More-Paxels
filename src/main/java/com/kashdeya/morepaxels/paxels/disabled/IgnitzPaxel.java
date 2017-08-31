package com.kashdeya.morepaxels.paxels.disabled;

import com.kashdeya.morepaxels.handlers.ConfigHandler;
import com.kashdeya.morepaxels.paxels.MainPaxels;

public class IgnitzPaxel extends MainPaxels {
	
	public IgnitzPaxel(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName("IgnitzPaxel");
		this.setMaxDamage(ConfigHandler.IgnitzDamage);
	}
	/*
    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        ItemStack mat = new ItemStack(Items.ignitzIngot);
        if (mat != null && net.minecraftforge.oredict.OreDictionary.itemMatches(mat, repair, false)) return true;
        return super.getIsRepairable(toRepair, repair);
    }
	*/
}