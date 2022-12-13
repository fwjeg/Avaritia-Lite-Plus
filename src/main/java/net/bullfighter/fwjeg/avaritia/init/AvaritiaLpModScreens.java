
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.bullfighter.fwjeg.avaritia.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.bullfighter.fwjeg.avaritia.client.gui.TripleNeutroncollectorguiScreen;
import net.bullfighter.fwjeg.avaritia.client.gui.QuadNeutroncollectorguiScreen;
import net.bullfighter.fwjeg.avaritia.client.gui.NeutroniumCompressorGuiScreen;
import net.bullfighter.fwjeg.avaritia.client.gui.NeutronCollectorGuiScreen;
import net.bullfighter.fwjeg.avaritia.client.gui.IbguiScreen;
import net.bullfighter.fwjeg.avaritia.client.gui.DoubleNeutroncollectorguiScreen;
import net.bullfighter.fwjeg.avaritia.client.gui.Cs2Screen;
import net.bullfighter.fwjeg.avaritia.client.gui.CbguiScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class AvaritiaLpModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(AvaritiaLpModMenus.NEUTRON_COLLECTOR_GUI, NeutronCollectorGuiScreen::new);
			MenuScreens.register(AvaritiaLpModMenus.NEUTRONIUM_COMPRESSOR_GUI, NeutroniumCompressorGuiScreen::new);
			MenuScreens.register(AvaritiaLpModMenus.CS_2, Cs2Screen::new);
			MenuScreens.register(AvaritiaLpModMenus.IBGUI, IbguiScreen::new);
			MenuScreens.register(AvaritiaLpModMenus.CBGUI, CbguiScreen::new);
			MenuScreens.register(AvaritiaLpModMenus.DOUBLE_NEUTRONCOLLECTORGUI, DoubleNeutroncollectorguiScreen::new);
			MenuScreens.register(AvaritiaLpModMenus.TRIPLE_NEUTRONCOLLECTORGUI, TripleNeutroncollectorguiScreen::new);
			MenuScreens.register(AvaritiaLpModMenus.QUAD_NEUTRONCOLLECTORGUI, QuadNeutroncollectorguiScreen::new);
		});
	}
}
