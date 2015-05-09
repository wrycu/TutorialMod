package com.wrycu.tutorial;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.wrycu.tutorial.init.TutorialBlocks;
import com.wrycu.tutorial.init.TutorialItems;
import com.wrycu.tutorial.proxy.CommonProxy;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class TutorialMod {
	// Proxies allow us to perform certain actions on either the server or client side only
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide=Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	// Set a background image for the creative tab and stuff
	public static final TutorialTab tabTutorial = new TutorialTab("tabTutorial");
	
	// Initialize the mod and register items
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		// Register blocks
		TutorialBlocks.init();
		TutorialBlocks.register();
		// Register items
		TutorialItems.init();
		TutorialItems.register();
	}
	
	// Register textures
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		proxy.registerRenders();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
}
