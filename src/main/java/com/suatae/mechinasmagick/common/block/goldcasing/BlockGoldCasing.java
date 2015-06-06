package com.suatae.mechinasmagick.common.block.goldcasing;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.suatae.mechinasmagick.client.creativetab.MechinasTabs;
import com.suatae.mechinasmagick.common.core.lib.REF;
import com.suatae.mechinasmagick.common.init.BlockBase;
import com.suatae.mechinasmagick.common.tileentity.goldcasing.TileEntityGoldCasing;





public class BlockGoldCasing extends BlockBase implements ITileEntityProvider {

	public BlockGoldCasing() {
		super(Material.rock);
		this.setBlockName(REF.NAME.BLOCK.GCasing);
		this.setBlockTextureName(REF.NAME.BLOCK.GCasing);
		this.setStepSound(Block.soundTypeStone);
		this.setCreativeTab(MechinasTabs.MechinasMagick_TAB);
		this.setBlockBounds(0.35F, 0.05F, 0.35F, 0.65F, 0.60F, 0.65F);
		this.setBlockUnbreakable();
	}

	@Override
	public TileEntity createNewTileEntity(World var1, int var2) {
		return new TileEntityGoldCasing();
	}

	@Override
	public int getRenderType() {
		return 0;
	}

	@Override
	public boolean renderAsNormalBlock() {
		return false;
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	// @Override
	// public ItemStack getPickBlock(MovingObjectPosition target, World world,
	// int x, int y, int z,
	// EntityPlayer player) {
	// return null;
	// }

}