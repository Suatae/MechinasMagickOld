package com.suatae.mechinasmagick.client.renders.ir.goldcasing;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;

import com.suatae.mechinasmagick.common.tileentity.goldcasing.TileEntityGoldCasingFinal;





public class IRGoldCasingFinal implements IItemRenderer {
	TileEntitySpecialRenderer	render;
	private TileEntity			entity;

	public IRGoldCasingFinal(TileEntitySpecialRenderer render, TileEntityGoldCasingFinal tileEntity) {
		this.entity = tileEntity;
		this.render = render;
	}

	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {
		return false;
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
		this.render.renderTileEntityAt(this.entity, 0.0D, 0.0D, 0.0D, 0.0F);
	}

}