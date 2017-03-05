package com.kashdeya.morepaxels.paxels;

import net.minecraft.item.ItemStack;

import com.kashdeya.morepaxels.handlers.ConfigHandler;
import com.sosnitzka.taiga.Items;

public class IgnitzPaxel extends MainPaxels {
	
	public IgnitzPaxel(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName("IgnitzPaxel");
		this.setMaxDamage(ConfigHandler.IgnitzDamage);
	}
	
    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        ItemStack mat = new ItemStack(Items.ignitzIngot);
        if (mat != null && net.minecraftforge.oredict.OreDictionary.itemMatches(mat, repair, false)) return true;
        return super.getIsRepairable(toRepair, repair);
    }
	
}