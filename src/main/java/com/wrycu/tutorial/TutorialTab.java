package com.wrycu.tutorial;

// Used to add a creative tab

import com.wrycu.tutorial.init.TutorialItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TutorialTab extends CreativeTabs{

	public TutorialTab(String label) {
		super(label);
		// Sets a background
		// Filename must be tab_background.png (in src/main/resources/assets/minecraft.textures.gui.container.creative_inventory
		this.setBackgroundImageName("background.png");
	}

	@Override
	public Item getTabIconItem() {
		// Sets the tab icon
		return TutorialItems.test_item;
	}
	
}
