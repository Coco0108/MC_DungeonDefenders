package net.mcreator.dungeondefenders.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.dungeondefenders.network.DungeonDefendersModVariables;

public class ShowGameOverProcedure {
	public static boolean execute(LevelAccessor world) {
		if (DungeonDefendersModVariables.MapVariables.get(world).IsGameOver) {
			return true;
		}
		return false;
	}
}