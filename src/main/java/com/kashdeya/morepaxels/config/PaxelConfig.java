package com.kashdeya.morepaxels.config;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

import com.kashdeya.morepaxels.handlers.ConfigHandler;

public class PaxelConfig {
	
	public static Configuration config;
	
	public static final File configDir = new File("config/More Paxels");
	
	public static void initMain()
	{
		
		File f = new File(configDir, "Main.cfg");
		config = new Configuration(f);
		
		config.load();
		String category;
		
		category = "More Paxels";
		
		config.addCustomCategoryComment(category, "Because People Love Multi Tools");
		ConfigHandler.VanillaSupport = config.getBoolean("Vanilla Paxels", category, true, "Enable?");
		ConfigHandler.BaseMetalsSupport = config.getBoolean("BaseMetal Paxels", category, false, "Enable?");
		ConfigHandler.immersiveSupport = config.getBoolean("ImmersiveEngineering Paxels", category, false, "Enable?");
		
		config.addCustomCategoryComment(category + " Vanilla", "Because People Love Multi Tools");
		ConfigHandler.WoodenPaxel = config.getBoolean("Wooden Paxel", category + " Vanilla", true, "Enable Wooden Paxel?");
		ConfigHandler.DiamondPaxel = config.getBoolean("Diamond Paxel", category + " Vanilla", true, "Enable Diamond Paxel?");
		ConfigHandler.GoldenPaxel = config.getBoolean("Golden Paxel", category + " Vanilla", true, "Enable Golden Paxel?");
		ConfigHandler.IronPaxel = config.getBoolean("Iron Paxel", category + " Vanilla", true, "Enable Iron Paxel?");
		ConfigHandler.StonePaxel = config.getBoolean("Stone Paxel", category + " Vanilla", true, "Enable?");
		
		config.addCustomCategoryComment(category + " BaseMetal", "Because People Love Multi Tools");
		ConfigHandler.AdamantinePaxel = config.getBoolean("Adamantine Paxel", category + " BaseMetal", true, "Enable?");
		ConfigHandler.AdamantineDamage = config.getInt("Adamantine Paxel Durability", category + " BaseMetal", 3200, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.AquariumPaxel = config.getBoolean("Aquarium Paxel", category + " BaseMetal", true, "Enable?");
		ConfigHandler.AquariumDamage = config.getInt("Aquarium Paxel Durability", category + " BaseMetal", 320, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.BrassPaxel = config.getBoolean("Brass Paxel", category + " BaseMetal", true, "Enable?");
		ConfigHandler.BrassDamage = config.getInt("Brass Paxel Durability", category + " BaseMetal", 96, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.BronzePaxel = config.getBoolean("Bronze Paxel", category + " BaseMetal", true, "Enable?");
		ConfigHandler.BronzeDamage = config.getInt("Bronze Paxel Durability", category + " BaseMetal", 128, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.ColdPaxel = config.getBoolean("ColdIron Paxel", category + " BaseMetal", true, "Enable?");
		ConfigHandler.ColdDamage = config.getInt("ColdIron Paxel Durability", category + " BaseMetal", 224, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.CopperPaxel = config.getBoolean("Copper Paxel", category + " BaseMetal", true, "Enable?");
		ConfigHandler.CopperDamage = config.getInt("Copper Paxel Durability", category + " BaseMetal", 128, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.CupronickelPaxel = config.getBoolean("Cupronickel Paxel", category + " BaseMetal", true, "Enable?");
		ConfigHandler.CupronickelDamage = config.getInt("Cupronickel Paxel Durability", category + " BaseMetal", 192, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.ElectrumPaxel = config.getBoolean("Electrum Paxel", category + " BaseMetal", true, "Enable?");
		ConfigHandler.ElectrumDamage = config.getInt("Electrum Paxel Durability", category + " BaseMetal", 128, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.InvarPaxel = config.getBoolean("Invar Paxel", category + " BaseMetal", true, "Enable?");
		ConfigHandler.InvarDamage = config.getInt("Invar Paxel Durability", category + " BaseMetal", 320, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.LeadPaxel = config.getBoolean("Lead Paxel", category + " BaseMetal", true, "Enable?");
		ConfigHandler.LeadDamage = config.getInt("Lead Paxel Durability", category + " BaseMetal", 32, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.MithrilPaxel = config.getBoolean("Mithril Paxel", category + " BaseMetal", true, "Enable?");
		ConfigHandler.MithrilDamage = config.getInt("Mithril Paxel Durability", category + " BaseMetal", 288, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.NickelPaxel = config.getBoolean("Nickel Paxel", category + " BaseMetal", true, "Enable?");
		ConfigHandler.NickelDamage = config.getInt("Nickel Paxel Durability", category + " BaseMetal", 128, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.PlatinumPaxel = config.getBoolean("Platinum Paxel", category + " BaseMetal", true, "Enable?");
		ConfigHandler.PlatinumDamage = config.getInt("Platinum Paxel Durability", category + " BaseMetal", 160, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.SilverPaxel = config.getBoolean("Silver Paxel", category + " BaseMetal", true, "Enable?");
		ConfigHandler.SilverDamage = config.getInt("Silver Paxel Durability", category + " BaseMetal", 128, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.StarPaxel = config.getBoolean("StarSteel Paxel", category + " BaseMetal", true, "Enable?");
		ConfigHandler.StarDamage = config.getInt("StarSteel Paxel Durability", category + " BaseMetal", 800, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.SteelPaxel = config.getBoolean("Steel Paxel", category + " BaseMetal", true, "Enable?");
		ConfigHandler.SteelDamage = config.getInt("Steel Paxel Durability", category + " BaseMetal", 480, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.TinPaxel = config.getBoolean("Tin Paxel", category + " BaseMetal", true, "Enable?");
		ConfigHandler.TinDamage = config.getInt("Tin Paxel Durability", category + " BaseMetal", 32, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		
		config.addCustomCategoryComment(category + " ImmersiveEngineering", "Because People Love Multi Tools");
		ConfigHandler.ImmersiveAluminiumPaxel = config.getBoolean("Aluminium Paxel", category + " ImmersiveEngineering", true, "Enable?");
		ConfigHandler.ImmersiveAluminiumDamage = config.getInt("Aluminium Paxel Durability", category + " ImmersiveEngineering", 255, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.ImmersiveConstantanPaxel = config.getBoolean("Constantan Paxel", category + " ImmersiveEngineering", true, "Enable?");
		ConfigHandler.ImmersiveConstantanDamage = config.getInt("Constantan Paxel Durability", category + " ImmersiveEngineering", 128, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.ImmersiveCopperPaxel = config.getBoolean("Copper Paxel", category + " ImmersiveEngineering", true, "Enable?");
		ConfigHandler.ImmersiveCopperDamage = config.getInt("Copper Paxel Durability", category + " ImmersiveEngineering", 128, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.ImmersiveElectrumPaxel = config.getBoolean("Electrum Paxel", category + " ImmersiveEngineering", true, "Enable?");
		ConfigHandler.ImmersiveElectrumDamage = config.getInt("Electrum Paxel Durability", category + " ImmersiveEngineering", 128, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.ImmersiveLeadPaxel = config.getBoolean("Lead Paxel", category + " ImmersiveEngineering", true, "Enable?");
		ConfigHandler.ImmersiveLeadDamage = config.getInt("Lead Paxel Durability", category + " ImmersiveEngineering", 32, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.ImmersiveNickelPaxel = config.getBoolean("Nickel Paxel", category + " ImmersiveEngineering", true, "Enable?");
		ConfigHandler.ImmersiveNickelDamage = config.getInt("Nickel Paxel Durability", category + " ImmersiveEngineering", 128, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.ImmersiveSilverPaxel = config.getBoolean("Silver Paxel", category + " ImmersiveEngineering", true, "Enable?");
		ConfigHandler.ImmersiveSilverDamage = config.getInt("Silver Paxel Durability", category + " ImmersiveEngineering", 128, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.ImmersiveSteelPaxel = config.getBoolean("Steel Paxel", category + " ImmersiveEngineering", true, "Enable?");
		ConfigHandler.ImmersiveSteelDamage = config.getInt("Steel Paxel Durability", category + " ImmersiveEngineering", 480, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.ImmersiveUraniumPaxel = config.getBoolean("Uranium Paxel", category + " ImmersiveEngineering", true, "Enable?");
		ConfigHandler.ImmersiveUraniumDamage = config.getInt("Uranium Paxel Durability", category + " ImmersiveEngineering", 128, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");

		if (config.hasChanged())
        config.save();    
	}
}
