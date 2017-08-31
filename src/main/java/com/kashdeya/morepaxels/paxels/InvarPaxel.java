package com.kashdeya.morepaxels.paxels;

import com.kashdeya.morepaxels.handlers.ConfigHandler;
import com.mcmoddev.basemetals.data.MaterialNames;
import com.mcmoddev.basemetals.init.Items;
import com.mcmoddev.lib.data.Names;

import net.minecraft.item.ItemStack;

public class InvarPaxel extends MainPaxels {
	
	public InvarPaxel(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName("InvarPaxel");
		this.setMaxDamage(ConfigHandler.InvarDamage);
	}
	
    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        ItemStack mat = new ItemStack(Items.getItemByName(MaterialNames.INVAR + "_" + Names.INGOT));
        if (mat != null && net.minecraftforge.oredict.OreDictionary.itemMatches(mat, repair, false)) return true;
        return super.getIsRepairable(toRepair, repair);
    }
	
}