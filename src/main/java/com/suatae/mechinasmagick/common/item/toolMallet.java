package com.suatae.mechinasmagick.common.item;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;

import com.suatae.mechinasmagick.common.core.lib.REF;
import com.suatae.mechinasmagick.common.init.ToolMalletBase;





public class ToolMallet extends ToolMalletBase {
	public ToolMallet() {
		super();
		this.setUnlocalizedName(REF.NAME.ITEM.MALLET);
	}

	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
		list.add(EnumChatFormatting.DARK_GRAY + "Strike at Lava Stone");

	}

}
