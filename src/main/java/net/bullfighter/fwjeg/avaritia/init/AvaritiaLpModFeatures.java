
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.bullfighter.fwjeg.avaritia.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.core.Registry;

import net.bullfighter.fwjeg.avaritia.world.features.ores.TinOreFeature;
import net.bullfighter.fwjeg.avaritia.world.features.ores.SilverOreFeature;
import net.bullfighter.fwjeg.avaritia.world.features.ores.PlatinumOreFeature;
import net.bullfighter.fwjeg.avaritia.world.features.ores.NickelOreFeature;
import net.bullfighter.fwjeg.avaritia.world.features.ores.LeadOreFeature;
import net.bullfighter.fwjeg.avaritia.world.features.ores.IridiumOreFeature;
import net.bullfighter.fwjeg.avaritia.world.features.ores.FluxedOreFeature;

import java.util.Set;
import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AvaritiaLpModFeatures {
	private static final Map<Feature<?>, FeatureRegistration> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(TinOreFeature.FEATURE,
				new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, TinOreFeature.GENERATE_BIOMES, TinOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(LeadOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, LeadOreFeature.GENERATE_BIOMES,
				LeadOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(SilverOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, SilverOreFeature.GENERATE_BIOMES,
				SilverOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(FluxedOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, FluxedOreFeature.GENERATE_BIOMES,
				FluxedOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(PlatinumOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				PlatinumOreFeature.GENERATE_BIOMES, PlatinumOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(IridiumOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, IridiumOreFeature.GENERATE_BIOMES,
				IridiumOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(NickelOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, NickelOreFeature.GENERATE_BIOMES,
				NickelOreFeature.CONFIGURED_FEATURE));
	}

	@SubscribeEvent
	public static void registerFeature(RegistryEvent.Register<Feature<?>> event) {
		event.getRegistry().registerAll(REGISTRY.keySet().toArray(new Feature[0]));
		REGISTRY.forEach((feature, registration) -> Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, feature.getRegistryName(),
				registration.configuredFeature()));
	}

	@Mod.EventBusSubscriber
	private static class BiomeFeatureLoader {
		@SubscribeEvent
		public static void addFeatureToBiomes(BiomeLoadingEvent event) {
			for (FeatureRegistration registration : REGISTRY.values()) {
				if (registration.biomes() == null || registration.biomes().contains(event.getName())) {
					event.getGeneration().getFeatures(registration.stage()).add(() -> registration.configuredFeature());
				}
			}
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			ConfiguredFeature<?, ?> configuredFeature) {
	}
}
