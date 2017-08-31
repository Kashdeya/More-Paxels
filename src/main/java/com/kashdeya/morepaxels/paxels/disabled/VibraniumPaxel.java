package com.kashdeya.morepaxels.paxels.disabled;

import com.kashdeya.morepaxels.handlers.ConfigHandler;
import com.kashdeya.morepaxels.paxels.MainPaxels;

public class VibraniumPaxel extends MainPaxels {
	
	public VibraniumPaxel(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName("VibraniumPaxel");
		this.setMaxDamage(ConfigHandler.VibraniumDamage);
	}
	/*
    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        ItemStack mat = new ItemStack(Items.vibraniumIngot);
        if (mat != null && net.minecraftforge.oredict.OreDictionary.itemMatches(mat, repair, false)) return true;
        return super.getIsRepairable(toRepair, repair);
    }
	*/
}