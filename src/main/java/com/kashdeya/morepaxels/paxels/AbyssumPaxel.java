package com.kashdeya.morepaxels.paxels;

import net.minecraft.item.ItemStack;

import com.kashdeya.morepaxels.handlers.ConfigHandler;
import com.sosnitzka.taiga.Items;

public class AbyssumPaxel extends MainPaxels {
	
	public AbyssumPaxel(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName("AbyssumPaxel");
		this.setMaxDamage(ConfigHandler.AbyssumDamage);
	}
	
    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        ItemStack mat = new ItemStack(Items.abyssumIngot);
        if (mat != null && net.minecraftforge.oredict.OreDictionary.itemMatches(mat, repair, false)) return true;
        return super.getIsRepairable(toRepair, repair);
    }
	
}