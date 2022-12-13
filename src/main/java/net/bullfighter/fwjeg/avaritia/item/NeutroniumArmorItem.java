
package net.bullfighter.fwjeg.avaritia.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.bullfighter.fwjeg.avaritia.init.AvaritiaLpModTabs;

public abstract class NeutroniumArmorItem extends ArmorItem {
	public NeutroniumArmorItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 15;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{2, 6, 5, 2}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 9;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}

			@Override
			public String getName() {
				return "neutronium_armor";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, slot, properties);
	}

	public static class Helmet extends NeutroniumArmorItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(AvaritiaLpModTabs.TAB_AVARITIATAB));
			setRegistryName("neutronium_armor_helmet");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "avaritia_lp:textures/models/armor/neutron__layer_1.png";
		}
	}

	public static class Chestplate extends NeutroniumArmorItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(AvaritiaLpModTabs.TAB_AVARITIATAB));
			setRegistryName("neutronium_armor_chestplate");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "avaritia_lp:textures/models/armor/neutron__layer_1.png";
		}
	}

	public static class Leggings extends NeutroniumArmorItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(AvaritiaLpModTabs.TAB_AVARITIATAB));
			setRegistryName("neutronium_armor_leggings");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "avaritia_lp:textures/models/armor/neutron__layer_2.png";
		}
	}

	public static class Boots extends NeutroniumArmorItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(AvaritiaLpModTabs.TAB_AVARITIATAB));
			setRegistryName("neutronium_armor_boots");
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "avaritia_lp:textures/models/armor/neutron__layer_1.png";
		}
	}
}
