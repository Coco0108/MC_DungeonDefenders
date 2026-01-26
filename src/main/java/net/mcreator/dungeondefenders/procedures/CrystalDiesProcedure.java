package net.mcreator.dungeondefenders.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.dungeondefenders.network.DungeonDefendersModVariables;

public class CrystalDiesProcedure {
	public static void execute(LevelAccessor world) {
		DungeonDefendersModVariables.MapVariables.get(world).IsGameOver = true;
		DungeonDefendersModVariables.MapVariables.get(world).markSyncDirty();
	}
}