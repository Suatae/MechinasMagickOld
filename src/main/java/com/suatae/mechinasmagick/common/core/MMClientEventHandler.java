package com.suatae.mechinasmagick.common.core;

import net.minecraftforge.event.entity.player.PlayerEvent;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;





public class MMClientEventHandler {

	public class NMClientEventHandler {

		@SubscribeEvent(priority = EventPriority.NORMAL)
		public void onEvent(PlayerEvent.NameFormat event) {
			if (event.username.equalsIgnoreCase("Suatae")) {
				event.displayname = "[" + event.username + "] the Engineer";
			}
			else
				if (event.username.equalsIgnoreCase("Omegami")) {
					event.displayname = "[" + event.username + "] the Mage";
				}
				else {
					event.displayname = "[--" + event.username + "--]";

				}

		}

	}
}
