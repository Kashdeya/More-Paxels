package com.kashdeya.morepaxels.paxels;

import net.minecraft.item.ItemStack;

import com.kashdeya.morepaxels.handlers.ConfigHandler;

import cyano.basemetals.init.Items;

public class AquariumPaxel extends MainPaxels {
	
	public AquariumPaxel(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName("AquariumPaxel");
		this.setMaxDamage(ConfigHandler.AquariumDamage);
	}
	
    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        ItemStack mat = new ItemStack(Items.aquarium_ingot);
        if (mat != null && net.minecraftforge.oredict.OreDictionary.itemMatches(mat, repair, false)) return true;
        return super.getIsRepairable(toRepair, repair);
    }
	
}