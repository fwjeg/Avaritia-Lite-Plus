
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.bullfighter.fwjeg.avaritia.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class AvaritiaLpModTabs {
	public static CreativeModeTab TAB_AVARITIATAB;
	public static CreativeModeTab TAB_ORES;

	public static void load() {
		TAB_AVARITIATAB = new CreativeModeTab("tabavaritiatab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(AvaritiaLpModItems.INFINITY_CATALYST);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
		TAB_ORES = new CreativeModeTab("tabores") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(AvaritiaLpModItems.ORESPNG);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
