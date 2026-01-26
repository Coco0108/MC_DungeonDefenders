package net.mcreator.dungeondefenders.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.dungeondefenders.network.DungeonDefendersModVariables;

public class ProcedureManaResetProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			DungeonDefendersModVariables.PlayerVariables _vars = entity.getData(DungeonDefendersModVariables.PLAYER_VARIABLES);
			_vars.Mana_Current = 0;
			_vars.markSyncDirty();
		}
	}
}