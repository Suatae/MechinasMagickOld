package com.suatae.mechinasmagick.common.init;

import net.minecraft.item.Item;

import com.suatae.mechinasmagick.common.core.lib.REF;
import com.suatae.mechinasmagick.common.item.Branch;
import com.suatae.mechinasmagick.common.item.Builder;
import com.suatae.mechinasmagick.common.item.Engineer;
import com.suatae.mechinasmagick.common.item.GoldAncientFruit;
import com.suatae.mechinasmagick.common.item.GoldSeedCured;
import com.suatae.mechinasmagick.common.item.GoldSeedEncased;
import com.suatae.mechinasmagick.common.item.GoldSeedPrimedGold;
import com.suatae.mechinasmagick.common.item.Leaf;
import com.suatae.mechinasmagick.common.item.Mage;
import com.suatae.mechinasmagick.common.item.Seed;
import com.suatae.mechinasmagick.common.item.WoodMallet;

import cpw.mods.fml.common.registry.GameRegistry;





@GameRegistry.ObjectHolder(REF.MOD_ID)
public class ItemReg {

	public static final Item	itemMMSeed			= new Seed();
	public static final Item	itemCuredGold		= new GoldSeedCured();
	public static final Item	itemEncasedGold		= new GoldSeedEncased();
	public static final Item	itemPrimedGold		= new GoldSeedPrimedGold();
	public static final Item	itemAncientFruit	= new GoldAncientFruit();
	public static final Item	woodMallet			= new WoodMallet();
	public static final Item	itemLeaf			= new Leaf();
	public static final Item	itemBranch			= new Branch();
	public static final Item	itemBuilder			= new Builder();
	public static final Item	itemEngineer		= new Engineer();
	public static final Item	itemMage			= new Mage();

	public static void init() {
		GameRegistry.registerItem(itemMMSeed, "itemSeed");
		GameRegistry.registerItem(itemCuredGold, "itemSeedCuredGold");
		GameRegistry.registerItem(itemEncasedGold, "itemSeedEncasedGold");
		GameRegistry.registerItem(itemPrimedGold, "itemSeedPrimedGold");
		GameRegistry.registerItem(itemAncientFruit, "fruitAncientGold");
		GameRegistry.registerItem(woodMallet, "woodMallet");
		GameRegistry.registerItem(itemLeaf, "itemLeaf");
		GameRegistry.registerItem(itemBranch, "itemBranch");
		GameRegistry.registerItem(itemBuilder, "itemBuilder");
		GameRegistry.registerItem(itemEngineer, "itemEngineer");
		GameRegistry.registerItem(itemMage, "itemMage");
	}
}
