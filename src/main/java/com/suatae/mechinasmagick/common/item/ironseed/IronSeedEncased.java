package com.suatae.mechinasmagick.common.item.ironseed;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;

import com.suatae.mechinasmagick.common.core.lib.REF;
import com.suatae.mechinasmagick.common.init.ItemBase;





public class IronSeedEncased extends ItemBase {

	public IronSeedEncased() {
		super();
		this.setUnlocalizedName(REF.NAME.ITEM.SEEDIE);
	}

	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
		list.add(EnumChatFormatting.GREEN + "-" + EnumChatFormatting.GRAY + "Iron "
				+ EnumChatFormatting.GREEN + "Encased");
	}
}
