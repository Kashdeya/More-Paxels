package com.kashdeya.morepaxels.paxels;

import com.kashdeya.morepaxels.handlers.ConfigHandler;
import com.mcmoddev.basemetals.data.MaterialNames;
import com.mcmoddev.basemetals.init.Items;
import com.mcmoddev.lib.data.Names;

import net.minecraft.item.ItemStack;

public class StarPaxel extends MainPaxels {
	
	public StarPaxel(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName("StarPaxel");
		this.setMaxDamage(ConfigHandler.StarDamage);
	}
	
    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        ItemStack mat = new ItemStack(Items.getItemByName(MaterialNames.STARSTEEL + "_" + Names.INGOT));
        if (mat != null && net.minecraftforge.oredict.OreDictionary.itemMatches(mat, repair, false)) return true;
        return super.getIsRepairable(toRepair, repair);
    }
	
}