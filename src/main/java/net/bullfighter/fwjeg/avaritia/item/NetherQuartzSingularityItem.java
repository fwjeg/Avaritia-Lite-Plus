
package net.bullfighter.fwjeg.avaritia.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.bullfighter.fwjeg.avaritia.init.AvaritiaLpModTabs;

public class NetherQuartzSingularityItem extends Item {
	public NetherQuartzSingularityItem() {
		super(new Item.Properties().tab(AvaritiaLpModTabs.TAB_AVARITIATAB).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("nether_quartz_singularity");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
