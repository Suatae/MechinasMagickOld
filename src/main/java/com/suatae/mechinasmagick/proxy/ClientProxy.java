package com.suatae.mechinasmagick.proxy;

import net.minecraftforge.client.MinecraftForgeClient;

import com.suatae.mechinasmagick.client.renders.IRToolWoodMallet;
import com.suatae.mechinasmagick.common.init.ItemReg;





public class ClientProxy extends CommonProxy {
	@Override
	public void preInit() {
		registerItemRender();
	}

	@Override
	public void Init() {}

	@Override
	public void postInit() {}

	@Override
	public void registerItemRender() {
		MinecraftForgeClient.registerItemRenderer(ItemReg.woodMallet, new IRToolWoodMallet());
	}

}
