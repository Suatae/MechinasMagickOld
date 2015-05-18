package com.suatae.mechinasmagick.common.init;

import net.minecraft.block.Block;

import com.suatae.mechinasmagick.common.block.BlockGoldAncient;
import com.suatae.mechinasmagick.common.block.BlockLavaStone;
import com.suatae.mechinasmagick.common.core.lib.REF;

import cpw.mods.fml.common.registry.GameRegistry;





@GameRegistry.ObjectHolder(REF.MOD_ID)
public class BlockReg {

	public static final Block	blockAncientGold	= new BlockGoldAncient();
	public static final Block	blockLavaStone		= new BlockLavaStone();

	public static void init() {
		GameRegistry.registerBlock(blockAncientGold, "blockGoldAncient");
		GameRegistry.registerBlock(blockLavaStone, "blockLavaStone");
	}
}
