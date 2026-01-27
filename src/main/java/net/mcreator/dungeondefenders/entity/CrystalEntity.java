package net.mcreator.dungeondefenders.entity;

import net.minecraft.nbt.Tag;
import net.minecraft.network.syncher.EntityDataAccessor;

public class CrystalEntity extends PathfinderMob {

	public CrystalEntity(EntityType<CrystalEntity> type, Level world) {
		super(type, world);
		xpReward = 0;
		setNoAi(true);

	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("block.amethyst_block.hit"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("block.amethyst_block.break"));
	}

	@Override
	public void die(DamageSource source) {
		super.die(source);
		CrystalDiesProcedure.execute(this.level());
	}

	public static void init(RegisterSpawnPlacementsEvent event) {
	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0);
		builder = builder.add(Attributes.MAX_HEALTH, 100);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 0);
		builder = builder.add(Attributes.FOLLOW_RANGE, 0);

		builder = builder.add(Attributes.STEP_HEIGHT, 0);

		return builder;
	}

}