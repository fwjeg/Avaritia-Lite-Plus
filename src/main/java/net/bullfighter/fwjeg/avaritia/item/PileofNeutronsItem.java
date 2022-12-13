
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

public class PileofNeutronsItem extends Item {
	public PileofNeutronsItem() {
		super(new Item.Properties().tab(AvaritiaLpModTabs.TAB_AVARITIATAB).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("pileof_neutrons");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("\u00A78\u00A7o\u5C3D\u91CF\u4E0D\u8981\u53BB\u60F3\u4ED6\u3002"));
	}
}
