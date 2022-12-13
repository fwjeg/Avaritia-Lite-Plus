
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.bullfighter.fwjeg.avaritia.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.bullfighter.fwjeg.avaritia.block.entity.TripleNeutroncollectorBlockEntity;
import net.bullfighter.fwjeg.avaritia.block.entity.QuadNeutroncollectorBlockEntity;
import net.bullfighter.fwjeg.avaritia.block.entity.NeutroniumCompressorBlockEntity;
import net.bullfighter.fwjeg.avaritia.block.entity.NeutronCollectorBlockEntity;
import net.bullfighter.fwjeg.avaritia.block.entity.IinftyboxBlockEntity;
import net.bullfighter.fwjeg.avaritia.block.entity.ExtremeCraftingTableBlockEntity;
import net.bullfighter.fwjeg.avaritia.block.entity.DoubleNeutroncollectorBlockEntity;
import net.bullfighter.fwjeg.avaritia.block.entity.Bbox2BlockEntity;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AvaritiaLpModBlockEntities {
	private static final List<BlockEntityType<?>> REGISTRY = new ArrayList<>();
	public static final BlockEntityType<?> NEUTRON_COLLECTOR = register("avaritia_lp:neutron_collector", AvaritiaLpModBlocks.NEUTRON_COLLECTOR,
			NeutronCollectorBlockEntity::new);
	public static final BlockEntityType<?> NEUTRONIUM_COMPRESSOR = register("avaritia_lp:neutronium_compressor",
			AvaritiaLpModBlocks.NEUTRONIUM_COMPRESSOR, NeutroniumCompressorBlockEntity::new);
	public static final BlockEntityType<?> EXTREME_CRAFTING_TABLE = register("avaritia_lp:extreme_crafting_table",
			AvaritiaLpModBlocks.EXTREME_CRAFTING_TABLE, ExtremeCraftingTableBlockEntity::new);
	public static final BlockEntityType<?> IINFTYBOX = register("avaritia_lp:iinftybox", AvaritiaLpModBlocks.IINFTYBOX, IinftyboxBlockEntity::new);
	public static final BlockEntityType<?> BBOX_2 = register("avaritia_lp:bbox_2", AvaritiaLpModBlocks.BBOX_2, Bbox2BlockEntity::new);
	public static final BlockEntityType<?> DOUBLE_NEUTRONCOLLECTOR = register("avaritia_lp:double_neutroncollector",
			AvaritiaLpModBlocks.DOUBLE_NEUTRONCOLLECTOR, DoubleNeutroncollectorBlockEntity::new);
	public static final BlockEntityType<?> TRIPLE_NEUTRONCOLLECTOR = register("avaritia_lp:triple_neutroncollector",
			AvaritiaLpModBlocks.TRIPLE_NEUTRONCOLLECTOR, TripleNeutroncollectorBlockEntity::new);
	public static final BlockEntityType<?> QUAD_NEUTRONCOLLECTOR = register("avaritia_lp:quad_neutroncollector",
			AvaritiaLpModBlocks.QUAD_NEUTRONCOLLECTOR, QuadNeutroncollectorBlockEntity::new);

	private static BlockEntityType<?> register(String registryname, Block block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		BlockEntityType<?> blockEntityType = BlockEntityType.Builder.of(supplier, block).build(null).setRegistryName(registryname);
		REGISTRY.add(blockEntityType);
		return blockEntityType;
	}

	@SubscribeEvent
	public static void registerTileEntity(RegistryEvent.Register<BlockEntityType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new BlockEntityType[0]));
	}
}
