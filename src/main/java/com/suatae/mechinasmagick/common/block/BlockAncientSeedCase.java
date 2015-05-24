package com.suatae.mechinasmagick.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.suatae.mechinasmagick.common.core.lib.REF;
import com.suatae.mechinasmagick.common.init.BlockBase;
import com.suatae.mechinasmagick.common.tileentity.TileEntityAncientCase;





public class BlockAncientSeedCase extends BlockBase {
	public BlockAncientSeedCase() {
		super(Material.rock);
		this.setBlockName(REF.NAME.BLOCK.ASCASE);
		this.setBlockTextureName(REF.NAME.BLOCK.ASCASE);
		this.setStepSound(Block.soundTypeStone);
		this.setHardness(8.0f);
		this.setLightOpacity(0);
		this.setHarvestLevel("pickaxe", 1);
		this.setBlockBounds(0.095F, 0F, 0.095F, 0.905F, 0.805F, 0.905F);
	}

	public TileEntity createNewTileEntity(World var1, int var2) {
		return new TileEntityAncientCase();
	}

	@Override
	public boolean renderAsNormalBlock() {
		return false;
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	@Override
	public int getRenderType() {
		return -1;
	}

	@Override
	protected boolean canSilkHarvest() {
		return true;
	}

}
