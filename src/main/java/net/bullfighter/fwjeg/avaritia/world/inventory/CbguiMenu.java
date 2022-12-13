
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

public class CbguiMenu extends AbstractContainerMenu implements Supplier<Map<Integer, Slot>> {
	public final static HashMap<String, Object> guistate = new HashMap<>();
	public final Level world;
	public final Player entity;
	public int x, y, z;
	private IItemHandler internal;
	private final Map<Integer, Slot> customSlots = new HashMap<>();
	private boolean bound = false;

	public CbguiMenu(int id, Inventory inv, FriendlyByteBuf extraData) {
		super(AvaritiaLpModMenus.CBGUI, id);
		this.entity = inv.player;
		this.world = inv.player.level;
		this.internal = new ItemStackHandler(108);
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
		this.customSlots.put(0, this.addSlot(new SlotItemHandler(internal, 0, 14, 6) {
		}));
		this.customSlots.put(1, this.addSlot(new SlotItemHandler(internal, 1, 32, 6) {
		}));
		this.customSlots.put(2, this.addSlot(new SlotItemHandler(internal, 2, 50, 6) {
		}));
		this.customSlots.put(3, this.addSlot(new SlotItemHandler(internal, 3, 68, 6) {
		}));
		this.customSlots.put(4, this.addSlot(new SlotItemHandler(internal, 4, 86, 6) {
		}));
		this.customSlots.put(5, this.addSlot(new SlotItemHandler(internal, 5, 104, 6) {
		}));
		this.customSlots.put(6, this.addSlot(new SlotItemHandler(internal, 6, 122, 6) {
		}));
		this.customSlots.put(7, this.addSlot(new SlotItemHandler(internal, 7, 140, 6) {
		}));
		this.customSlots.put(8, this.addSlot(new SlotItemHandler(internal, 8, 158, 6) {
		}));
		this.customSlots.put(9, this.addSlot(new SlotItemHandler(internal, 9, 14, 24) {
		}));
		this.customSlots.put(10, this.addSlot(new SlotItemHandler(internal, 10, 32, 24) {
		}));
		this.customSlots.put(11, this.addSlot(new SlotItemHandler(internal, 11, 50, 24) {
		}));
		this.customSlots.put(12, this.addSlot(new SlotItemHandler(internal, 12, 68, 24) {
		}));
		this.customSlots.put(13, this.addSlot(new SlotItemHandler(internal, 13, 86, 24) {
		}));
		this.customSlots.put(14, this.addSlot(new SlotItemHandler(internal, 14, 104, 24) {
		}));
		this.customSlots.put(15, this.addSlot(new SlotItemHandler(internal, 15, 122, 24) {
		}));
		this.customSlots.put(16, this.addSlot(new SlotItemHandler(internal, 16, 140, 24) {
		}));
		this.customSlots.put(17, this.addSlot(new SlotItemHandler(internal, 17, 158, 24) {
		}));
		this.customSlots.put(18, this.addSlot(new SlotItemHandler(internal, 18, 14, 42) {
		}));
		this.customSlots.put(19, this.addSlot(new SlotItemHandler(internal, 19, 32, 42) {
		}));
		this.customSlots.put(20, this.addSlot(new SlotItemHandler(internal, 20, 50, 42) {
		}));
		this.customSlots.put(21, this.addSlot(new SlotItemHandler(internal, 21, 68, 42) {
		}));
		this.customSlots.put(22, this.addSlot(new SlotItemHandler(internal, 22, 86, 42) {
		}));
		this.customSlots.put(23, this.addSlot(new SlotItemHandler(internal, 23, 104, 42) {
		}));
		this.customSlots.put(24, this.addSlot(new SlotItemHandler(internal, 24, 122, 42) {
		}));
		this.customSlots.put(25, this.addSlot(new SlotItemHandler(internal, 25, 140, 42) {
		}));
		this.customSlots.put(26, this.addSlot(new SlotItemHandler(internal, 26, 158, 42) {
		}));
		this.customSlots.put(27, this.addSlot(new SlotItemHandler(internal, 27, 14, 60) {
		}));
		this.customSlots.put(28, this.addSlot(new SlotItemHandler(internal, 28, 32, 60) {
		}));
		this.customSlots.put(29, this.addSlot(new SlotItemHandler(internal, 29, 50, 60) {
		}));
		this.customSlots.put(30, this.addSlot(new SlotItemHandler(internal, 30, 68, 60) {
		}));
		this.customSlots.put(31, this.addSlot(new SlotItemHandler(internal, 31, 86, 60) {
		}));
		this.customSlots.put(32, this.addSlot(new SlotItemHandler(internal, 32, 104, 60) {
		}));
		this.customSlots.put(33, this.addSlot(new SlotItemHandler(internal, 33, 122, 60) {
		}));
		this.customSlots.put(34, this.addSlot(new SlotItemHandler(internal, 34, 140, 60) {
		}));
		this.customSlots.put(35, this.addSlot(new SlotItemHandler(internal, 35, 158, 60) {
		}));
		this.customSlots.put(36, this.addSlot(new SlotItemHandler(internal, 36, 14, 78) {
		}));
		this.customSlots.put(37, this.addSlot(new SlotItemHandler(internal, 37, 32, 78) {
		}));
		this.customSlots.put(38, this.addSlot(new SlotItemHandler(internal, 38, 50, 78) {
		}));
		this.customSlots.put(39, this.addSlot(new SlotItemHandler(internal, 39, 68, 78) {
		}));
		this.customSlots.put(40, this.addSlot(new SlotItemHandler(internal, 40, 86, 78) {
		}));
		this.customSlots.put(41, this.addSlot(new SlotItemHandler(internal, 41, 104, 78) {
		}));
		this.customSlots.put(42, this.addSlot(new SlotItemHandler(internal, 42, 122, 78) {
		}));
		this.customSlots.put(43, this.addSlot(new SlotItemHandler(internal, 43, 140, 78) {
		}));
		this.customSlots.put(44, this.addSlot(new SlotItemHandler(internal, 44, 158, 78) {
		}));
		this.customSlots.put(45, this.addSlot(new SlotItemHandler(internal, 45, 14, 96) {
		}));
		this.customSlots.put(46, this.addSlot(new SlotItemHandler(internal, 46, 32, 96) {
		}));
		this.customSlots.put(47, this.addSlot(new SlotItemHandler(internal, 47, 50, 96) {
		}));
		this.customSlots.put(48, this.addSlot(new SlotItemHandler(internal, 48, 68, 96) {
		}));
		this.customSlots.put(49, this.addSlot(new SlotItemHandler(internal, 49, 86, 96) {
		}));
		this.customSlots.put(50, this.addSlot(new SlotItemHandler(internal, 50, 104, 96) {
		}));
		this.customSlots.put(51, this.addSlot(new SlotItemHandler(internal, 51, 122, 96) {
		}));
		this.customSlots.put(52, this.addSlot(new SlotItemHandler(internal, 52, 140, 96) {
		}));
		this.customSlots.put(53, this.addSlot(new SlotItemHandler(internal, 53, 158, 96) {
		}));
		this.customSlots.put(54, this.addSlot(new SlotItemHandler(internal, 54, 14, 114) {
		}));
		this.customSlots.put(55, this.addSlot(new SlotItemHandler(internal, 55, 32, 114) {
		}));
		this.customSlots.put(56, this.addSlot(new SlotItemHandler(internal, 56, 50, 114) {
		}));
		this.customSlots.put(57, this.addSlot(new SlotItemHandler(internal, 57, 68, 114) {
		}));
		this.customSlots.put(58, this.addSlot(new SlotItemHandler(internal, 58, 86, 114) {
		}));
		this.customSlots.put(59, this.addSlot(new SlotItemHandler(internal, 59, 104, 114) {
		}));
		this.customSlots.put(60, this.addSlot(new SlotItemHandler(internal, 60, 122, 114) {
		}));
		this.customSlots.put(61, this.addSlot(new SlotItemHandler(internal, 61, 140, 114) {
		}));
		this.customSlots.put(62, this.addSlot(new SlotItemHandler(internal, 62, 158, 114) {
		}));
		this.customSlots.put(63, this.addSlot(new SlotItemHandler(internal, 63, 14, 132) {
		}));
		this.customSlots.put(64, this.addSlot(new SlotItemHandler(internal, 64, 32, 132) {
		}));
		this.customSlots.put(65, this.addSlot(new SlotItemHandler(internal, 65, 50, 132) {
		}));
		this.customSlots.put(66, this.addSlot(new SlotItemHandler(internal, 66, 68, 132) {
		}));
		this.customSlots.put(67, this.addSlot(new SlotItemHandler(internal, 67, 86, 150) {
		}));
		this.customSlots.put(68, this.addSlot(new SlotItemHandler(internal, 68, 104, 132) {
		}));
		this.customSlots.put(69, this.addSlot(new SlotItemHandler(internal, 69, 122, 132) {
		}));
		this.customSlots.put(70, this.addSlot(new SlotItemHandler(internal, 70, 140, 132) {
		}));
		this.customSlots.put(71, this.addSlot(new SlotItemHandler(internal, 71, 158, 132) {
		}));
		this.customSlots.put(72, this.addSlot(new SlotItemHandler(internal, 72, 14, 150) {
		}));
		this.customSlots.put(73, this.addSlot(new SlotItemHandler(internal, 73, 32, 150) {
		}));
		this.customSlots.put(74, this.addSlot(new SlotItemHandler(internal, 74, 50, 150) {
		}));
		this.customSlots.put(75, this.addSlot(new SlotItemHandler(internal, 75, 68, 150) {
		}));
		this.customSlots.put(76, this.addSlot(new SlotItemHandler(internal, 76, 86, 132) {
		}));
		this.customSlots.put(77, this.addSlot(new SlotItemHandler(internal, 77, 104, 150) {
		}));
		this.customSlots.put(78, this.addSlot(new SlotItemHandler(internal, 78, 122, 150) {
		}));
		this.customSlots.put(79, this.addSlot(new SlotItemHandler(internal, 79, 140, 150) {
		}));
		this.customSlots.put(80, this.addSlot(new SlotItemHandler(internal, 80, 158, 150) {
		}));
		this.customSlots.put(81, this.addSlot(new SlotItemHandler(internal, 81, 176, 6) {
		}));
		this.customSlots.put(82, this.addSlot(new SlotItemHandler(internal, 82, 194, 6) {
		}));
		this.customSlots.put(83, this.addSlot(new SlotItemHandler(internal, 83, 212, 6) {
		}));
		this.customSlots.put(84, this.addSlot(new SlotItemHandler(internal, 84, 176, 24) {
		}));
		this.customSlots.put(85, this.addSlot(new SlotItemHandler(internal, 85, 176, 42) {
		}));
		this.customSlots.put(86, this.addSlot(new SlotItemHandler(internal, 86, 176, 60) {
		}));
		this.customSlots.put(87, this.addSlot(new SlotItemHandler(internal, 87, 176, 78) {
		}));
		this.customSlots.put(88, this.addSlot(new SlotItemHandler(internal, 88, 176, 96) {
		}));
		this.customSlots.put(89, this.addSlot(new SlotItemHandler(internal, 89, 176, 114) {
		}));
		this.customSlots.put(90, this.addSlot(new SlotItemHandler(internal, 90, 176, 132) {
		}));
		this.customSlots.put(91, this.addSlot(new SlotItemHandler(internal, 91, 176, 150) {
		}));
		this.customSlots.put(92, this.addSlot(new SlotItemHandler(internal, 92, 194, 24) {
		}));
		this.customSlots.put(93, this.addSlot(new SlotItemHandler(internal, 93, 212, 24) {
		}));
		this.customSlots.put(94, this.addSlot(new SlotItemHandler(internal, 94, 194, 42) {
		}));
		this.customSlots.put(95, this.addSlot(new SlotItemHandler(internal, 95, 212, 42) {
		}));
		this.customSlots.put(96, this.addSlot(new SlotItemHandler(internal, 96, 194, 60) {
		}));
		this.customSlots.put(97, this.addSlot(new SlotItemHandler(internal, 97, 212, 60) {
		}));
		this.customSlots.put(98, this.addSlot(new SlotItemHandler(internal, 98, 194, 150) {
		}));
		this.customSlots.put(99, this.addSlot(new SlotItemHandler(internal, 99, 212, 150) {
		}));
		this.customSlots.put(100, this.addSlot(new SlotItemHandler(internal, 100, 194, 78) {
		}));
		this.customSlots.put(101, this.addSlot(new SlotItemHandler(internal, 101, 194, 96) {
		}));
		this.customSlots.put(102, this.addSlot(new SlotItemHandler(internal, 102, 194, 114) {
		}));
		this.customSlots.put(103, this.addSlot(new SlotItemHandler(internal, 103, 212, 78) {
		}));
		this.customSlots.put(104, this.addSlot(new SlotItemHandler(internal, 104, 212, 96) {
		}));
		this.customSlots.put(105, this.addSlot(new SlotItemHandler(internal, 105, 194, 132) {
		}));
		this.customSlots.put(106, this.addSlot(new SlotItemHandler(internal, 106, 212, 114) {
		}));
		this.customSlots.put(107, this.addSlot(new SlotItemHandler(internal, 107, 212, 132) {
		}));
		for (int si = 0; si < 3; ++si)
			for (int sj = 0; sj < 9; ++sj)
				this.addSlot(new Slot(inv, sj + (si + 1) * 9, 34 + 8 + sj * 18, 88 + 84 + si * 18));
		for (int si = 0; si < 9; ++si)
			this.addSlot(new Slot(inv, si, 34 + 8 + si * 18, 88 + 142));
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
			if (index < 108) {
				if (!this.moveItemStackTo(itemstack1, 108, this.slots.size(), true)) {
					return ItemStack.EMPTY;
				}
				slot.onQuickCraft(itemstack1, itemstack);
			} else if (!this.moveItemStackTo(itemstack1, 0, 108, false)) {
				if (index < 108 + 27) {
					if (!this.moveItemStackTo(itemstack1, 108 + 27, this.slots.size(), true)) {
						return ItemStack.EMPTY;
					}
				} else {
					if (!this.moveItemStackTo(itemstack1, 108, 108 + 27, false)) {
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
					playerIn.getInventory().placeItemBackInInventory(internal.extractItem(i, internal.getStackInSlot(i).getCount(), false));
				}
			}
		}
	}

	public Map<Integer, Slot> get() {
		return customSlots;
	}
}
