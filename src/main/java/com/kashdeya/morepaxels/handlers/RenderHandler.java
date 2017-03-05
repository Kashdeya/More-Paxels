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
		InventoryItemRender(PaxelTools.ImmersiveUraniumPaxel, "ImmersiveUraniumPaxel");
		
		// Adamantium
		InventoryItemRender(PaxelTools.AdamantiumPaxel, "AdamantiumPaxel");
		
		// Taiga
		InventoryItemRender(PaxelTools.AbyssumPaxel, "AbyssumPaxel");
		InventoryItemRender(PaxelTools.AdamantPaxel, "AdamantPaxel");
		InventoryItemRender(PaxelTools.AstriumPaxel, "AstriumPaxel");
		InventoryItemRender(PaxelTools.AuroriumPaxel, "AuroriumPaxel");
		InventoryItemRender(PaxelTools.BasaltPaxel, "BasaltPaxel");
		InventoryItemRender(PaxelTools.DilithiumPaxel, "DilithiumPaxel");
		InventoryItemRender(PaxelTools.DuranitePaxel, "DuranitePaxel");
		InventoryItemRender(PaxelTools.DyonitePaxel, "DyonitePaxel");
		InventoryItemRender(PaxelTools.EezoPaxel, "EezoPaxel");
		InventoryItemRender(PaxelTools.FractumPaxel, "FractumPaxel");
		InventoryItemRender(PaxelTools.IgnitzPaxel, "IgnitzPaxel");
		InventoryItemRender(PaxelTools.ImperomitePaxel, "ImperomitePaxel");
		InventoryItemRender(PaxelTools.IoxPaxel, "IoxPaxel");
		InventoryItemRender(PaxelTools.JauxumPaxel, "JauxumPaxel");
		InventoryItemRender(PaxelTools.KarmesinePaxel, "KarmesinePaxel");
		InventoryItemRender(PaxelTools.LumixPaxel, "LumixPaxel");
		InventoryItemRender(PaxelTools.MeteoritePaxel, "MeteoritePaxel");
		InventoryItemRender(PaxelTools.NihilitePaxel, "NihilitePaxel");
		InventoryItemRender(PaxelTools.NiobPaxel, "NiobPaxel");
		InventoryItemRender(PaxelTools.NucleumPaxel, "NucleumPaxel");
		InventoryItemRender(PaxelTools.ObsidioritePaxel, "ObsidioritePaxel");
		InventoryItemRender(PaxelTools.OsramPaxel, "OsramPaxel");
		InventoryItemRender(PaxelTools.OviumPaxel, "OviumPaxel");
		InventoryItemRender(PaxelTools.PalladiumPaxel, "PalladiumPaxel");
		InventoryItemRender(PaxelTools.PrometheumPaxel, "PrometheumPaxel");
		InventoryItemRender(PaxelTools.ProxiiPaxel, "ProxiiPaxel");
		InventoryItemRender(PaxelTools.SeismumPaxel, "SeismumPaxel");
		InventoryItemRender(PaxelTools.SolariumPaxel, "SolariumPaxel");
		InventoryItemRender(PaxelTools.TerraxPaxel, "TerraxPaxel");
		InventoryItemRender(PaxelTools.TiberiumPaxel, "TiberiumPaxel");
		InventoryItemRender(PaxelTools.TriberiumPaxel, "TriberiumPaxel");
		InventoryItemRender(PaxelTools.TritonitePaxel, "TritonitePaxel");
		InventoryItemRender(PaxelTools.UruPaxel, "UruPaxel");
		InventoryItemRender(PaxelTools.ValyriumPaxel, "ValyriumPaxel");
		InventoryItemRender(PaxelTools.VibraniumPaxel, "VibraniumPaxel");
		InventoryItemRender(PaxelTools.VioliumPaxel, "VioliumPaxel");
		InventoryItemRender(PaxelTools.YrdeenPaxel, "YrdeenPaxel");
	}
	  
	public static void InventoryItemRender(Item item, String itemName) {
		if(item != null)
			ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + itemName, "inventory"));
	}
	
}
