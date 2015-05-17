package com.suatae.mechinasmagick.client.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import com.suatae.mechinasmagick.common.core.lib.REF;





public class MechinasTabs {

	public static final CreativeTabs	MechinasMagick_TAB	= new CreativeTabs(REF.MOD_ID) {
																@Override
																public Item getTabIconItem() {
																	return Items.apple;
																}
															};
}
