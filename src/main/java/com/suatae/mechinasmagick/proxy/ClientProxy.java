package com.suatae.mechinasmagick.proxy;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

import com.suatae.mechinasmagick.client.renders.TESRAncientSeedContainer;
import com.suatae.mechinasmagick.client.renders.TESRBranch;
import com.suatae.mechinasmagick.client.renders.TESRCatalyst;
import com.suatae.mechinasmagick.client.renders.TESRGoldCasing;
import com.suatae.mechinasmagick.client.renders.TESRGoldCrop;
import com.suatae.mechinasmagick.client.renders.TESRIronCasing;
import com.suatae.mechinasmagick.client.renders.TESRIronCrop;
import com.suatae.mechinasmagick.client.renders.flint.TESRBlockFlint01;
import com.suatae.mechinasmagick.client.renders.flint.TESRBlockFlint02;
import com.suatae.mechinasmagick.client.renders.flint.TESRBlockFlint03;
import com.suatae.mechinasmagick.client.renders.flint.TESRBlockFlint04;
import com.suatae.mechinasmagick.client.renders.ir.IRBranch;
import com.suatae.mechinasmagick.client.renders.ir.IRCatalyst;
import com.suatae.mechinasmagick.client.renders.ir.IRToolIronSteelMallet;
import com.suatae.mechinasmagick.client.renders.ir.IRToolStoneMallet;
import com.suatae.mechinasmagick.client.renders.ir.IRToolWoodMallet;
import com.suatae.mechinasmagick.client.renders.ir.flint.IRBlockFlint01;
import com.suatae.mechinasmagick.client.renders.ir.flint.IRBlockFlint02;
import com.suatae.mechinasmagick.client.renders.ir.flint.IRBlockFlint03;
import com.suatae.mechinasmagick.client.renders.ir.flint.IRBlockFlint04;
import com.suatae.mechinasmagick.common.init.BlockReg;
import com.suatae.mechinasmagick.common.init.ItemReg;
import com.suatae.mechinasmagick.common.tileentity.TileEntityAncientContainer;
import com.suatae.mechinasmagick.common.tileentity.TileEntityBranch;
import com.suatae.mechinasmagick.common.tileentity.TileEntityCatalyst;
import com.suatae.mechinasmagick.common.tileentity.TileEntityGoldCrop;
import com.suatae.mechinasmagick.common.tileentity.TileEntityIronCrop;
import com.suatae.mechinasmagick.common.tileentity.flint.TileEntityFlint01;
import com.suatae.mechinasmagick.common.tileentity.flint.TileEntityFlint02;
import com.suatae.mechinasmagick.common.tileentity.flint.TileEntityFlint03;
import com.suatae.mechinasmagick.common.tileentity.flint.TileEntityFlint04;
import com.suatae.mechinasmagick.common.tileentity.goldcasing.TileEntityGoldCasing;
import com.suatae.mechinasmagick.common.tileentity.goldcasing.TileEntityGoldCasingFinal;
import com.suatae.mechinasmagick.common.tileentity.goldcasing.TileEntityGoldCasingSeeded;
import com.suatae.mechinasmagick.common.tileentity.ironcasing.TileEntityIronCasing;
import com.suatae.mechinasmagick.common.tileentity.ironcasing.TileEntityIronCasingFinal;
import com.suatae.mechinasmagick.common.tileentity.ironcasing.TileEntityIronCasingSeeded;

import cpw.mods.fml.client.registry.ClientRegistry;





public class ClientProxy extends CommonProxy {

	TileEntitySpecialRenderer	r	= new TESRAncientSeedContainer();
	TileEntitySpecialRenderer	r1	= new TESRCatalyst();
	TileEntitySpecialRenderer	r2	= new TESRGoldCrop();
	TileEntitySpecialRenderer	r3	= new TESRIronCrop();
	TileEntitySpecialRenderer	r4	= new TESRBranch();
	TileEntitySpecialRenderer	r5	= new TESRGoldCasing();
	TileEntitySpecialRenderer	r6	= new TESRGoldCasing();
	TileEntitySpecialRenderer	r7	= new TESRGoldCasing();
	TileEntitySpecialRenderer	r8	= new TESRIronCasing();
	TileEntitySpecialRenderer	r9	= new TESRIronCasing();
	TileEntitySpecialRenderer	r10	= new TESRIronCasing();
	TileEntitySpecialRenderer	r11	= new TESRBlockFlint01();
	TileEntitySpecialRenderer	r12	= new TESRBlockFlint02();
	TileEntitySpecialRenderer	r13	= new TESRBlockFlint03();
	TileEntitySpecialRenderer	r14	= new TESRBlockFlint04();

	@Override
	public void registerItemRender() {
		MinecraftForgeClient.registerItemRenderer(ItemReg.woodMallet, new IRToolWoodMallet());
		MinecraftForgeClient.registerItemRenderer(ItemReg.stoneMallet, new IRToolStoneMallet());
		MinecraftForgeClient.registerItemRenderer(ItemReg.ironsteelMallet,
				new IRToolIronSteelMallet());

		// Find out why it won't render!!!!!

		MinecraftForgeClient.registerItemRenderer(ItemReg.itemBranch, new IRBranch());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockCatalyst),
				new IRCatalyst(r1, new TileEntityCatalyst()));
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockFlint01),
				new IRBlockFlint01(r11, new TileEntityFlint01()));
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockFlint02),
				new IRBlockFlint02(r12, new TileEntityFlint02()));
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockFlint03),
				new IRBlockFlint03(r13, new TileEntityFlint03()));
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(BlockReg.blockFlint04),
				new IRBlockFlint04(r14, new TileEntityFlint04()));
	}

	@Override
	public void registerTESRender() {

		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityAncientContainer.class, r);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCatalyst.class, r1);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGoldCrop.class, r2);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityIronCrop.class, r3);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBranch.class, r4);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFlint01.class, r11);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFlint02.class, r12);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFlint03.class, r13);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFlint04.class, r14);
	}

	@Override
	public void registerTESRGoldCasing() {

		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGoldCasing.class, r5);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGoldCasingSeeded.class, r6);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGoldCasingFinal.class, r7);
	}

	@Override
	public void registerTESRIronCasing() {

		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityIronCasing.class, r8);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityIronCasingSeeded.class, r9);
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityIronCasingFinal.class, r10);
	}
}
