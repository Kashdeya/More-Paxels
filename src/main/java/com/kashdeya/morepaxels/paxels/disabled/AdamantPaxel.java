package com.kashdeya.morepaxels.paxels.disabled;

import net.minecraft.item.ItemStack;

import com.kashdeya.morepaxels.handlers.ConfigHandler;
import com.sosnitzka.taiga.Items;

public class AdamantPaxel extends MainPaxels {
	
	public AdamantPaxel(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName("AdamantPaxel");
		this.setMaxDamage(ConfigHandler.AdamantDamage);
	}
	
    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        ItemStack mat = new ItemStack(Items.adamantIngot);
        if (mat != null && net.minecraftforge.oredict.OreDictionary.itemMatches(mat, repair, false)) return true;
        return super.getIsRepairable(toRepair, repair);
    }
	
}