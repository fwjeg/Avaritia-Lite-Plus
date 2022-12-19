package net.bullfighter.fwjeg.avaritia.procedures;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.core.BlockPos;

import net.bullfighter.fwjeg.avaritia.network.AvaritiaLpModVariables;
import net.bullfighter.fwjeg.avaritia.init.AvaritiaLpModItems;
import net.bullfighter.fwjeg.avaritia.init.AvaritiaLpModBlocks;

import java.util.function.Supplier;
import java.util.Map;

public class Nc2Procedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getTileData().getDouble(tag);
				return -1;
			}
		}.getValue(world,
				new BlockPos((int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorx,
						(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectory,
						(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorz),
				"process") != 0) {
			if ((new Object() {
				public String getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getTileData().getString(tag);
					return "";
				}
			}.getValue(world,
					new BlockPos((int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorx,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectory,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorz),
					"material")).equals("Gold")) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.GOLD_BLOCK);
					_setstack.setCount(1);
					((Slot) _slots.get(2)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if ((new Object() {
				public String getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getTileData().getString(tag);
					return "";
				}
			}.getValue(world,
					new BlockPos((int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorx,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectory,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorz),
					"material")).equals("Lapis")) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.LAPIS_BLOCK);
					_setstack.setCount(1);
					((Slot) _slots.get(2)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if ((new Object() {
				public String getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getTileData().getString(tag);
					return "";
				}
			}.getValue(world,
					new BlockPos((int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorx,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectory,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorz),
					"material")).equals("Redstone")) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.REDSTONE_BLOCK);
					_setstack.setCount(1);
					((Slot) _slots.get(2)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if ((new Object() {
				public String getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getTileData().getString(tag);
					return "";
				}
			}.getValue(world,
					new BlockPos((int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorx,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectory,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorz),
					"material")).equals("Quartz")) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.QUARTZ_BLOCK);
					_setstack.setCount(1);
					((Slot) _slots.get(2)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if ((new Object() {
				public String getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getTileData().getString(tag);
					return "";
				}
			}.getValue(world,
					new BlockPos((int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorx,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectory,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorz),
					"material")).equals("Diamond")) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.DIAMOND_BLOCK);
					_setstack.setCount(1);
					((Slot) _slots.get(2)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if ((new Object() {
				public String getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getTileData().getString(tag);
					return "";
				}
			}.getValue(world,
					new BlockPos((int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorx,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectory,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorz),
					"material")).equals("Emerald")) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.EMERALD_BLOCK);
					_setstack.setCount(1);
					((Slot) _slots.get(2)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if ((new Object() {
				public String getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getTileData().getString(tag);
					return "";
				}
			}.getValue(world,
					new BlockPos((int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorx,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectory,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorz),
					"material")).equals("Iron")) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.IRON_BLOCK);
					_setstack.setCount(1);
					((Slot) _slots.get(2)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if ((new Object() {
				public String getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getTileData().getString(tag);
					return "";
				}
			}.getValue(world,
					new BlockPos((int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorx,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectory,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorz),
					"material")).equals("Tin")) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(AvaritiaLpModBlocks.TIN_BLOCK);
					_setstack.setCount(1);
					((Slot) _slots.get(2)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if ((new Object() {
				public String getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getTileData().getString(tag);
					return "";
				}
			}.getValue(world,
					new BlockPos((int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorx,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectory,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorz),
					"material")).equals("Netherite")) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.NETHERITE_BLOCK);
					_setstack.setCount(1);
					((Slot) _slots.get(2)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if ((new Object() {
				public String getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getTileData().getString(tag);
					return "";
				}
			}.getValue(world,
					new BlockPos((int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorx,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectory,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorz),
					"material")).equals("Amethyst")) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.AMETHYST_BLOCK);
					_setstack.setCount(1);
					((Slot) _slots.get(2)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if ((new Object() {
				public String getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getTileData().getString(tag);
					return "";
				}
			}.getValue(world,
					new BlockPos((int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorx,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectory,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorz),
					"material")).equals("Copper")) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(Blocks.COPPER_BLOCK);
					_setstack.setCount(1);
					((Slot) _slots.get(2)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if ((new Object() {
				public String getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getTileData().getString(tag);
					return "";
				}
			}.getValue(world,
					new BlockPos((int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorx,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectory,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorz),
					"material")).equals("Lead")) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(AvaritiaLpModBlocks.LEAD_BLOCK);
					_setstack.setCount(1);
					((Slot) _slots.get(2)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if ((new Object() {
				public String getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getTileData().getString(tag);
					return "";
				}
			}.getValue(world,
					new BlockPos((int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorx,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectory,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorz),
					"material")).equals("Silver")) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(AvaritiaLpModBlocks.SILVER_BLOCK);
					_setstack.setCount(1);
					((Slot) _slots.get(2)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if ((new Object() {
				public String getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getTileData().getString(tag);
					return "";
				}
			}.getValue(world,
					new BlockPos((int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorx,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectory,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorz),
					"material")).equals("Nickel")) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(AvaritiaLpModBlocks.NICKEL_BLOCK);
					_setstack.setCount(1);
					((Slot) _slots.get(2)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if ((new Object() {
				public String getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getTileData().getString(tag);
					return "";
				}
			}.getValue(world,
					new BlockPos((int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorx,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectory,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorz),
					"material")).equals("Fluxed")) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(AvaritiaLpModBlocks.FLUXED_BLOCK);
					_setstack.setCount(1);
					((Slot) _slots.get(2)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if ((new Object() {
				public String getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getTileData().getString(tag);
					return "";
				}
			}.getValue(world,
					new BlockPos((int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorx,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectory,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorz),
					"material")).equals("Platinum")) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(AvaritiaLpModBlocks.PLATINUM_BLOCK);
					_setstack.setCount(1);
					((Slot) _slots.get(2)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if ((new Object() {
				public String getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getTileData().getString(tag);
					return "";
				}
			}.getValue(world,
					new BlockPos((int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorx,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectory,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorz),
					"material")).equals("Iridium")) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(AvaritiaLpModBlocks.IRIDIUM_BLOCK);
					_setstack.setCount(1);
					((Slot) _slots.get(2)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			}
		}
		if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getTileData().getDouble(tag);
				return -1;
			}
		}.getValue(world,
				new BlockPos((int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorx,
						(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectory,
						(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorz),
				"process") != 0) {
			if ((new Object() {
				public String getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getTileData().getString(tag);
					return "";
				}
			}.getValue(world,
					new BlockPos((int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorx,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectory,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorz),
					"material")).equals("Gold")) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(AvaritiaLpModItems.GOLDEN_SINGULARITY);
					_setstack.setCount(1);
					((Slot) _slots.get(3)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if ((new Object() {
				public String getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getTileData().getString(tag);
					return "";
				}
			}.getValue(world,
					new BlockPos((int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorx,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectory,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorz),
					"material")).equals("Lapis")) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(AvaritiaLpModItems.LAPIS_SINGULARITY);
					_setstack.setCount(1);
					((Slot) _slots.get(3)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if ((new Object() {
				public String getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getTileData().getString(tag);
					return "";
				}
			}.getValue(world,
					new BlockPos((int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorx,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectory,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorz),
					"material")).equals("Redstone")) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(AvaritiaLpModItems.REDSTONE_SINGULARITY);
					_setstack.setCount(1);
					((Slot) _slots.get(3)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if ((new Object() {
				public String getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getTileData().getString(tag);
					return "";
				}
			}.getValue(world,
					new BlockPos((int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorx,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectory,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorz),
					"material")).equals("Quartz")) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(AvaritiaLpModItems.NETHER_QUARTZ_SINGULARITY);
					_setstack.setCount(1);
					((Slot) _slots.get(3)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if ((new Object() {
				public String getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getTileData().getString(tag);
					return "";
				}
			}.getValue(world,
					new BlockPos((int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorx,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectory,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorz),
					"material")).equals("Diamond")) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(AvaritiaLpModItems.DIAMOND_SINGULARITY);
					_setstack.setCount(1);
					((Slot) _slots.get(3)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if ((new Object() {
				public String getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getTileData().getString(tag);
					return "";
				}
			}.getValue(world,
					new BlockPos((int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorx,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectory,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorz),
					"material")).equals("Emerald")) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(AvaritiaLpModItems.EMERALD_SINGULARITY);
					_setstack.setCount(1);
					((Slot) _slots.get(3)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if ((new Object() {
				public String getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getTileData().getString(tag);
					return "";
				}
			}.getValue(world,
					new BlockPos((int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorx,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectory,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorz),
					"material")).equals("Iron")) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(AvaritiaLpModItems.IRON_SINGULARITY);
					_setstack.setCount(1);
					((Slot) _slots.get(3)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if ((new Object() {
				public String getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getTileData().getString(tag);
					return "";
				}
			}.getValue(world,
					new BlockPos((int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorx,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectory,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorz),
					"material")).equals("Tin")) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(AvaritiaLpModItems.TIN_SINGULARITY);
					_setstack.setCount(1);
					((Slot) _slots.get(3)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if ((new Object() {
				public String getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getTileData().getString(tag);
					return "";
				}
			}.getValue(world,
					new BlockPos((int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorx,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectory,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorz),
					"material")).equals("Netherite")) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(AvaritiaLpModItems.SINGULARITYXJHJ);
					_setstack.setCount(1);
					((Slot) _slots.get(3)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if ((new Object() {
				public String getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getTileData().getString(tag);
					return "";
				}
			}.getValue(world,
					new BlockPos((int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorx,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectory,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorz),
					"material")).equals("Amethyst")) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(AvaritiaLpModItems.SINGULARITYZSJ);
					_setstack.setCount(1);
					((Slot) _slots.get(3)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if ((new Object() {
				public String getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getTileData().getString(tag);
					return "";
				}
			}.getValue(world,
					new BlockPos((int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorx,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectory,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorz),
					"material")).equals("Copper")) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(AvaritiaLpModItems.COPPER_SINGULARITY);
					_setstack.setCount(1);
					((Slot) _slots.get(3)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if ((new Object() {
				public String getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getTileData().getString(tag);
					return "";
				}
			}.getValue(world,
					new BlockPos((int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorx,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectory,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorz),
					"material")).equals("Lead")) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(AvaritiaLpModItems.LEAD_SINGULARITY);
					_setstack.setCount(1);
					((Slot) _slots.get(3)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if ((new Object() {
				public String getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getTileData().getString(tag);
					return "";
				}
			}.getValue(world,
					new BlockPos((int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorx,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectory,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorz),
					"material")).equals("Silver")) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(AvaritiaLpModItems.SILVER_SINGULARITY);
					_setstack.setCount(1);
					((Slot) _slots.get(3)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if ((new Object() {
				public String getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getTileData().getString(tag);
					return "";
				}
			}.getValue(world,
					new BlockPos((int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorx,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectory,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorz),
					"material")).equals("Nickel")) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(AvaritiaLpModItems.NICKEL_SINGULARITY);
					_setstack.setCount(1);
					((Slot) _slots.get(3)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if ((new Object() {
				public String getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getTileData().getString(tag);
					return "";
				}
			}.getValue(world,
					new BlockPos((int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorx,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectory,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorz),
					"material")).equals("Fluxed")) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(AvaritiaLpModItems.FLUXED_SINGULARITY);
					_setstack.setCount(1);
					((Slot) _slots.get(3)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if ((new Object() {
				public String getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getTileData().getString(tag);
					return "";
				}
			}.getValue(world,
					new BlockPos((int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorx,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectory,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorz),
					"material")).equals("Platinum")) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(AvaritiaLpModItems.PLATINUM_SINGULARITY);
					_setstack.setCount(1);
					((Slot) _slots.get(3)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			} else if ((new Object() {
				public String getValue(LevelAccessor world, BlockPos pos, String tag) {
					BlockEntity blockEntity = world.getBlockEntity(pos);
					if (blockEntity != null)
						return blockEntity.getTileData().getString(tag);
					return "";
				}
			}.getValue(world,
					new BlockPos((int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorx,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectory,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorz),
					"material")).equals("Iridium")) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(AvaritiaLpModItems.IRIDIUM_SINGULARITY);
					_setstack.setCount(1);
					((Slot) _slots.get(3)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			}
		}
	}
}
