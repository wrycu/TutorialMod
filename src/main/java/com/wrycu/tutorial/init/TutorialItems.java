package com.wrycu.tutorial.init;

// Needed to register the item in minecraft
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

// Needed for various reference strings (e.g. mod name)
import com.wrycu.tutorial.Reference;
import com.wrycu.tutorial.TutorialMod;
import com.wrycu.tutorial.items.TeleportItem;

public class TutorialItems {
	
	/* Item variables */
	public static Item test_item;
	public static Item teleport_item;
	
	/* initialize the item */
	public static void init() {
		// Add the item with nothing special
		//test_item = new Item().setUnlocalizedName("test_item");
		// Add the item to a creative tab
		test_item = new Item().setUnlocalizedName("test_item").setCreativeTab(TutorialMod.tabTutorial);
		teleport_item = new TeleportItem().setUnlocalizedName("teleport_item").setCreativeTab(TutorialMod.tabTutorial);
		
	}
	
	/* register the item */
	public static void register()
	{
		GameRegistry.registerItem(test_item, test_item.getUnlocalizedName().substring(5)); // "tile.test_item"
		GameRegistry.registerItem(teleport_item, teleport_item.getUnlocalizedName().substring(5)); // "tile.teleport_item"
	}
	
	/* registers all item textures when called */
	public static void registerRenders()
	{
		registerRender(test_item);
		registerRender(teleport_item);
	}
	
	/* performs the actual register on a singular item */
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(
			item, 
			0, 
			new ModelResourceLocation(
				Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), 
				"inventory"
			)
		);
	}
}
