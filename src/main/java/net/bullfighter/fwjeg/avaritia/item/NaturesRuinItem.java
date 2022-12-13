
package net.bullfighter.fwjeg.avaritia.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.entity.Entity;

import net.bullfighter.fwjeg.avaritia.procedures.MendProcedure;
import net.bullfighter.fwjeg.avaritia.init.AvaritiaLpModTabs;

public class NaturesRuinItem extends AxeItem {
	public NaturesRuinItem() {
		super(new Tier() {
			public int getUses() {
				return 100;
			}

			public float getSpeed() {
				return 99999f;
			}

			public float getAttackDamageBonus() {
				return 19f;
			}

			public int getLevel() {
				return 1000;
			}

			public int getEnchantmentValue() {
				return 100;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 1, -3f, new Item.Properties().tab(AvaritiaLpModTabs.TAB_AVARITIATAB));
		setRegistryName("natures_ruin");
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			MendProcedure.execute(itemstack);
	}
}
