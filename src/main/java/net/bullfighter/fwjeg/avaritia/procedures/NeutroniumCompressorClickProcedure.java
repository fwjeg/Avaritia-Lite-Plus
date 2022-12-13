package net.bullfighter.fwjeg.avaritia.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.bullfighter.fwjeg.avaritia.network.AvaritiaLpModVariables;

public class NeutroniumCompressorClickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorx = x;
		AvaritiaLpModVariables.MapVariables.get(world).syncData(world);
		AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectory = y;
		AvaritiaLpModVariables.MapVariables.get(world).syncData(world);
		AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorz = z;
		AvaritiaLpModVariables.MapVariables.get(world).syncData(world);
	}
}
