package com.kashdeya.morepaxels.paxels;

import net.minecraft.item.ItemStack;

import com.kashdeya.morepaxels.handlers.ConfigHandler;
import com.sosnitzka.taiga.Items;

public class AuroriumPaxel extends MainPaxels {
	
	public AuroriumPaxel(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName("AuroriumPaxel");
		this.setMaxDamage(ConfigHandler.AuroriumDamage);
	}
	
    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        ItemStack mat = new ItemStack(Items.auroriumIngot);
        if (mat != null && net.minecraftforge.oredict.OreDictionary.itemMatches(mat, repair, false)) return true;
        return super.getIsRepairable(toRepair, repair);
    }
	
}