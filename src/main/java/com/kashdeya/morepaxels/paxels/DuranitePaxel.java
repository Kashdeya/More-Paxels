package com.kashdeya.morepaxels.paxels;

import net.minecraft.item.ItemStack;

import com.kashdeya.morepaxels.handlers.ConfigHandler;
import com.sosnitzka.taiga.Items;

public class DuranitePaxel extends MainPaxels {
	
	public DuranitePaxel(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName("DuranitePaxel");
		this.setMaxDamage(ConfigHandler.DuraniteDamage);
	}
	
    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        ItemStack mat = new ItemStack(Items.duraniteIngot);
        if (mat != null && net.minecraftforge.oredict.OreDictionary.itemMatches(mat, repair, false)) return true;
        return super.getIsRepairable(toRepair, repair);
    }
	
}