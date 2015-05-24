package com.suatae.mechinasmagick.common.core.lib;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

import com.suatae.mechinasmagick.common.init.BlockReg;





public class REF {
	public static final String	MOD_ID				= "MechinasMagick";
	public static final String	MOD_NAME			= "Mechinas Magick";
	public static final String	VERSION				= "1.7.10-1.10";
	public static final String	CLIENTSIDE			= "com.suatae.mechinasmagick.proxy.ClientProxy";
	public static final String	SERVERSIDE			= "com.suatae.mechinasmagick.proxy.ServerProxy";
	public static final String	GUI_FACTORY_CLASS	= "com.suatae.mechinasmagick.client.gui.NBGuiFactory";

	// Config Types
	public static String		DEBUG				= "DEV MODE";

	public static class BLOCK {
		public final static Block	stone	= Blocks.stonebrick;
		public final static Block	stone01	= Blocks.stone;
		public final static Block	sand	= Blocks.sand;
		public final static Block	grass	= Blocks.grass;
		public final static Block	mush	= Blocks.mycelium;
		public final static Block	gold	= Blocks.gold_block;
		public final static Block	air		= Blocks.air;
		public final static Block	nether	= Blocks.netherrack;
		public final static Block	fire	= Blocks.fire;
		public final static Block	lava	= Blocks.lava;
		public final static Block	gravel	= Blocks.gravel;
		public final static Block	lavaS	= BlockReg.blockLavaStone;

		public static class PILLAR {
			public final static Block	Main		= Blocks.stonebrick;
			public final static Block	Glyph		= Blocks.obsidian;
			public final static Block	Core		= BlockReg.blockASCase;
			public final static Block	Catalyst	= Blocks.brick_block;
			public final static Block	Step		= BlockReg.blockAStepping;
			public final static Block	Door		= BlockReg.blockADoor;
		}

	}

	public static class ITEM {

	}

	public static class NAME {
		public static class ITEM {
			public final static String	SEED		= "itemSeed";
			public final static String	SEEDGE		= "itemSeedEncasedGold";
			public final static String	SEEDGC		= "itemSeedCuredGold";
			public final static String	SEEDGP		= "itemSeedPrimedGold";
			public final static String	FRUITG		= "fruitAncientGold";
			public final static String	WMALLET		= "woodMallet";
			public final static String	SMallet		= "stoneMallet";
			public final static String	ISMallet	= "ironsteelMallet";
			public final static String	LEAF		= "itemLeaf";
			public final static String	BRANCH		= "itemBranch";
			public final static String	BUILDER		= "itemBuilder";
			public final static String	MAGE		= "itemMage";
			public final static String	ENGINEER	= "itemEngineer";
			public final static String	PLANTFIBER	= "itemPlantFiber";
		}

		public static class BLOCK {
			public final static String	GOLD		= "blockGoldAncient";
			public final static String	GOLD00		= "MechinasMagick:ancient_gold_0";
			public final static String	GOLD01		= "MechinasMagick:ancient_gold_1";
			public final static String	GOLD02		= "MechinasMagick:ancient_gold_2";
			public final static String	GOLD03		= "MechinasMagick:ancient_gold_3";
			public final static String	GOLD04		= "MechinasMagick:ancient_gold_4";
			public final static String	LAVA		= "blockLavaStone";
			public final static String	ASTEPPING	= "blockAncientSteppingStone";
			public final static String	ADOOR		= "blockAncientDoor";
			public final static String	ASCASE		= "blockAncientSeedCase";
		}

	}

	public static class SOUND {
		public final static String	FAIL01		= "random.break";
		public final static String	FAIL02		= "random.break";
		public final static String	FAIL03		= "random.pop";
		public final static String	SUCCESS01	= "mob.zombie.unfect";
		public final static String	SUCCESS02	= "random.successful_hit";
		public final static String	LAVASTONE	= "liquid.lavapop";
		public final static String	MALLETHIT	= "random.anvil_land";
	}

}
