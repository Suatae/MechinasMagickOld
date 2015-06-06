package com.suatae.mechinasmagick.proxy;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

import com.suatae.mechinasmagick.client.renders.TESRAncientSeedContainer;
import com.suatae.mechinasmagick.client.renders.TESRCatalyst;
import com.suatae.mechinasmagick.client.renders.TESRGoldCasing;
import com.suatae.mechinasmagick.client.renders.TESRGoldCrop;
import com.suatae.mechinasmagick.client.renders.TESRIronCasing;
import com.suatae.mechinasmagick.client.renders.TESRIronCrop;
import com.suatae.mechinasmagick.client.renders.ir.IRAncientSeedContainer;
import com.suatae.mechinasmagick.client.renders.ir.IRCatalyst;
import com.suatae.mechinasmagick.client.renders.ir.IRGoldCrop;
import com.suatae.mechinasmagick.client.renders.ir.IRIronCrop;
import com.suatae.mechinasmagick.client.renders.ir.IRToolIronSteelMallet;
import com.suatae.mechinasmagick.client.renders.ir.IRToolStoneMallet;
import com.suatae.mechinasmagick.client.renders.ir.IRToolWoodMallet;
import com.suatae.mechinasmagick.client.renders.ir.goldcasing.IRGoldCasing;
import com.suatae.mechinasmagick.client.renders.ir.goldcasing.IRGoldCasingFinal;
import com.suatae.mechinasmagick.client.renders.ir.goldcasing.IRGoldCasingSeeded;
import com.suatae.mechinasmagick.client.renders.ir.ironcasing.IRIronCasing;
import com.suatae.mechinasmagick.client.renders.ir.ironcasing.IRIronCasingFinal;
import com.suatae.mechinasmagick.client.renders.ir.ironcasing.IRIronCasingSeeded;
import com.suatae.mechinasmagick.common.init.BlockReg;
import com.suatae.mechinasmagick.common.init.ItemReg;
import com.suatae.mechinasmagick.common.tileentity.TileEntityAncientContainer;
import com.suatae.mechinasmagick.common.tileentity.TileEntityCatalyst;
import com.suatae.mechinasmagick.common.tileentity.TileEntityGoldCrop;
import com.suatae.mechinasmagick.common.tileentity.TileEntityIronCrop;
import com.suatae.mechinasmagick.common.tileentity.goldcasing.TileEntityGoldCasing;
import com.suatae.mechinasmagick.common.tileentity.goldcasing.TileEntityGoldCasingFinal;
import com.suatae.mechinasmagick.common.tileentity.goldcasing.TileEntityGoldCasingSeeded;
import com.suatae.mechinasmagick.common.tileentity.ironcasing.TileEntityIronCasing;
import com.suatae.mechinasmagick.common.tileentity.ironcasing.TileEntityIronCasingFinal;
import com.suatae.mechinasmagick.common.tileentity.ironcasing.TileEntityIronCasingSeeded;

import cpw.mods.fml.client.registry.ClientRegistry;





public class ClientProxy extends CommonProxy {
	@Override
	public void preInit() {
		registerItemRender();
		registerTESRender();
		registerTESRGoldCasing();
		registerTESRIronCasing();
	}

	@Override
	public void Init() {}

	@Override
	public void postInit() {}

	@Override
	public void registerItemRender() {
		MinecraftForgeClient.registerItemRenderer(ItemReg.woodMallet, new IRToolWoodMallet());
		MinecraftForgeClient.registerItemRenderer(ItemReg.stoneMallet, new IRToolStoneMallet());
		MinecraftForgeClient.registerItemRenderer(ItemReg.ironsteelMallet,
				new IRToolIronSteelMallet());

	}

	@Override
	public void registerTESRender() {
		TileEntitySpecialRenderer render = new TESRAncientSeedContainer();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAncientContainer.class, render);
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockASContainer),
				new IRAncientSeedContainer(render, new TileEntityAncientContainer()));

		TileEntitySpecialRenderer render1 = new TESRCatalyst();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCatalyst.class, render1);
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockCatalyst),
				new IRCatalyst(render1, new TileEntityCatalyst()));

		TileEntitySpecialRenderer render2 = new TESRGoldCrop();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGoldCrop.class, render2);
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockAncientGold),
				new IRGoldCrop(render2, new TileEntityGoldCrop()));

		TileEntitySpecialRenderer render3 = new TESRIronCrop();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityIronCrop.class, render3);
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockAncientIron),
				new IRIronCrop(render3, new TileEntityIronCrop()));
	}

	@Override
	public void registerTESRGoldCasing() {
		TileEntitySpecialRenderer render = new TESRGoldCasing();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGoldCasing.class, render);
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockGoldCasing),
				new IRGoldCasing(render, new TileEntityGoldCasing()));

		TileEntitySpecialRenderer render1 = new TESRGoldCasing();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGoldCasingSeeded.class, render1);
		MinecraftForgeClient.registerItemRenderer(Item
				.getItemFromBlock(BlockReg.blockGoldCasingSeeded), new IRGoldCasingSeeded(render1,
				new TileEntityGoldCasingSeeded()));

		TileEntitySpecialRenderer render2 = new TESRGoldCasing();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGoldCasingFinal.class, render2);
		MinecraftForgeClient.registerItemRenderer(Item
				.getItemFromBlock(BlockReg.blockGoldCasingFinal), new IRGoldCasingFinal(render2,
				new TileEntityGoldCasingFinal()));
	}

	@Override
	public void registerTESRIronCasing() {
		TileEntitySpecialRenderer render = new TESRIronCasing();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityIronCasing.class, render);
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockIronCasing),
				new IRIronCasing(render, new TileEntityIronCasing()));

		TileEntitySpecialRenderer render1 = new TESRIronCasing();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityIronCasingSeeded.class, render1);
		MinecraftForgeClient.registerItemRenderer(Item
				.getItemFromBlock(BlockReg.blockIronCasingSeeded), new IRIronCasingSeeded(render1,
				new TileEntityIronCasingSeeded()));

		TileEntitySpecialRenderer render2 = new TESRIronCasing();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityIronCasingFinal.class, render2);
		MinecraftForgeClient.registerItemRenderer(Item
				.getItemFromBlock(BlockReg.blockIronCasingFinal), new IRIronCasingFinal(render2,
				new TileEntityIronCasingFinal()));

	}

}
