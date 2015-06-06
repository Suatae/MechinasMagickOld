package com.suatae.mechinasmagick.client.renders.ir;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;

import com.suatae.mechinasmagick.client.models.WoodMallet;
import com.suatae.mechinasmagick.common.core.lib.REF;





public class IRToolWoodMallet implements IItemRenderer {
	protected WoodMallet	model;

	public IRToolWoodMallet() {
		model = new WoodMallet();
		this.MalletTexture = new ResourceLocation(REF.MOD_ID.toLowerCase(),
				"textures/models/woodMallet.png");
	}

	private ResourceLocation	MalletTexture;

	@Override
	public boolean handleRenderType(ItemStack itemstack, ItemRenderType type) {
		switch (type) {
			case EQUIPPED:
				return true;
			case EQUIPPED_FIRST_PERSON:
				return true;
			case ENTITY:
				return true;
				// case INVENTORY:
				// return true;
			default:
				return false;
		}
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack itemstack,
			ItemRendererHelper helper) {
		return true;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack itemstack, Object... data) {
		switch (type) {
			case EQUIPPED:
				GL11.glPushMatrix();
				Minecraft.getMinecraft().renderEngine.bindTexture(MalletTexture);

				GL11.glRotatef(140F, 1.0F, 0.0F, 0.0F);
				GL11.glRotatef(60F, 0.0F, -0.35F, -1.0F);
				GL11.glRotatef(30F, 0.0F, -0.5F, 0.9F);
				GL11.glTranslatef(0.0F, -1.9F, -1.3F);
				GL11.glScalef(3.0F, 3.0F, 3.0F);

				model.render((Entity) data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);

				GL11.glPopMatrix();
				break;
			case EQUIPPED_FIRST_PERSON:
				GL11.glPushMatrix();
				Minecraft.getMinecraft().renderEngine.bindTexture(MalletTexture);

				GL11.glRotatef(90F, 0.5F, 0.5F, 0.0F);
				GL11.glRotatef(120.0F, 1.0F, 0.0F, 0.0F);
				GL11.glRotatef(150.0F, 0.0F, 1.0F, 0.0F);
				GL11.glRotatef(40F, -1.0F, -1.0F, 0.0F);
				GL11.glRotatef(30F, 0.0F, -1.0F, -0.2F);
				GL11.glTranslatef(0.4F, -2.0F, -0.60F);
				GL11.glScalef(1.8F, 1.8F, 1.8F);

				model.render((Entity) data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);

				GL11.glPopMatrix();
				break;

			case ENTITY:
				GL11.glPushMatrix();
				Minecraft.getMinecraft().renderEngine.bindTexture(MalletTexture);

				GL11.glRotatef(180F, 1.0f, 0.0f, 0.0f);
				GL11.glTranslatef(0F, -1.2F, 0F);

				model.render((Entity) data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);

				GL11.glPopMatrix();
				break;

			// WHAT AM I MISSING HERE!?!?!?!?!?!

			// case INVENTORY:
			// GL11.glPushMatrix();
			// Minecraft.getMinecraft().renderEngine.bindTexture(MalletTexture);
			//
			// // GL11.glRotatef(200F, 1.0f, 0.0f, 0.0f);
			// // GL11.glRotatef(-80F, 0.0f, 1.0f, 0.0f);
			// GL11.glTranslatef(1.0F, 1.0F, 1.0F);
			// GL11.glScalef(5.0F, 5.0F, 5.0F);
			//
			// GL11.glPopMatrix();
			//
			// break;
			default:
				break;
		}
	}
}
