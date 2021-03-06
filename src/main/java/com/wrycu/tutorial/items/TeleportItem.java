package com.wrycu.tutorial.items;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


// This is a new item class. need to define the item as belonging to this class
public class TeleportItem extends Item{
	// Runs code when the block is "used" (on block)
	@Override
	public boolean onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ)
    {
		// Set data if the player is not sneaking
		if (!playerIn.isSneaking())
		{
			if (stack.getTagCompound() == null)
			{
				// Allows us to set data within the item (prevents stacking)
				stack.setTagCompound(new NBTTagCompound());
			}
			NBTTagCompound nbt = new NBTTagCompound();
			nbt.setInteger("posX", pos.getX());
			nbt.setInteger("posY", pos.getY());
			nbt.setInteger("posZ", pos.getZ());
			stack.getTagCompound().setTag("coords", nbt);
			// Update the color
			stack.setStackDisplayName(EnumChatFormatting.AQUA + "<item name here>");
		}
        return false;
    }
	
	// Runs code when the block is right clicked (whenever)
	@Override
	public ItemStack onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn)
    {
		// Clear data if the player is sneaking
		if (playerIn.isSneaking())
		{
			if (itemStackIn.getTagCompound() != null)
			{
				itemStackIn.getTagCompound().removeTag("coords");
				// Set the name color back to normal
				itemStackIn.clearCustomName();
			}
		}
        return itemStackIn;
    }	
	
	// Store information in the item (tooltip under the name)
	@Override
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List tooltip, boolean advanced) 
	{
		if (stack.getTagCompound() != null)
		{
			if (stack.getTagCompound().hasKey("coords"))
			{
				NBTTagCompound nbt = (NBTTagCompound) stack.getTagCompound().getTag("coords");
				int posX = nbt.getInteger("posX");
				int posY = nbt.getInteger("posY");
				int posZ = nbt.getInteger("posZ");
				tooltip.add("X: " + posX + ", Y: " + posY + ", Z: " + posZ);
			}
		}
	}
	
	// Add cool effects
	@Override
	@SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack stack)
    {
		if (stack.getTagCompound() != null)
		{
			return stack.getTagCompound().hasKey("coords");
		}
			
		// It doesn't have the data
        return false;
    }
}
