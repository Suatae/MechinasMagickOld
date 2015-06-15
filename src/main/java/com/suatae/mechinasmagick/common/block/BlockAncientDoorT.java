package com.suatae.mechinasmagick.common.block;

import net.minecraft.block.Block;
import net.minecraft.world.World;

import com.suatae.mechinasmagick.common.core.lib.REF;
import com.suatae.mechinasmagick.common.init.AncientDoorBase;





public class BlockAncientDoorT extends AncientDoorBase {

	public BlockAncientDoorT() {
		super();
		this.setBlockName(REF.NAME.BLOCK.ADOOR);
		this.setBlockTextureName(REF.NAME.BLOCK.ADOOR);
	}

	@Override
	public void onNeighborBlockChange(World world, int X, int Y, int Z, Block block) {

		Block lava = world.getBlock(X, Y - 1, Z);
		if ((lava != REF.BLOCK.PILLAR.DoorB)) {
			world.func_147480_a(X, Y, Z, true);
		}
	};
}
