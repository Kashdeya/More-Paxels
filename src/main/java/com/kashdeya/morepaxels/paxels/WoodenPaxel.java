package com.kashdeya.morepaxels.paxels;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class WoodenPaxel extends MainPaxels {

	public WoodenPaxel(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName("WoodenPaxel");
	}
	
	@Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        ItemStack mat = new ItemStack(Blocks.PLANKS);
        if (mat != null && net.minecraftforge.oredict.OreDictionary.itemMatches(mat, repair, false)) return true;
        return super.getIsRepairable(toRepair, repair);
    }
	
}
