package net.bullfighter.fwjeg.avaritia.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.core.BlockPos;

import net.bullfighter.fwjeg.avaritia.network.AvaritiaLpModVariables;
import net.bullfighter.fwjeg.avaritia.init.AvaritiaLpModItems;
import net.bullfighter.fwjeg.avaritia.init.AvaritiaLpModGameRules;
import net.bullfighter.fwjeg.avaritia.init.AvaritiaLpModBlocks;

import java.util.function.Supplier;
import java.util.Map;

public class NeutroniumCompressorGuiTickProcedure {
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
				"process") >= (world.getLevelData().getGameRules().getInt(AvaritiaLpModGameRules.NEUTRONIUMCOMPRESSORAMOUNT))) {
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
					_setstack.setCount((int) (new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get() instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(1) + 1));
					((Slot) _slots.get(1)).set(_setstack);
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
					_setstack.setCount((int) (new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get() instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(1) + 1));
					((Slot) _slots.get(1)).set(_setstack);
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
					_setstack.setCount((int) (new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get() instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(1) + 1));
					((Slot) _slots.get(1)).set(_setstack);
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
					_setstack.setCount((int) (new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get() instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(1) + 1));
					((Slot) _slots.get(1)).set(_setstack);
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
					_setstack.setCount((int) (new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get() instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(1) + 1));
					((Slot) _slots.get(1)).set(_setstack);
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
					_setstack.setCount((int) (new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get() instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(1) + 1));
					((Slot) _slots.get(1)).set(_setstack);
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
					_setstack.setCount((int) (new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get() instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(1) + 1));
					((Slot) _slots.get(1)).set(_setstack);
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
					_setstack.setCount((int) (new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get() instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(1) + 1));
					((Slot) _slots.get(1)).set(_setstack);
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
					_setstack.setCount((int) (new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get() instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(1) + 1));
					((Slot) _slots.get(1)).set(_setstack);
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
					_setstack.setCount((int) (new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get() instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(1) + 1));
					((Slot) _slots.get(1)).set(_setstack);
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
					_setstack.setCount((int) (new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get() instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(1) + 1));
					((Slot) _slots.get(1)).set(_setstack);
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
					_setstack.setCount((int) (new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get() instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(1) + 1));
					((Slot) _slots.get(1)).set(_setstack);
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
					_setstack.setCount((int) (new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get() instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(1) + 1));
					((Slot) _slots.get(1)).set(_setstack);
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
					_setstack.setCount((int) (new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get() instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(1) + 1));
					((Slot) _slots.get(1)).set(_setstack);
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
					_setstack.setCount((int) (new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get() instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(1) + 1));
					((Slot) _slots.get(1)).set(_setstack);
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
					_setstack.setCount((int) (new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get() instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(1) + 1));
					((Slot) _slots.get(1)).set(_setstack);
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
					_setstack.setCount((int) (new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get() instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(1) + 1));
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			}
			if (!world.isClientSide()) {
				BlockPos _bp = new BlockPos((int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorx,
						(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectory,
						(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorz);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getTileData().putDouble("process", ((new Object() {
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
							"process")) - (world.getLevelData().getGameRules().getInt(AvaritiaLpModGameRules.NEUTRONIUMCOMPRESSORAMOUNT))));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
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
					"process") == 0) {
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos((int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorx,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectory,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorz);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getTileData().putString("material", "");
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			}
		}
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
				"material")).equals("Iron") || true) {
			if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
					&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == Blocks.IRON_BLOCK.asItem()) {
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos((int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorx,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectory,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorz);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getTileData().putString("material", "Iron");
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos((int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorx,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectory,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorz);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getTileData().putDouble("process", (new Object() {
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
								"process") + new Object() {
									public int getAmount(int sltid) {
										if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
												&& _current.get() instanceof Map _slots) {
											ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
											if (stack != null)
												return stack.getCount();
										}
										return 0;
									}
								}.getAmount(0)));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					((Slot) _slots.get(0)).remove(new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get() instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(0));
					_player.containerMenu.broadcastChanges();
				}
			}
		}
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
				"material")).equals("Quartz") || true) {
			if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
					&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
					.getItem() == Blocks.SMOOTH_QUARTZ.asItem()) {
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos((int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorx,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectory,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorz);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getTileData().putString("material", "Quartz");
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos((int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorx,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectory,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorz);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getTileData().putDouble("process", (new Object() {
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
								"process") + new Object() {
									public int getAmount(int sltid) {
										if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
												&& _current.get() instanceof Map _slots) {
											ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
											if (stack != null)
												return stack.getCount();
										}
										return 0;
									}
								}.getAmount(0)));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					((Slot) _slots.get(0)).remove(new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get() instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(0));
					_player.containerMenu.broadcastChanges();
				}
			}
		}
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
				"material")).equals("Emerald") || true) {
			if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
					&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
					.getItem() == Blocks.EMERALD_BLOCK.asItem()) {
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos((int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorx,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectory,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorz);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getTileData().putString("material", "Emerald");
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos((int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorx,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectory,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorz);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getTileData().putDouble("process", (new Object() {
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
								"process") + new Object() {
									public int getAmount(int sltid) {
										if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
												&& _current.get() instanceof Map _slots) {
											ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
											if (stack != null)
												return stack.getCount();
										}
										return 0;
									}
								}.getAmount(0)));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					((Slot) _slots.get(0)).remove(new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get() instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(0));
					_player.containerMenu.broadcastChanges();
				}
			}
		}
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
				"material")).equals("Lapis") || true) {
			if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
					&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == Blocks.LAPIS_BLOCK.asItem()) {
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos((int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorx,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectory,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorz);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getTileData().putString("material", "Lapis");
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos((int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorx,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectory,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorz);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getTileData().putDouble("process", (new Object() {
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
								"process") + new Object() {
									public int getAmount(int sltid) {
										if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
												&& _current.get() instanceof Map _slots) {
											ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
											if (stack != null)
												return stack.getCount();
										}
										return 0;
									}
								}.getAmount(0)));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					((Slot) _slots.get(0)).remove(new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get() instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(0));
					_player.containerMenu.broadcastChanges();
				}
			}
		}
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
				"material")).equals("Redstone") || true) {
			if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
					&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
					.getItem() == Blocks.REDSTONE_BLOCK.asItem()) {
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos((int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorx,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectory,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorz);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getTileData().putString("material", "Redstone");
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos((int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorx,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectory,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorz);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getTileData().putDouble("process", (new Object() {
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
								"process") + new Object() {
									public int getAmount(int sltid) {
										if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
												&& _current.get() instanceof Map _slots) {
											ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
											if (stack != null)
												return stack.getCount();
										}
										return 0;
									}
								}.getAmount(0)));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					((Slot) _slots.get(0)).remove(new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get() instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(0));
					_player.containerMenu.broadcastChanges();
				}
			}
		}
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
				"material")).equals("Gold") || true) {
			if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
					&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY).getItem() == Blocks.GOLD_BLOCK.asItem()) {
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos((int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorx,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectory,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorz);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getTileData().putString("material", "Gold");
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos((int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorx,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectory,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorz);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getTileData().putDouble("process", (new Object() {
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
								"process") + new Object() {
									public int getAmount(int sltid) {
										if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
												&& _current.get() instanceof Map _slots) {
											ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
											if (stack != null)
												return stack.getCount();
										}
										return 0;
									}
								}.getAmount(0)));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					((Slot) _slots.get(0)).remove(new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get() instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(0));
					_player.containerMenu.broadcastChanges();
				}
			}
		}
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
				"material")).equals("Diamond") || true) {
			if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
					&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
					.getItem() == Blocks.DIAMOND_BLOCK.asItem()) {
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos((int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorx,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectory,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorz);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getTileData().putString("material", "Diamond");
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos((int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorx,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectory,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorz);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getTileData().putDouble("process", (new Object() {
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
								"process") + new Object() {
									public int getAmount(int sltid) {
										if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
												&& _current.get() instanceof Map _slots) {
											ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
											if (stack != null)
												return stack.getCount();
										}
										return 0;
									}
								}.getAmount(0)));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					((Slot) _slots.get(0)).remove(new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get() instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(0));
					_player.containerMenu.broadcastChanges();
				}
			}
		}
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
				"material")).equals("Tin") || true) {
			if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
					&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
					.getItem() == AvaritiaLpModBlocks.TIN_BLOCK.asItem()) {
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos((int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorx,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectory,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorz);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getTileData().putString("material", "Tin");
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos((int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorx,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectory,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorz);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getTileData().putDouble("process", (new Object() {
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
								"process") + new Object() {
									public int getAmount(int sltid) {
										if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
												&& _current.get() instanceof Map _slots) {
											ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
											if (stack != null)
												return stack.getCount();
										}
										return 0;
									}
								}.getAmount(0)));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					((Slot) _slots.get(0)).remove(new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get() instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(0));
					_player.containerMenu.broadcastChanges();
				}
			}
		}
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
				"material")).equals("Copper") || true) {
			if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
					&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
					.getItem() == Blocks.COPPER_BLOCK.asItem()) {
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos((int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorx,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectory,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorz);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getTileData().putString("material", "Copper");
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos((int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorx,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectory,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorz);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getTileData().putDouble("process", (new Object() {
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
								"process") + new Object() {
									public int getAmount(int sltid) {
										if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
												&& _current.get() instanceof Map _slots) {
											ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
											if (stack != null)
												return stack.getCount();
										}
										return 0;
									}
								}.getAmount(0)));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					((Slot) _slots.get(0)).remove(new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get() instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(0));
					_player.containerMenu.broadcastChanges();
				}
			}
		}
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
				"material")).equals("Netherite") || true) {
			if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
					&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
					.getItem() == Blocks.NETHERITE_BLOCK.asItem()) {
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos((int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorx,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectory,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorz);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getTileData().putString("material", "Netherite");
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos((int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorx,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectory,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorz);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getTileData().putDouble("process", (new Object() {
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
								"process") + new Object() {
									public int getAmount(int sltid) {
										if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
												&& _current.get() instanceof Map _slots) {
											ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
											if (stack != null)
												return stack.getCount();
										}
										return 0;
									}
								}.getAmount(0)));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					((Slot) _slots.get(0)).remove(new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get() instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(0));
					_player.containerMenu.broadcastChanges();
				}
			}
		}
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
				"material")).equals("Amethyst") || true) {
			if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
					&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
					.getItem() == Blocks.AMETHYST_BLOCK.asItem()) {
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos((int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorx,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectory,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorz);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getTileData().putString("material", "Amethyst");
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos((int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorx,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectory,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorz);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getTileData().putDouble("process", (new Object() {
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
								"process") + new Object() {
									public int getAmount(int sltid) {
										if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
												&& _current.get() instanceof Map _slots) {
											ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
											if (stack != null)
												return stack.getCount();
										}
										return 0;
									}
								}.getAmount(0)));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					((Slot) _slots.get(0)).remove(new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get() instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(0));
					_player.containerMenu.broadcastChanges();
				}
			}
		}
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
				"material")).equals("Lead") || true) {
			if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
					&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
					.getItem() == AvaritiaLpModBlocks.LEAD_BLOCK.asItem()) {
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos((int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorx,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectory,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorz);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getTileData().putString("material", "Lead");
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos((int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorx,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectory,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorz);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getTileData().putDouble("process", (new Object() {
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
								"process") + new Object() {
									public int getAmount(int sltid) {
										if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
												&& _current.get() instanceof Map _slots) {
											ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
											if (stack != null)
												return stack.getCount();
										}
										return 0;
									}
								}.getAmount(0)));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					((Slot) _slots.get(0)).remove(new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get() instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(0));
					_player.containerMenu.broadcastChanges();
				}
			}
		}
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
				"material")).equals("Silver") || true) {
			if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
					&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
					.getItem() == AvaritiaLpModBlocks.SILVER_BLOCK.asItem()) {
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos((int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorx,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectory,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorz);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getTileData().putString("material", "Silver");
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos((int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorx,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectory,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorz);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getTileData().putDouble("process", (new Object() {
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
								"process") + new Object() {
									public int getAmount(int sltid) {
										if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
												&& _current.get() instanceof Map _slots) {
											ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
											if (stack != null)
												return stack.getCount();
										}
										return 0;
									}
								}.getAmount(0)));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					((Slot) _slots.get(0)).remove(new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get() instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(0));
					_player.containerMenu.broadcastChanges();
				}
			}
		}
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
				"material")).equals("Nickel") || true) {
			if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
					&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
					.getItem() == AvaritiaLpModBlocks.NICKEL_BLOCK.asItem()) {
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos((int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorx,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectory,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorz);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getTileData().putString("material", "Nickel");
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos((int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorx,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectory,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorz);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getTileData().putDouble("process", (new Object() {
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
								"process") + new Object() {
									public int getAmount(int sltid) {
										if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
												&& _current.get() instanceof Map _slots) {
											ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
											if (stack != null)
												return stack.getCount();
										}
										return 0;
									}
								}.getAmount(0)));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					((Slot) _slots.get(0)).remove(new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get() instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(0));
					_player.containerMenu.broadcastChanges();
				}
			}
		}
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
				"material")).equals("Fluxed") || true) {
			if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
					&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
					.getItem() == AvaritiaLpModBlocks.FLUXED_BLOCK.asItem()) {
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos((int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorx,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectory,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorz);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getTileData().putString("material", "Fluxed");
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos((int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorx,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectory,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorz);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getTileData().putDouble("process", (new Object() {
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
								"process") + new Object() {
									public int getAmount(int sltid) {
										if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
												&& _current.get() instanceof Map _slots) {
											ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
											if (stack != null)
												return stack.getCount();
										}
										return 0;
									}
								}.getAmount(0)));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					((Slot) _slots.get(0)).remove(new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get() instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(0));
					_player.containerMenu.broadcastChanges();
				}
			}
		}
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
				"material")).equals("Platinum") || true) {
			if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
					&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
					.getItem() == AvaritiaLpModBlocks.PLATINUM_BLOCK.asItem()) {
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos((int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorx,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectory,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorz);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getTileData().putString("material", "Platinum");
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos((int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorx,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectory,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorz);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getTileData().putDouble("process", (new Object() {
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
								"process") + new Object() {
									public int getAmount(int sltid) {
										if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
												&& _current.get() instanceof Map _slots) {
											ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
											if (stack != null)
												return stack.getCount();
										}
										return 0;
									}
								}.getAmount(0)));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					((Slot) _slots.get(0)).remove(new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get() instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(0));
					_player.containerMenu.broadcastChanges();
				}
			}
		}
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
				"material")).equals("Iridium") || true) {
			if ((entity instanceof ServerPlayer _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr
					&& _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
					.getItem() == AvaritiaLpModBlocks.IRIDIUM_BLOCK.asItem()) {
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos((int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorx,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectory,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorz);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getTileData().putString("material", "Iridium");
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (!world.isClientSide()) {
					BlockPos _bp = new BlockPos((int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorx,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectory,
							(int) AvaritiaLpModVariables.MapVariables.get(world).neutroniumcollectorz);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getTileData().putDouble("process", (new Object() {
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
								"process") + new Object() {
									public int getAmount(int sltid) {
										if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
												&& _current.get() instanceof Map _slots) {
											ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
											if (stack != null)
												return stack.getCount();
										}
										return 0;
									}
								}.getAmount(0)));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					((Slot) _slots.get(0)).remove(new Object() {
						public int getAmount(int sltid) {
							if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
									&& _current.get() instanceof Map _slots) {
								ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(0));
					_player.containerMenu.broadcastChanges();
				}
			}
		}
	}
}
