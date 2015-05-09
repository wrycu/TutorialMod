/* Events within this file are performed client-side only */
package com.wrycu.tutorial.proxy;

import com.wrycu.tutorial.init.TutorialBlocks;
import com.wrycu.tutorial.init.TutorialItems;

public class ClientProxy extends CommonProxy{
	@Override
	public void registerRenders()
	{
		// This function is only called on the client.  The server has no concept of a GUI, so we don't need to register textures
		TutorialBlocks.registerRenders();
		TutorialItems.registerRenders();
	}
}
