package com.suatae.mechinasmagick.common.item;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;

import com.suatae.mechinasmagick.client.creativetab.MechinasTabs;
import com.suatae.mechinasmagick.common.init.ItemBase;





public class GoldSeedCured extends ItemBase {

	public GoldSeedCured() {
		super();
		this.setUnlocalizedName("itemSeedCuredGold");
		this.setCreativeTab(MechinasTabs.MechinasMagick_TAB);
	}

	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
		list.add(EnumChatFormatting.GREEN + "-" + EnumChatFormatting.YELLOW + "Gold "
				+ EnumChatFormatting.GREEN + "Encased");
		list.add(EnumChatFormatting.BLUE + "-Cured");
	}
}
