package com.kashdeya.morepaxels.paxels;

import net.minecraft.item.ItemStack;

import com.kashdeya.morepaxels.handlers.ConfigHandler;
import com.sosnitzka.taiga.Items;

public class NiobPaxel extends MainPaxels {
	
	public NiobPaxel(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName("NiobPaxel");
		this.setMaxDamage(ConfigHandler.NiobDamage);
	}
	
    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        ItemStack mat = new ItemStack(Items.niobIngot);
        if (mat != null && net.minecraftforge.oredict.OreDictionary.itemMatches(mat, repair, false)) return true;
        return super.getIsRepairable(toRepair, repair);
    }
	
}