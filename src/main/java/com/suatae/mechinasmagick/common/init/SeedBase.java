package com.suatae.mechinasmagick.common.init;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.util.ForgeDirection;

import com.suatae.mechinasmagick.common.core.lib.REF;





public class SeedBase extends ItemBase implements IPlantable {
	private final Block	theBlockPlant;
	private final Block	soil;
	private final Block	activator;
	private final Block	cap;
	private final Block	base;
	private final Block	pillar;
	private final Block	pillar_base;

	public SeedBase(Block BlockPlant, Block SoilBlock, Block Base, Block Pillar_Base, Block Pillar,
			Block Cap, Block Activator) {
		super();
		theBlockPlant = BlockPlant;
		soil = SoilBlock;
		base = Base;
		pillar_base = Pillar_Base;
		pillar = Pillar;
		cap = Cap;
		activator = Activator;
	}

	@Override
	public boolean onItemUse(ItemStack ItemStack, EntityPlayer Player, World World, int X, int Y,
			int Z, int par7, float par8, float par9, float par10) {
		if (par7 != 1) {
			World.playSoundEffect(X, Y, Z, REF.SOUND.FAIL01, 1.0F, 0.2F);
			World.playSoundEffect(X, Y, Z, REF.SOUND.FAIL02, 1.0F, 2.0F);
			World.playSoundEffect(X, Y, Z, REF.SOUND.FAIL03, 0.5F, 1.0F);
			return false;
		}
		else
			if (Player.canPlayerEdit(X, Y + 1, Z, par7, ItemStack)) {
				if (World.getBlock(X, Y, Z)
						.canSustainPlant(World, X, Y, Z, ForgeDirection.UP, this)
						&& World.isAirBlock(X, Y + 1, Z)) {

					Block c1xm = World.getBlock(X - 1, Y - 1, Z);
					Block c1xp = World.getBlock(X + 1, Y - 1, Z);
					Block c1zm = World.getBlock(X, Y - 1, Z - 1);
					Block c1zp = World.getBlock(X, Y - 1, Z + 1);
					Block c1xpzp = World.getBlock(X + 1, Y - 1, Z + 1);
					Block c1xmzp = World.getBlock(X - 1, Y - 1, Z + 1);
					Block c1xmzm = World.getBlock(X - 1, Y - 1, Z - 1);
					Block c1xpzm = World.getBlock(X + 1, Y - 1, Z - 1);
					if (!(c1xm != base) && !(c1xp != base) && !(c1zm != base) && !(c1zp != base)
							&& !(c1xpzp != base) && !(c1xmzp != base) && !(c1xmzm != base)
							&& !(c1xpzm != base)) {
						Block c2xMm = World.getBlock(X - 2, Y - 2, Z);
						Block c2xMmzm1 = World.getBlock(X - 2, Y - 2, Z - 1);
						Block c2xMmzm2 = World.getBlock(X - 2, Y - 2, Z - 2);
						Block c2xMmzp1 = World.getBlock(X - 2, Y - 2, Z + 1);
						Block c2xMmzp2 = World.getBlock(X - 2, Y - 2, Z + 2);
						Block c2xMp = World.getBlock(X + 2, Y - 2, Z);
						Block c2xMpzm1 = World.getBlock(X + 2, Y - 2, Z - 1);
						Block c2xMpzm2 = World.getBlock(X + 2, Y - 2, Z - 2);
						Block c2xMpzp1 = World.getBlock(X + 2, Y - 2, Z + 1);
						Block c2xMpzp2 = World.getBlock(X + 2, Y - 2, Z + 2);
						Block c2zMm = World.getBlock(X, Y - 2, Z - 2);
						Block c2zMmxm1 = World.getBlock(X - 1, Y - 2, Z - 2);
						Block c2zMmxp1 = World.getBlock(X + 1, Y - 2, Z - 2);
						Block c2zMp = World.getBlock(X, Y - 2, Z + 2);
						Block c2zMpxm1 = World.getBlock(X - 1, Y - 2, Z + 2);
						Block c2zMpxp1 = World.getBlock(X + 1, Y - 2, Z + 2);
						if (!(c2xMm != REF.BLOCK.stone) && !(c2xMmzm1 != base)
								&& !(c2xMmzm2 != base) && !(c2xMmzp1 != base)
								&& !(c2xMmzp2 != base) && !(c2xMp != base) && !(c2xMpzm1 != base)
								&& !(c2xMpzm2 != base) && !(c2xMpzp1 != base)
								&& !(c2xMpzp2 != base) && !(c2zMm != base) && !(c2zMmxm1 != base)
								&& !(c2zMmxp1 != base) && !(c2zMp != base) && !(c2zMpxm1 != base)
								&& !(c2zMpxp1 != base)) {
							Block c1b1 = World.getBlock(X - 5, Y - 2, Z - 5);
							Block c1b2 = World.getBlock(X - 5, Y - 1, Z - 5);
							Block c1b3 = World.getBlock(X - 5, Y, Z - 5);
							Block c1b4 = World.getBlock(X - 5, Y + 1, Z - 5);
							Block c1b5 = World.getBlock(X - 5, Y + 2, Z - 5);
							Block c2b1 = World.getBlock(X + 5, Y - 2, Z + 5);
							Block c2b2 = World.getBlock(X + 5, Y - 1, Z + 5);
							Block c2b3 = World.getBlock(X + 5, Y, Z + 5);
							Block c2b4 = World.getBlock(X + 5, Y + 1, Z + 5);
							Block c2b5 = World.getBlock(X + 5, Y + 2, Z + 5);
							Block c3b1 = World.getBlock(X + 5, Y - 2, Z - 5);
							Block c3b2 = World.getBlock(X + 5, Y - 1, Z - 5);
							Block c3b3 = World.getBlock(X + 5, Y, Z - 5);
							Block c3b4 = World.getBlock(X + 5, Y + 1, Z - 5);
							Block c3b5 = World.getBlock(X + 5, Y + 2, Z - 5);
							Block c4b1 = World.getBlock(X - 5, Y - 2, Z + 5);
							Block c4b2 = World.getBlock(X - 5, Y - 1, Z + 5);
							Block c4b3 = World.getBlock(X - 5, Y, Z + 5);
							Block c4b4 = World.getBlock(X - 5, Y + 1, Z + 5);
							Block c4b5 = World.getBlock(X - 5, Y + 2, Z + 5);
							if (!(c1b1 != pillar_base) && !(c1b2 != pillar) && !(c1b3 != pillar)
									&& !(c1b4 != cap) && !(c1b5 != activator)
									&& !(c2b1 != pillar_base) && !(c2b2 != pillar)
									&& !(c2b3 != pillar) && !(c2b4 != cap) && !(c2b5 != activator)
									&& !(c3b1 != pillar_base) && !(c3b2 != pillar)
									&& !(c3b3 != pillar) && !(c3b4 != cap) && !(c3b5 != activator)
									&& !(c4b1 != pillar_base) && !(c4b2 != pillar)
									&& !(c4b3 != pillar) && !(c4b4 != cap) && !(c4b5 != activator)) {
								World.setBlock(X, Y + 1, Z, theBlockPlant);
								--ItemStack.stackSize;
								World.playSoundEffect(X, Y, Z, REF.SOUND.SUCCESS01, 1.0F, 2.0F);
								World.playSoundEffect(X, Y, Z, REF.SOUND.SUCCESS02, 0.5F, 0.5F);
							}
							return true;

						}
						else {
							World.playSoundEffect(X, Y, Z, REF.SOUND.FAIL01, 1.0F, 0.2F);
							World.playSoundEffect(X, Y, Z, REF.SOUND.FAIL02, 1.0F, 2.0F);
							World.playSoundEffect(X, Y, Z, REF.SOUND.FAIL03, 0.5F, 1.0F);
							return false;

						}

					}
					else {
						World.playSoundEffect(X, Y, Z, REF.SOUND.FAIL01, 1.0F, 0.2F);
						World.playSoundEffect(X, Y, Z, REF.SOUND.FAIL02, 1.0F, 2.0F);
						World.playSoundEffect(X, Y, Z, REF.SOUND.FAIL03, 0.5F, 1.0F);
						return false;

					}
				}

				else {
					World.playSoundEffect(X, Y, Z, REF.SOUND.FAIL01, 1.0F, 0.2F);
					World.playSoundEffect(X, Y, Z, REF.SOUND.FAIL02, 1.0F, 2.0F);
					World.playSoundEffect(X, Y, Z, REF.SOUND.FAIL03, 0.5F, 1.0F);
					return false;
				}
			}
			else {
				World.playSoundEffect(X, Y, Z, REF.SOUND.FAIL01, 1.0F, 0.2F);
				World.playSoundEffect(X, Y, Z, REF.SOUND.FAIL02, 1.0F, 2.0F);
				World.playSoundEffect(X, Y, Z, REF.SOUND.FAIL03, 0.5F, 1.0F);
				return false;
			}

	}

	@Override
	public EnumPlantType getPlantType(IBlockAccess world, int X, int Y, int Z) {
		return EnumPlantType.Cave;
	}

	@Override
	public Block getPlant(IBlockAccess world, int X, int Y, int Z) {
		return theBlockPlant;
	}

	@Override
	public int getPlantMetadata(IBlockAccess world, int X, int Y, int Z) {
		return 0;
	}

	public Block getSoilId() {
		return soil;
	}

}
