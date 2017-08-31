package com.kashdeya.morepaxels.paxels.disabled;

import net.minecraft.item.ItemStack;

import com.kashdeya.morepaxels.handlers.ConfigHandler;
import com.sosnitzka.taiga.Items;

public class PalladiumPaxel extends MainPaxels {
	
	public PalladiumPaxel(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName("PalladiumPaxel");
		this.setMaxDamage(ConfigHandler.PalladiumDamage);
	}
	
    @Override
    public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        ItemStack mat = new ItemStack(Items.palladiumIngot);
        if (mat != null && net.minecraftforge.oredict.OreDictionary.itemMatches(mat, repair, false)) return true;
        return super.getIsRepairable(toRepair, repair);
    }
	
}