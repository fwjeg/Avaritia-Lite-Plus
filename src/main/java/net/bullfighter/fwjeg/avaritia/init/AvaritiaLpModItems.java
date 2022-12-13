
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.bullfighter.fwjeg.avaritia.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.bullfighter.fwjeg.avaritia.item.WorldBreakerItem;
import net.bullfighter.fwjeg.avaritia.item.UltimateStewItem;
import net.bullfighter.fwjeg.avaritia.item.SwordoftheCosmosItem;
import net.bullfighter.fwjeg.avaritia.item.StarFullItem;
import net.bullfighter.fwjeg.avaritia.item.SpaceTimeRipperItem;
import net.bullfighter.fwjeg.avaritia.item.SkullfireSwordItem;
import net.bullfighter.fwjeg.avaritia.item.RedstoneSingularityItem;
import net.bullfighter.fwjeg.avaritia.item.RecordFragmentItem;
import net.bullfighter.fwjeg.avaritia.item.PlanetEaterItem;
import net.bullfighter.fwjeg.avaritia.item.PileofNeutronsItem;
import net.bullfighter.fwjeg.avaritia.item.NeutroniumSwordItem;
import net.bullfighter.fwjeg.avaritia.item.NeutroniumShovelItem;
import net.bullfighter.fwjeg.avaritia.item.NeutroniumPickaxeItem;
import net.bullfighter.fwjeg.avaritia.item.NeutroniumNuggetItem;
import net.bullfighter.fwjeg.avaritia.item.NeutroniumIngotItem;
import net.bullfighter.fwjeg.avaritia.item.NeutroniumHoeItem;
import net.bullfighter.fwjeg.avaritia.item.NeutroniumGearItem;
import net.bullfighter.fwjeg.avaritia.item.NeutroniumAxeItem;
import net.bullfighter.fwjeg.avaritia.item.NeutroniumArmorItem;
import net.bullfighter.fwjeg.avaritia.item.NetherQuartzSingularityItem;
import net.bullfighter.fwjeg.avaritia.item.NaturesRuinItem;
import net.bullfighter.fwjeg.avaritia.item.LongbowoftheHeavensItem;
import net.bullfighter.fwjeg.avaritia.item.LapisSingularityItem;
import net.bullfighter.fwjeg.avaritia.item.IronSingularityItem;
import net.bullfighter.fwjeg.avaritia.item.InfinityNuggetItem;
import net.bullfighter.fwjeg.avaritia.item.InfinityIngotItem;
import net.bullfighter.fwjeg.avaritia.item.InfinityCatalystItem;
import net.bullfighter.fwjeg.avaritia.item.InfinityArmorItem;
import net.bullfighter.fwjeg.avaritia.item.HoeoftheGreenEarthItem;
import net.bullfighter.fwjeg.avaritia.item.GoldenSingularityItem;
import net.bullfighter.fwjeg.avaritia.item.EndestPearlItem;
import net.bullfighter.fwjeg.avaritia.item.EmeraldSingularityItem;
import net.bullfighter.fwjeg.avaritia.item.DiamondSingularityItem;
import net.bullfighter.fwjeg.avaritia.item.DiamondLatticeItem;
import net.bullfighter.fwjeg.avaritia.item.CrystalSwordItem;
import net.bullfighter.fwjeg.avaritia.item.CrystalShovelItem;
import net.bullfighter.fwjeg.avaritia.item.CrystalPickaxeItem;
import net.bullfighter.fwjeg.avaritia.item.CrystalMatrixIngotItem;
import net.bullfighter.fwjeg.avaritia.item.CrystalHoeItem;
import net.bullfighter.fwjeg.avaritia.item.CrystalAxeItem;
import net.bullfighter.fwjeg.avaritia.item.CrystalArmorItem;
import net.bullfighter.fwjeg.avaritia.item.CrossbowOfTheInfernoItem;
import net.bullfighter.fwjeg.avaritia.item.CosmicMeatballsItem;
import net.bullfighter.fwjeg.avaritia.item.CopperSingularityItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AvaritiaLpModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item DIAMOND_LATTICE = register(new DiamondLatticeItem());
	public static final Item CRYSTAL_MATRIX_INGOT = register(new CrystalMatrixIngotItem());
	public static final Item PILEOF_NEUTRONS = register(new PileofNeutronsItem());
	public static final Item NEUTRONIUM_NUGGET = register(new NeutroniumNuggetItem());
	public static final Item NEUTRONIUM_INGOT = register(new NeutroniumIngotItem());
	public static final Item INFINITY_CATALYST = register(new InfinityCatalystItem());
	public static final Item NEUTRON_COLLECTOR = register(AvaritiaLpModBlocks.NEUTRON_COLLECTOR, AvaritiaLpModTabs.TAB_AVARITIATAB);
	public static final Item INFINITY_INGOT = register(new InfinityIngotItem());
	public static final Item RECORD_FRAGMENT = register(new RecordFragmentItem());
	public static final Item IRON_SINGULARITY = register(new IronSingularityItem());
	public static final Item GOLDEN_SINGULARITY = register(new GoldenSingularityItem());
	public static final Item LAPIS_SINGULARITY = register(new LapisSingularityItem());
	public static final Item REDSTONE_SINGULARITY = register(new RedstoneSingularityItem());
	public static final Item NETHER_QUARTZ_SINGULARITY = register(new NetherQuartzSingularityItem());
	public static final Item DIAMOND_SINGULARITY = register(new DiamondSingularityItem());
	public static final Item EMERALD_SINGULARITY = register(new EmeraldSingularityItem());
	public static final Item NEUTRONIUM_COMPRESSOR = register(AvaritiaLpModBlocks.NEUTRONIUM_COMPRESSOR, AvaritiaLpModTabs.TAB_AVARITIATAB);
	public static final Item SWORDOFTHE_COSMOS = register(new SwordoftheCosmosItem());
	public static final Item PLANET_EATER = register(new PlanetEaterItem());
	public static final Item NATURES_RUIN = register(new NaturesRuinItem());
	public static final Item HOEOFTHE_GREEN_EARTH = register(new HoeoftheGreenEarthItem());
	public static final Item LONGBOWOFTHE_HEAVENS = register(new LongbowoftheHeavensItem());
	public static final Item WORLD_BREAKER = register(new WorldBreakerItem());
	public static final Item INFINITY_ARMOR_HELMET = register(new InfinityArmorItem.Helmet());
	public static final Item INFINITY_ARMOR_CHESTPLATE = register(new InfinityArmorItem.Chestplate());
	public static final Item INFINITY_ARMOR_LEGGINGS = register(new InfinityArmorItem.Leggings());
	public static final Item INFINITY_ARMOR_BOOTS = register(new InfinityArmorItem.Boots());
	public static final Item SKULLFIRE_SWORD = register(new SkullfireSwordItem());
	public static final Item COMPRESSED_CRAFTING_TABLE = register(AvaritiaLpModBlocks.COMPRESSED_CRAFTING_TABLE, AvaritiaLpModTabs.TAB_AVARITIATAB);
	public static final Item DOUBLE_COMPRESSED_CRAFTING_TABLE = register(AvaritiaLpModBlocks.DOUBLE_COMPRESSED_CRAFTING_TABLE,
			AvaritiaLpModTabs.TAB_AVARITIATAB);
	public static final Item EXTREME_CRAFTING_TABLE = register(AvaritiaLpModBlocks.EXTREME_CRAFTING_TABLE, AvaritiaLpModTabs.TAB_AVARITIATAB);
	public static final Item NEUTRONIUM_BLOCK = register(AvaritiaLpModBlocks.NEUTRONIUM_BLOCK, AvaritiaLpModTabs.TAB_AVARITIATAB);
	public static final Item INFINITY_BLOCK = register(AvaritiaLpModBlocks.INFINITY_BLOCK, AvaritiaLpModTabs.TAB_AVARITIATAB);
	public static final Item CRYSTAL_MATRIX = register(AvaritiaLpModBlocks.CRYSTAL_MATRIX, AvaritiaLpModTabs.TAB_AVARITIATAB);
	public static final Item ENDEST_PEARL = register(new EndestPearlItem());
	public static final Item ULTIMATE_STEW = register(new UltimateStewItem());
	public static final Item COSMIC_MEATBALLS = register(new CosmicMeatballsItem());
	public static final Item CRYSTAL_ARMOR_HELMET = register(new CrystalArmorItem.Helmet());
	public static final Item CRYSTAL_ARMOR_CHESTPLATE = register(new CrystalArmorItem.Chestplate());
	public static final Item CRYSTAL_ARMOR_LEGGINGS = register(new CrystalArmorItem.Leggings());
	public static final Item CRYSTAL_ARMOR_BOOTS = register(new CrystalArmorItem.Boots());
	public static final Item NEUTRONIUM_ARMOR_HELMET = register(new NeutroniumArmorItem.Helmet());
	public static final Item NEUTRONIUM_ARMOR_CHESTPLATE = register(new NeutroniumArmorItem.Chestplate());
	public static final Item NEUTRONIUM_ARMOR_LEGGINGS = register(new NeutroniumArmorItem.Leggings());
	public static final Item NEUTRONIUM_ARMOR_BOOTS = register(new NeutroniumArmorItem.Boots());
	public static final Item CRYSTAL_PICKAXE = register(new CrystalPickaxeItem());
	public static final Item CRYSTAL_AXE = register(new CrystalAxeItem());
	public static final Item CRYSTAL_SWORD = register(new CrystalSwordItem());
	public static final Item CRYSTAL_SHOVEL = register(new CrystalShovelItem());
	public static final Item CRYSTAL_HOE = register(new CrystalHoeItem());
	public static final Item NEUTRONIUM_PICKAXE = register(new NeutroniumPickaxeItem());
	public static final Item NEUTRONIUM_AXE = register(new NeutroniumAxeItem());
	public static final Item NEUTRONIUM_SWORD = register(new NeutroniumSwordItem());
	public static final Item NEUTRONIUM_SHOVEL = register(new NeutroniumShovelItem());
	public static final Item NEUTRONIUM_HOE = register(new NeutroniumHoeItem());
	public static final Item IINFTYBOX = register(AvaritiaLpModBlocks.IINFTYBOX, AvaritiaLpModTabs.TAB_AVARITIATAB);
	public static final Item BBOX_2 = register(AvaritiaLpModBlocks.BBOX_2, AvaritiaLpModTabs.TAB_AVARITIATAB);
	public static final Item DOUBLE_NEUTRONCOLLECTOR = register(AvaritiaLpModBlocks.DOUBLE_NEUTRONCOLLECTOR, AvaritiaLpModTabs.TAB_AVARITIATAB);
	public static final Item TRIPLE_NEUTRONCOLLECTOR = register(AvaritiaLpModBlocks.TRIPLE_NEUTRONCOLLECTOR, AvaritiaLpModTabs.TAB_AVARITIATAB);
	public static final Item QUAD_NEUTRONCOLLECTOR = register(AvaritiaLpModBlocks.QUAD_NEUTRONCOLLECTOR, AvaritiaLpModTabs.TAB_AVARITIATAB);
	public static final Item NEUTRONIUM_GEAR = register(new NeutroniumGearItem());
	public static final Item INFINITY_NUGGET = register(new InfinityNuggetItem());
	public static final Item STAR_FULL = register(new StarFullItem());
	public static final Item CROSSBOW_OF_THE_INFERNO = register(new CrossbowOfTheInfernoItem());
	public static final Item SPACE_TIME_RIPPER = register(new SpaceTimeRipperItem());
	public static final Item COPPER_SINGULARITY = register(new CopperSingularityItem());

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
