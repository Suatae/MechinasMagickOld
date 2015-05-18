package com.suatae.mechinasmagick.common.item;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;

import com.suatae.mechinasmagick.common.core.lib.REF;
import com.suatae.mechinasmagick.common.init.BlockReg;
import com.suatae.mechinasmagick.common.init.SeedBase;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;





public class GoldSeedPrimedGold extends SeedBase {

	public GoldSeedPrimedGold() {
		super(BlockReg.blockAncientGold, REF.BLOCK.gold, REF.BLOCK.stone, REF.BLOCK.stone,
				REF.BLOCK.stone, REF.BLOCK.gold, REF.BLOCK.air);
		this.setUnlocalizedName(REF.NAME.ITEM.SEEDGP);
	}

	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
		list.add(EnumChatFormatting.GREEN + "-" + EnumChatFormatting.YELLOW + "Gold "
				+ EnumChatFormatting.GREEN + "Encased");
		list.add(EnumChatFormatting.BLUE + "-Cured");
		list.add(EnumChatFormatting.LIGHT_PURPLE + "-Primed");
	}

	@Override
	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack itemstack) {
		return true;
	}
}
