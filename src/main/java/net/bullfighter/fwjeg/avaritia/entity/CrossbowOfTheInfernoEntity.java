
package net.bullfighter.fwjeg.avaritia.entity;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fmllegacy.network.NetworkHooks;
import net.minecraftforge.fmllegacy.network.FMLPlayMessages;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.Packet;

import net.bullfighter.fwjeg.avaritia.init.AvaritiaLpModItems;
import net.bullfighter.fwjeg.avaritia.init.AvaritiaLpModEntities;

import java.util.Random;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class CrossbowOfTheInfernoEntity extends AbstractArrow implements ItemSupplier {
	public CrossbowOfTheInfernoEntity(FMLPlayMessages.SpawnEntity packet, Level world) {
		super(AvaritiaLpModEntities.CROSSBOW_OF_THE_INFERNO, world);
	}

	public CrossbowOfTheInfernoEntity(EntityType<? extends CrossbowOfTheInfernoEntity> type, Level world) {
		super(type, world);
	}

	public CrossbowOfTheInfernoEntity(EntityType<? extends CrossbowOfTheInfernoEntity> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public CrossbowOfTheInfernoEntity(EntityType<? extends CrossbowOfTheInfernoEntity> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return new ItemStack(AvaritiaLpModItems.INFINITY_CATALYST);
	}

	@Override
	protected ItemStack getPickupItem() {
		return null;
	}

	@Override
	protected void doPostHurtEffects(LivingEntity entity) {
		super.doPostHurtEffects(entity);
		entity.setArrowCount(entity.getArrowCount() - 1);
	}

	@Override
	public void tick() {
		super.tick();
		if (this.inGround)
			this.discard();
	}

	public static CrossbowOfTheInfernoEntity shoot(Level world, LivingEntity entity, Random random, float power, double damage, int knockback) {
		CrossbowOfTheInfernoEntity entityarrow = new CrossbowOfTheInfernoEntity(AvaritiaLpModEntities.CROSSBOW_OF_THE_INFERNO, entity, world);
		entityarrow.shoot(entity.getViewVector(1).x, entity.getViewVector(1).y, entity.getViewVector(1).z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(true);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		world.addFreshEntity(entityarrow);
		world.playSound((Player) null, entity.getX(), entity.getY(), entity.getZ(),
				ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.PLAYERS, 1,
				1f / (random.nextFloat() * 0.5f + 1) + (power / 2));
		return entityarrow;
	}

	public static CrossbowOfTheInfernoEntity shoot(LivingEntity entity, LivingEntity target) {
		CrossbowOfTheInfernoEntity entityarrow = new CrossbowOfTheInfernoEntity(AvaritiaLpModEntities.CROSSBOW_OF_THE_INFERNO, entity, entity.level);
		double d0 = target.getY() + (double) target.getEyeHeight() - 1.1;
		double d1 = target.getX() - entity.getX();
		double d3 = target.getZ() - entity.getZ();
		entityarrow.shoot(d1, d0 - entityarrow.getY() + Math.sqrt(d1 * d1 + d3 * d3) * 0.2F, d3, 5f * 2, 12.0F);
		entityarrow.setSilent(true);
		entityarrow.setBaseDamage(9999);
		entityarrow.setKnockback(5);
		entityarrow.setCritArrow(true);
		entity.level.addFreshEntity(entityarrow);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		entity.level.playSound((Player) null, (double) x, (double) y, (double) z,
				ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.PLAYERS, 1,
				1f / (new Random().nextFloat() * 0.5f + 1));
		return entityarrow;
	}
}
