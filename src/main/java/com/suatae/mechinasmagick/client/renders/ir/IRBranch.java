package com.suatae.mechinasmagick.client.renders.ir;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;

import com.suatae.mechinasmagick.client.models.Branch;
import com.suatae.mechinasmagick.common.core.lib.REF;





public class IRBranch implements IItemRenderer {
	protected Branch	model;

	public IRBranch() {
		model = new Branch();
		this.MalletTexture = new ResourceLocation(REF.MOD_ID.toLowerCase(),
				"textures/models/Branch.png");
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

				GL11.glRotatef(180F, 1.0F, 0.0F, 0.0F);
				GL11.glTranslatef(-0.2F, -5F, 0.2F);
				GL11.glScalef(3.0F, 3.0F, 3.0F);

				model.render((Entity) data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);

				GL11.glPopMatrix();
				break;
			case EQUIPPED_FIRST_PERSON:
				GL11.glPushMatrix();
				Minecraft.getMinecraft().renderEngine.bindTexture(MalletTexture);

				GL11.glRotatef(30F, 0.0F, 0.0F, 1.0F);
				GL11.glRotatef(180F, 0.0F, -1.0F, 0.0F);
				GL11.glTranslatef(-0.1F, 0.0F, -0.1F);

				model.render((Entity) data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);

				GL11.glPopMatrix();
				break;

			case ENTITY:
				GL11.glPushMatrix();
				Minecraft.getMinecraft().renderEngine.bindTexture(MalletTexture);

				GL11.glRotatef(180F, 1.0f, 0.0f, 0.0f);
				GL11.glTranslatef(0F, -1.5F, 0F);

				model.render((Entity) data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);

				GL11.glPopMatrix();
				break;

			default:
				break;
		}
	}
}
