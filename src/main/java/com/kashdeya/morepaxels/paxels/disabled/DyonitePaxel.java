package com.kashdeya.morepaxels.paxels.disabled;

import net.minecraft.item.ItemStack;

import com.kashdeya.morepaxels.handlers.ConfigHandler;
import com.sosnitzka.taiga.Items;

public class DyonitePaxel extends MainPaxels {
	
	public DyonitePaxel(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName("DyonitePaxel");
		this.setMaxDamage(ConfigHandler.DyoniteDamage);
	}
	
    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        ItemStack mat = new ItemStack(Items.dyoniteIngot);
        if (mat != null && net.minecraftforge.oredict.OreDictionary.itemMatches(mat, repair, false)) return true;
        return super.getIsRepairable(toRepair, repair);
    }
	
}