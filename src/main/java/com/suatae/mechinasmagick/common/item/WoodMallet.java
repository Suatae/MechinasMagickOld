package com.suatae.mechinasmagick.common.item;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

import com.suatae.mechinasmagick.common.core.lib.REF;
import com.suatae.mechinasmagick.common.init.ItemReg;
import com.suatae.mechinasmagick.common.init.ToolMalletBase;





public class WoodMallet extends ToolMalletBase {
	public WoodMallet() {
		super(ItemReg.MMWood);
		this.setUnlocalizedName(REF.NAME.ITEM.WMALLET);
		this.setMaxDamage(ToolMalletBase.Wooddurability);
	}

	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
		list.add(EnumChatFormatting.DARK_GRAY + "Strike at Lava Stone");

	}

	@Override
	public boolean onItemUse(ItemStack itemstack, EntityPlayer Player, World world, int X, int Y,
			int Z, int par7, float par8, float par9, float par10) {
		if (par7 != 1) {
			return false;
		}
		else
			if (Player.canPlayerEdit(X, Y, Z, par7, itemstack)) {

				Block block = world.getBlock(X, Y, Z);

				if (!(block != REF.BLOCK.lavaS)) {
					world.setBlock(X, Y, Z, REF.BLOCK.lava);
					itemstack.attemptDamageItem(par7, null);
					if (itemstack.getItemDamage() <= ToolMalletBase.Wooddurability) {
						world.playSoundEffect(X, Y, Z, REF.SOUND.MALLETHIT, 0.5F, 1.0F);
					}
				}
			}

		if (itemstack.getItemDamage() == ToolMalletBase.Wooddurability + 1) {
			Player.inventory.consumeInventoryItem(this);

			// FIX for EnchantmentDurability.negateDamage

		}

		return true;
	}

}
