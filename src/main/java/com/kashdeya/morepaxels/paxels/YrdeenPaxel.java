package com.kashdeya.morepaxels.paxels;

import net.minecraft.item.ItemStack;

import com.kashdeya.morepaxels.handlers.ConfigHandler;
import com.sosnitzka.taiga.Items;

public class YrdeenPaxel extends MainPaxels {
	
	public YrdeenPaxel(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName("YrdeenPaxel");
		this.setMaxDamage(ConfigHandler.YrdeenDamage);
	}
	
    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        ItemStack mat = new ItemStack(Items.yrdeenIngot);
        if (mat != null && net.minecraftforge.oredict.OreDictionary.itemMatches(mat, repair, false)) return true;
        return super.getIsRepairable(toRepair, repair);
    }
	
}