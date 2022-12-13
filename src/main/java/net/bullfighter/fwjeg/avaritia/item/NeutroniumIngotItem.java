
package net.bullfighter.fwjeg.avaritia.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.bullfighter.fwjeg.avaritia.init.AvaritiaLpModTabs;

import java.util.List;

public class NeutroniumIngotItem extends Item {
	public NeutroniumIngotItem() {
		super(new Item.Properties().tab(AvaritiaLpModTabs.TAB_AVARITIATAB).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("neutronium_ingot");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("\u00A78\u00A7o\u81F4\u5BC6\u6052\u661F\u4E4B\u5FC3\uFF0C\u5316\u4E3A\u4E00\u952D\u3002"));
	}
}
