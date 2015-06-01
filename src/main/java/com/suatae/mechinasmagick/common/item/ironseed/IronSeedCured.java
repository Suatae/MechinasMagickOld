package com.suatae.mechinasmagick.common.item.ironseed;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;

import com.suatae.mechinasmagick.common.core.lib.REF;
import com.suatae.mechinasmagick.common.init.ItemBase;





public class IronSeedCured extends ItemBase {

	public IronSeedCured() {
		super();
		this.setUnlocalizedName(REF.NAME.ITEM.SEEDIC);
	}

	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
		list.add(EnumChatFormatting.GREEN + "-" + EnumChatFormatting.GRAY + "Iron "
				+ EnumChatFormatting.GREEN + "Encased");
		list.add(EnumChatFormatting.BLUE + "-Cured");
	}
}
