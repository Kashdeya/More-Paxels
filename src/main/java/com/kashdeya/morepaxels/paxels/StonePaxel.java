package com.kashdeya.morepaxels.paxels;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class StonePaxel extends MainPaxels {

	public StonePaxel(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName("StonePaxel");
	}
	
	@Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        ItemStack mat = new ItemStack(Blocks.STONE);
        if (mat != null && net.minecraftforge.oredict.OreDictionary.itemMatches(mat, repair, false)) return true;
        return super.getIsRepairable(toRepair, repair);
    }
}
