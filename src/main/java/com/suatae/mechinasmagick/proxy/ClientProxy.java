package com.suatae.mechinasmagick.proxy;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

import com.suatae.mechinasmagick.client.renders.IRAncientSeedContainer;
import com.suatae.mechinasmagick.client.renders.IRCatalyst;
import com.suatae.mechinasmagick.client.renders.IRGoldCrop;
import com.suatae.mechinasmagick.client.renders.IRIronCrop;
import com.suatae.mechinasmagick.client.renders.IRToolIronSteelMallet;
import com.suatae.mechinasmagick.client.renders.IRToolStoneMallet;
import com.suatae.mechinasmagick.client.renders.IRToolWoodMallet;
import com.suatae.mechinasmagick.client.renders.TESRAncientSeedContainer;
import com.suatae.mechinasmagick.client.renders.TESRCatalyst;
import com.suatae.mechinasmagick.client.renders.TESRGoldCrop;
import com.suatae.mechinasmagick.client.renders.TESRIronCrop;
import com.suatae.mechinasmagick.common.init.BlockReg;
import com.suatae.mechinasmagick.common.init.ItemReg;
import com.suatae.mechinasmagick.common.tileentity.TileEntityAncientContainer;
import com.suatae.mechinasmagick.common.tileentity.TileEntityCatalyst;
import com.suatae.mechinasmagick.common.tileentity.TileEntityGoldCrop;
import com.suatae.mechinasmagick.common.tileentity.TileEntityIronCrop;

import cpw.mods.fml.client.registry.ClientRegistry;





public class ClientProxy extends CommonProxy {
	@Override
	public void preInit() {
		registerItemRender();
		registerTESRender();
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

}
