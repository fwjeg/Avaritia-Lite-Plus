
package net.bullfighter.fwjeg.avaritia.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.bullfighter.fwjeg.avaritia.init.AvaritiaLpModTabs;

public class GoldenSingularityItem extends Item {
	public GoldenSingularityItem() {
		super(new Item.Properties().tab(AvaritiaLpModTabs.TAB_AVARITIATAB).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("golden_singularity");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
