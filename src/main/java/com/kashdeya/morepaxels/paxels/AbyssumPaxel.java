package com.kashdeya.morepaxels.paxels;

import com.kashdeya.morepaxels.handlers.ConfigHandler;

import net.minecraft.item.ItemStack;

public class AbyssumPaxel extends MainPaxels {
	
	public AbyssumPaxel(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName("AbyssumPaxel");
		this.setMaxDamage(ConfigHandler.AbyssumDamage);
	}
	
    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
    	return false;
//        ItemStack mat = new ItemStack(Items.abyssumIngot);
  //      if (mat != null && net.minecraftforge.oredict.OreDictionary.itemMatches(mat, repair, false)) return true;
    //    return super.getIsRepairable(toRepair, repair);
    }
	
}