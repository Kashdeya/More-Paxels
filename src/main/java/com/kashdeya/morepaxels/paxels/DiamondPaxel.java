package com.kashdeya.morepaxels.paxels;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class DiamondPaxel extends MainPaxels {
	
	public DiamondPaxel(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName("DiamondPaxel");
	}
	
	@Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        ItemStack mat = new ItemStack(Items.DIAMOND);
        if (mat != null && net.minecraftforge.oredict.OreDictionary.itemMatches(mat, repair, false)) return true;
        return super.getIsRepairable(toRepair, repair);
    }
	
}