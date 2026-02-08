package net.mcreator.dungeondefenders.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.dungeondefenders.network.DungeonDefendersModVariables;

public class StickTestSpawnerRightclickedProcedure {
	public static void execute(LevelAccessor world) {
		DungeonDefendersModVariables.MapVariables.get(world).Wave_Current = 1;
		DungeonDefendersModVariables.MapVariables.get(world).IsInGame = true;
		DungeonDefendersModVariables.MapVariables.get(world).markSyncDirty();
		if (DungeonDefendersModVariables.MapVariables.get(world).IsCombatPhase) {
			DungeonDefendersModVariables.MapVariables.get(world).IsCombatPhase = false;
			DungeonDefendersModVariables.MapVariables.get(world).markSyncDirty();
		} else {
			DungeonDefendersModVariables.MapVariables.get(world).IsCombatPhase = true;
			DungeonDefendersModVariables.MapVariables.get(world).markSyncDirty();
		}
	}
}