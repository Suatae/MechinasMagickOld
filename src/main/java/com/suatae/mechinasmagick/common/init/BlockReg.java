package com.suatae.mechinasmagick.common.init;

import net.minecraft.block.Block;

import com.suatae.mechinasmagick.common.block.BlockGoldAncient;
import com.suatae.mechinasmagick.common.core.lib.REF;

import cpw.mods.fml.common.registry.GameRegistry;





@GameRegistry.ObjectHolder(REF.MOD_ID)
public class BlockReg {

	public static final Block	blockAncientGold	= new BlockGoldAncient();

	public static void init() {
		GameRegistry.registerBlock(blockAncientGold, "blockGoldAncient");
	}
}
