package com.suatae.mechinasmagick.common.item;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;

import com.suatae.mechinasmagick.common.core.lib.REF;
import com.suatae.mechinasmagick.common.init.ItemBase;





public class Seed extends ItemBase {

	public Seed() {
		super();
		this.setUnlocalizedName(REF.NAME.ITEM.SEED);
	}

	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
		list.add(EnumChatFormatting.DARK_GRAY + "-Base Seed");

	}
}
