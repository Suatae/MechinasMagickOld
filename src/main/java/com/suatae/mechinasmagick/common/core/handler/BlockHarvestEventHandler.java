package com.suatae.mechinasmagick.common.core.handler;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;

import com.suatae.mechinasmagick.common.core.lib.REF;

import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;





public class BlockHarvestEventHandler {

	@SubscribeEvent(priority = EventPriority.NORMAL, receiveCanceled = true)
	public void onBlockHarvest(HarvestDropsEvent event) {
		if (event.block == REF.BLOCK.gravel) {
			event.drops.clear();
			event.drops.add(new ItemStack(REF.BLOCK.gravel, 1));

		}
		if (event.block == Blocks.gravel) {
			event.drops.clear();
		}
	}

}
