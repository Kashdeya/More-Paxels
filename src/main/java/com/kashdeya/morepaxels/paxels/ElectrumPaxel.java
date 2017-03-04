package com.kashdeya.morepaxels.paxels;

import net.minecraft.item.ItemStack;

import com.kashdeya.morepaxels.handlers.ConfigHandler;

import cyano.basemetals.init.Items;

public class ElectrumPaxel extends MainPaxels {
	
	public ElectrumPaxel(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName("ElectrumPaxel");
		this.setMaxDamage(ConfigHandler.ElectrumDamage);
	}
	
    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        ItemStack mat = new ItemStack(Items.electrum_ingot);
        if (mat != null && net.minecraftforge.oredict.OreDictionary.itemMatches(mat, repair, false)) return true;
        return super.getIsRepairable(toRepair, repair);
    }
	
}