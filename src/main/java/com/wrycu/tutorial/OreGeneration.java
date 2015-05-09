package com.wrycu.tutorial;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.state.pattern.BlockHelper;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

import com.wrycu.tutorial.init.TutorialBlocks;

public class OreGeneration implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.getDimensionId())
		{
		case -1:
			// Nether
			generateNether(world, random, chunkX, chunkZ);
			break;
		case 0:
			// Overworld
			generateOverworld(world, random, chunkX, chunkZ);
			break;
		case 1:
			// End
			generateEnd(world, random, chunkX, chunkZ);
			break;
		}
	}
	
	public void generateNether(World world, Random rand, int x, int z){
		// Don't care.
	}
	
	public void generateOverworld(World world, Random rand, int x, int z){
		//generateBoat(Blocks.bookshelf, world, rand, x, z, 100, 100, 100, Blocks.stone);
		BlockPos pos = new BlockPos(x * 16 + rand.nextInt(16), 65, z * 16 + rand.nextInt(16));
		(new StructureGeneration()).generate(world, rand, pos);
		generateOre(TutorialBlocks.test_block, world, rand, x, z, 2, 10, 100, 0, 100, Blocks.dirt);
	}
	
	public void generateEnd(World world, Random rand, int x, int z){
		// Don't care.
	}
	
	/*
	public void generateBoat(Block block, World world, Random random, int chunkX, int chunkZ, int chance, int minY, int maxY, Block generateIn){
		// Select a single spot to start and go from there
		// Let's just make it a 100 chance?
		WorldGenMinable gen = new WorldGenMinable(block.getDefaultState(), 1, BlockHelper.forBlock(Blocks.air));
		
		
		for (int i = 0; i < 100; i++)
		{
			int startX = chunkX * 16 + random.nextInt(16);
			int startY = 65;
			int startZ = chunkZ * 16 + random.nextInt(16);
			BlockPos pos = new BlockPos(startX, startY, startZ);
			gen.generate(world, random, pos);
			BlockPos pos2 = new BlockPos(startX + 1, startY, startZ);
			gen.generate(world,  random,  pos2);
		}
	}
	*/
	public void generateOre(Block block, World world, Random random, int chunkX, int chunkZ, int minVienSize, int maxVienSize, int chance, int minY, int maxY, Block generateIn){
		int vienSize = minVienSize + random.nextInt(maxVienSize - minVienSize);
		int heightRange = maxY - minY;
		//WorldGenMinable gen = new WorldGenMinable(block, vienSize, generateIn);
		WorldGenMinable gen = new WorldGenMinable(block.getDefaultState(), vienSize, BlockHelper.forBlock(Blocks.dirt));
		for (int i = 0; i < chance; i++)
		{
			int xRand = chunkX * 16 + random.nextInt(16);
			int yRand = random.nextInt(heightRange) + minY;
			
			int zRand = chunkZ * 16 + random.nextInt(16);
			// Different than tutorial (assumed because this is 1.8)
			BlockPos pos = new BlockPos(xRand, yRand, zRand);
			gen.generate(world, random, pos);
		}
	}

}
