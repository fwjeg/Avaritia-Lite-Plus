
package net.bullfighter.fwjeg.avaritia.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Item;

import net.bullfighter.fwjeg.avaritia.init.AvaritiaLpModTabs;

public class CrystalPickaxeItem extends PickaxeItem {
	public CrystalPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 250;
			}

			public float getSpeed() {
				return 6f;
			}

			public float getAttackDamageBonus() {
				return 0f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 14;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 1, -3f, new Item.Properties().tab(AvaritiaLpModTabs.TAB_AVARITIATAB));
		setRegistryName("crystal_pickaxe");
	}
}
