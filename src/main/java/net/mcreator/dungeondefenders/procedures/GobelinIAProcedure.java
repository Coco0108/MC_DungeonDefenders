package net.mcreator.dungeondefenders.procedures;

import net.neoforged.bus.api.Event;

public class GobelinIAProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double crystalX = 0;
		double crystalY = 0;
		double crystalZ = 0;
		boolean occupied = false;
		Entity current_tower = null;
		if (entity instanceof Mob _entity)
			_entity.getNavigation().moveTo(crystalX, crystalY, crystalZ, 1);
		{
			final Vec3 _center = new Vec3(x, y, z);
			for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(6 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
				DungeonDefendersMod.LOGGER.warn(("" + entityiterator));
				if (!occupied) {
					if (entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("dungeon_defenders:tower")))) {
						if (entity instanceof Mob _entity)
							_entity.getNavigation().moveTo((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 1);
						occupied = true;
						current_tower = entityiterator;
						if (entity instanceof Mob _entity && entityiterator instanceof LivingEntity _ent)
							_entity.setTarget(_ent);
					} else if (entityiterator instanceof Player) {
						if (entity instanceof Mob _entity)
							_entity.getNavigation().moveTo((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 1);
						if (entity instanceof Mob _entity && entityiterator instanceof LivingEntity _ent)
							_entity.setTarget(_ent);
					}
				} else if (!current_tower.isAlive()) {
					occupied = false;
				}
			}
		}
	}
}