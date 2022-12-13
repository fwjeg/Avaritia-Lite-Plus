
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.bullfighter.fwjeg.avaritia.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.bullfighter.fwjeg.avaritia.block.TripleNeutroncollectorBlock;
import net.bullfighter.fwjeg.avaritia.block.QuadNeutroncollectorBlock;
import net.bullfighter.fwjeg.avaritia.block.NeutroniumCompressorBlock;
import net.bullfighter.fwjeg.avaritia.block.NeutroniumBlockBlock;
import net.bullfighter.fwjeg.avaritia.block.NeutronCollectorBlock;
import net.bullfighter.fwjeg.avaritia.block.InfinityBlockBlock;
import net.bullfighter.fwjeg.avaritia.block.IinftyboxBlock;
import net.bullfighter.fwjeg.avaritia.block.ExtremeCraftingTableBlock;
import net.bullfighter.fwjeg.avaritia.block.DoubleNeutroncollectorBlock;
import net.bullfighter.fwjeg.avaritia.block.DoubleCompressedCraftingTableBlock;
import net.bullfighter.fwjeg.avaritia.block.CrystalMatrixBlock;
import net.bullfighter.fwjeg.avaritia.block.CompressedCraftingTableBlock;
import net.bullfighter.fwjeg.avaritia.block.Bbox2Block;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AvaritiaLpModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block NEUTRON_COLLECTOR = register(new NeutronCollectorBlock());
	public static final Block NEUTRONIUM_COMPRESSOR = register(new NeutroniumCompressorBlock());
	public static final Block COMPRESSED_CRAFTING_TABLE = register(new CompressedCraftingTableBlock());
	public static final Block DOUBLE_COMPRESSED_CRAFTING_TABLE = register(new DoubleCompressedCraftingTableBlock());
	public static final Block EXTREME_CRAFTING_TABLE = register(new ExtremeCraftingTableBlock());
	public static final Block NEUTRONIUM_BLOCK = register(new NeutroniumBlockBlock());
	public static final Block INFINITY_BLOCK = register(new InfinityBlockBlock());
	public static final Block CRYSTAL_MATRIX = register(new CrystalMatrixBlock());
	public static final Block IINFTYBOX = register(new IinftyboxBlock());
	public static final Block BBOX_2 = register(new Bbox2Block());
	public static final Block DOUBLE_NEUTRONCOLLECTOR = register(new DoubleNeutroncollectorBlock());
	public static final Block TRIPLE_NEUTRONCOLLECTOR = register(new TripleNeutroncollectorBlock());
	public static final Block QUAD_NEUTRONCOLLECTOR = register(new QuadNeutroncollectorBlock());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			IinftyboxBlock.registerRenderLayer();
			Bbox2Block.registerRenderLayer();
		}
	}
}
