package com.suatae.mechinasmagick.common.core.lib;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;





public class REF {
	public static final String	MOD_ID				= "MechinasMagick";
	public static final String	MOD_NAME			= "Mechinas Magick";
	public static final String	VERSION				= "1.7.10-1.0";
	public static final String	CLIENTSIDE			= "com.suatae.mechinasmagick.proxy.ClientProxy";
	public static final String	SERVERSIDE			= "com.suatae.mechinasmagick.proxy.ServerProxy";
	public static final String	GUI_FACTORY_CLASS	= "com.suatae.mechinasmagick.client.gui.NBGuiFactory";

	// Config Types
	public static String		DEBUG				= "DEV MODE";

	public static class BLOCK {
		public final static Block	stone	= Blocks.stonebrick;
		public final static Block	gold	= Blocks.gold_block;
		public final static Block	air		= Blocks.air;
		public final static Block	nether	= Blocks.netherrack;
		public final static Block	fire	= Blocks.fire;

	}

}
