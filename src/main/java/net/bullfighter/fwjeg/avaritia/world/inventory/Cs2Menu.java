
package net.bullfighter.fwjeg.avaritia.world.inventory;

import net.minecraftforge.items.SlotItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.CapabilityItemHandler;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.bullfighter.fwjeg.avaritia.init.AvaritiaLpModMenus;

import java.util.function.Supplier;
import java.util.Map;
import java.util.HashMap;

public class Cs2Menu extends AbstractContainerMenu implements Supplier<Map<Integer, Slot>> {
	public final static HashMap<String, Object> guistate = new HashMap<>();
	public final Level world;
	public final Player entity;
	public int x, y, z;
	private IItemHandler internal;
	private final Map<Integer, Slot> customSlots = new HashMap<>();
	private boolean bound = false;

	public Cs2Menu(int id, Inventory inv, FriendlyByteBuf extraData) {
		super(AvaritiaLpModMenus.CS_2, id);
		this.entity = inv.player;
		this.world = inv.player.level;
		this.internal = new ItemStackHandler(82);
		BlockPos pos = null;
		if (extraData != null) {
			pos = extraData.readBlockPos();
			this.x = pos.getX();
			this.y = pos.getY();
			this.z = pos.getZ();
		}
		if (pos != null) {
			if (extraData.readableBytes() == 1) { // bound to item
				byte hand = extraData.readByte();
				ItemStack itemstack;
				if (hand == 0)
					itemstack = this.entity.getMainHandItem();
				else
					itemstack = this.entity.getOffhandItem();
				itemstack.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
					this.internal = capability;
					this.bound = true;
				});
			} else if (extraData.readableBytes() > 1) {
				extraData.readByte(); // drop padding
				Entity entity = world.getEntity(extraData.readVarInt());
				if (entity != null)
					entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						this.internal = capability;
						this.bound = true;
					});
			} else { // might be bound to block
				BlockEntity ent = inv.player != null ? inv.player.level.getBlockEntity(pos) : null;
				if (ent != null) {
					ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						this.internal = capability;
						this.bound = true;
					});
				}
			}
		}
		this.customSlots.put(0, this.addSlot(new SlotItemHandler(internal, 0, 6, 5) {
		}));
		this.customSlots.put(1, this.addSlot(new SlotItemHandler(internal, 1, 24, 5) {
		}));
		this.customSlots.put(2, this.addSlot(new SlotItemHandler(internal, 2, 42, 5) {
		}));
		this.customSlots.put(3, this.addSlot(new SlotItemHandler(internal, 3, 60, 5) {
		}));
		this.customSlots.put(4, this.addSlot(new SlotItemHandler(internal, 4, 78, 5) {
		}));
		this.customSlots.put(5, this.addSlot(new SlotItemHandler(internal, 5, 96, 5) {
		}));
		this.customSlots.put(6, this.addSlot(new SlotItemHandler(internal, 6, 114, 5) {
		}));
		this.customSlots.put(7, this.addSlot(new SlotItemHandler(internal, 7, 132, 5) {
		}));
		this.customSlots.put(8, this.addSlot(new SlotItemHandler(internal, 8, 150, 5) {
		}));
		this.customSlots.put(9, this.addSlot(new SlotItemHandler(internal, 9, 6, 23) {
		}));
		this.customSlots.put(10, this.addSlot(new SlotItemHandler(internal, 10, 24, 23) {
		}));
		this.customSlots.put(11, this.addSlot(new SlotItemHandler(internal, 11, 42, 23) {
		}));
		this.customSlots.put(12, this.addSlot(new SlotItemHandler(internal, 12, 60, 23) {
		}));
		this.customSlots.put(13, this.addSlot(new SlotItemHandler(internal, 13, 78, 23) {
		}));
		this.customSlots.put(14, this.addSlot(new SlotItemHandler(internal, 14, 96, 23) {
		}));
		this.customSlots.put(15, this.addSlot(new SlotItemHandler(internal, 15, 114, 23) {
		}));
		this.customSlots.put(16, this.addSlot(new SlotItemHandler(internal, 16, 132, 23) {
		}));
		this.customSlots.put(17, this.addSlot(new SlotItemHandler(internal, 17, 150, 23) {
		}));
		this.customSlots.put(18, this.addSlot(new SlotItemHandler(internal, 18, 6, 41) {
		}));
		this.customSlots.put(19, this.addSlot(new SlotItemHandler(internal, 19, 24, 41) {
		}));
		this.customSlots.put(20, this.addSlot(new SlotItemHandler(internal, 20, 42, 41) {
		}));
		this.customSlots.put(21, this.addSlot(new SlotItemHandler(internal, 21, 60, 41) {
		}));
		this.customSlots.put(22, this.addSlot(new SlotItemHandler(internal, 22, 78, 41) {
		}));
		this.customSlots.put(23, this.addSlot(new SlotItemHandler(internal, 23, 96, 41) {
		}));
		this.customSlots.put(24, this.addSlot(new SlotItemHandler(internal, 24, 114, 41) {
		}));
		this.customSlots.put(25, this.addSlot(new SlotItemHandler(internal, 25, 132, 41) {
		}));
		this.customSlots.put(26, this.addSlot(new SlotItemHandler(internal, 26, 150, 41) {
		}));
		this.customSlots.put(27, this.addSlot(new SlotItemHandler(internal, 27, 6, 59) {
		}));
		this.customSlots.put(28, this.addSlot(new SlotItemHandler(internal, 28, 24, 59) {
		}));
		this.customSlots.put(29, this.addSlot(new SlotItemHandler(internal, 29, 42, 59) {
		}));
		this.customSlots.put(30, this.addSlot(new SlotItemHandler(internal, 30, 60, 59) {
		}));
		this.customSlots.put(31, this.addSlot(new SlotItemHandler(internal, 31, 78, 59) {
		}));
		this.customSlots.put(32, this.addSlot(new SlotItemHandler(internal, 32, 96, 59) {
		}));
		this.customSlots.put(33, this.addSlot(new SlotItemHandler(internal, 33, 114, 59) {
		}));
		this.customSlots.put(34, this.addSlot(new SlotItemHandler(internal, 34, 132, 59) {
		}));
		this.customSlots.put(35, this.addSlot(new SlotItemHandler(internal, 35, 150, 59) {
		}));
		this.customSlots.put(36, this.addSlot(new SlotItemHandler(internal, 36, 6, 77) {
		}));
		this.customSlots.put(37, this.addSlot(new SlotItemHandler(internal, 37, 24, 77) {
		}));
		this.customSlots.put(38, this.addSlot(new SlotItemHandler(internal, 38, 42, 77) {
		}));
		this.customSlots.put(39, this.addSlot(new SlotItemHandler(internal, 39, 60, 77) {
		}));
		this.customSlots.put(40, this.addSlot(new SlotItemHandler(internal, 40, 78, 77) {
		}));
		this.customSlots.put(41, this.addSlot(new SlotItemHandler(internal, 41, 96, 77) {
		}));
		this.customSlots.put(42, this.addSlot(new SlotItemHandler(internal, 42, 114, 77) {
		}));
		this.customSlots.put(43, this.addSlot(new SlotItemHandler(internal, 43, 132, 77) {
		}));
		this.customSlots.put(44, this.addSlot(new SlotItemHandler(internal, 44, 150, 77) {
		}));
		this.customSlots.put(45, this.addSlot(new SlotItemHandler(internal, 45, 6, 95) {
		}));
		this.customSlots.put(46, this.addSlot(new SlotItemHandler(internal, 46, 24, 95) {
		}));
		this.customSlots.put(47, this.addSlot(new SlotItemHandler(internal, 47, 42, 95) {
		}));
		this.customSlots.put(48, this.addSlot(new SlotItemHandler(internal, 48, 60, 95) {
		}));
		this.customSlots.put(49, this.addSlot(new SlotItemHandler(internal, 49, 78, 95) {
		}));
		this.customSlots.put(50, this.addSlot(new SlotItemHandler(internal, 50, 96, 95) {
		}));
		this.customSlots.put(51, this.addSlot(new SlotItemHandler(internal, 51, 114, 95) {
		}));
		this.customSlots.put(52, this.addSlot(new SlotItemHandler(internal, 52, 132, 95) {
		}));
		this.customSlots.put(53, this.addSlot(new SlotItemHandler(internal, 53, 150, 95) {
		}));
		this.customSlots.put(54, this.addSlot(new SlotItemHandler(internal, 54, 6, 113) {
		}));
		this.customSlots.put(55, this.addSlot(new SlotItemHandler(internal, 55, 24, 113) {
		}));
		this.customSlots.put(56, this.addSlot(new SlotItemHandler(internal, 56, 42, 113) {
		}));
		this.customSlots.put(57, this.addSlot(new SlotItemHandler(internal, 57, 60, 113) {
		}));
		this.customSlots.put(58, this.addSlot(new SlotItemHandler(internal, 58, 78, 113) {
		}));
		this.customSlots.put(59, this.addSlot(new SlotItemHandler(internal, 59, 96, 113) {
		}));
		this.customSlots.put(60, this.addSlot(new SlotItemHandler(internal, 60, 114, 113) {
		}));
		this.customSlots.put(61, this.addSlot(new SlotItemHandler(internal, 61, 132, 113) {
		}));
		this.customSlots.put(62, this.addSlot(new SlotItemHandler(internal, 62, 150, 113) {
		}));
		this.customSlots.put(63, this.addSlot(new SlotItemHandler(internal, 63, 6, 131) {
		}));
		this.customSlots.put(64, this.addSlot(new SlotItemHandler(internal, 64, 24, 131) {
		}));
		this.customSlots.put(65, this.addSlot(new SlotItemHandler(internal, 65, 42, 131) {
		}));
		this.customSlots.put(66, this.addSlot(new SlotItemHandler(internal, 66, 60, 131) {
		}));
		this.customSlots.put(67, this.addSlot(new SlotItemHandler(internal, 67, 78, 149) {
		}));
		this.customSlots.put(68, this.addSlot(new SlotItemHandler(internal, 68, 96, 131) {
		}));
		this.customSlots.put(69, this.addSlot(new SlotItemHandler(internal, 69, 114, 131) {
		}));
		this.customSlots.put(70, this.addSlot(new SlotItemHandler(internal, 70, 132, 131) {
		}));
		this.customSlots.put(71, this.addSlot(new SlotItemHandler(internal, 71, 150, 131) {
		}));
		this.customSlots.put(72, this.addSlot(new SlotItemHandler(internal, 72, 6, 149) {
		}));
		this.customSlots.put(73, this.addSlot(new SlotItemHandler(internal, 73, 24, 149) {
		}));
		this.customSlots.put(74, this.addSlot(new SlotItemHandler(internal, 74, 42, 149) {
		}));
		this.customSlots.put(75, this.addSlot(new SlotItemHandler(internal, 75, 60, 149) {
		}));
		this.customSlots.put(76, this.addSlot(new SlotItemHandler(internal, 76, 78, 131) {
		}));
		this.customSlots.put(77, this.addSlot(new SlotItemHandler(internal, 77, 96, 149) {
		}));
		this.customSlots.put(78, this.addSlot(new SlotItemHandler(internal, 78, 114, 149) {
		}));
		this.customSlots.put(79, this.addSlot(new SlotItemHandler(internal, 79, 132, 149) {
		}));
		this.customSlots.put(80, this.addSlot(new SlotItemHandler(internal, 80, 150, 149) {
		}));
		this.customSlots.put(81, this.addSlot(new SlotItemHandler(internal, 81, 202, 70) {
			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		for (int si = 0; si < 3; ++si)
			for (int sj = 0; sj < 9; ++sj)
				this.addSlot(new Slot(inv, sj + (si + 1) * 9, 33 + 8 + sj * 18, 84 + 84 + si * 18));
		for (int si = 0; si < 9; ++si)
			this.addSlot(new Slot(inv, si, 33 + 8 + si * 18, 84 + 142));
	}

	@Override
	public boolean stillValid(Player player) {
		return true;
	}

	@Override
	public ItemStack quickMoveStack(Player playerIn, int index) {
		ItemStack itemstack = ItemStack.EMPTY;
		Slot slot = (Slot) this.slots.get(index);
		if (slot != null && slot.hasItem()) {
			ItemStack itemstack1 = slot.getItem();
			itemstack = itemstack1.copy();
			if (index < 82) {
				if (!this.moveItemStackTo(itemstack1, 82, this.slots.size(), true)) {
					return ItemStack.EMPTY;
				}
				slot.onQuickCraft(itemstack1, itemstack);
			} else if (!this.moveItemStackTo(itemstack1, 0, 82, false)) {
				if (index < 82 + 27) {
					if (!this.moveItemStackTo(itemstack1, 82 + 27, this.slots.size(), true)) {
						return ItemStack.EMPTY;
					}
				} else {
					if (!this.moveItemStackTo(itemstack1, 82, 82 + 27, false)) {
						return ItemStack.EMPTY;
					}
				}
				return ItemStack.EMPTY;
			}
			if (itemstack1.getCount() == 0) {
				slot.set(ItemStack.EMPTY);
			} else {
				slot.setChanged();
			}
			if (itemstack1.getCount() == itemstack.getCount()) {
				return ItemStack.EMPTY;
			}
			slot.onTake(playerIn, itemstack1);
		}
		return itemstack;
	}

	@Override
	protected boolean moveItemStackTo(ItemStack p_38904_, int p_38905_, int p_38906_, boolean p_38907_) {
		boolean flag = false;
		int i = p_38905_;
		if (p_38907_) {
			i = p_38906_ - 1;
		}
		if (p_38904_.isStackable()) {
			while (!p_38904_.isEmpty()) {
				if (p_38907_) {
					if (i < p_38905_) {
						break;
					}
				} else if (i >= p_38906_) {
					break;
				}
				Slot slot = this.slots.get(i);
				ItemStack itemstack = slot.getItem();
				if (slot.mayPlace(itemstack) && !itemstack.isEmpty() && ItemStack.isSameItemSameTags(p_38904_, itemstack)) {
					int j = itemstack.getCount() + p_38904_.getCount();
					int maxSize = Math.min(slot.getMaxStackSize(), p_38904_.getMaxStackSize());
					if (j <= maxSize) {
						p_38904_.setCount(0);
						itemstack.setCount(j);
						slot.set(itemstack);
						flag = true;
					} else if (itemstack.getCount() < maxSize) {
						p_38904_.shrink(maxSize - itemstack.getCount());
						itemstack.setCount(maxSize);
						slot.set(itemstack);
						flag = true;
					}
				}
				if (p_38907_) {
					--i;
				} else {
					++i;
				}
			}
		}
		if (!p_38904_.isEmpty()) {
			if (p_38907_) {
				i = p_38906_ - 1;
			} else {
				i = p_38905_;
			}
			while (true) {
				if (p_38907_) {
					if (i < p_38905_) {
						break;
					}
				} else if (i >= p_38906_) {
					break;
				}
				Slot slot1 = this.slots.get(i);
				ItemStack itemstack1 = slot1.getItem();
				if (itemstack1.isEmpty() && slot1.mayPlace(p_38904_)) {
					if (p_38904_.getCount() > slot1.getMaxStackSize()) {
						slot1.set(p_38904_.split(slot1.getMaxStackSize()));
					} else {
						slot1.set(p_38904_.split(p_38904_.getCount()));
					}
					slot1.setChanged();
					flag = true;
					break;
				}
				if (p_38907_) {
					--i;
				} else {
					++i;
				}
			}
		}
		return flag;
	}

	@Override
	public void removed(Player playerIn) {
		super.removed(playerIn);
		if (!bound && playerIn instanceof ServerPlayer serverPlayer) {
			if (!serverPlayer.isAlive() || serverPlayer.hasDisconnected()) {
				for (int j = 0; j < internal.getSlots(); ++j) {
					if (j == 0)
						continue;
					if (j == 1)
						continue;
					if (j == 2)
						continue;
					if (j == 3)
						continue;
					if (j == 4)
						continue;
					if (j == 5)
						continue;
					if (j == 6)
						continue;
					if (j == 7)
						continue;
					if (j == 8)
						continue;
					if (j == 9)
						continue;
					if (j == 10)
						continue;
					if (j == 11)
						continue;
					if (j == 12)
						continue;
					if (j == 13)
						continue;
					if (j == 14)
						continue;
					if (j == 15)
						continue;
					if (j == 16)
						continue;
					if (j == 17)
						continue;
					if (j == 18)
						continue;
					if (j == 19)
						continue;
					if (j == 20)
						continue;
					if (j == 21)
						continue;
					if (j == 22)
						continue;
					if (j == 23)
						continue;
					if (j == 24)
						continue;
					if (j == 25)
						continue;
					if (j == 26)
						continue;
					if (j == 27)
						continue;
					if (j == 28)
						continue;
					if (j == 29)
						continue;
					if (j == 30)
						continue;
					if (j == 31)
						continue;
					if (j == 32)
						continue;
					if (j == 33)
						continue;
					if (j == 34)
						continue;
					if (j == 35)
						continue;
					if (j == 36)
						continue;
					if (j == 37)
						continue;
					if (j == 38)
						continue;
					if (j == 39)
						continue;
					if (j == 40)
						continue;
					if (j == 41)
						continue;
					if (j == 42)
						continue;
					if (j == 43)
						continue;
					if (j == 44)
						continue;
					if (j == 45)
						continue;
					if (j == 46)
						continue;
					if (j == 47)
						continue;
					if (j == 48)
						continue;
					if (j == 49)
						continue;
					if (j == 50)
						continue;
					if (j == 51)
						continue;
					if (j == 52)
						continue;
					if (j == 53)
						continue;
					if (j == 54)
						continue;
					if (j == 55)
						continue;
					if (j == 56)
						continue;
					if (j == 57)
						continue;
					if (j == 58)
						continue;
					if (j == 59)
						continue;
					if (j == 60)
						continue;
					if (j == 61)
						continue;
					if (j == 62)
						continue;
					if (j == 63)
						continue;
					if (j == 64)
						continue;
					if (j == 65)
						continue;
					if (j == 66)
						continue;
					if (j == 67)
						continue;
					if (j == 68)
						continue;
					if (j == 69)
						continue;
					if (j == 70)
						continue;
					if (j == 71)
						continue;
					if (j == 72)
						continue;
					if (j == 73)
						continue;
					if (j == 74)
						continue;
					if (j == 75)
						continue;
					if (j == 76)
						continue;
					if (j == 77)
						continue;
					if (j == 78)
						continue;
					if (j == 79)
						continue;
					if (j == 80)
						continue;
					if (j == 81)
						continue;
					playerIn.drop(internal.extractItem(j, internal.getStackInSlot(j).getCount(), false), false);
				}
			} else {
				for (int i = 0; i < internal.getSlots(); ++i) {
					if (i == 0)
						continue;
					if (i == 1)
						continue;
					if (i == 2)
						continue;
					if (i == 3)
						continue;
					if (i == 4)
						continue;
					if (i == 5)
						continue;
					if (i == 6)
						continue;
					if (i == 7)
						continue;
					if (i == 8)
						continue;
					if (i == 9)
						continue;
					if (i == 10)
						continue;
					if (i == 11)
						continue;
					if (i == 12)
						continue;
					if (i == 13)
						continue;
					if (i == 14)
						continue;
					if (i == 15)
						continue;
					if (i == 16)
						continue;
					if (i == 17)
						continue;
					if (i == 18)
						continue;
					if (i == 19)
						continue;
					if (i == 20)
						continue;
					if (i == 21)
						continue;
					if (i == 22)
						continue;
					if (i == 23)
						continue;
					if (i == 24)
						continue;
					if (i == 25)
						continue;
					if (i == 26)
						continue;
					if (i == 27)
						continue;
					if (i == 28)
						continue;
					if (i == 29)
						continue;
					if (i == 30)
						continue;
					if (i == 31)
						continue;
					if (i == 32)
						continue;
					if (i == 33)
						continue;
					if (i == 34)
						continue;
					if (i == 35)
						continue;
					if (i == 36)
						continue;
					if (i == 37)
						continue;
					if (i == 38)
						continue;
					if (i == 39)
						continue;
					if (i == 40)
						continue;
					if (i == 41)
						continue;
					if (i == 42)
						continue;
					if (i == 43)
						continue;
					if (i == 44)
						continue;
					if (i == 45)
						continue;
					if (i == 46)
						continue;
					if (i == 47)
						continue;
					if (i == 48)
						continue;
					if (i == 49)
						continue;
					if (i == 50)
						continue;
					if (i == 51)
						continue;
					if (i == 52)
						continue;
					if (i == 53)
						continue;
					if (i == 54)
						continue;
					if (i == 55)
						continue;
					if (i == 56)
						continue;
					if (i == 57)
						continue;
					if (i == 58)
						continue;
					if (i == 59)
						continue;
					if (i == 60)
						continue;
					if (i == 61)
						continue;
					if (i == 62)
						continue;
					if (i == 63)
						continue;
					if (i == 64)
						continue;
					if (i == 65)
						continue;
					if (i == 66)
						continue;
					if (i == 67)
						continue;
					if (i == 68)
						continue;
					if (i == 69)
						continue;
					if (i == 70)
						continue;
					if (i == 71)
						continue;
					if (i == 72)
						continue;
					if (i == 73)
						continue;
					if (i == 74)
						continue;
					if (i == 75)
						continue;
					if (i == 76)
						continue;
					if (i == 77)
						continue;
					if (i == 78)
						continue;
					if (i == 79)
						continue;
					if (i == 80)
						continue;
					if (i == 81)
						continue;
					playerIn.getInventory().placeItemBackInInventory(internal.extractItem(i, internal.getStackInSlot(i).getCount(), false));
				}
			}
		}
	}

	public Map<Integer, Slot> get() {
		return customSlots;
	}
}
