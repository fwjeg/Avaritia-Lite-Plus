
package net.bullfighter.fwjeg.avaritia.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.bullfighter.fwjeg.avaritia.init.AvaritiaLpModTabs;

public class IridiumItem extends Item {
	public IridiumItem() {
		super(new Item.Properties().tab(AvaritiaLpModTabs.TAB_ORES).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("iridium");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
