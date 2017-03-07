package com.kashdeya.morepaxels.inits;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.kashdeya.morepaxels.handlers.ConfigHandler;
import com.kashdeya.morepaxels.handlers.ToolHandler;
import com.kashdeya.morepaxels.main.Reference;
import com.kashdeya.morepaxels.paxels.AbyssumPaxel;
import com.kashdeya.morepaxels.paxels.AdamantPaxel;
import com.kashdeya.morepaxels.paxels.AdamantinePaxel;
import com.kashdeya.morepaxels.paxels.AdamantiumPaxel;
import com.kashdeya.morepaxels.paxels.AquariumPaxel;
import com.kashdeya.morepaxels.paxels.AstriumPaxel;
import com.kashdeya.morepaxels.paxels.AuroriumPaxel;
import com.kashdeya.morepaxels.paxels.BasaltPaxel;
import com.kashdeya.morepaxels.paxels.BrassPaxel;
import com.kashdeya.morepaxels.paxels.BronzePaxel;
import com.kashdeya.morepaxels.paxels.ColdPaxel;
import com.kashdeya.morepaxels.paxels.CopperPaxel;
import com.kashdeya.morepaxels.paxels.CupronickelPaxel;
import com.kashdeya.morepaxels.paxels.DiamondPaxel;
import com.kashdeya.morepaxels.paxels.DilithiumPaxel;
import com.kashdeya.morepaxels.paxels.DuranitePaxel;
import com.kashdeya.morepaxels.paxels.DyonitePaxel;
import com.kashdeya.morepaxels.paxels.EezoPaxel;
import com.kashdeya.morepaxels.paxels.ElectrumPaxel;
import com.kashdeya.morepaxels.paxels.FractumPaxel;
import com.kashdeya.morepaxels.paxels.GoldenPaxel;
import com.kashdeya.morepaxels.paxels.IgnitzPaxel;
import com.kashdeya.morepaxels.paxels.ImmersiveAluminiumPaxel;
import com.kashdeya.morepaxels.paxels.ImmersiveConstantanPaxel;
import com.kashdeya.morepaxels.paxels.ImmersiveUraniumPaxel;
import com.kashdeya.morepaxels.paxels.ImperomitePaxel;
import com.kashdeya.morepaxels.paxels.InvarPaxel;
import com.kashdeya.morepaxels.paxels.IoxPaxel;
import com.kashdeya.morepaxels.paxels.IronPaxel;
import com.kashdeya.morepaxels.paxels.JauxumPaxel;
import com.kashdeya.morepaxels.paxels.KarmesinePaxel;
import com.kashdeya.morepaxels.paxels.LeadPaxel;
import com.kashdeya.morepaxels.paxels.LumixPaxel;
import com.kashdeya.morepaxels.paxels.MeteoritePaxel;
import com.kashdeya.morepaxels.paxels.MithrilPaxel;
import com.kashdeya.morepaxels.paxels.NickelPaxel;
import com.kashdeya.morepaxels.paxels.NihilitePaxel;
import com.kashdeya.morepaxels.paxels.NiobPaxel;
import com.kashdeya.morepaxels.paxels.NucleumPaxel;
import com.kashdeya.morepaxels.paxels.ObsidioritePaxel;
import com.kashdeya.morepaxels.paxels.OsramPaxel;
import com.kashdeya.morepaxels.paxels.OviumPaxel;
import com.kashdeya.morepaxels.paxels.PalladiumPaxel;
import com.kashdeya.morepaxels.paxels.PlatinumPaxel;
import com.kashdeya.morepaxels.paxels.PrometheumPaxel;
import com.kashdeya.morepaxels.paxels.ProxiiPaxel;
import com.kashdeya.morepaxels.paxels.SeismumPaxel;
import com.kashdeya.morepaxels.paxels.SilverPaxel;
import com.kashdeya.morepaxels.paxels.SolariumPaxel;
import com.kashdeya.morepaxels.paxels.StarPaxel;
import com.kashdeya.morepaxels.paxels.SteelPaxel;
import com.kashdeya.morepaxels.paxels.StonePaxel;
import com.kashdeya.morepaxels.paxels.TerraxPaxel;
import com.kashdeya.morepaxels.paxels.TiberiumPaxel;
import com.kashdeya.morepaxels.paxels.TinPaxel;
import com.kashdeya.morepaxels.paxels.TriberiumPaxel;
import com.kashdeya.morepaxels.paxels.TritonitePaxel;
import com.kashdeya.morepaxels.paxels.UruPaxel;
import com.kashdeya.morepaxels.paxels.ValyriumPaxel;
import com.kashdeya.morepaxels.paxels.VibraniumPaxel;
import com.kashdeya.morepaxels.paxels.VioliumPaxel;
import com.kashdeya.morepaxels.paxels.WoodenPaxel;
import com.kashdeya.morepaxels.paxels.YrdeenPaxel;

public class PaxelTools {
	
	// Vanilla Paxels
	public static Item DiamondPaxel;
	public static Item GoldenPaxel;
	public static Item IronPaxel;
	public static Item StonePaxel;
	public static Item WoodenPaxel;
	// Base Metals
	public static Item AdamantinePaxel;
	public static Item AquariumPaxel;
	public static Item BrassPaxel;
	public static Item BronzePaxel;
	public static Item ColdPaxel;
	public static Item CopperPaxel;
	public static Item CupronickelPaxel;
	public static Item ElectrumPaxel;
	public static Item InvarPaxel;
	public static Item LeadPaxel;
	public static Item MithrilPaxel;
	public static Item NickelPaxel;
	public static Item PlatinumPaxel;
	public static Item SilverPaxel;
	public static Item StarPaxel;
	public static Item SteelPaxel;
	public static Item TinPaxel;
	// Immersive
	public static Item ImmersiveAluminiumPaxel;
	public static Item ImmersiveConstantanPaxel;
	public static Item ImmersiveUraniumPaxel;
	// Adamantium
	public static Item AdamantiumPaxel;
	// Taiga
	public static Item AbyssumPaxel;
	public static Item AdamantPaxel;
	public static Item AstriumPaxel;
	public static Item AuroriumPaxel;
	public static Item BasaltPaxel;
	public static Item DilithiumPaxel;
	public static Item DuranitePaxel;
	public static Item DyonitePaxel;
	public static Item EezoPaxel;
	public static Item FractumPaxel;
	public static Item IgnitzPaxel;
	public static Item ImperomitePaxel;
	public static Item IoxPaxel;
	public static Item JauxumPaxel;
	public static Item KarmesinePaxel;
	public static Item LumixPaxel;
	public static Item MeteoritePaxel;
	public static Item NihilitePaxel;
	public static Item NiobPaxel;
	public static Item NucleumPaxel;
	public static Item ObsidioritePaxel;
	public static Item OsramPaxel;
	public static Item OviumPaxel;
	public static Item PalladiumPaxel;
	public static Item PrometheumPaxel;
	public static Item ProxiiPaxel;
	public static Item SeismumPaxel;
	public static Item SolariumPaxel;
	public static Item TerraxPaxel;
	public static Item TiberiumPaxel;
	public static Item TriberiumPaxel;
	public static Item TritonitePaxel;
	public static Item UruPaxel;
	public static Item ValyriumPaxel;
	public static Item VibraniumPaxel;
	public static Item VioliumPaxel;
	public static Item YrdeenPaxel;
	
	public static void init(){
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
		// BaseMetals
		if(Loader.isModLoaded("basemetals")){
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
		if (Loader.isModLoaded("immersiveengineering")){
			if (ConfigHandler.ImmersiveAluminiumPaxel){
				ImmersiveAluminiumPaxel = new ImmersiveAluminiumPaxel(ToolHandler.ieAluminiumToolMaterial);
				registerItem(ImmersiveAluminiumPaxel, "ImmersiveAluminiumPaxel");
			}
			if (ConfigHandler.ImmersiveConstantanPaxel){
				ImmersiveConstantanPaxel = new ImmersiveConstantanPaxel(ToolHandler.ieConstantanToolMaterial);
				registerItem(ImmersiveConstantanPaxel, "ImmersiveConstantanPaxel");
			}
			if (ConfigHandler.ImmersiveUraniumPaxel){
				ImmersiveUraniumPaxel = new ImmersiveUraniumPaxel(ToolHandler.ieUraniumToolMaterial);
				registerItem(ImmersiveUraniumPaxel, "ImmersiveUraniumPaxel");
			}
		}
		// Adamantium
		if (Loader.isModLoaded("adamantium")){
			if (ConfigHandler.AdamantiumPaxel){
				AdamantiumPaxel = new AdamantiumPaxel(ToolHandler.adamantiumToolMaterial);
				registerItem(AdamantiumPaxel, "AdamantiumPaxel");
			}
		}
		// Taiga
		if (Loader.isModLoaded("taiga")){
			if (ConfigHandler.AbyssumPaxel){
				AbyssumPaxel = new AbyssumPaxel(ToolHandler.abyssumToolMaterial);
				registerItem(AbyssumPaxel, "AbyssumPaxel");
			}
			if (ConfigHandler.AdamantPaxel){
				AdamantPaxel = new AdamantPaxel(ToolHandler.adamantToolMaterial);
				registerItem(AdamantPaxel, "AdamantPaxel");
			}
			if (ConfigHandler.AstriumPaxel){
				AstriumPaxel = new AstriumPaxel(ToolHandler.astriumToolMaterial);
				registerItem(AstriumPaxel, "AstriumPaxel");
			}
			if (ConfigHandler.AuroriumPaxel){
				AuroriumPaxel = new AuroriumPaxel(ToolHandler.auroriumToolMaterial);
				registerItem(AuroriumPaxel, "AuroriumPaxel");
			}
			if (ConfigHandler.BasaltPaxel){
				BasaltPaxel = new BasaltPaxel(ToolHandler.basaltToolMaterial);
				registerItem(BasaltPaxel, "BasaltPaxel");
			}
			if (ConfigHandler.DilithiumPaxel){
				DilithiumPaxel = new DilithiumPaxel(ToolHandler.dilithiumToolMaterial);
				registerItem(DilithiumPaxel, "DilithiumPaxel");
			}
			if (ConfigHandler.DuranitePaxel){
				DuranitePaxel = new DuranitePaxel(ToolHandler.duraniteToolMaterial);
				registerItem(DuranitePaxel, "DuranitePaxel");
			}
			if (ConfigHandler.DyonitePaxel){
				DyonitePaxel = new DyonitePaxel(ToolHandler.dyoniteToolMaterial);
				registerItem(DyonitePaxel, "DyonitePaxel");
			}
			if (ConfigHandler.EezoPaxel){
				EezoPaxel = new EezoPaxel(ToolHandler.eezoToolMaterial);
				registerItem(EezoPaxel, "EezoPaxel");
			}
			if (ConfigHandler.FractumPaxel){
				FractumPaxel = new FractumPaxel(ToolHandler.fractumToolMaterial);
				registerItem(FractumPaxel, "FractumPaxel");
			}
			if (ConfigHandler.IgnitzPaxel){
				IgnitzPaxel = new IgnitzPaxel(ToolHandler.ignitzToolMaterial);
				registerItem(IgnitzPaxel, "IgnitzPaxel");
			}
			if (ConfigHandler.ImperomitePaxel){
				ImperomitePaxel = new ImperomitePaxel(ToolHandler.imperomiteToolMaterial);
				registerItem(ImperomitePaxel, "ImperomitePaxel");
			}
			if (ConfigHandler.IoxPaxel){
				IoxPaxel = new IoxPaxel(ToolHandler.ioxToolMaterial);
				registerItem(IoxPaxel, "IoxPaxel");
			}
			if (ConfigHandler.JauxumPaxel){
				JauxumPaxel = new JauxumPaxel(ToolHandler.jauxumToolMaterial);
				registerItem(JauxumPaxel, "JauxumPaxel");
			}
			if (ConfigHandler.KarmesinePaxel){
				KarmesinePaxel = new KarmesinePaxel(ToolHandler.karmesineToolMaterial);
				registerItem(KarmesinePaxel, "KarmesinePaxel");
			}
			if (ConfigHandler.LumixPaxel){
				LumixPaxel = new LumixPaxel(ToolHandler.lumixToolMaterial);
				registerItem(LumixPaxel, "LumixPaxel");
			}
			if (ConfigHandler.MeteoritePaxel){
				MeteoritePaxel = new MeteoritePaxel(ToolHandler.meteoriteToolMaterial);
				registerItem(MeteoritePaxel, "MeteoritePaxel");
			}
			if (ConfigHandler.NihilitePaxel){
				NihilitePaxel = new NihilitePaxel(ToolHandler.nihiliteToolMaterial);
				registerItem(NihilitePaxel, "NihilitePaxel");
			}
			if (ConfigHandler.NiobPaxel){
				NiobPaxel = new NiobPaxel(ToolHandler.niobToolMaterial);
				registerItem(NiobPaxel, "NiobPaxel");
			}
			if (ConfigHandler.NucleumPaxel){
				NucleumPaxel = new NucleumPaxel(ToolHandler.nucleumToolMaterial);
				registerItem(NucleumPaxel, "NucleumPaxel");
			}
			if (ConfigHandler.ObsidioritePaxel){
				ObsidioritePaxel = new ObsidioritePaxel(ToolHandler.obsidioriteToolMaterial);
				registerItem(ObsidioritePaxel, "ObsidioritePaxel");
			}
			if (ConfigHandler.OsramPaxel){
				OsramPaxel = new OsramPaxel(ToolHandler.osramToolMaterial);
				registerItem(OsramPaxel, "OsramPaxel");
			}
			if (ConfigHandler.OviumPaxel){
				OviumPaxel = new OviumPaxel(ToolHandler.oviumToolMaterial);
				registerItem(OviumPaxel, "OviumPaxel");
			}
			if (ConfigHandler.PalladiumPaxel){
				PalladiumPaxel = new PalladiumPaxel(ToolHandler.palladiumToolMaterial);
				registerItem(PalladiumPaxel, "PalladiumPaxel");
			}
			if (ConfigHandler.PrometheumPaxel){
				PrometheumPaxel = new PrometheumPaxel(ToolHandler.prometheumToolMaterial);
				registerItem(PrometheumPaxel, "PrometheumPaxel");
			}
			if (ConfigHandler.ProxiiPaxel){
				ProxiiPaxel = new ProxiiPaxel(ToolHandler.proxiiToolMaterial);
				registerItem(ProxiiPaxel, "ProxiiPaxel");
			}
			if (ConfigHandler.SeismumPaxel){
				SeismumPaxel = new SeismumPaxel(ToolHandler.seismumToolMaterial);
				registerItem(SeismumPaxel, "SeismumPaxel");
			}
			if (ConfigHandler.SolariumPaxel){
				SolariumPaxel = new SolariumPaxel(ToolHandler.solariumToolMaterial);
				registerItem(SolariumPaxel, "SolariumPaxel");
			}
			if (ConfigHandler.TerraxPaxel){
				TerraxPaxel = new TerraxPaxel(ToolHandler.terraxToolMaterial);
				registerItem(TerraxPaxel, "TerraxPaxel");
			}
			if (ConfigHandler.TiberiumPaxel){
				TiberiumPaxel = new TiberiumPaxel(ToolHandler.tiberiumToolMaterial);
				registerItem(TiberiumPaxel, "TiberiumPaxel");
			}
			if (ConfigHandler.TriberiumPaxel){
				TriberiumPaxel = new TriberiumPaxel(ToolHandler.triberiumToolMaterial);
				registerItem(TriberiumPaxel, "TriberiumPaxel");
			}
			if (ConfigHandler.TritonitePaxel){
				TritonitePaxel = new TritonitePaxel(ToolHandler.tritoniteToolMaterial);
				registerItem(TritonitePaxel, "TritonitePaxel");
			}
			if (ConfigHandler.UruPaxel){
				UruPaxel = new UruPaxel(ToolHandler.uruToolMaterial);
				registerItem(UruPaxel, "UruPaxel");
			}
			if (ConfigHandler.ValyriumPaxel){
				ValyriumPaxel = new ValyriumPaxel(ToolHandler.valyriumToolMaterial);
				registerItem(ValyriumPaxel, "ValyriumPaxel");
			}
			if (ConfigHandler.VibraniumPaxel){
				VibraniumPaxel = new VibraniumPaxel(ToolHandler.vibraniumToolMaterial);
				registerItem(VibraniumPaxel, "VibraniumPaxel");
			}
			if (ConfigHandler.VioliumPaxel){
				VioliumPaxel = new VioliumPaxel(ToolHandler.violiumToolMaterial);
				registerItem(VioliumPaxel, "VioliumPaxel");
			}
			if (ConfigHandler.YrdeenPaxel){
				YrdeenPaxel = new YrdeenPaxel(ToolHandler.yrdeenToolMaterial);
				registerItem(YrdeenPaxel, "YrdeenPaxel");
			}
		}
		
	}

	static void registerItem(Item item, String name){
		GameRegistry.register(item, new ResourceLocation(Reference.MOD_ID + ":" + name));
	}
}
