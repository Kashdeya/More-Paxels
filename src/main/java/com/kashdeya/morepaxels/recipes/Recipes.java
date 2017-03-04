package com.kashdeya.morepaxels.recipes;


import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

import com.kashdeya.morepaxels.handlers.ConfigHandler;
import com.kashdeya.morepaxels.inits.PaxelTools;



public class Recipes {
	
	public static void registerRecipes(){
		// vanilla
		if (ConfigHandler.VanillaSupport){
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
		}
		// BaseMetals
		if (ConfigHandler.BaseMetalsSupport){
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
		}
		// IE
		if (ConfigHandler.immersiveSupport){
			if (ConfigHandler.ImmersiveAluminiumPaxel){
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PaxelTools.ImmersiveAluminiumPaxel), "www", " sw", " s ", 'w', "ingotAluminum", 's', "stickWood"));
			}
			if (ConfigHandler.ImmersiveConstantanPaxel){
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PaxelTools.ImmersiveConstantanPaxel), "www", " sw", " s ", 'w', "ingotConstantan", 's', "stickWood"));
			}
			if (ConfigHandler.ImmersiveCopperPaxel){
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PaxelTools.ImmersiveCopperPaxel), "www", " sw", " s ", 'w', "ingotCopper", 's', "stickWood"));
			}
			if (ConfigHandler.ImmersiveElectrumPaxel){
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PaxelTools.ImmersiveElectrumPaxel), "www", " sw", " s ", 'w', "ingotElectrum", 's', "stickWood"));
			}
			if (ConfigHandler.ImmersiveLeadPaxel){
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PaxelTools.ImmersiveLeadPaxel), "www", " sw", " s ", 'w', "ingotLead", 's', "stickWood"));
			}
			if (ConfigHandler.ImmersiveNickelPaxel){
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PaxelTools.ImmersiveNickelPaxel), "www", " sw", " s ", 'w', "ingotNickel", 's', "stickWood"));
			}
			if (ConfigHandler.ImmersiveSilverPaxel){
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PaxelTools.ImmersiveSilverPaxel), "www", " sw", " s ", 'w', "ingotSilver", 's', "stickWood"));
			}
			if (ConfigHandler.ImmersiveSteelPaxel){
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PaxelTools.ImmersiveSteelPaxel), "www", " sw", " s ", 'w', "ingotSteel", 's', "stickWood"));
			}
			if (ConfigHandler.ImmersiveUraniumPaxel){
				GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(PaxelTools.ImmersiveUraniumPaxel), "www", " sw", " s ", 'w', "ingotUranium", 's', "stickWood"));
			}
		}		
	}

}
