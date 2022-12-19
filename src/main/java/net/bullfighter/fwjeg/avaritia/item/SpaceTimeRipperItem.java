
package net.bullfighter.fwjeg.avaritia.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.entity.Entity;

import net.bullfighter.fwjeg.avaritia.procedures.MendProcedure;

public class SpaceTimeRipperItem extends SwordItem {
	public SpaceTimeRipperItem() {
		super(new Tier() {
			public int getUses() {
				return 100;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 97f;
			}

			public int getLevel() {
				return 0;
			}

			public int getEnchantmentValue() {
				return 300;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 3, -2.5f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
		setRegistryName("space_time_ripper");
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		MendProcedure.execute(itemstack);
	}
}
