package com.suatae.mechinasmagick.common.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Blocks;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import com.suatae.mechinasmagick.common.core.lib.REF;
import com.suatae.mechinasmagick.common.init.BlockBase;





public class BlockAncientSteppingStone extends BlockBase {

	protected static Random	ran	= new Random();

	public BlockAncientSteppingStone() {
		super(Material.rock);
		this.setBlockName(REF.NAME.BLOCK.ASTEPPING);
		this.setBlockTextureName(REF.NAME.BLOCK.LAVA);
		this.setStepSound(Block.soundTypeStone);
		this.setBlockUnbreakable();
		this.setTickRandomly(true);
	}

	@Override
	public boolean canDropFromExplosion(Explosion explosion) {
		return false;
	}

	@Override
	public void onEntityWalking(World world, int X, int Y, int Z, Entity entity) {
		world.setBlock(X, Y, Z, Blocks.air);
	}

	@Override
	public boolean canCreatureSpawn(EnumCreatureType type, IBlockAccess world, int x, int y, int z) {
		return false;
	}

	@Override
	public boolean canPlaceTorchOnTop(World world, int x, int y, int z) {
		return false;
	}
}