package com.kashdeya.morepaxels.tabs;

import com.kashdeya.morepaxels.inits.PaxelTools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TabMP extends CreativeTabs{
	public TabMP(String label) {
		super(label);
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(PaxelTools.DiamondPaxel);
	}
}
