
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.bullfighter.fwjeg.avaritia.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.bullfighter.fwjeg.avaritia.client.renderer.BlackHoleRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class AvaritiaLpModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(AvaritiaLpModEntities.ENDEST_PEARL, ThrownItemRenderer::new);
		event.registerEntityRenderer(AvaritiaLpModEntities.LONGBOWOFTHE_HEAVENS, ThrownItemRenderer::new);
		event.registerEntityRenderer(AvaritiaLpModEntities.CROSSBOW_OF_THE_INFERNO, ThrownItemRenderer::new);
		event.registerEntityRenderer(AvaritiaLpModEntities.BLACK_HOLE, BlackHoleRenderer::new);
	}
}
