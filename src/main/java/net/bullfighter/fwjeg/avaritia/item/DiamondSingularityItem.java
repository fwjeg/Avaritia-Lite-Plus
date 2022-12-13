
package net.bullfighter.fwjeg.avaritia.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.bullfighter.fwjeg.avaritia.init.AvaritiaLpModTabs;

public class DiamondSingularityItem extends Item {
	public DiamondSingularityItem() {
		super(new Item.Properties().tab(AvaritiaLpModTabs.TAB_AVARITIATAB).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("diamond_singularity");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
