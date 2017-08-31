package com.kashdeya.morepaxels.paxels;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class IronPaxel extends MainPaxels {

	public IronPaxel(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName("IronPaxel");
	}
	
	@Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        ItemStack mat = new ItemStack(Items.IRON_INGOT);
        if (mat != null && net.minecraftforge.oredict.OreDictionary.itemMatches(mat, repair, false)) return true;
        return super.getIsRepairable(toRepair, repair);
    }
	
}
