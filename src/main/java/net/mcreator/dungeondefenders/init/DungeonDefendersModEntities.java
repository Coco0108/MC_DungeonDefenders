/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dungeondefenders.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.dungeondefenders.entity.SpikeBlockadeEntity;
import net.mcreator.dungeondefenders.entity.OrcEntity;
import net.mcreator.dungeondefenders.entity.GobelinEntity;
import net.mcreator.dungeondefenders.entity.CrystalEntity;
import net.mcreator.dungeondefenders.DungeonDefendersMod;

@EventBusSubscriber
public class DungeonDefendersModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, DungeonDefendersMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<CrystalEntity>> CRYSTAL = register("crystal",
			EntityType.Builder.<CrystalEntity>of(CrystalEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(1).setUpdateInterval(3)

					.sized(1f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<SpikeBlockadeEntity>> SPIKE_BLOCKADE = register("spike_blockade",
			EntityType.Builder.<SpikeBlockadeEntity>of(SpikeBlockadeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(2f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<GobelinEntity>> GOBELIN = register("gobelin",
			EntityType.Builder.<GobelinEntity>of(GobelinEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<OrcEntity>> ORC = register("orc", EntityType.Builder.<OrcEntity>of(OrcEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

			.sized(1f, 2f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(ResourceKey.create(Registries.ENTITY_TYPE, ResourceLocation.fromNamespaceAndPath(DungeonDefendersMod.MODID, registryname))));
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		CrystalEntity.init(event);
		SpikeBlockadeEntity.init(event);
		GobelinEntity.init(event);
		OrcEntity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(CRYSTAL.get(), CrystalEntity.createAttributes().build());
		event.put(SPIKE_BLOCKADE.get(), SpikeBlockadeEntity.createAttributes().build());
		event.put(GOBELIN.get(), GobelinEntity.createAttributes().build());
		event.put(ORC.get(), OrcEntity.createAttributes().build());
	}
}