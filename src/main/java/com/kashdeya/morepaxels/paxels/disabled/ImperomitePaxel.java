package com.kashdeya.morepaxels.paxels.disabled;

import com.kashdeya.morepaxels.handlers.ConfigHandler;
import com.kashdeya.morepaxels.paxels.MainPaxels;

public class ImperomitePaxel extends MainPaxels {
	
	public ImperomitePaxel(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName("ImperomitePaxel");
		this.setMaxDamage(ConfigHandler.ImperomiteDamage);
	}
	/*
    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        ItemStack mat = new ItemStack(Items.imperomiteIngot);
        if (mat != null && net.minecraftforge.oredict.OreDictionary.itemMatches(mat, repair, false)) return true;
        return super.getIsRepairable(toRepair, repair);
    }
	*/
}