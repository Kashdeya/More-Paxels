package com.kashdeya.morepaxels.paxels;

import net.minecraft.item.ItemStack;

import com.kashdeya.morepaxels.handlers.ConfigHandler;

import cyano.basemetals.init.Items;

public class StarPaxel extends MainPaxels {
	
	public StarPaxel(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName("StarPaxel");
		this.setMaxDamage(ConfigHandler.StarDamage);
	}
	
    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        ItemStack mat = new ItemStack(Items.starsteel_ingot);
        if (mat != null && net.minecraftforge.oredict.OreDictionary.itemMatches(mat, repair, false)) return true;
        return super.getIsRepairable(toRepair, repair);
    }
	
}