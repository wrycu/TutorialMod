package com.wrycu.tutorial.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockTest extends Block{
	// This file is required, but I don't think we need anything else in it. At least, not yet.
	
	// defaults to protected. Change to public
	public BlockTest(Material materialIn) {
		super(materialIn);
	}

}
