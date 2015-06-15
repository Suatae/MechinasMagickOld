package com.suatae.mechinasmagick.common.item;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.suatae.mechinasmagick.common.core.lib.REF;
import com.suatae.mechinasmagick.common.init.BlockReg;
import com.suatae.mechinasmagick.common.init.ItemBase;





public class Branch extends ItemBase {
	public Branch() {
		super();
		this.setUnlocalizedName(REF.NAME.ITEM.BRANCH);
	}

	@Override
	public boolean onItemUse(ItemStack itemstack, EntityPlayer Player, World world, int X, int Y,
			int Z, int par7, float par8, float par9, float par10) {
		if (par7 != 1) {
			return false;
		}
		else
			if (Player.canPlayerEdit(X, Y, Z, par7, itemstack)) {
				Block block = world.getBlock(X, Y + 1, Z);
				Block self = world.getBlock(X, Y, Z);
				if (block == Blocks.air && self != BlockReg.blockBranch) {
					world.setBlock(X, Y + 1, Z, BlockReg.blockBranch);
					if (!(Player.capabilities.isCreativeMode)) {
						Player.inventory.consumeInventoryItem(this);
					}
					return true;
				}

			}

		return false;
	}
}
