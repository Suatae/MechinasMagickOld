package com.suatae.mechinasmagick.proxy;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

import com.suatae.mechinasmagick.client.renders.IRAncientSeedCase;
import com.suatae.mechinasmagick.client.renders.IRToolIronSteelMallet;
import com.suatae.mechinasmagick.client.renders.IRToolStoneMallet;
import com.suatae.mechinasmagick.client.renders.IRToolWoodMallet;
import com.suatae.mechinasmagick.client.renders.TESRAncientSeedCase;
import com.suatae.mechinasmagick.common.init.BlockReg;
import com.suatae.mechinasmagick.common.init.ItemReg;
import com.suatae.mechinasmagick.common.tileentity.TileEntityAncientCase;

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
		TileEntitySpecialRenderer render = new TESRAncientSeedCase();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAncientCase.class, render);
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockASCase),
				new IRAncientSeedCase(render, new TileEntityAncientCase()));
	}

}
