package net.mcreator.dungeondefenders.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.dungeondefenders.network.DungeonDefendersModVariables;

public class UpdateEnnemyLeftProcedure {
	public static void execute(LevelAccessor world) {
		DungeonDefendersModVariables.MapVariables.get(world).EnemyLeft = DungeonDefendersModVariables.MapVariables.get(world).EnemyLeft - 1;
		DungeonDefendersModVariables.MapVariables.get(world).markSyncDirty();
	}
}