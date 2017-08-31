package com.kashdeya.morepaxels.paxels.disabled;

import net.minecraft.item.ItemStack;

import com.kashdeya.morepaxels.handlers.ConfigHandler;
import com.sosnitzka.taiga.Items;

public class AstriumPaxel extends MainPaxels {
	
	public AstriumPaxel(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName("AstriumPaxel");
		this.setMaxDamage(ConfigHandler.AstriumDamage);
	}
	
    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        ItemStack mat = new ItemStack(Items.astriumIngot);
        if (mat != null && net.minecraftforge.oredict.OreDictionary.itemMatches(mat, repair, false)) return true;
        return super.getIsRepairable(toRepair, repair);
    }
	
}