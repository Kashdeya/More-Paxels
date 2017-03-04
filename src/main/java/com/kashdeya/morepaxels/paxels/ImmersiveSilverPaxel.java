package com.kashdeya.morepaxels.paxels;

import net.minecraft.item.ItemStack;
import blusunrize.immersiveengineering.common.IEContent;

import com.kashdeya.morepaxels.handlers.ConfigHandler;

public class ImmersiveSilverPaxel extends MainPaxels {
	
	public ImmersiveSilverPaxel(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName("ImmersiveSilverPaxel");
		this.setMaxDamage(ConfigHandler.ImmersiveSilverDamage);
	}
	
    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        ItemStack mat = new ItemStack(IEContent.itemMetal, 1, 3);
        if (mat != null && net.minecraftforge.oredict.OreDictionary.itemMatches(mat, repair, false)) return true;
        return super.getIsRepairable(toRepair, repair);
    }
	
}