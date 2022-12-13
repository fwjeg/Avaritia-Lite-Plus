package net.bullfighter.fwjeg.avaritia.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.core.BlockPos;

import net.bullfighter.fwjeg.avaritia.network.AvaritiaLpModVariables;
import net.bullfighter.fwjeg.avaritia.init.AvaritiaLpModBlocks;

import java.util.function.Supplier;
import java.util.Map;

public class QuadNeutroncollectorTickProcedure {
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
				"process") >= 100) {
			if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
					&& _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(AvaritiaLpModBlocks.NEUTRONIUM_BLOCK);
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
				}.getAmount(0) + 1));
				((Slot) _slots.get(0)).set(_setstack);
				_player.containerMenu.broadcastChanges();
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
							"process")) - 100));
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		}
	}
}
