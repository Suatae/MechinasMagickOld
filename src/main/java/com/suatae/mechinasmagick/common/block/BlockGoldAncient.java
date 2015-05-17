package com.suatae.mechinasmagick.common.block;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import com.suatae.mechinasmagick.common.init.CropBase;
import com.suatae.mechinasmagick.common.init.ItemReg;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;





public class BlockGoldAncient extends CropBase {

	public BlockGoldAncient() {
		this.setBlockName("blockGoldAncient");
		this.setBlockTextureName("mechinasmagick:ancient_stage_0");
		this.setLightLevel(1.0F);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void randomDisplayTick(World world, int X, int Y, int Z, Random ran) {
		super.randomDisplayTick(world, X, Y, Z, ran);
		double d0 = X + ran.nextFloat();
		double d1 = Y + 0.5F;
		double d2 = Z + ran.nextFloat();
		double d3 = 1.0D; // Color R
		double d4 = 0.0D; // Color G
		double d5 = 0.0D; // Color B

		double d6 = X + 0.0F + (6.0F * ran.nextFloat());
		double d6m = X + 0.0F + (-6.0F * ran.nextFloat());
		double d7 = Y + 0.0F + (2.0F * ran.nextFloat());
		double d8 = Z + 0.0F + (6.0F * ran.nextFloat());
		double d8m = Z + 0.0F + (-6.0F * ran.nextFloat());
		double d9 = Y + 0.0F + (-2.0F * ran.nextFloat());

		double d10 = 5.0F + (ran.nextFloat());
		double d11 = Y + 0.9F;
		double d12 = 4.8F;
		double d13 = 0.0D; // Velocity
		double d14 = 0.0D; // Velocity
		double d15 = 0.0D; // Velocity

		/*
		 * if (world.getBlock(X, Y + 1, Z) == REF.BLOCK.air) {
		 * 
		 * 
		 * }
		 */
		if (getPlantMetadata(world, X, Y, Z) == 9) {
			world.spawnParticle("mobSpell", d0, d1, d2, d3, d4, d5);
		}

		if (getPlantMetadata(world, X, Y, Z) >= 6) {
			world.spawnParticle("townaura", d6, d7, d8, d3, d4, d5);
			world.spawnParticle("townaura", d6, d9, d8, d3, d4, d5);
			world.spawnParticle("townaura", d6m, d7, d8m, d3, d4, d5);
			world.spawnParticle("townaura", d6m, d9, d8m, d3, d4, d5);
			world.spawnParticle("townaura", d6, d7, d8m, d3, d4, d5);
			world.spawnParticle("townaura", d6, d9, d8m, d3, d4, d5);
			world.spawnParticle("townaura", d6m, d7, d8, d3, d4, d5);
			world.spawnParticle("townaura", d6m, d9, d8, d3, d4, d5);
		}

		// world.spawnParticle("enchantmenttable", x + d10, d11, z + d12, d13,
		// d14, d15);
		// world.spawnParticle("enchantmenttable", x + d12, d11, z + d10, d13,
		// d14, d15);

	};

	@Override
	public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
		ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
		if (metadata == 9) {

			drops.add(new ItemStack(this.SEED(), 1, 0));
			drops.add(new ItemStack(this.FRUIT(), 2, 0));

		}
		if (metadata <= 8) {

			drops.add(new ItemStack(this.PRIMED_SEED(), 1, 0));

		}

		return drops;
	}

	protected Item SEED() {
		return ItemReg.itemMMSeed;
	}

	protected Item PRIMED_SEED() {
		return ItemReg.itemPrimedGold;
	}

	protected Item FRUIT() {
		return ItemReg.itemAncientFruit;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister parIIconRegister) {
		iIcon = new IIcon[maxGrowthStage + 1];
		iIcon[0] = parIIconRegister.registerIcon("MechinasMagick:ancient_stage_0");
		iIcon[1] = parIIconRegister.registerIcon("MechinasMagick:ancient_stage_0");
		iIcon[2] = parIIconRegister.registerIcon("MechinasMagick:ancient_stage_1");
		iIcon[3] = parIIconRegister.registerIcon("MechinasMagick:ancient_stage_1");
		iIcon[4] = parIIconRegister.registerIcon("MechinasMagick:ancient_stage_2");
		iIcon[5] = parIIconRegister.registerIcon("MechinasMagick:ancient_stage_2");
		iIcon[6] = parIIconRegister.registerIcon("MechinasMagick:ancient_stage_3");
		iIcon[7] = parIIconRegister.registerIcon("MechinasMagick:ancient_stage_3");
		iIcon[8] = parIIconRegister.registerIcon("MechinasMagick:ancient_stage_4");
		iIcon[9] = parIIconRegister.registerIcon("MechinasMagick:ancient_stage_4");
	}

}
