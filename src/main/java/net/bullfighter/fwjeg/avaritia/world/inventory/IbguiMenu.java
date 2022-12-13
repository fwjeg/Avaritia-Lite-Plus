
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

public class IbguiMenu extends AbstractContainerMenu implements Supplier<Map<Integer, Slot>> {
	public final static HashMap<String, Object> guistate = new HashMap<>();
	public final Level world;
	public final Player entity;
	public int x, y, z;
	private IItemHandler internal;
	private final Map<Integer, Slot> customSlots = new HashMap<>();
	private boolean bound = false;

	public IbguiMenu(int id, Inventory inv, FriendlyByteBuf extraData) {
		super(AvaritiaLpModMenus.IBGUI, id);
		this.entity = inv.player;
		this.world = inv.player.level;
		this.internal = new ItemStackHandler(256);
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
		this.customSlots.put(0, this.addSlot(new SlotItemHandler(internal, 0, 1, 11) {
		}));
		this.customSlots.put(1, this.addSlot(new SlotItemHandler(internal, 1, 19, 11) {
		}));
		this.customSlots.put(2, this.addSlot(new SlotItemHandler(internal, 2, 37, 11) {
		}));
		this.customSlots.put(3, this.addSlot(new SlotItemHandler(internal, 3, 55, 11) {
		}));
		this.customSlots.put(4, this.addSlot(new SlotItemHandler(internal, 4, 73, 11) {
		}));
		this.customSlots.put(5, this.addSlot(new SlotItemHandler(internal, 5, 91, 11) {
		}));
		this.customSlots.put(6, this.addSlot(new SlotItemHandler(internal, 6, 109, 11) {
		}));
		this.customSlots.put(7, this.addSlot(new SlotItemHandler(internal, 7, 127, 11) {
		}));
		this.customSlots.put(8, this.addSlot(new SlotItemHandler(internal, 8, 145, 11) {
		}));
		this.customSlots.put(9, this.addSlot(new SlotItemHandler(internal, 9, 163, 11) {
		}));
		this.customSlots.put(10, this.addSlot(new SlotItemHandler(internal, 10, 181, 11) {
		}));
		this.customSlots.put(11, this.addSlot(new SlotItemHandler(internal, 11, 199, 11) {
		}));
		this.customSlots.put(12, this.addSlot(new SlotItemHandler(internal, 12, 217, 11) {
		}));
		this.customSlots.put(13, this.addSlot(new SlotItemHandler(internal, 13, 235, 11) {
		}));
		this.customSlots.put(14, this.addSlot(new SlotItemHandler(internal, 14, 253, 11) {
		}));
		this.customSlots.put(15, this.addSlot(new SlotItemHandler(internal, 15, 271, 11) {
		}));
		this.customSlots.put(16, this.addSlot(new SlotItemHandler(internal, 16, 289, 11) {
		}));
		this.customSlots.put(17, this.addSlot(new SlotItemHandler(internal, 17, 307, 11) {
		}));
		this.customSlots.put(18, this.addSlot(new SlotItemHandler(internal, 18, 325, 11) {
		}));
		this.customSlots.put(19, this.addSlot(new SlotItemHandler(internal, 19, 343, 11) {
		}));
		this.customSlots.put(20, this.addSlot(new SlotItemHandler(internal, 20, 361, 11) {
		}));
		this.customSlots.put(21, this.addSlot(new SlotItemHandler(internal, 21, 379, 11) {
		}));
		this.customSlots.put(22, this.addSlot(new SlotItemHandler(internal, 22, 397, 11) {
		}));
		this.customSlots.put(23, this.addSlot(new SlotItemHandler(internal, 23, 415, 11) {
		}));
		this.customSlots.put(24, this.addSlot(new SlotItemHandler(internal, 24, 1, 29) {
		}));
		this.customSlots.put(25, this.addSlot(new SlotItemHandler(internal, 25, 19, 29) {
		}));
		this.customSlots.put(26, this.addSlot(new SlotItemHandler(internal, 26, 37, 29) {
		}));
		this.customSlots.put(27, this.addSlot(new SlotItemHandler(internal, 27, 55, 29) {
		}));
		this.customSlots.put(28, this.addSlot(new SlotItemHandler(internal, 28, 73, 29) {
		}));
		this.customSlots.put(29, this.addSlot(new SlotItemHandler(internal, 29, 91, 29) {
		}));
		this.customSlots.put(30, this.addSlot(new SlotItemHandler(internal, 30, 109, 29) {
		}));
		this.customSlots.put(31, this.addSlot(new SlotItemHandler(internal, 31, 127, 29) {
		}));
		this.customSlots.put(32, this.addSlot(new SlotItemHandler(internal, 32, 145, 29) {
		}));
		this.customSlots.put(33, this.addSlot(new SlotItemHandler(internal, 33, 163, 29) {
		}));
		this.customSlots.put(34, this.addSlot(new SlotItemHandler(internal, 34, 181, 29) {
		}));
		this.customSlots.put(35, this.addSlot(new SlotItemHandler(internal, 35, 199, 29) {
		}));
		this.customSlots.put(36, this.addSlot(new SlotItemHandler(internal, 36, 217, 29) {
		}));
		this.customSlots.put(37, this.addSlot(new SlotItemHandler(internal, 37, 235, 29) {
		}));
		this.customSlots.put(38, this.addSlot(new SlotItemHandler(internal, 38, 253, 29) {
		}));
		this.customSlots.put(39, this.addSlot(new SlotItemHandler(internal, 39, 271, 29) {
		}));
		this.customSlots.put(40, this.addSlot(new SlotItemHandler(internal, 40, 289, 29) {
		}));
		this.customSlots.put(41, this.addSlot(new SlotItemHandler(internal, 41, 307, 29) {
		}));
		this.customSlots.put(42, this.addSlot(new SlotItemHandler(internal, 42, 325, 29) {
		}));
		this.customSlots.put(43, this.addSlot(new SlotItemHandler(internal, 43, 343, 29) {
		}));
		this.customSlots.put(44, this.addSlot(new SlotItemHandler(internal, 44, 361, 29) {
		}));
		this.customSlots.put(45, this.addSlot(new SlotItemHandler(internal, 45, 379, 29) {
		}));
		this.customSlots.put(46, this.addSlot(new SlotItemHandler(internal, 46, 397, 29) {
		}));
		this.customSlots.put(47, this.addSlot(new SlotItemHandler(internal, 47, 415, 29) {
		}));
		this.customSlots.put(48, this.addSlot(new SlotItemHandler(internal, 48, 1, 47) {
		}));
		this.customSlots.put(49, this.addSlot(new SlotItemHandler(internal, 49, 19, 47) {
		}));
		this.customSlots.put(50, this.addSlot(new SlotItemHandler(internal, 50, 37, 47) {
		}));
		this.customSlots.put(51, this.addSlot(new SlotItemHandler(internal, 51, 55, 47) {
		}));
		this.customSlots.put(52, this.addSlot(new SlotItemHandler(internal, 52, 73, 47) {
		}));
		this.customSlots.put(53, this.addSlot(new SlotItemHandler(internal, 53, 91, 47) {
		}));
		this.customSlots.put(54, this.addSlot(new SlotItemHandler(internal, 54, 109, 47) {
		}));
		this.customSlots.put(55, this.addSlot(new SlotItemHandler(internal, 55, 127, 47) {
		}));
		this.customSlots.put(56, this.addSlot(new SlotItemHandler(internal, 56, 145, 47) {
		}));
		this.customSlots.put(57, this.addSlot(new SlotItemHandler(internal, 57, 163, 47) {
		}));
		this.customSlots.put(58, this.addSlot(new SlotItemHandler(internal, 58, 181, 47) {
		}));
		this.customSlots.put(59, this.addSlot(new SlotItemHandler(internal, 59, 199, 47) {
		}));
		this.customSlots.put(60, this.addSlot(new SlotItemHandler(internal, 60, 217, 47) {
		}));
		this.customSlots.put(61, this.addSlot(new SlotItemHandler(internal, 61, 235, 47) {
		}));
		this.customSlots.put(62, this.addSlot(new SlotItemHandler(internal, 62, 253, 47) {
		}));
		this.customSlots.put(63, this.addSlot(new SlotItemHandler(internal, 63, 271, 47) {
		}));
		this.customSlots.put(64, this.addSlot(new SlotItemHandler(internal, 64, 289, 47) {
		}));
		this.customSlots.put(65, this.addSlot(new SlotItemHandler(internal, 65, 307, 47) {
		}));
		this.customSlots.put(66, this.addSlot(new SlotItemHandler(internal, 66, 325, 47) {
		}));
		this.customSlots.put(67, this.addSlot(new SlotItemHandler(internal, 67, 343, 47) {
		}));
		this.customSlots.put(68, this.addSlot(new SlotItemHandler(internal, 68, 361, 47) {
		}));
		this.customSlots.put(69, this.addSlot(new SlotItemHandler(internal, 69, 379, 47) {
		}));
		this.customSlots.put(70, this.addSlot(new SlotItemHandler(internal, 70, 397, 47) {
		}));
		this.customSlots.put(71, this.addSlot(new SlotItemHandler(internal, 71, 415, 47) {
		}));
		this.customSlots.put(72, this.addSlot(new SlotItemHandler(internal, 72, 1, 65) {
		}));
		this.customSlots.put(73, this.addSlot(new SlotItemHandler(internal, 73, 19, 65) {
		}));
		this.customSlots.put(74, this.addSlot(new SlotItemHandler(internal, 74, 37, 65) {
		}));
		this.customSlots.put(75, this.addSlot(new SlotItemHandler(internal, 75, 55, 65) {
		}));
		this.customSlots.put(76, this.addSlot(new SlotItemHandler(internal, 76, 73, 65) {
		}));
		this.customSlots.put(77, this.addSlot(new SlotItemHandler(internal, 77, 91, 65) {
		}));
		this.customSlots.put(78, this.addSlot(new SlotItemHandler(internal, 78, 109, 65) {
		}));
		this.customSlots.put(79, this.addSlot(new SlotItemHandler(internal, 79, 127, 65) {
		}));
		this.customSlots.put(80, this.addSlot(new SlotItemHandler(internal, 80, 145, 65) {
		}));
		this.customSlots.put(81, this.addSlot(new SlotItemHandler(internal, 81, 163, 65) {
		}));
		this.customSlots.put(82, this.addSlot(new SlotItemHandler(internal, 82, 181, 65) {
		}));
		this.customSlots.put(83, this.addSlot(new SlotItemHandler(internal, 83, 199, 65) {
		}));
		this.customSlots.put(84, this.addSlot(new SlotItemHandler(internal, 84, 217, 65) {
		}));
		this.customSlots.put(85, this.addSlot(new SlotItemHandler(internal, 85, 235, 65) {
		}));
		this.customSlots.put(86, this.addSlot(new SlotItemHandler(internal, 86, 253, 65) {
		}));
		this.customSlots.put(87, this.addSlot(new SlotItemHandler(internal, 87, 271, 65) {
		}));
		this.customSlots.put(88, this.addSlot(new SlotItemHandler(internal, 88, 289, 65) {
		}));
		this.customSlots.put(89, this.addSlot(new SlotItemHandler(internal, 89, 307, 65) {
		}));
		this.customSlots.put(90, this.addSlot(new SlotItemHandler(internal, 90, 325, 65) {
		}));
		this.customSlots.put(91, this.addSlot(new SlotItemHandler(internal, 91, 343, 65) {
		}));
		this.customSlots.put(92, this.addSlot(new SlotItemHandler(internal, 92, 361, 65) {
		}));
		this.customSlots.put(93, this.addSlot(new SlotItemHandler(internal, 93, 379, 65) {
		}));
		this.customSlots.put(94, this.addSlot(new SlotItemHandler(internal, 94, 397, 65) {
		}));
		this.customSlots.put(95, this.addSlot(new SlotItemHandler(internal, 95, 415, 65) {
		}));
		this.customSlots.put(96, this.addSlot(new SlotItemHandler(internal, 96, 1, 83) {
		}));
		this.customSlots.put(97, this.addSlot(new SlotItemHandler(internal, 97, 19, 83) {
		}));
		this.customSlots.put(98, this.addSlot(new SlotItemHandler(internal, 98, 37, 83) {
		}));
		this.customSlots.put(99, this.addSlot(new SlotItemHandler(internal, 99, 55, 83) {
		}));
		this.customSlots.put(100, this.addSlot(new SlotItemHandler(internal, 100, 73, 83) {
		}));
		this.customSlots.put(101, this.addSlot(new SlotItemHandler(internal, 101, 91, 83) {
		}));
		this.customSlots.put(102, this.addSlot(new SlotItemHandler(internal, 102, 109, 83) {
		}));
		this.customSlots.put(103, this.addSlot(new SlotItemHandler(internal, 103, 127, 83) {
		}));
		this.customSlots.put(104, this.addSlot(new SlotItemHandler(internal, 104, 145, 83) {
		}));
		this.customSlots.put(105, this.addSlot(new SlotItemHandler(internal, 105, 163, 83) {
		}));
		this.customSlots.put(106, this.addSlot(new SlotItemHandler(internal, 106, 181, 83) {
		}));
		this.customSlots.put(107, this.addSlot(new SlotItemHandler(internal, 107, 199, 83) {
		}));
		this.customSlots.put(108, this.addSlot(new SlotItemHandler(internal, 108, 217, 83) {
		}));
		this.customSlots.put(109, this.addSlot(new SlotItemHandler(internal, 109, 235, 83) {
		}));
		this.customSlots.put(110, this.addSlot(new SlotItemHandler(internal, 110, 253, 83) {
		}));
		this.customSlots.put(111, this.addSlot(new SlotItemHandler(internal, 111, 271, 83) {
		}));
		this.customSlots.put(112, this.addSlot(new SlotItemHandler(internal, 112, 289, 83) {
		}));
		this.customSlots.put(113, this.addSlot(new SlotItemHandler(internal, 113, 307, 83) {
		}));
		this.customSlots.put(114, this.addSlot(new SlotItemHandler(internal, 114, 325, 83) {
		}));
		this.customSlots.put(115, this.addSlot(new SlotItemHandler(internal, 115, 343, 83) {
		}));
		this.customSlots.put(116, this.addSlot(new SlotItemHandler(internal, 116, 361, 83) {
		}));
		this.customSlots.put(117, this.addSlot(new SlotItemHandler(internal, 117, 379, 83) {
		}));
		this.customSlots.put(118, this.addSlot(new SlotItemHandler(internal, 118, 397, 83) {
		}));
		this.customSlots.put(119, this.addSlot(new SlotItemHandler(internal, 119, 415, 83) {
		}));
		this.customSlots.put(120, this.addSlot(new SlotItemHandler(internal, 120, 1, 101) {
		}));
		this.customSlots.put(122, this.addSlot(new SlotItemHandler(internal, 122, 1, 119) {
		}));
		this.customSlots.put(123, this.addSlot(new SlotItemHandler(internal, 123, 1, 137) {
		}));
		this.customSlots.put(124, this.addSlot(new SlotItemHandler(internal, 124, 1, 155) {
		}));
		this.customSlots.put(125, this.addSlot(new SlotItemHandler(internal, 125, 19, 155) {
		}));
		this.customSlots.put(126, this.addSlot(new SlotItemHandler(internal, 126, 37, 155) {
		}));
		this.customSlots.put(127, this.addSlot(new SlotItemHandler(internal, 127, 55, 155) {
		}));
		this.customSlots.put(128, this.addSlot(new SlotItemHandler(internal, 128, 73, 155) {
		}));
		this.customSlots.put(129, this.addSlot(new SlotItemHandler(internal, 129, 91, 155) {
		}));
		this.customSlots.put(192, this.addSlot(new SlotItemHandler(internal, 192, 109, 155) {
		}));
		this.customSlots.put(193, this.addSlot(new SlotItemHandler(internal, 193, 127, 155) {
		}));
		this.customSlots.put(194, this.addSlot(new SlotItemHandler(internal, 194, 145, 155) {
		}));
		this.customSlots.put(195, this.addSlot(new SlotItemHandler(internal, 195, 163, 155) {
		}));
		this.customSlots.put(196, this.addSlot(new SlotItemHandler(internal, 196, 181, 155) {
		}));
		this.customSlots.put(197, this.addSlot(new SlotItemHandler(internal, 197, 199, 155) {
		}));
		this.customSlots.put(198, this.addSlot(new SlotItemHandler(internal, 198, 217, 155) {
		}));
		this.customSlots.put(199, this.addSlot(new SlotItemHandler(internal, 199, 235, 155) {
		}));
		this.customSlots.put(200, this.addSlot(new SlotItemHandler(internal, 200, 253, 155) {
		}));
		this.customSlots.put(201, this.addSlot(new SlotItemHandler(internal, 201, 271, 155) {
		}));
		this.customSlots.put(202, this.addSlot(new SlotItemHandler(internal, 202, 289, 155) {
		}));
		this.customSlots.put(203, this.addSlot(new SlotItemHandler(internal, 203, 307, 155) {
		}));
		this.customSlots.put(204, this.addSlot(new SlotItemHandler(internal, 204, 325, 155) {
		}));
		this.customSlots.put(205, this.addSlot(new SlotItemHandler(internal, 205, 343, 155) {
		}));
		this.customSlots.put(206, this.addSlot(new SlotItemHandler(internal, 206, 361, 155) {
		}));
		this.customSlots.put(207, this.addSlot(new SlotItemHandler(internal, 207, 379, 155) {
		}));
		this.customSlots.put(208, this.addSlot(new SlotItemHandler(internal, 208, 397, 155) {
		}));
		this.customSlots.put(209, this.addSlot(new SlotItemHandler(internal, 209, 415, 155) {
		}));
		this.customSlots.put(121, this.addSlot(new SlotItemHandler(internal, 121, 19, 101) {
		}));
		this.customSlots.put(210, this.addSlot(new SlotItemHandler(internal, 210, 37, 101) {
		}));
		this.customSlots.put(211, this.addSlot(new SlotItemHandler(internal, 211, 55, 101) {
		}));
		this.customSlots.put(212, this.addSlot(new SlotItemHandler(internal, 212, 73, 101) {
		}));
		this.customSlots.put(213, this.addSlot(new SlotItemHandler(internal, 213, 91, 101) {
		}));
		this.customSlots.put(214, this.addSlot(new SlotItemHandler(internal, 214, 109, 101) {
		}));
		this.customSlots.put(215, this.addSlot(new SlotItemHandler(internal, 215, 127, 101) {
		}));
		this.customSlots.put(216, this.addSlot(new SlotItemHandler(internal, 216, 145, 101) {
		}));
		this.customSlots.put(217, this.addSlot(new SlotItemHandler(internal, 217, 163, 101) {
		}));
		this.customSlots.put(218, this.addSlot(new SlotItemHandler(internal, 218, 181, 101) {
		}));
		this.customSlots.put(219, this.addSlot(new SlotItemHandler(internal, 219, 199, 101) {
		}));
		this.customSlots.put(220, this.addSlot(new SlotItemHandler(internal, 220, 217, 101) {
		}));
		this.customSlots.put(221, this.addSlot(new SlotItemHandler(internal, 221, 235, 101) {
		}));
		this.customSlots.put(222, this.addSlot(new SlotItemHandler(internal, 222, 253, 101) {
		}));
		this.customSlots.put(223, this.addSlot(new SlotItemHandler(internal, 223, 271, 101) {
		}));
		this.customSlots.put(224, this.addSlot(new SlotItemHandler(internal, 224, 289, 101) {
		}));
		this.customSlots.put(225, this.addSlot(new SlotItemHandler(internal, 225, 307, 101) {
		}));
		this.customSlots.put(226, this.addSlot(new SlotItemHandler(internal, 226, 325, 101) {
		}));
		this.customSlots.put(227, this.addSlot(new SlotItemHandler(internal, 227, 343, 101) {
		}));
		this.customSlots.put(228, this.addSlot(new SlotItemHandler(internal, 228, 361, 101) {
		}));
		this.customSlots.put(229, this.addSlot(new SlotItemHandler(internal, 229, 379, 101) {
		}));
		this.customSlots.put(230, this.addSlot(new SlotItemHandler(internal, 230, 397, 101) {
		}));
		this.customSlots.put(231, this.addSlot(new SlotItemHandler(internal, 231, 415, 101) {
		}));
		this.customSlots.put(232, this.addSlot(new SlotItemHandler(internal, 232, 415, 119) {
		}));
		this.customSlots.put(233, this.addSlot(new SlotItemHandler(internal, 233, 415, 137) {
		}));
		this.customSlots.put(234, this.addSlot(new SlotItemHandler(internal, 234, 397, 119) {
		}));
		this.customSlots.put(235, this.addSlot(new SlotItemHandler(internal, 235, 397, 137) {
		}));
		this.customSlots.put(236, this.addSlot(new SlotItemHandler(internal, 236, 379, 119) {
		}));
		this.customSlots.put(237, this.addSlot(new SlotItemHandler(internal, 237, 379, 137) {
		}));
		this.customSlots.put(238, this.addSlot(new SlotItemHandler(internal, 238, 361, 119) {
		}));
		this.customSlots.put(239, this.addSlot(new SlotItemHandler(internal, 239, 361, 137) {
		}));
		this.customSlots.put(240, this.addSlot(new SlotItemHandler(internal, 240, 343, 119) {
		}));
		this.customSlots.put(241, this.addSlot(new SlotItemHandler(internal, 241, 343, 137) {
		}));
		this.customSlots.put(242, this.addSlot(new SlotItemHandler(internal, 242, 325, 119) {
		}));
		this.customSlots.put(243, this.addSlot(new SlotItemHandler(internal, 243, 325, 137) {
		}));
		this.customSlots.put(244, this.addSlot(new SlotItemHandler(internal, 244, 307, 119) {
		}));
		this.customSlots.put(245, this.addSlot(new SlotItemHandler(internal, 245, 307, 137) {
		}));
		this.customSlots.put(246, this.addSlot(new SlotItemHandler(internal, 246, 289, 119) {
		}));
		this.customSlots.put(247, this.addSlot(new SlotItemHandler(internal, 247, 289, 137) {
		}));
		this.customSlots.put(248, this.addSlot(new SlotItemHandler(internal, 248, 271, 119) {
		}));
		this.customSlots.put(249, this.addSlot(new SlotItemHandler(internal, 249, 271, 137) {
		}));
		this.customSlots.put(250, this.addSlot(new SlotItemHandler(internal, 250, 253, 119) {
		}));
		this.customSlots.put(251, this.addSlot(new SlotItemHandler(internal, 251, 253, 137) {
		}));
		this.customSlots.put(252, this.addSlot(new SlotItemHandler(internal, 252, 235, 119) {
		}));
		this.customSlots.put(253, this.addSlot(new SlotItemHandler(internal, 253, 235, 137) {
		}));
		this.customSlots.put(254, this.addSlot(new SlotItemHandler(internal, 254, 217, 119) {
		}));
		this.customSlots.put(255, this.addSlot(new SlotItemHandler(internal, 255, 217, 137) {
		}));
		this.customSlots.put(160, this.addSlot(new SlotItemHandler(internal, 160, 199, 119) {
		}));
		this.customSlots.put(130, this.addSlot(new SlotItemHandler(internal, 130, 199, 137) {
		}));
		this.customSlots.put(131, this.addSlot(new SlotItemHandler(internal, 131, 181, 119) {
		}));
		this.customSlots.put(132, this.addSlot(new SlotItemHandler(internal, 132, 181, 137) {
		}));
		this.customSlots.put(133, this.addSlot(new SlotItemHandler(internal, 133, 163, 119) {
		}));
		this.customSlots.put(134, this.addSlot(new SlotItemHandler(internal, 134, 163, 137) {
		}));
		this.customSlots.put(135, this.addSlot(new SlotItemHandler(internal, 135, 145, 119) {
		}));
		this.customSlots.put(136, this.addSlot(new SlotItemHandler(internal, 136, 145, 137) {
		}));
		this.customSlots.put(137, this.addSlot(new SlotItemHandler(internal, 137, 127, 119) {
		}));
		this.customSlots.put(138, this.addSlot(new SlotItemHandler(internal, 138, 127, 137) {
		}));
		this.customSlots.put(139, this.addSlot(new SlotItemHandler(internal, 139, 109, 119) {
		}));
		this.customSlots.put(140, this.addSlot(new SlotItemHandler(internal, 140, 109, 137) {
		}));
		this.customSlots.put(141, this.addSlot(new SlotItemHandler(internal, 141, 73, 119) {
		}));
		this.customSlots.put(142, this.addSlot(new SlotItemHandler(internal, 142, 91, 119) {
		}));
		this.customSlots.put(143, this.addSlot(new SlotItemHandler(internal, 143, 73, 137) {
		}));
		this.customSlots.put(144, this.addSlot(new SlotItemHandler(internal, 144, 91, 137) {
		}));
		this.customSlots.put(145, this.addSlot(new SlotItemHandler(internal, 145, 19, 119) {
		}));
		this.customSlots.put(146, this.addSlot(new SlotItemHandler(internal, 146, 37, 119) {
			@Override
			public boolean mayPlace(ItemStack stack) {
				return false;
			}
		}));
		this.customSlots.put(147, this.addSlot(new SlotItemHandler(internal, 147, 55, 119) {
		}));
		this.customSlots.put(148, this.addSlot(new SlotItemHandler(internal, 148, 55, 137) {
		}));
		this.customSlots.put(149, this.addSlot(new SlotItemHandler(internal, 149, 37, 137) {
		}));
		this.customSlots.put(150, this.addSlot(new SlotItemHandler(internal, 150, 19, 137) {
		}));
		this.customSlots.put(151, this.addSlot(new SlotItemHandler(internal, 151, 119, 183) {
		}));
		this.customSlots.put(152, this.addSlot(new SlotItemHandler(internal, 152, 119, 201) {
		}));
		this.customSlots.put(153, this.addSlot(new SlotItemHandler(internal, 153, 119, 219) {
		}));
		this.customSlots.put(154, this.addSlot(new SlotItemHandler(internal, 154, 119, 241) {
		}));
		this.customSlots.put(155, this.addSlot(new SlotItemHandler(internal, 155, 101, 183) {
		}));
		this.customSlots.put(156, this.addSlot(new SlotItemHandler(internal, 156, 83, 183) {
		}));
		this.customSlots.put(157, this.addSlot(new SlotItemHandler(internal, 157, 101, 201) {
		}));
		this.customSlots.put(158, this.addSlot(new SlotItemHandler(internal, 158, 65, 183) {
		}));
		this.customSlots.put(159, this.addSlot(new SlotItemHandler(internal, 159, 47, 183) {
		}));
		this.customSlots.put(161, this.addSlot(new SlotItemHandler(internal, 161, 29, 183) {
		}));
		this.customSlots.put(162, this.addSlot(new SlotItemHandler(internal, 162, 11, 183) {
		}));
		this.customSlots.put(163, this.addSlot(new SlotItemHandler(internal, 163, 11, 201) {
		}));
		this.customSlots.put(164, this.addSlot(new SlotItemHandler(internal, 164, 29, 201) {
		}));
		this.customSlots.put(165, this.addSlot(new SlotItemHandler(internal, 165, 47, 201) {
		}));
		this.customSlots.put(166, this.addSlot(new SlotItemHandler(internal, 166, 83, 201) {
		}));
		this.customSlots.put(167, this.addSlot(new SlotItemHandler(internal, 167, 65, 201) {
		}));
		this.customSlots.put(168, this.addSlot(new SlotItemHandler(internal, 168, 11, 219) {
		}));
		this.customSlots.put(169, this.addSlot(new SlotItemHandler(internal, 169, 29, 219) {
		}));
		this.customSlots.put(170, this.addSlot(new SlotItemHandler(internal, 170, 47, 219) {
		}));
		this.customSlots.put(171, this.addSlot(new SlotItemHandler(internal, 171, 65, 219) {
		}));
		this.customSlots.put(172, this.addSlot(new SlotItemHandler(internal, 172, 83, 219) {
		}));
		this.customSlots.put(173, this.addSlot(new SlotItemHandler(internal, 173, 101, 219) {
		}));
		this.customSlots.put(174, this.addSlot(new SlotItemHandler(internal, 174, 101, 241) {
		}));
		this.customSlots.put(175, this.addSlot(new SlotItemHandler(internal, 175, 83, 241) {
		}));
		this.customSlots.put(176, this.addSlot(new SlotItemHandler(internal, 176, 65, 241) {
		}));
		this.customSlots.put(177, this.addSlot(new SlotItemHandler(internal, 177, 47, 241) {
		}));
		this.customSlots.put(178, this.addSlot(new SlotItemHandler(internal, 178, 29, 241) {
		}));
		this.customSlots.put(179, this.addSlot(new SlotItemHandler(internal, 179, 11, 241) {
		}));
		this.customSlots.put(180, this.addSlot(new SlotItemHandler(internal, 180, 299, 183) {
		}));
		this.customSlots.put(181, this.addSlot(new SlotItemHandler(internal, 181, 317, 183) {
		}));
		this.customSlots.put(182, this.addSlot(new SlotItemHandler(internal, 182, 335, 183) {
		}));
		this.customSlots.put(183, this.addSlot(new SlotItemHandler(internal, 183, 353, 183) {
		}));
		this.customSlots.put(184, this.addSlot(new SlotItemHandler(internal, 184, 371, 183) {
		}));
		this.customSlots.put(185, this.addSlot(new SlotItemHandler(internal, 185, 389, 183) {
		}));
		this.customSlots.put(186, this.addSlot(new SlotItemHandler(internal, 186, 407, 183) {
		}));
		this.customSlots.put(187, this.addSlot(new SlotItemHandler(internal, 187, 299, 201) {
		}));
		this.customSlots.put(188, this.addSlot(new SlotItemHandler(internal, 188, 299, 219) {
		}));
		this.customSlots.put(189, this.addSlot(new SlotItemHandler(internal, 189, 317, 201) {
		}));
		this.customSlots.put(190, this.addSlot(new SlotItemHandler(internal, 190, 335, 201) {
		}));
		this.customSlots.put(191, this.addSlot(new SlotItemHandler(internal, 191, 353, 201) {
		}));
		this.customSlots.put(-1, this.addSlot(new SlotItemHandler(internal, -1, 371, 201) {
		}));
		this.customSlots.put(-2, this.addSlot(new SlotItemHandler(internal, -2, 389, 201) {
		}));
		this.customSlots.put(-3, this.addSlot(new SlotItemHandler(internal, -3, 407, 201) {
		}));
		this.customSlots.put(-4, this.addSlot(new SlotItemHandler(internal, -4, 317, 219) {
		}));
		this.customSlots.put(-5, this.addSlot(new SlotItemHandler(internal, -5, 335, 219) {
		}));
		this.customSlots.put(-6, this.addSlot(new SlotItemHandler(internal, -6, 353, 219) {
		}));
		this.customSlots.put(-7, this.addSlot(new SlotItemHandler(internal, -7, 371, 219) {
		}));
		this.customSlots.put(-8, this.addSlot(new SlotItemHandler(internal, -8, 389, 219) {
		}));
		this.customSlots.put(-9, this.addSlot(new SlotItemHandler(internal, -9, 407, 219) {
		}));
		this.customSlots.put(-10, this.addSlot(new SlotItemHandler(internal, -10, 299, 241) {
		}));
		this.customSlots.put(-11, this.addSlot(new SlotItemHandler(internal, -11, 317, 241) {
		}));
		this.customSlots.put(-12, this.addSlot(new SlotItemHandler(internal, -12, 335, 241) {
		}));
		this.customSlots.put(-13, this.addSlot(new SlotItemHandler(internal, -13, 353, 241) {
		}));
		this.customSlots.put(-14, this.addSlot(new SlotItemHandler(internal, -14, 371, 241) {
		}));
		this.customSlots.put(-15, this.addSlot(new SlotItemHandler(internal, -15, 389, 241) {
		}));
		this.customSlots.put(-16, this.addSlot(new SlotItemHandler(internal, -16, 407, 241) {
		}));
		for (int si = 0; si < 3; ++si)
			for (int sj = 0; sj < 9; ++sj)
				this.addSlot(new Slot(inv, sj + (si + 1) * 9, 129 + 8 + sj * 18, 99 + 84 + si * 18));
		for (int si = 0; si < 9; ++si)
			this.addSlot(new Slot(inv, si, 129 + 8 + si * 18, 99 + 142));
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
			if (index < 272) {
				if (!this.moveItemStackTo(itemstack1, 272, this.slots.size(), true)) {
					return ItemStack.EMPTY;
				}
				slot.onQuickCraft(itemstack1, itemstack);
			} else if (!this.moveItemStackTo(itemstack1, 0, 272, false)) {
				if (index < 272 + 27) {
					if (!this.moveItemStackTo(itemstack1, 272 + 27, this.slots.size(), true)) {
						return ItemStack.EMPTY;
					}
				} else {
					if (!this.moveItemStackTo(itemstack1, 272, 272 + 27, false)) {
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
