package com.kashdeya.morepaxels.handlers;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

import com.kashdeya.morepaxels.inits.PaxelTools;
import com.kashdeya.morepaxels.main.Reference;

public class RenderHandler {

	public static void initItems(){
		// Vanilla Renders
		InventoryItemRender(PaxelTools.WoodenPaxel, "WoodenPaxel");
		InventoryItemRender(PaxelTools.StonePaxel, "StonePaxel");
		InventoryItemRender(PaxelTools.GoldenPaxel, "GoldenPaxel");
		InventoryItemRender(PaxelTools.IronPaxel, "IronPaxel");
		InventoryItemRender(PaxelTools.DiamondPaxel, "DiamondPaxel");
		
		// BaseMetal Renders
		InventoryItemRender(PaxelTools.AdamantinePaxel, "AdamantinePaxel");
		InventoryItemRender(PaxelTools.AquariumPaxel, "AquariumPaxel");
		InventoryItemRender(PaxelTools.BrassPaxel, "BrassPaxel");
		InventoryItemRender(PaxelTools.BronzePaxel, "BronzePaxel");
		InventoryItemRender(PaxelTools.ColdPaxel, "ColdPaxel");
		InventoryItemRender(PaxelTools.CopperPaxel, "CopperPaxel");
		InventoryItemRender(PaxelTools.CupronickelPaxel, "CupronickelPaxel");
		InventoryItemRender(PaxelTools.ElectrumPaxel, "ElectrumPaxel");
		InventoryItemRender(PaxelTools.InvarPaxel, "InvarPaxel");
		InventoryItemRender(PaxelTools.LeadPaxel, "LeadPaxel");
		InventoryItemRender(PaxelTools.MithrilPaxel, "MithrilPaxel");
		InventoryItemRender(PaxelTools.NickelPaxel, "NickelPaxel");
		InventoryItemRender(PaxelTools.PlatinumPaxel, "PlatinumPaxel");
		InventoryItemRender(PaxelTools.SilverPaxel, "SilverPaxel");
		InventoryItemRender(PaxelTools.StarPaxel, "StarPaxel");
		InventoryItemRender(PaxelTools.SteelPaxel, "SteelPaxel");
		InventoryItemRender(PaxelTools.TinPaxel, "TinPaxel");
		
		// IE Renders
		InventoryItemRender(PaxelTools.ImmersiveAluminiumPaxel, "ImmersiveAluminiumPaxel");
		InventoryItemRender(PaxelTools.ImmersiveConstantanPaxel, "ImmersiveConstantanPaxel");
		InventoryItemRender(PaxelTools.ImmersiveCopperPaxel, "ImmersiveCopperPaxel");
		InventoryItemRender(PaxelTools.ImmersiveElectrumPaxel, "ImmersiveElectrumPaxel");
		InventoryItemRender(PaxelTools.ImmersiveLeadPaxel, "ImmersiveLeadPaxel");
		InventoryItemRender(PaxelTools.ImmersiveNickelPaxel, "ImmersiveNickelPaxel");
		InventoryItemRender(PaxelTools.ImmersiveSilverPaxel, "ImmersiveSilverPaxel");
		InventoryItemRender(PaxelTools.ImmersiveSteelPaxel, "ImmersiveSteelPaxel");
		InventoryItemRender(PaxelTools.ImmersiveUraniumPaxel, "ImmersiveUraniumPaxel");
	}
	  
	public static void InventoryItemRender(Item item, String itemName) {
		if(item != null)
			ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + itemName, "inventory"));
	}
	
}
