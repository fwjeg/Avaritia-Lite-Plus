
package net.bullfighter.fwjeg.avaritia.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.bullfighter.fwjeg.avaritia.init.AvaritiaLpModTabs;
import net.bullfighter.fwjeg.avaritia.init.AvaritiaLpModItems;

public class NeutroniumGearItem extends Item {
	public NeutroniumGearItem() {
		super(new Item.Properties().tab(AvaritiaLpModTabs.TAB_AVARITIATAB).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("neutronium_gear");
	}

	@Override
	public boolean hasCraftingRemainingItem() {
		return true;
	}

	@Override
	public ItemStack getContainerItem(ItemStack itemstack) {
		return new ItemStack(AvaritiaLpModItems.PILEOF_NEUTRONS);
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
