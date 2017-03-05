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
		ConfigHandler.ImmersiveUraniumPaxel = config.getBoolean("Uranium Paxel", category + " ImmersiveEngineering", true, "Enable?");
		ConfigHandler.ImmersiveUraniumDamage = config.getInt("Uranium Paxel Durability", category + " ImmersiveEngineering", 128, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");

		config.addCustomCategoryComment(category + " Adamantium", "Because People Love Multi Tools");
		ConfigHandler.AdamantiumPaxel = config.getBoolean("Adamantium Paxel", category + " Adamantium", true, "Enable?");
		ConfigHandler.AdamantiumDamage = config.getInt("Adamantium Paxel Durability", category + " Adamantium", 16384, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		
		config.addCustomCategoryComment(category + " Taiga", "Because People Love Multi Tools");
		ConfigHandler.AbyssumPaxel = config.getBoolean("Abyssum Paxel", category + " Taiga", true, "Enable?");
		ConfigHandler.AbyssumDamage = config.getInt("Abyssum Paxel Durability", category + " Taiga", 124, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.AdamantPaxel = config.getBoolean("Adamant Paxel", category + " Taiga", true, "Enable?");
		ConfigHandler.AdamantDamage = config.getInt("Adamant Paxel Durability", category + " Taiga", 1750, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.AstriumPaxel = config.getBoolean("Astrium Paxel", category + " Taiga", true, "Enable?");
		ConfigHandler.AstriumDamage = config.getInt("Astrium Paxel Durability", category + " Taiga", 750, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.AuroriumPaxel = config.getBoolean("Aurorium Paxel", category + " Taiga", true, "Enable?");
		ConfigHandler.AuroriumDamage = config.getInt("Aurorium Paxel Durability", category + " Taiga", 750, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.BasaltPaxel = config.getBoolean("Basalt Paxel", category + " Taiga", true, "Enable?");
		ConfigHandler.BasaltDamage = config.getInt("Basalt Paxel Durability", category + " Taiga", 200, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.DilithiumPaxel = config.getBoolean("Dilithium Paxel", category + " Taiga", true, "Enable?");
		ConfigHandler.DilithiumDamage = config.getInt("Dilithium Paxel Durability", category + " Taiga", 105, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.DuranitePaxel = config.getBoolean("Duranite Paxel", category + " Taiga", true, "Enable?");
		ConfigHandler.DuraniteDamage = config.getInt("Duranite Paxel Durability", category + " Taiga", 1550, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.DyonitePaxel = config.getBoolean("Dyonite Paxel", category + " Taiga", true, "Enable?");
		ConfigHandler.DyoniteDamage = config.getInt("Dyonite Paxel Durability", category + " Taiga", 900, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.EezoPaxel = config.getBoolean("Eezo Paxel", category + " Taiga", true, "Enable?");
		ConfigHandler.EezoDamage = config.getInt("Eezo Paxel Durability", category + " Taiga", 50, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.FractumPaxel = config.getBoolean("Fractum Paxel", category + " Taiga", true, "Enable?");
		ConfigHandler.FractumDamage = config.getInt("Fractum Paxel Durability", category + " Taiga", 538, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.IgnitzPaxel = config.getBoolean("Ignitz Paxel", category + " Taiga", true, "Enable?");
		ConfigHandler.IgnitzDamage = config.getInt("Ignitz Paxel Durability", category + " Taiga", 350, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.ImperomitePaxel = config.getBoolean("Imperomite Paxel", category + " Taiga", true, "Enable?");
		ConfigHandler.ImperomiteDamage = config.getInt("Imperomite Paxel Durability", category + " Taiga", 1350, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.IoxPaxel = config.getBoolean("Iox Paxel", category + " Taiga", true, "Enable?");
		ConfigHandler.IoxDamage = config.getInt("Iox Paxel Durability", category + " Taiga", 595, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.JauxumPaxel = config.getBoolean("Jauxum Paxel", category + " Taiga", true, "Enable?");
		ConfigHandler.JauxumDamage = config.getInt("Jauxum Paxel Durability", category + " Taiga", 155, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.KarmesinePaxel = config.getBoolean("Karmesine Paxel", category + " Taiga", true, "Enable?");
		ConfigHandler.KarmesineDamage = config.getInt("Karmesine Paxel Durability", category + " Taiga", 368, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.LumixPaxel = config.getBoolean("Lumix Paxel", category + " Taiga", true, "Enable?");
		ConfigHandler.LumixDamage = config.getInt("Lumix Paxel Durability", category + " Taiga", 667, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.MeteoritePaxel = config.getBoolean("Meteorite Paxel", category + " Taiga", true, "Enable?");
		ConfigHandler.MeteoriteDamage = config.getInt("Meteorite Paxel Durability", category + " Taiga", 1500, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.NihilitePaxel = config.getBoolean("Nihilite Paxel", category + " Taiga", true, "Enable?");
		ConfigHandler.NihiliteDamage = config.getInt("Nihilite Paxel Durability", category + " Taiga", 400, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.NiobPaxel = config.getBoolean("Niob Paxel", category + " Taiga", true, "Enable?");
		ConfigHandler.NiobDamage = config.getInt("Niob Paxel Durability", category + " Taiga", 700, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.NucleumPaxel = config.getBoolean("Nucleum Paxel", category + " Taiga", true, "Enable?");
		ConfigHandler.NucleumDamage = config.getInt("Nucleum Paxel Durability", category + " Taiga", 505, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.ObsidioritePaxel = config.getBoolean("Obsidiorite Paxel", category + " Taiga", true, "Enable?");
		ConfigHandler.ObsidioriteDamage = config.getInt("Obsidiorite Paxel Durability", category + " Taiga", 1500, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.OsramPaxel = config.getBoolean("Osram Paxel", category + " Taiga", true, "Enable?");
		ConfigHandler.OsramDamage = config.getInt("Osram Paxel Durability", category + " Taiga", 222, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.OviumPaxel = config.getBoolean("Ovium Paxel", category + " Taiga", true, "Enable?");
		ConfigHandler.OviumDamage = config.getInt("Ovium Paxel Durability", category + " Taiga", 111, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.PalladiumPaxel = config.getBoolean("Palladium Paxel", category + " Taiga", true, "Enable?");
		ConfigHandler.PalladiumDamage = config.getInt("Palladium Paxel Durability", category + " Taiga", 797, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.PrometheumPaxel = config.getBoolean("Prometheum Paxel", category + " Taiga", true, "Enable?");
		ConfigHandler.PrometheumDamage = config.getInt("Prometheum Paxel Durability", category + " Taiga", 844, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.ProxiiPaxel = config.getBoolean("Proxii Paxel", category + " Taiga", true, "Enable?");
		ConfigHandler.ProxiiDamage = config.getInt("Proxii Paxel Durability", category + " Taiga", 625, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.SeismumPaxel = config.getBoolean("Seismum Paxel", category + " Taiga", true, "Enable?");
		ConfigHandler.SeismumDamage = config.getInt("Seismum Paxel Durability", category + " Taiga", 780, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.SolariumPaxel = config.getBoolean("Solarium Paxel", category + " Taiga", true, "Enable?");
		ConfigHandler.SolariumDamage = config.getInt("Solarium Paxel Durability", category + " Taiga", 1100, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.TerraxPaxel = config.getBoolean("Terrax Paxel", category + " Taiga", true, "Enable?");
		ConfigHandler.TerraxDamage = config.getInt("Terrax Paxel Durability", category + " Taiga", 444, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.TiberiumPaxel = config.getBoolean("Tiberium Paxel", category + " Taiga", true, "Enable?");
		ConfigHandler.TiberiumDamage = config.getInt("Tiberium Paxel Durability", category + " Taiga", 80, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.TriberiumPaxel = config.getBoolean("Triberium Paxel", category + " Taiga", true, "Enable?");
		ConfigHandler.TriberiumDamage = config.getInt("Triberium Paxel Durability", category + " Taiga", 223, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.TritonitePaxel = config.getBoolean("Tritonite Paxel", category + " Taiga", true, "Enable?");
		ConfigHandler.TritoniteDamage = config.getInt("Tritonite Paxel Durability", category + " Taiga", 780, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.UruPaxel = config.getBoolean("Uru Paxel", category + " Taiga", true, "Enable?");
		ConfigHandler.UruDamage = config.getInt("Uru Paxel Durability", category + " Taiga", 877, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.ValyriumPaxel = config.getBoolean("Valyrium Paxel", category + " Taiga", true, "Enable?");
		ConfigHandler.ValyriumDamage = config.getInt("Valyrium Paxel Durability", category + " Taiga", 1111, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.VibraniumPaxel = config.getBoolean("Vibranium Paxel", category + " Taiga", true, "Enable?");
		ConfigHandler.VibraniumDamage = config.getInt("Vibranium Paxel Durability", category + " Taiga", 1235, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.VioliumPaxel = config.getBoolean("Violium Paxel", category + " Taiga", true, "Enable?");
		ConfigHandler.VioliumDamage = config.getInt("Violium Paxel Durability", category + " Taiga", 925, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		ConfigHandler.YrdeenPaxel = config.getBoolean("Yrdeen Paxel", category + " Taiga", true, "Enable?");
		ConfigHandler.YrdeenDamage = config.getInt("Yrdeen Paxel Durability", category + " Taiga", 999, 0, Integer.MAX_VALUE, "Sets the ammount of Durability.");
		
		if (config.hasChanged())
        config.save();    
	}
}
