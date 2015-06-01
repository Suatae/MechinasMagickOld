package com.suatae.mechinasmagick.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

import com.suatae.mechinasmagick.common.core.lib.REF;
import com.suatae.mechinasmagick.common.init.BlockBase;





public class BlockAncientDoor extends BlockBase {

	public BlockAncientDoor() {
		super(Material.rock);
		this.setBlockName(REF.NAME.BLOCK.ADOOR);
		this.setBlockTextureName(REF.NAME.BLOCK.ADOOR);
		this.setStepSound(Block.soundTypeStone);
		this.setBlockUnbreakable();
		this.setTickRandomly(true);
		this.setBlockBounds(0.095F, 0, 0, 0.905F, 1.0F, 1.0F);
	}

	@Override
	public boolean canDropFromExplosion(Explosion explosion) {
		return false;
	}

	@Override
	public boolean canPlaceTorchOnTop(World world, int x, int y, int z) {
		return false;
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
	public void onBlockClicked(World world, int X, int Y, int Z, EntityPlayer Player) {
		world.setBlock(X, Y, Z, REF.BLOCK.air);
	};

	@Override
	public void onNeighborBlockChange(World world, int X, int Y, int Z, Block block) {

		for (ForgeDirection d : ForgeDirection.VALID_DIRECTIONS) {
			Block lava = world.getBlock(X, Y + d.offsetY, Z);
			if (!(lava != REF.BLOCK.air)) {
				world.setBlock(X, Y, Z, REF.BLOCK.air);
			}
		}
	};

}
