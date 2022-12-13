
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.bullfighter.fwjeg.avaritia.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

@Mod.EventBusSubscriber
public class AvaritiaLpModFuels {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == AvaritiaLpModBlocks.COMPRESSED_CRAFTING_TABLE.asItem())
			event.setBurnTime(300);
		else if (event.getItemStack().getItem() == AvaritiaLpModBlocks.DOUBLE_COMPRESSED_CRAFTING_TABLE.asItem())
			event.setBurnTime(300);
		else if (event.getItemStack().getItem() == AvaritiaLpModItems.STAR_FULL)
			event.setBurnTime(1000000000);
	}
}
