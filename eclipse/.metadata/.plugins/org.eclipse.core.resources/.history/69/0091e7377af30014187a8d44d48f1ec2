package com.wrycu.tutorial;

public class Reference {
	// Mod ID is prepended to item names. Thus this is a pretty important string
	public static final String MOD_ID = "tutorial_mod";
	public static final String MOD_NAME = "Tutorial Mod";
	public static final String VERSION = "0.1";
	// Name and path of the two proxies
	public static final String CLIENT_PROXY_CLASS = "com.wrycu.tutorial.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "com.wrycu.tutorial.proxy.CommonProxy";
}

/* 
 * Description of files
 * 	com.wrycu.tutorial - <site in reverse>.package_name (package)
 *  com.wrycu.tutorial.init - init things (package)
 *  com.wrycu.tutorial.init.TutorialItems.java - item definitions (class)
 *  com.wrycu.tutorial.proxy - allows things to be run on one side or the other (package)
 *  com.wrycu.tutorial.proxy.ClientProxy.java - things to be run client-side only (class)
 *  com.wrycu.tutorial.proxy.CommonProxy.java - things to be run server-side only (class)
 *  com.wrycu.tutorial.Reference.java - mod-wide strings (e.g. mod name) (class)
 *  com.wrycu.tutorial.TutorialMod.java - mod definition. Invokes other methods. (class)
 */

/* 
 * Don't forget to add: 
 * <workspace>\src\main\resources
 * <workspace>\src\main\resources\assets
 * <workspace>\src\main\resources\assets\models
 * <workspace>\src\main\resources\assets\models\items
 * 			item JSON definitions go here
 * <workspace>\src\main\resources\assets\models\blocks
 * 			block JSON definitions go here
 * <workspace>\src\main\resources\assets\textures
 * <workspace>\src\main\resources\assets\textures\items
 * 			item texture definitions go here
 * <workspace>\src\main\resources\assets\textures\blocks
 * 			block texture definitions go here
 * <workspace>\src\main\resources\assets\blockstates
 * 			weird block things go here
 */

/*
 * To add a mod:
 * 	src/main/java:
 * 		package - com.wrycu.<mod_name>
 *  	class 	- <mod_name>.java
 *  	class 	- Reference.java
 *  src/main/resources:
 *  	mcmod.info
 * Blocks:
 *  setup:
 *  	create:
 *  		src/main/java
 *  			com.wrycu.<mod_name>
 *  				blocks
 *  				init
 *  					<mod_name>Blocks.java
 *  				proxy
 *  					ClientProxy.java
 *  					CommonProxy.java
 *  		src/main/resources
 *  			assets.<mod_name>
 *  				blockstates
 *  				models
 *  					block
 *  					item
 *  				textures
 *  					blocks
 *  add:
 *  	src/main/java
 *  		com.wrycu.<mod_name>
 *  			blocks
 *  				<block_name>.java
 * 		src/main/resources
 * 			assets.<mod_name>
 * 				blockstates
 * 					<block_name>.json
 * 				models
 * 					block
 * 						<block_name>.json
 * 					item
 * 						<block_name>.json
 * 				textures
 * 					blocks
 * 						<block_name>.png
 * Items:
 *  setup:
 *  	create:
 *  		src/main/java
 *  			com.wrycu.<mod_name>
 *  				init
 *  					<mod_name>Items.java
 *  				proxy
 *  					ClientProxy.java
 *  					CommonProxy.java
 *  		src/main/resources
 *  			assets.<mod_name>
 *  				models
 *  					item
 *  				textures
 *  					items
 *  add:
 *  	src/main/java
 *  		com.wrycu.<mod_name>
 * 		src/main/resources
 * 			assets.<mod_name>
 * 				models
 * 					item
 * 						<item_name>.json
 * 				textures
 * 					items
 * 						<item_name>.png
 */