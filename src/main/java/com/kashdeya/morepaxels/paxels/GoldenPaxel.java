package com.kashdeya.morepaxels.paxels;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class GoldenPaxel extends MainPaxels {

	public GoldenPaxel(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName("GoldenPaxel");
	}
	
	@Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        ItemStack mat = new ItemStack(Items.GOLD_INGOT);
        if (mat != null && net.minecraftforge.oredict.OreDictionary.itemMatches(mat, repair, false)) return true;
        return super.getIsRepairable(toRepair, repair);
    }
	
}
