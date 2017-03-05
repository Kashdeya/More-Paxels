package com.kashdeya.morepaxels.paxels;

import net.minecraft.item.ItemStack;

import com.kashdeya.morepaxels.handlers.ConfigHandler;
import com.sosnitzka.taiga.Items;

public class OsramPaxel extends MainPaxels {
	
	public OsramPaxel(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName("OsramPaxel");
		this.setMaxDamage(ConfigHandler.OsramDamage);
	}
	
    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        ItemStack mat = new ItemStack(Items.osramIngot);
        if (mat != null && net.minecraftforge.oredict.OreDictionary.itemMatches(mat, repair, false)) return true;
        return super.getIsRepairable(toRepair, repair);
    }
	
}