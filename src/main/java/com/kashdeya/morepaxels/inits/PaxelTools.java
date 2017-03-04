package com.kashdeya.morepaxels.inits;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.kashdeya.morepaxels.handlers.ConfigHandler;
import com.kashdeya.morepaxels.handlers.ToolHandler;
import com.kashdeya.morepaxels.main.Reference;
import com.kashdeya.morepaxels.paxels.AdamantinePaxel;
import com.kashdeya.morepaxels.paxels.AquariumPaxel;
import com.kashdeya.morepaxels.paxels.BrassPaxel;
import com.kashdeya.morepaxels.paxels.BronzePaxel;
import com.kashdeya.morepaxels.paxels.ColdPaxel;
import com.kashdeya.morepaxels.paxels.CopperPaxel;
import com.kashdeya.morepaxels.paxels.CupronickelPaxel;
import com.kashdeya.morepaxels.paxels.DiamondPaxel;
import com.kashdeya.morepaxels.paxels.ElectrumPaxel;
import com.kashdeya.morepaxels.paxels.GoldenPaxel;
import com.kashdeya.morepaxels.paxels.ImmersiveAluminiumPaxel;
import com.kashdeya.morepaxels.paxels.ImmersiveConstantanPaxel;
import com.kashdeya.morepaxels.paxels.ImmersiveCopperPaxel;
import com.kashdeya.morepaxels.paxels.ImmersiveElectrumPaxel;
import com.kashdeya.morepaxels.paxels.ImmersiveLeadPaxel;
import com.kashdeya.morepaxels.paxels.ImmersiveNickelPaxel;
import com.kashdeya.morepaxels.paxels.ImmersiveSilverPaxel;
import com.kashdeya.morepaxels.paxels.ImmersiveSteelPaxel;
import com.kashdeya.morepaxels.paxels.ImmersiveUraniumPaxel;
import com.kashdeya.morepaxels.paxels.InvarPaxel;
import com.kashdeya.morepaxels.paxels.IronPaxel;
import com.kashdeya.morepaxels.paxels.LeadPaxel;
import com.kashdeya.morepaxels.paxels.MithrilPaxel;
import com.kashdeya.morepaxels.paxels.NickelPaxel;
import com.kashdeya.morepaxels.paxels.PlatinumPaxel;
import com.kashdeya.morepaxels.paxels.SilverPaxel;
import com.kashdeya.morepaxels.paxels.StarPaxel;
import com.kashdeya.morepaxels.paxels.SteelPaxel;
import com.kashdeya.morepaxels.paxels.StonePaxel;
import com.kashdeya.morepaxels.paxels.TinPaxel;
import com.kashdeya.morepaxels.paxels.WoodenPaxel;

public class PaxelTools {
	
	// Vanilla Paxels
	public static Item WoodenPaxel;
	public static Item StonePaxel;
	public static Item GoldenPaxel;
	public static Item IronPaxel;
	public static Item DiamondPaxel;
	// Base Metals
	public static Item CopperPaxel;
	public static Item SilverPaxel;
	public static Item TinPaxel;
	public static Item LeadPaxel;
	public static Item SteelPaxel;
	public static Item NickelPaxel;
	public static Item PlatinumPaxel;
	public static Item ColdPaxel;
	public static Item MithrilPaxel;
	public static Item StarPaxel;
	public static Item BronzePaxel;
	public static Item BrassPaxel;
	public static Item ElectrumPaxel;
	public static Item InvarPaxel;
	public static Item AquariumPaxel;
	public static Item AdamantinePaxel;
	public static Item CupronickelPaxel;
	// Immersive
	public static Item ImmersiveCopperPaxel;
	public static Item ImmersiveAluminiumPaxel;
	public static Item ImmersiveLeadPaxel;
	public static Item ImmersiveSilverPaxel;
	public static Item ImmersiveNickelPaxel;
	public static Item ImmersiveUraniumPaxel;
	public static Item ImmersiveConstantanPaxel;
	public static Item ImmersiveElectrumPaxel;
	public static Item ImmersiveSteelPaxel;
	
	public static void init(){
		if (ConfigHandler.VanillaSupport){
			if (ConfigHandler.WoodenPaxel){
				WoodenPaxel = new WoodenPaxel(ToolMaterial.WOOD);
				registerItem(WoodenPaxel, "WoodenPaxel");
			}
			if (ConfigHandler.StonePaxel){
				StonePaxel = new StonePaxel(ToolMaterial.STONE);
				registerItem(StonePaxel, "StonePaxel");
			}
			if (ConfigHandler.IronPaxel){
				IronPaxel = new IronPaxel(ToolMaterial.IRON);
				registerItem(IronPaxel, "IronPaxel");
			}
			if (ConfigHandler.GoldenPaxel){
				GoldenPaxel = new GoldenPaxel(ToolMaterial.GOLD);
				registerItem(GoldenPaxel, "GoldenPaxel");
			}
			if (ConfigHandler.DiamondPaxel){
				DiamondPaxel = new DiamondPaxel(ToolMaterial.DIAMOND);
				registerItem(DiamondPaxel, "DiamondPaxel");
			}
		}
		// BaseMetals
		if(Loader.isModLoaded("basemetals") && ConfigHandler.BaseMetalsSupport){
			if (ConfigHandler.AdamantinePaxel){
				AdamantinePaxel = new AdamantinePaxel(ToolHandler.adamantineToolMaterial);
				registerItem(AdamantinePaxel, "AdamantinePaxel");
			}
			if (ConfigHandler.AquariumPaxel){
				AquariumPaxel = new AquariumPaxel(ToolHandler.aquariumToolMaterial);
				registerItem(AquariumPaxel, "AquariumPaxel");
			}
			if (ConfigHandler.BrassPaxel){
				BrassPaxel = new BrassPaxel(ToolHandler.brassToolMaterial);
				registerItem(BrassPaxel, "BrassPaxel");
			}
			if (ConfigHandler.BronzePaxel){
				BronzePaxel = new BronzePaxel(ToolHandler.bronzeToolMaterial);
				registerItem(BronzePaxel, "BronzePaxel");
			}
			if (ConfigHandler.ColdPaxel){
				ColdPaxel = new ColdPaxel(ToolHandler.coldToolMaterial);
				registerItem(ColdPaxel, "ColdPaxel");
			}
			if (ConfigHandler.CopperPaxel){
				CopperPaxel = new CopperPaxel(ToolHandler.copperToolMaterial);
				registerItem(CopperPaxel, "CopperPaxel");
			}
			if (ConfigHandler.CupronickelPaxel){
				CupronickelPaxel = new CupronickelPaxel(ToolHandler.cupronickelToolMaterial);
				registerItem(CupronickelPaxel, "CupronickelPaxel");
			}
			if (ConfigHandler.ElectrumPaxel){
				ElectrumPaxel = new ElectrumPaxel(ToolHandler.electrumToolMaterial);
				registerItem(ElectrumPaxel, "ElectrumPaxel");
			}
			if (ConfigHandler.InvarPaxel){
				InvarPaxel = new InvarPaxel(ToolHandler.invarToolMaterial);
				registerItem(InvarPaxel, "InvarPaxel");
			}
			if (ConfigHandler.LeadPaxel){
				LeadPaxel = new LeadPaxel(ToolHandler.leadToolMaterial);
				registerItem(LeadPaxel, "LeadPaxel");
			}
			if (ConfigHandler.MithrilPaxel){
				MithrilPaxel = new MithrilPaxel(ToolHandler.mithrilToolMaterial);
				registerItem(MithrilPaxel, "MithrilPaxel");
			}
			if (ConfigHandler.NickelPaxel){
				NickelPaxel = new NickelPaxel(ToolHandler.nickelToolMaterial);
				registerItem(NickelPaxel, "NickelPaxel");
			}
			if (ConfigHandler.PlatinumPaxel){
				PlatinumPaxel = new PlatinumPaxel(ToolHandler.platinumToolMaterial);
				registerItem(PlatinumPaxel, "PlatinumPaxel");
			}
			if (ConfigHandler.SilverPaxel){
				SilverPaxel = new SilverPaxel(ToolHandler.silverToolMaterial);
				registerItem(SilverPaxel, "SilverPaxel");
			}
			if (ConfigHandler.StarPaxel){
				StarPaxel = new StarPaxel(ToolHandler.starToolMaterial);
				registerItem(StarPaxel, "StarPaxel");
			}
			if (ConfigHandler.SteelPaxel){
				SteelPaxel = new SteelPaxel(ToolHandler.steelToolMaterial);
				registerItem(SteelPaxel, "SteelPaxel");
			}
			if (ConfigHandler.TinPaxel){
				TinPaxel = new TinPaxel(ToolHandler.tinToolMaterial);
				registerItem(TinPaxel, "TinPaxel");
			}
		}
		// IE
		if (Loader.isModLoaded("immersiveengineering") && ConfigHandler.immersiveSupport){
			if (ConfigHandler.ImmersiveAluminiumPaxel){
				ImmersiveAluminiumPaxel = new ImmersiveAluminiumPaxel(ToolHandler.ieAluminiumToolMaterial);
				registerItem(ImmersiveAluminiumPaxel, "ImmersiveAluminiumPaxel");
			}
			if (ConfigHandler.ImmersiveConstantanPaxel){
				ImmersiveConstantanPaxel = new ImmersiveConstantanPaxel(ToolHandler.ieConstantanToolMaterial);
				registerItem(ImmersiveConstantanPaxel, "ImmersiveConstantanPaxel");
			}
			if (ConfigHandler.ImmersiveCopperPaxel){
				ImmersiveCopperPaxel = new ImmersiveCopperPaxel(ToolHandler.ieCopperToolMaterial);
				registerItem(ImmersiveCopperPaxel, "ImmersiveCopperPaxel");
			}
			if (ConfigHandler.ImmersiveElectrumPaxel){
				ImmersiveElectrumPaxel = new ImmersiveElectrumPaxel(ToolHandler.ieElectrumToolMaterial);
				registerItem(ImmersiveElectrumPaxel, "ImmersiveElectrumPaxel");
			}
			if (ConfigHandler.ImmersiveLeadPaxel){
				ImmersiveLeadPaxel = new ImmersiveLeadPaxel(ToolHandler.ieLeadToolMaterial);
				registerItem(ImmersiveLeadPaxel, "ImmersiveLeadPaxel");
			}
			if (ConfigHandler.ImmersiveNickelPaxel){
				ImmersiveNickelPaxel = new ImmersiveNickelPaxel(ToolHandler.ieNickelToolMaterial);
				registerItem(ImmersiveNickelPaxel, "ImmersiveNickelPaxel");
			}
			if (ConfigHandler.ImmersiveSilverPaxel){
				ImmersiveSilverPaxel = new ImmersiveSilverPaxel(ToolHandler.ieSilverToolMaterial);
				registerItem(ImmersiveSilverPaxel, "ImmersiveSilverPaxel");
			}
			if (ConfigHandler.ImmersiveSteelPaxel){
				ImmersiveSteelPaxel = new ImmersiveSteelPaxel(ToolHandler.ieSteelToolMaterial);
				registerItem(ImmersiveSteelPaxel, "ImmersiveSteelPaxel");
			}
			if (ConfigHandler.ImmersiveUraniumPaxel){
				ImmersiveUraniumPaxel = new ImmersiveUraniumPaxel(ToolHandler.ieUraniumToolMaterial);
				registerItem(ImmersiveUraniumPaxel, "ImmersiveUraniumPaxel");
			}
		}
		
	}

	static void registerItem(Item item, String name){
		GameRegistry.register(item, new ResourceLocation(Reference.MOD_ID + ":" + name));
	}
}
