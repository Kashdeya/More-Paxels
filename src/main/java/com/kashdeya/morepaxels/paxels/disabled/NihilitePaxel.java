package com.kashdeya.morepaxels.paxels.disabled;

import com.kashdeya.morepaxels.handlers.ConfigHandler;
import com.kashdeya.morepaxels.paxels.MainPaxels;

public class NihilitePaxel extends MainPaxels {
	
	public NihilitePaxel(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName("NihilitePaxel");
		this.setMaxDamage(ConfigHandler.NihiliteDamage);
	}
	/*
    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        ItemStack mat = new ItemStack(Items.nihiliteIngot);
        if (mat != null && net.minecraftforge.oredict.OreDictionary.itemMatches(mat, repair, false)) return true;
        return super.getIsRepairable(toRepair, repair);
    }
	*/
}