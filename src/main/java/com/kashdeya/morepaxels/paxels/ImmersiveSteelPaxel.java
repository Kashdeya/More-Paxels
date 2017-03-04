package com.kashdeya.morepaxels.paxels;

import net.minecraft.item.ItemStack;
import blusunrize.immersiveengineering.common.IEContent;

import com.kashdeya.morepaxels.handlers.ConfigHandler;

public class ImmersiveSteelPaxel extends MainPaxels {
	
	public ImmersiveSteelPaxel(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName("ImmersiveSteelPaxel");
		this.setMaxDamage(ConfigHandler.ImmersiveSteelDamage);
	}
	
    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        ItemStack mat = new ItemStack(IEContent.itemMetal, 1, 8);
        if (mat != null && net.minecraftforge.oredict.OreDictionary.itemMatches(mat, repair, false)) return true;
        return super.getIsRepairable(toRepair, repair);
    }
	
}