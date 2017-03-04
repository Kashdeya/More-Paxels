package com.kashdeya.morepaxels.paxels;

import net.minecraft.item.ItemStack;
import blusunrize.immersiveengineering.common.IEContent;

import com.kashdeya.morepaxels.handlers.ConfigHandler;

public class ImmersiveAluminiumPaxel extends MainPaxels {
	
	public ImmersiveAluminiumPaxel(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName("ImmersiveAluminiumPaxel");
		this.setMaxDamage(ConfigHandler.ImmersiveAluminiumDamage);
	}
	
    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        ItemStack mat = new ItemStack(IEContent.itemMetal, 1, 1);
        if (mat != null && net.minecraftforge.oredict.OreDictionary.itemMatches(mat, repair, false)) return true;
        return super.getIsRepairable(toRepair, repair);
    }
	
}