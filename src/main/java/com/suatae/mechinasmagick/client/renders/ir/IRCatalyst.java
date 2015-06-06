package com.suatae.mechinasmagick.client.renders.ir;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;

import com.suatae.mechinasmagick.common.tileentity.TileEntityCatalyst;





public class IRCatalyst implements IItemRenderer {
	TileEntitySpecialRenderer	render1;
	private TileEntity			entity;

	public IRCatalyst(TileEntitySpecialRenderer render1, TileEntityCatalyst tileEntity) {
		this.entity = tileEntity;
		this.render1 = render1;
	}

	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {
		return true;
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item,
			ItemRendererHelper helper) {
		return true;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
		if (type == IItemRenderer.ItemRenderType.ENTITY)
			GL11.glTranslatef(-0.5F, 0.0F, -0.5F);
		this.render1.renderTileEntityAt(this.entity, 0.0D, 0.0D, 0.0D, 0.0F);
	}
}
