package com.kashdeya.morepaxels.paxels;

import net.minecraft.item.ItemStack;

import com.kashdeya.morepaxels.handlers.ConfigHandler;
import com.sosnitzka.taiga.Items;

public class MeteoritePaxel extends MainPaxels {
	
	public MeteoritePaxel(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName("MeteoritePaxel");
		this.setMaxDamage(ConfigHandler.MeteoriteDamage);
	}
	
    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        ItemStack mat = new ItemStack(Items.meteoriteIngot);
        if (mat != null && net.minecraftforge.oredict.OreDictionary.itemMatches(mat, repair, false)) return true;
        return super.getIsRepairable(toRepair, repair);
    }
	
}