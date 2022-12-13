
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.bullfighter.fwjeg.avaritia.init;

import net.minecraftforge.fmllegacy.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;

import net.bullfighter.fwjeg.avaritia.world.inventory.TripleNeutroncollectorguiMenu;
import net.bullfighter.fwjeg.avaritia.world.inventory.QuadNeutroncollectorguiMenu;
import net.bullfighter.fwjeg.avaritia.world.inventory.NeutroniumCompressorGuiMenu;
import net.bullfighter.fwjeg.avaritia.world.inventory.NeutronCollectorGuiMenu;
import net.bullfighter.fwjeg.avaritia.world.inventory.IbguiMenu;
import net.bullfighter.fwjeg.avaritia.world.inventory.DoubleNeutroncollectorguiMenu;
import net.bullfighter.fwjeg.avaritia.world.inventory.Cs2Menu;
import net.bullfighter.fwjeg.avaritia.world.inventory.CbguiMenu;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AvaritiaLpModMenus {
	private static final List<MenuType<?>> REGISTRY = new ArrayList<>();
	public static final MenuType<NeutronCollectorGuiMenu> NEUTRON_COLLECTOR_GUI = register("neutron_collector_gui",
			(id, inv, extraData) -> new NeutronCollectorGuiMenu(id, inv, extraData));
	public static final MenuType<NeutroniumCompressorGuiMenu> NEUTRONIUM_COMPRESSOR_GUI = register("neutronium_compressor_gui",
			(id, inv, extraData) -> new NeutroniumCompressorGuiMenu(id, inv, extraData));
	public static final MenuType<Cs2Menu> CS_2 = register("cs_2", (id, inv, extraData) -> new Cs2Menu(id, inv, extraData));
	public static final MenuType<IbguiMenu> IBGUI = register("ibgui", (id, inv, extraData) -> new IbguiMenu(id, inv, extraData));
	public static final MenuType<CbguiMenu> CBGUI = register("cbgui", (id, inv, extraData) -> new CbguiMenu(id, inv, extraData));
	public static final MenuType<DoubleNeutroncollectorguiMenu> DOUBLE_NEUTRONCOLLECTORGUI = register("double_neutroncollectorgui",
			(id, inv, extraData) -> new DoubleNeutroncollectorguiMenu(id, inv, extraData));
	public static final MenuType<TripleNeutroncollectorguiMenu> TRIPLE_NEUTRONCOLLECTORGUI = register("triple_neutroncollectorgui",
			(id, inv, extraData) -> new TripleNeutroncollectorguiMenu(id, inv, extraData));
	public static final MenuType<QuadNeutroncollectorguiMenu> QUAD_NEUTRONCOLLECTORGUI = register("quad_neutroncollectorgui",
			(id, inv, extraData) -> new QuadNeutroncollectorguiMenu(id, inv, extraData));

	private static <T extends AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
		MenuType<T> menuType = new MenuType<T>(containerFactory);
		menuType.setRegistryName(registryname);
		REGISTRY.add(menuType);
		return menuType;
	}

	@SubscribeEvent
	public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MenuType[0]));
	}
}
