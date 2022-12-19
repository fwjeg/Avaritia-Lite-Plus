
package net.bullfighter.fwjeg.avaritia.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class OrespngItem extends Item {
	public OrespngItem() {
		super(new Item.Properties().tab(null).stacksTo(0).rarity(Rarity.COMMON));
		setRegistryName("orespng");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 0F;
	}
}
