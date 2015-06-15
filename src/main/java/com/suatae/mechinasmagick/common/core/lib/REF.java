package com.suatae.mechinasmagick.common.core.lib;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

import com.suatae.mechinasmagick.common.init.BlockReg;





public class REF {
	public static final String	MOD_ID				= "MechinasMagick";
	public static final String	MOD_NAME			= "Mechinas Magick";
	public static final String	VERSION				= "1.7.10-1.16";
	public static final String	CLIENTSIDE			= "com.suatae.mechinasmagick.proxy.ClientProxy";
	public static final String	COMMONSIDE			= "com.suatae.mechinasmagick.proxy.CommonProxy";
	public static final String	GUI_FACTORY_CLASS	= "com.suatae.mechinasmagick.client.gui.NBGuiFactory";

	// Config Types
	public static String		DEBUG				= "DEV MODE";

	public static class BLOCK {
		public final static Block	stone	= Blocks.stonebrick;
		public final static Block	stone01	= Blocks.stone;
		public final static Block	log		= Blocks.log;
		public final static Block	sand	= Blocks.sand;
		public final static Block	dirt	= Blocks.dirt;
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
			public final static Block	Design		= BlockReg.blockStoneBrick;
			public final static Block	Glyph		= BlockReg.blockStoneBrick;
			public final static Block	Core		= BlockReg.blockASContainer;
			public final static Block	Catalyst	= BlockReg.blockCatalyst;
			public final static Block	Step		= BlockReg.blockAStepping;
			public final static Block	DoorT		= BlockReg.blockADoorT;
			public final static Block	DoorB		= BlockReg.blockADoorB;
		}

		public static class SEED {
			public final static Block	SOIL	= BlockReg.blockCatalyst;

			public static class GOLD {
				public final static Block	PLANT		= BlockReg.blockAncientGold;
				public final static Block	CAP			= Blocks.gold_block;
				public final static Block	ACTIVATOR	= Blocks.air;
			}

			public static class IRON {
				public final static Block	PLANT		= BlockReg.blockAncientIron;
				public final static Block	CAP			= Blocks.iron_block;
				public final static Block	ACTIVATOR	= Blocks.air;

			}

		}

	}

	public static class ITEM {

	}

	public static class NAME {
		public static class ITEM {

			// Seed
			public final static String	SEED		= "itemSeed";

			// Gold Seed
			public final static String	SEEDGE		= "itemSeedEncasedGold";
			public final static String	SEEDGC		= "itemSeedCuredGold";
			public final static String	SEEDGP		= "itemSeedPrimedGold";
			public final static String	FRUITG		= "fruitAncientGold";

			// Iron Seed
			public final static String	SEEDIE		= "itemSeedEncasedIron";
			public final static String	SEEDIC		= "itemSeedCuredIron";
			public final static String	SEEDIP		= "itemSeedPrimedIron";
			public final static String	FRUITI		= "fruitAncientIron";

			// Tools
			public final static String	WMALLET		= "woodMallet";
			public final static String	SMallet		= "stoneMallet";
			public final static String	ISMallet	= "ironsteelMallet";

			// MIsc
			public final static String	LEAF		= "itemLeaf";
			public final static String	BRANCH		= "itemBranch";
			public final static String	PLANTFIBER	= "itemPlantFiber";

			// Player Class
			public final static String	BUILDER		= "itemBuilder";
			public final static String	MAGE		= "itemMage";
			public final static String	ENGINEER	= "itemEngineer";
		}

		public static class BLOCK {

			// Gold Plant
			public final static String	GOLD			= "blockGoldAncient";
			public final static String	GOLD00			= "MechinasMagick:ancient_gold_0";
			public final static String	GOLD01			= "MechinasMagick:ancient_gold_1";
			public final static String	GOLD02			= "MechinasMagick:ancient_gold_2";
			public final static String	GOLD03			= "MechinasMagick:ancient_gold_3";
			public final static String	GOLD04			= "MechinasMagick:ancient_gold_4";

			// Iron PLant
			public final static String	IRON			= "blockIronAncient";
			public final static String	IRON00			= "MechinasMagick:ancient_Iron_0";
			public final static String	IRON01			= "MechinasMagick:ancient_Iron_1";
			public final static String	IRON02			= "MechinasMagick:ancient_Iron_2";
			public final static String	IRON03			= "MechinasMagick:ancient_Iron_3";
			public final static String	IRON04			= "MechinasMagick:ancient_Iron_4";

			// Flint
			public final static String	F_01_NAME		= "blockFlint01";
			public final static String	F_02_NAME		= "blockFlint02";
			public final static String	F_03_NAME		= "blockFlint03";
			public final static String	F_04_NAME		= "blockFlint04";

			public final static String	nul				= "null";

			// Lava Stone
			public final static String	LAVA			= "blockLavaStone";

			// Ancient Blocks
			public final static String	ASTEPPING		= "blockAncientSteppingStone";
			public final static String	ADOOR			= "blockAncientDoor";
			public final static String	ASContainer		= "blockAncientSeedContainer";
			public final static String	MSTONEBRICK		= "blockStoneBrick";
			public final static String	MiSTONEBRICK	= "MechinasMagick:StoneBrick";
			public final static String	CATALYST		= "blockCatalyst";
			public final static String	GCasing			= "blockGoldCasing";
			public final static String	GSCasing		= "blockGoldCasingSeeded";
			public final static String	GFCasing		= "blockGoldCasingFinal";
			public final static String	ICasing			= "blockIronCasing";
			public final static String	ISCasing		= "blockIronCasingSeeded";
			public final static String	IFCasing		= "blockIronCasingFinal";

			// Misc
			public final static String	BRANCH			= "blockBranch";

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
