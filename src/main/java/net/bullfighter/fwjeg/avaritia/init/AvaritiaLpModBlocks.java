
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
import net.bullfighter.fwjeg.avaritia.block.TinOreBlock;
import net.bullfighter.fwjeg.avaritia.block.TinBlockBlock;
import net.bullfighter.fwjeg.avaritia.block.SilverOreBlock;
import net.bullfighter.fwjeg.avaritia.block.SilverBlockBlock;
import net.bullfighter.fwjeg.avaritia.block.QuadNeutroncollectorBlock;
import net.bullfighter.fwjeg.avaritia.block.PlatinumOreBlock;
import net.bullfighter.fwjeg.avaritia.block.PlatinumBlockBlock;
import net.bullfighter.fwjeg.avaritia.block.NickelOreBlock;
import net.bullfighter.fwjeg.avaritia.block.NickelBlockBlock;
import net.bullfighter.fwjeg.avaritia.block.NeutroniumCompressorBlock;
import net.bullfighter.fwjeg.avaritia.block.NeutroniumBlockBlock;
import net.bullfighter.fwjeg.avaritia.block.NeutronCollectorBlock;
import net.bullfighter.fwjeg.avaritia.block.LeadOreBlock;
import net.bullfighter.fwjeg.avaritia.block.LeadBlockBlock;
import net.bullfighter.fwjeg.avaritia.block.IridiumOreBlock;
import net.bullfighter.fwjeg.avaritia.block.IridiumBlockBlock;
import net.bullfighter.fwjeg.avaritia.block.InfinityBlockBlock;
import net.bullfighter.fwjeg.avaritia.block.IinftyboxBlock;
import net.bullfighter.fwjeg.avaritia.block.FluxedOreBlock;
import net.bullfighter.fwjeg.avaritia.block.FluxedBlockBlock;
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
	public static final Block COMPRESSED_CRAFTING_TABLE = register(new CompressedCraftingTableBlock());
	public static final Block DOUBLE_COMPRESSED_CRAFTING_TABLE = register(new DoubleCompressedCraftingTableBlock());
	public static final Block EXTREME_CRAFTING_TABLE = register(new ExtremeCraftingTableBlock());
	public static final Block NEUTRONIUM_COMPRESSOR = register(new NeutroniumCompressorBlock());
	public static final Block NEUTRON_COLLECTOR = register(new NeutronCollectorBlock());
	public static final Block DOUBLE_NEUTRONCOLLECTOR = register(new DoubleNeutroncollectorBlock());
	public static final Block TRIPLE_NEUTRONCOLLECTOR = register(new TripleNeutroncollectorBlock());
	public static final Block QUAD_NEUTRONCOLLECTOR = register(new QuadNeutroncollectorBlock());
	public static final Block NEUTRONIUM_BLOCK = register(new NeutroniumBlockBlock());
	public static final Block INFINITY_BLOCK = register(new InfinityBlockBlock());
	public static final Block CRYSTAL_MATRIX = register(new CrystalMatrixBlock());
	public static final Block BBOX_2 = register(new Bbox2Block());
	public static final Block IINFTYBOX = register(new IinftyboxBlock());
	public static final Block TIN_BLOCK = register(new TinBlockBlock());
	public static final Block LEAD_BLOCK = register(new LeadBlockBlock());
	public static final Block SILVER_BLOCK = register(new SilverBlockBlock());
	public static final Block FLUXED_BLOCK = register(new FluxedBlockBlock());
	public static final Block PLATINUM_BLOCK = register(new PlatinumBlockBlock());
	public static final Block IRIDIUM_BLOCK = register(new IridiumBlockBlock());
	public static final Block NICKEL_BLOCK = register(new NickelBlockBlock());
	public static final Block TIN_ORE = register(new TinOreBlock());
	public static final Block LEAD_ORE = register(new LeadOreBlock());
	public static final Block SILVER_ORE = register(new SilverOreBlock());
	public static final Block FLUXED_ORE = register(new FluxedOreBlock());
	public static final Block PLATINUM_ORE = register(new PlatinumOreBlock());
	public static final Block IRIDIUM_ORE = register(new IridiumOreBlock());
	public static final Block NICKEL_ORE = register(new NickelOreBlock());

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
			Bbox2Block.registerRenderLayer();
			IinftyboxBlock.registerRenderLayer();
		}
	}
}
