package com.kashdeya.morepaxels.paxels;

import net.minecraft.item.ItemStack;

import com.kashdeya.morepaxels.handlers.ConfigHandler;

import cyano.basemetals.init.Items;

public class BrassPaxel extends MainPaxels {
	
	public BrassPaxel(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName("BrassPaxel");
		this.setMaxDamage(ConfigHandler.BrassDamage);
	}
	
    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        ItemStack mat = new ItemStack(Items.brass_ingot);
        if (mat != null && net.minecraftforge.oredict.OreDictionary.itemMatches(mat, repair, false)) return true;
        return super.getIsRepairable(toRepair, repair);
    }
	
}