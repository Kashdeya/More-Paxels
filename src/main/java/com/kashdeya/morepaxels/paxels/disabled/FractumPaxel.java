package com.kashdeya.morepaxels.paxels.disabled;

import net.minecraft.item.ItemStack;

import com.kashdeya.morepaxels.handlers.ConfigHandler;
import com.sosnitzka.taiga.Items;

public class FractumPaxel extends MainPaxels {
	
	public FractumPaxel(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName("FractumPaxel");
		this.setMaxDamage(ConfigHandler.FractumDamage);
	}
	
    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        ItemStack mat = new ItemStack(Items.fractumIngot);
        if (mat != null && net.minecraftforge.oredict.OreDictionary.itemMatches(mat, repair, false)) return true;
        return super.getIsRepairable(toRepair, repair);
    }
	
}