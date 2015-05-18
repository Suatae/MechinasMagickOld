package com.suatae.mechinasmagick.common.item;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

import com.suatae.mechinasmagick.common.core.lib.REF;
import com.suatae.mechinasmagick.common.init.BlockReg;
import com.suatae.mechinasmagick.common.init.ItemBase;





public class toolMallet extends ItemBase {
	public toolMallet() {
		super();
		this.setUnlocalizedName(REF.NAME.ITEM.MALLET);
	}

	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
		list.add(EnumChatFormatting.DARK_GRAY + "Strike at Lava Stone");

	}

	@Override
	public boolean onItemUse(ItemStack ItemStack, EntityPlayer Player, World world, int X, int Y,
			int Z, int par7, float par8, float par9, float par10) {
		if (par7 != 1) {
			return false;
		}
		else
			if (Player.canPlayerEdit(X, Y, Z, par7, ItemStack)) {

				Block block = world.getBlock(X, Y, Z);

				if (!(block != BlockReg.blockLavaStone)) {
					world.setBlock(X, Y, Z, Blocks.lava);
					world.playSoundEffect(X, Y, Z, REF.SOUND.FIRE, 1.0F, 1.0F);
				}

			}
		return true;
	}
}
