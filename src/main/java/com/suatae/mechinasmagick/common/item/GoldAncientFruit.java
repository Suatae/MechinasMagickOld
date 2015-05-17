package com.suatae.mechinasmagick.common.item;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;

import com.suatae.mechinasmagick.client.creativetab.MechinasTabs;
import com.suatae.mechinasmagick.common.init.FruitBase;





public class GoldAncientFruit extends FruitBase {

	public GoldAncientFruit() {
		super(20, 2.5F, 18, 900, 5, 100, 10, 1200, 4, 100, 14, 1200, 5, 100, 1, 1200, 2, 100, 8,
				1200, 1, 100);
		this.setAlwaysEdible();
		this.setUnlocalizedName("fruitAncientGold");
		this.setCreativeTab(MechinasTabs.MechinasMagick_TAB);
	}

	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
		list.add(EnumChatFormatting.BLUE + "-Speed III");
		list.add(EnumChatFormatting.BLUE + "-Weakness");
		list.add(EnumChatFormatting.BLUE + "-Jump Boost II");
		list.add(EnumChatFormatting.BLUE + "-Regeneration");
		list.add(EnumChatFormatting.BLUE + "-Invisibility");
	}
}
