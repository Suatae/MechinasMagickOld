package com.suatae.mechinasmagick.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.suatae.mechinasmagick.common.core.lib.REF;
import com.suatae.mechinasmagick.common.init.AncientDoorBase;
import com.suatae.mechinasmagick.common.tileentity.TileEntityAncientDoorB;





public class BlockAncientDoorB extends AncientDoorBase implements ITileEntityProvider {

	public BlockAncientDoorB() {
		super();
		this.setBlockName(REF.NAME.BLOCK.ADOOR);
		this.setBlockTextureName(REF.NAME.BLOCK.ADOOR);

	}

	@Override
	public TileEntity createNewTileEntity(World var1, int var2) {
		return new TileEntityAncientDoorB();
	}

	@Override
	public void onNeighborBlockChange(World world, int X, int Y, int Z, Block block) {

		Block lava = world.getBlock(X, Y + 1, Z);
		if ((lava != REF.BLOCK.PILLAR.DoorT)) {
			world.func_147480_a(X, Y, Z, true);
		}
	};
}
