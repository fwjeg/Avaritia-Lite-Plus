
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.bullfighter.fwjeg.avaritia.init;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.bullfighter.fwjeg.avaritia.entity.SpaceTimeRipperEntity;
import net.bullfighter.fwjeg.avaritia.entity.LongbowoftheHeavensEntity;
import net.bullfighter.fwjeg.avaritia.entity.EndestPearlEntity;
import net.bullfighter.fwjeg.avaritia.entity.CrossbowOfTheInfernoEntity;
import net.bullfighter.fwjeg.avaritia.entity.BlackHoleEntity;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AvaritiaLpModEntities {
	private static final List<EntityType<?>> REGISTRY = new ArrayList<>();
	public static final EntityType<EndestPearlEntity> ENDEST_PEARL = register("projectile_endest_pearl",
			EntityType.Builder.<EndestPearlEntity>of(EndestPearlEntity::new, MobCategory.MISC).setCustomClientFactory(EndestPearlEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<LongbowoftheHeavensEntity> LONGBOWOFTHE_HEAVENS = register("projectile_longbowofthe_heavens",
			EntityType.Builder.<LongbowoftheHeavensEntity>of(LongbowoftheHeavensEntity::new, MobCategory.MISC)
					.setCustomClientFactory(LongbowoftheHeavensEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<CrossbowOfTheInfernoEntity> CROSSBOW_OF_THE_INFERNO = register("projectile_crossbow_of_the_inferno",
			EntityType.Builder.<CrossbowOfTheInfernoEntity>of(CrossbowOfTheInfernoEntity::new, MobCategory.MISC)
					.setCustomClientFactory(CrossbowOfTheInfernoEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<SpaceTimeRipperEntity> SPACE_TIME_RIPPER = register("projectile_space_time_ripper",
			EntityType.Builder.<SpaceTimeRipperEntity>of(SpaceTimeRipperEntity::new, MobCategory.MISC)
					.setCustomClientFactory(SpaceTimeRipperEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<BlackHoleEntity> BLACK_HOLE = register("black_hole",
			EntityType.Builder.<BlackHoleEntity>of(BlackHoleEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BlackHoleEntity::new).fireImmune().sized(0.6f, 1.8f));

	private static <T extends Entity> EntityType<T> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		EntityType<T> entityType = (EntityType<T>) entityTypeBuilder.build(registryname).setRegistryName(registryname);
		REGISTRY.add(entityType);
		return entityType;
	}

	@SubscribeEvent
	public static void registerEntities(RegistryEvent.Register<EntityType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new EntityType[0]));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			BlackHoleEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(BLACK_HOLE, BlackHoleEntity.createAttributes().build());
	}
}
