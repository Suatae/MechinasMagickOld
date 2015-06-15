package com.suatae.mechinasmagick.client.renders.flint;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import com.suatae.mechinasmagick.client.models.Flint3;
import com.suatae.mechinasmagick.common.core.lib.REF;





public class TESRBlockFlint03 extends TileEntitySpecialRenderer {
	private static final ResourceLocation	texture	= new ResourceLocation(
															REF.MOD_ID.toLowerCase(),
															"textures/models/Flint3.png");
	private Flint3							model;

	public TESRBlockFlint03() {
		this.model = new Flint3();
	}

	@Override
	public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float f) {
		GL11.glPushMatrix();
		this.bindTexture(texture);

		GL11.glTranslatef((float) x + 0.5F, (float) y + 1.47F, (float) z + 0.5F);
		GL11.glRotatef(-180F, 0F, 0F, 1F);

		this.model.render((Entity) null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
		GL11.glPopMatrix();
	}
}