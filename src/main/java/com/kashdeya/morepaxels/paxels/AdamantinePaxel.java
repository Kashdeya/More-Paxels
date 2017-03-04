package com.kashdeya.morepaxels.paxels;

import net.minecraft.item.ItemStack;

import com.kashdeya.morepaxels.handlers.ConfigHandler;

import cyano.basemetals.init.Items;


public class AdamantinePaxel extends MainPaxels {
	
	public AdamantinePaxel(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName("AdamantinePaxel");
		this.setMaxDamage(ConfigHandler.AdamantineDamage);
	}
	
    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        ItemStack mat = new ItemStack(Items.adamantine_ingot);
        if (mat != null && net.minecraftforge.oredict.OreDictionary.itemMatches(mat, repair, false)) return true;
        return super.getIsRepairable(toRepair, repair);
    }
	
}