package com.suatae.mechinasmagick.common.init;

import net.minecraft.block.Block;

import com.suatae.mechinasmagick.common.block.BlockAncientDoor;
import com.suatae.mechinasmagick.common.block.BlockAncientSeedContainer;
import com.suatae.mechinasmagick.common.block.BlockAncientSteppingStone;
import com.suatae.mechinasmagick.common.block.BlockCatalyst;
import com.suatae.mechinasmagick.common.block.BlockGoldAncient;
import com.suatae.mechinasmagick.common.block.BlockIronAncient;
import com.suatae.mechinasmagick.common.block.BlockLavaStone;
import com.suatae.mechinasmagick.common.block.BlockStoneBrick;
import com.suatae.mechinasmagick.common.block.ItemBlockStoneBrick;
import com.suatae.mechinasmagick.common.block.goldcasing.BlockGoldCasing;
import com.suatae.mechinasmagick.common.block.goldcasing.BlockGoldCasingFinal;
import com.suatae.mechinasmagick.common.block.goldcasing.BlockGoldCasingSeeded;
import com.suatae.mechinasmagick.common.block.ironcasing.BlockIronCasing;
import com.suatae.mechinasmagick.common.block.ironcasing.BlockIronCasingFinal;
import com.suatae.mechinasmagick.common.block.ironcasing.BlockIronCasingSeeded;
import com.suatae.mechinasmagick.common.core.lib.REF;
import com.suatae.mechinasmagick.common.tileentity.TileEntityAncientContainer;
import com.suatae.mechinasmagick.common.tileentity.TileEntityCatalyst;
import com.suatae.mechinasmagick.common.tileentity.TileEntityGoldCrop;
import com.suatae.mechinasmagick.common.tileentity.TileEntityIronCrop;
import com.suatae.mechinasmagick.common.tileentity.goldcasing.TileEntityGoldCasing;
import com.suatae.mechinasmagick.common.tileentity.goldcasing.TileEntityGoldCasingFinal;
import com.suatae.mechinasmagick.common.tileentity.goldcasing.TileEntityGoldCasingSeeded;
import com.suatae.mechinasmagick.common.tileentity.ironcasing.TileEntityIronCasing;
import com.suatae.mechinasmagick.common.tileentity.ironcasing.TileEntityIronCasingFinal;
import com.suatae.mechinasmagick.common.tileentity.ironcasing.TileEntityIronCasingSeeded;

import cpw.mods.fml.common.registry.GameRegistry;





@GameRegistry.ObjectHolder(REF.MOD_ID)
public class BlockReg {

	public static final Block	blockAncientGold		= new BlockGoldAncient();
	public static final Block	blockAncientIron		= new BlockIronAncient();
	public static final Block	blockLavaStone			= new BlockLavaStone();
	public static final Block	blockAStepping			= new BlockAncientSteppingStone();
	public static final Block	blockADoor				= new BlockAncientDoor();
	public static final Block	blockASContainer		= new BlockAncientSeedContainer();
	public static final Block	blockCatalyst			= new BlockCatalyst();

	public static final Block	blockStoneBrick			= new BlockStoneBrick();
	public static final Block	blockGoldCasing			= new BlockGoldCasing();
	public static final Block	blockGoldCasingSeeded	= new BlockGoldCasingSeeded();
	public static final Block	blockGoldCasingFinal	= new BlockGoldCasingFinal();
	public static final Block	blockIronCasing			= new BlockIronCasing();
	public static final Block	blockIronCasingSeeded	= new BlockIronCasingSeeded();
	public static final Block	blockIronCasingFinal	= new BlockIronCasingFinal();

	public static void init() {
		GameRegistry.registerBlock(blockAncientGold, "blockGoldAncient");
		GameRegistry.registerBlock(blockAncientIron, "blockIronAncient");
		GameRegistry.registerBlock(blockLavaStone, "blockLavaStone");
		GameRegistry.registerBlock(blockAStepping, "blockAncientSteppingStone");
		GameRegistry.registerBlock(blockADoor, "blockAncientDoor");
		GameRegistry.registerBlock(blockASContainer, "blockAncientContainer");
		GameRegistry.registerBlock(blockCatalyst, "blockCatalyst");
		GameRegistry.registerBlock(blockGoldCasing, "blockGoldCasing");
		GameRegistry.registerBlock(blockGoldCasingSeeded, "blockGoldCasingSeeded");
		GameRegistry.registerBlock(blockGoldCasingFinal, "blockGoldCasingFinal");
		GameRegistry.registerBlock(blockIronCasing, "blockIronCasing");
		GameRegistry.registerBlock(blockIronCasingSeeded, "blockIronCasingSeeded");
		GameRegistry.registerBlock(blockIronCasingFinal, "blockIronCasingFinal");

		GameRegistry.registerTileEntity(TileEntityAncientContainer.class,
				"TileEntityAncientContainer");
		GameRegistry.registerTileEntity(TileEntityCatalyst.class, "TileEntityCatalyst");
		GameRegistry.registerTileEntity(TileEntityGoldCasing.class, "TileEntityGoldCasing");
		GameRegistry.registerTileEntity(TileEntityGoldCasingSeeded.class,
				"TileEntityGoldCasingSeeded");
		GameRegistry.registerTileEntity(TileEntityGoldCasingFinal.class,
				"TileEntityGoldCasingFinal");
		GameRegistry.registerTileEntity(TileEntityGoldCrop.class, "TileEntityGoldCrop");
		GameRegistry.registerTileEntity(TileEntityIronCasing.class, "TileEntityIronCasing");
		GameRegistry.registerTileEntity(TileEntityIronCasingSeeded.class,
				"TileEntityIronCasingSeeded");
		GameRegistry.registerTileEntity(TileEntityIronCasingFinal.class,
				"TileEntityIronCasingFinal");
		GameRegistry.registerTileEntity(TileEntityIronCrop.class, "TileEntityIronCrop");

		GameRegistry.registerBlock(blockStoneBrick, ItemBlockStoneBrick.class, "blockStoneBrick");

	}
}
