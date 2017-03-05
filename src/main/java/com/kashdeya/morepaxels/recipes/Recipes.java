package com.kashdeya.morepaxels.recipes;


import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

import com.kashdeya.morepaxels.handlers.ConfigHandler;
import com.kashdeya.morepaxels.inits.PaxelTools;
import com.reygok.adamantiummod.init.AdaItems;



public class Recipes {
	
	public static void registerRecipes(){
		// vanilla
		if (ConfigHandler.WoodenPaxel){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PaxelTools.WoodenPaxel), "www", " sw", " s ", 'w', "plankWood", 's', "stickWood"));
		}
		if (ConfigHandler.StonePaxel){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PaxelTools.StonePaxel), "www", " sw", " s ", 'w', "stone", 's', "stickWood"));
		}
		if (ConfigHandler.GoldenPaxel){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PaxelTools.GoldenPaxel), "www", " sw", " s ", 'w', "ingotGold", 's', "stickWood"));
		}
		if (ConfigHandler.IronPaxel){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PaxelTools.IronPaxel), "www", " sw", " s ", 'w', "ingotIron", 's', "stickWood"));
		}
		if (ConfigHandler.DiamondPaxel){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PaxelTools.DiamondPaxel), "www", " sw", " s ", 'w', "gemDiamond", 's', "stickWood"));
		}
		// BaseMetals
		if (ConfigHandler.AdamantinePaxel){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PaxelTools.AdamantinePaxel), "www", " sw", " s ", 'w', "ingotAdamantine", 's', "stickWood"));
		}
		if (ConfigHandler.AquariumPaxel){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PaxelTools.AquariumPaxel), "www", " sw", " s ", 'w', "ingotAquarium", 's', "stickWood"));
		}
		if (ConfigHandler.BrassPaxel){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PaxelTools.BrassPaxel), "www", " sw", " s ", 'w', "ingotBrass", 's', "stickWood"));
		}
		if (ConfigHandler.BronzePaxel){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PaxelTools.BronzePaxel), "www", " sw", " s ", 'w', "ingotBronze", 's', "stickWood"));
		}
		if (ConfigHandler.ColdPaxel){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PaxelTools.ColdPaxel), "www", " sw", " s ", 'w', "ingotColdiron", 's', "stickWood"));
		}
		if (ConfigHandler.CopperPaxel){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PaxelTools.CopperPaxel), "www", " sw", " s ", 'w', "ingotCopper", 's', "stickWood"));
		}
		if (ConfigHandler.CupronickelPaxel){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PaxelTools.CupronickelPaxel), "www", " sw", " s ", 'w', "ingotCupronickel", 's', "stickWood"));
		}
		if (ConfigHandler.ElectrumPaxel){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PaxelTools.ElectrumPaxel), "www", " sw", " s ", 'w', "ingotElectrum", 's', "stickWood"));
		}
		if (ConfigHandler.InvarPaxel){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PaxelTools.InvarPaxel), "www", " sw", " s ", 'w', "ingotInvar", 's', "stickWood"));
		}
		if (ConfigHandler.LeadPaxel){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PaxelTools.LeadPaxel), "www", " sw", " s ", 'w', "ingotLead", 's', "stickWood"));
		}
		if (ConfigHandler.MithrilPaxel){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PaxelTools.MithrilPaxel), "www", " sw", " s ", 'w', "ingotMithril", 's', "stickWood"));
		}
		if (ConfigHandler.NickelPaxel){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PaxelTools.NickelPaxel), "www", " sw", " s ", 'w', "ingotNickel", 's', "stickWood"));
		}
		if (ConfigHandler.PlatinumPaxel){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PaxelTools.PlatinumPaxel), "www", " sw", " s ", 'w', "ingotPlatinum", 's', "stickWood"));
		}
		if (ConfigHandler.SilverPaxel){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PaxelTools.SilverPaxel), "www", " sw", " s ", 'w', "ingotSilver", 's', "stickWood"));
		}
		if (ConfigHandler.StarPaxel){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PaxelTools.StarPaxel), "www", " sw", " s ", 'w', "ingotStarsteel", 's', "stickWood"));
		}
		if (ConfigHandler.SteelPaxel){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PaxelTools.SteelPaxel), "www", " sw", " s ", 'w', "ingotSteel", 's', "stickWood"));
		}
		if (ConfigHandler.TinPaxel){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PaxelTools.TinPaxel), "www", " sw", " s ", 'w', "ingotTin", 's', "stickWood"));
		}
		// IE
		if (ConfigHandler.ImmersiveAluminiumPaxel){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PaxelTools.ImmersiveAluminiumPaxel), "www", " sw", " s ", 'w', "ingotAluminum", 's', "stickWood"));
		}
		if (ConfigHandler.ImmersiveConstantanPaxel){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PaxelTools.ImmersiveConstantanPaxel), "www", " sw", " s ", 'w', "ingotConstantan", 's', "stickWood"));
		}
		if (ConfigHandler.ImmersiveUraniumPaxel){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PaxelTools.ImmersiveUraniumPaxel), "www", " sw", " s ", 'w', "ingotUranium", 's', "stickWood"));
		}
		// Adamantium
		if (ConfigHandler.AdamantiumPaxel){
			GameRegistry.addShapedRecipe(new ItemStack(PaxelTools.AdamantiumPaxel), new Object[] {"www", " sw", " s ", 'w', new ItemStack(AdaItems.adamantiumIngot), 's', new ItemStack(Items.STICK)});
		}
		// Taiga
		if (ConfigHandler.AbyssumPaxel){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PaxelTools.AbyssumPaxel), "www", " sw", " s ", 'w', "ingotAbyssum", 's', "stickWood"));
		}
		if (ConfigHandler.AdamantPaxel){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PaxelTools.AdamantPaxel), "www", " sw", " s ", 'w', "ingotAdamant", 's', "stickWood"));
		}
		if (ConfigHandler.AstriumPaxel){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PaxelTools.AstriumPaxel), "www", " sw", " s ", 'w', "ingotAstrium", 's', "stickWood"));
		}
		if (ConfigHandler.AuroriumPaxel){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PaxelTools.AuroriumPaxel), "www", " sw", " s ", 'w', "ingotAurorium", 's', "stickWood"));
		}
		if (ConfigHandler.BasaltPaxel){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PaxelTools.BasaltPaxel), "www", " sw", " s ", 'w', "ingotBasalt", 's', "stickWood"));
		}
		if (ConfigHandler.DilithiumPaxel){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PaxelTools.DilithiumPaxel), "www", " sw", " s ", 'w', "ingotDilithium", 's', "stickWood"));
		}
		if (ConfigHandler.DuranitePaxel){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PaxelTools.DuranitePaxel), "www", " sw", " s ", 'w', "ingotDuranite", 's', "stickWood"));
		}
		if (ConfigHandler.DyonitePaxel){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PaxelTools.DyonitePaxel), "www", " sw", " s ", 'w', "ingotDyonite", 's', "stickWood"));
		}
		if (ConfigHandler.EezoPaxel){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PaxelTools.EezoPaxel), "www", " sw", " s ", 'w', "ingotEezo", 's', "stickWood"));
		}
		if (ConfigHandler.FractumPaxel){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PaxelTools.FractumPaxel), "www", " sw", " s ", 'w', "ingotFractum", 's', "stickWood"));
		}
		if (ConfigHandler.IgnitzPaxel){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PaxelTools.IgnitzPaxel), "www", " sw", " s ", 'w', "ingotIgnitz", 's', "stickWood"));
		}
		if (ConfigHandler.ImperomitePaxel){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PaxelTools.ImperomitePaxel), "www", " sw", " s ", 'w', "ingotImperomite", 's', "stickWood"));
		}
		if (ConfigHandler.IoxPaxel){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PaxelTools.IoxPaxel), "www", " sw", " s ", 'w', "ingotIox", 's', "stickWood"));
		}
		if (ConfigHandler.JauxumPaxel){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PaxelTools.JauxumPaxel), "www", " sw", " s ", 'w', "ingotJauxum", 's', "stickWood"));
		}
		if (ConfigHandler.KarmesinePaxel){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PaxelTools.KarmesinePaxel), "www", " sw", " s ", 'w', "ingotKarmesine", 's', "stickWood"));
		}
		if (ConfigHandler.LumixPaxel){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PaxelTools.LumixPaxel), "www", " sw", " s ", 'w', "ingotLumix", 's', "stickWood"));
		}
		if (ConfigHandler.MeteoritePaxel){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PaxelTools.MeteoritePaxel), "www", " sw", " s ", 'w', "ingotMeteorite", 's', "stickWood"));
		}
		if (ConfigHandler.NihilitePaxel){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PaxelTools.NihilitePaxel), "www", " sw", " s ", 'w', "ingotNihilite", 's', "stickWood"));
		}
		if (ConfigHandler.NiobPaxel){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PaxelTools.NiobPaxel), "www", " sw", " s ", 'w', "ingotNiob", 's', "stickWood"));
		}
		if (ConfigHandler.NucleumPaxel){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PaxelTools.NucleumPaxel), "www", " sw", " s ", 'w', "ingotNucleum", 's', "stickWood"));
		}
		if (ConfigHandler.ObsidioritePaxel){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PaxelTools.ObsidioritePaxel), "www", " sw", " s ", 'w', "ingotObsidiorite", 's', "stickWood"));
		}
		if (ConfigHandler.OsramPaxel){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PaxelTools.OsramPaxel), "www", " sw", " s ", 'w', "ingotOsram", 's', "stickWood"));
		}
		if (ConfigHandler.OviumPaxel){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PaxelTools.OviumPaxel), "www", " sw", " s ", 'w', "ingotOvium", 's', "stickWood"));
		}
		if (ConfigHandler.PalladiumPaxel){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PaxelTools.PalladiumPaxel), "www", " sw", " s ", 'w', "ingotPalladium", 's', "stickWood"));
		}
		if (ConfigHandler.PrometheumPaxel){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PaxelTools.PrometheumPaxel), "www", " sw", " s ", 'w', "ingotPrometheum", 's', "stickWood"));
		}
		if (ConfigHandler.ProxiiPaxel){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PaxelTools.ProxiiPaxel), "www", " sw", " s ", 'w', "ingotProxii", 's', "stickWood"));
		}
		if (ConfigHandler.SeismumPaxel){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PaxelTools.SeismumPaxel), "www", " sw", " s ", 'w', "ingotSeismum", 's', "stickWood"));
		}
		if (ConfigHandler.SolariumPaxel){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PaxelTools.SolariumPaxel), "www", " sw", " s ", 'w', "ingotSolarium", 's', "stickWood"));
		}
		if (ConfigHandler.TerraxPaxel){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PaxelTools.TerraxPaxel), "www", " sw", " s ", 'w', "ingotTerrax", 's', "stickWood"));
		}
		if (ConfigHandler.TiberiumPaxel){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PaxelTools.TiberiumPaxel), "www", " sw", " s ", 'w', "ingotTiberium", 's', "stickWood"));
		}
		if (ConfigHandler.TriberiumPaxel){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PaxelTools.TriberiumPaxel), "www", " sw", " s ", 'w', "ingotTriberium", 's', "stickWood"));
		}
		if (ConfigHandler.TritonitePaxel){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PaxelTools.TritonitePaxel), "www", " sw", " s ", 'w', "ingotTritonite", 's', "stickWood"));
		}
		if (ConfigHandler.UruPaxel){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PaxelTools.UruPaxel), "www", " sw", " s ", 'w', "ingotUru", 's', "stickWood"));
		}
		if (ConfigHandler.ValyriumPaxel){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PaxelTools.ValyriumPaxel), "www", " sw", " s ", 'w', "ingotValyrium", 's', "stickWood"));
		}
		if (ConfigHandler.VibraniumPaxel){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PaxelTools.VibraniumPaxel), "www", " sw", " s ", 'w', "ingotVibranium", 's', "stickWood"));
		}
		if (ConfigHandler.VioliumPaxel){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PaxelTools.VioliumPaxel), "www", " sw", " s ", 'w', "ingotViolium", 's', "stickWood"));
		}
		if (ConfigHandler.YrdeenPaxel){
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PaxelTools.YrdeenPaxel), "www", " sw", " s ", 'w', "ingotYrdeen", 's', "stickWood"));
		}
	}

}
