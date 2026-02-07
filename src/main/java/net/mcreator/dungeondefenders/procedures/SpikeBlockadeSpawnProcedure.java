package net.mcreator.dungeondefenders.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.dungeondefenders.init.DungeonDefendersModEntities;

public class SpikeBlockadeSpawnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = DungeonDefendersModEntities.SPIKE_BLOCKADE.get().spawn(_level, BlockPos.containing(x, y + 1, z), EntitySpawnReason.MOB_SUMMONED);
			if (entityToSpawn != null) {
				entityToSpawn.setYRot(entity.getYRot() + 90);
				entityToSpawn.setYBodyRot(entity.getYRot() + 90);
				entityToSpawn.setYHeadRot(entity.getYRot() + 90);
				entityToSpawn.setDeltaMovement(0, 0, 0);
			}
		}
	}
}