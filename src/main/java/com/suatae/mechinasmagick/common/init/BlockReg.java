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
import com.suatae.mechinasmagick.common.core.lib.REF;

import cpw.mods.fml.common.registry.GameRegistry;





@GameRegistry.ObjectHolder(REF.MOD_ID)
public class BlockReg {

	public static final Block	blockAncientGold	= new BlockGoldAncient();
	public static final Block	blockAncientIron	= new BlockIronAncient();
	public static final Block	blockLavaStone		= new BlockLavaStone();
	public static final Block	blockAStepping		= new BlockAncientSteppingStone();
	public static final Block	blockADoor			= new BlockAncientDoor();
	public static final Block	blockASContainer	= new BlockAncientSeedContainer();
	public static final Block	blockCatalyst		= new BlockCatalyst();

	public static final Block	blockStoneBrick		= new BlockStoneBrick();

	public static void init() {
		GameRegistry.registerBlock(blockAncientGold, "blockGoldAncient");
		GameRegistry.registerBlock(blockAncientIron, "blockIronAncient");
		GameRegistry.registerBlock(blockLavaStone, "blockLavaStone");
		GameRegistry.registerBlock(blockAStepping, "blockAncientSteppingStone");
		GameRegistry.registerBlock(blockADoor, "blockAncientDoor");
		GameRegistry.registerBlock(blockASContainer, "blockAncientContainer");
		GameRegistry.registerBlock(blockCatalyst, "blockCatalyst");
		GameRegistry.registerBlock(blockStoneBrick, ItemBlockStoneBrick.class, "blockStoneBrick");

	}
}
