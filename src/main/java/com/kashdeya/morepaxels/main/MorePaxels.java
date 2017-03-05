package com.kashdeya.morepaxels.main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.kashdeya.morepaxels.config.PaxelConfig;
import com.kashdeya.morepaxels.inits.PaxelTools;
import com.kashdeya.morepaxels.proxy.CommonProxy;
import com.kashdeya.morepaxels.tabs.TabMP;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, dependencies = "after:basemetals;after:immersiveengineering;after:adamantium;after:taiga")

public class MorePaxels {
	
	@Instance(Reference.MOD_ID)
    public static MorePaxels instance;
	
	@SidedProxy(clientSide=Reference.PROXY_CLIENT, serverSide=Reference.PROXY_COMMON)
	public static CommonProxy PROXY;
	
	public static final CreativeTabs tabMP = new TabMP("MorePaxels");
	
    public static org.apache.logging.log4j.Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent e) {
    	logger = e.getModLog();;
    	
		// Configs
		PaxelConfig.initMain();
		
    	// Load everything else
		PaxelTools.init();
		
		// Renders
    	PROXY.registerRenderers();
    	
    	// Events
    	MinecraftForge.EVENT_BUS.register(instance);
    }

    @EventHandler
    public void init(FMLInitializationEvent e) {
    	PROXY.init();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {}
}