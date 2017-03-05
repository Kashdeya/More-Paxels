package com.kashdeya.morepaxels.paxels;

import net.minecraft.item.ItemStack;

import com.kashdeya.morepaxels.handlers.ConfigHandler;
import com.reygok.adamantiummod.init.AdaItems;

public class AdamantiumPaxel extends MainPaxels {
	
	public AdamantiumPaxel(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName("AdamantiumPaxel");
		this.setMaxDamage(ConfigHandler.AdamantiumDamage);
	}
	
    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        ItemStack mat = new ItemStack(AdaItems.adamantiumIngot);
        if (mat != null && net.minecraftforge.oredict.OreDictionary.itemMatches(mat, repair, false)) return true;
        return super.getIsRepairable(toRepair, repair);
    }
	
}