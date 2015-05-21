package com.suatae.mechinasmagick.common.init;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

import com.suatae.mechinasmagick.client.creativetab.MechinasTabs;
import com.suatae.mechinasmagick.common.core.lib.REF;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;





public class ToolMalletBase extends ItemSword {
	public static int	durability	= 132;

	public ToolMalletBase() {
		super(ToolMaterial.STONE);
		this.setMaxStackSize(1);
		this.setCreativeTab(MechinasTabs.MechinasMagick_TAB);
		this.setMaxDamage(durability);
		this.setFull3D();
	}

	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
		list.add(EnumChatFormatting.DARK_GRAY + "Strike at Lava Stone");

	}

	@Override
	public boolean onItemUse(ItemStack itemstack, EntityPlayer Player, World world, int X, int Y,
			int Z, int par7, float par8, float par9, float par10) {
		if (par7 != 1) {
			return false;
		}
		else
			if (Player.canPlayerEdit(X, Y, Z, par7, itemstack)) {

				Block block = world.getBlock(X, Y, Z);

				if (!(block != BlockReg.blockLavaStone)) {
					world.setBlock(X, Y, Z, Blocks.lava);
					itemstack.attemptDamageItem(par7, null);
					if (itemstack.getItemDamage() <= durability) {
						world.playSoundEffect(X, Y, Z, REF.SOUND.FIRE, 0.5F, 1.0F);
					}
				}
			}

		if (itemstack.getItemDamage() == durability + 1) {
			Player.inventory.consumeInventoryItem(this);

		}

		return true;
	}

	@Override
	public String getUnlocalizedName() {
		return String.format("item.%s%s", REF.MOD_ID.toLowerCase() + ":",
				getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}

	@Override
	public String getUnlocalizedName(ItemStack itemStack) {
		return String.format("item.%s%s", REF.MOD_ID.toLowerCase() + ":",
				getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(
				this.getUnlocalizedName().indexOf(".") + 1));
	}

	protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}
}
