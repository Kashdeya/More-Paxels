package com.kashdeya.morepaxels.paxels;

import net.minecraft.item.ItemStack;

import com.kashdeya.morepaxels.handlers.ConfigHandler;

import cyano.basemetals.init.Items;

public class SteelPaxel extends MainPaxels {
	
	public SteelPaxel(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName("SteelPaxel");
		this.setMaxDamage(ConfigHandler.SteelDamage);
	}
	
    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        ItemStack mat = new ItemStack(Items.steel_ingot);
        if (mat != null && net.minecraftforge.oredict.OreDictionary.itemMatches(mat, repair, false)) return true;
        return super.getIsRepairable(toRepair, repair);
    }
	
}