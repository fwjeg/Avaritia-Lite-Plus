package net.bullfighter.fwjeg.avaritia.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;

import net.bullfighter.fwjeg.avaritia.network.AvaritiaLpModVariables;
import net.bullfighter.fwjeg.avaritia.init.AvaritiaLpModGameRules;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class MaxCompressorResourcesProcedure {
	@SubscribeEvent
	public static void onWorldTick(TickEvent.WorldTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.world);
		}
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		AvaritiaLpModVariables.MapVariables.get(world).MaxCompressorResources = (world.getLevelData().getGameRules()
				.getInt(AvaritiaLpModGameRules.NEUTRONIUMCOMPRESSORAMOUNT));
		AvaritiaLpModVariables.MapVariables.get(world).syncData(world);
	}
}
