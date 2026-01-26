package net.mcreator.dungeondefenders.procedures;

import org.objectweb.asm.tree.analysis.Value;

import net.minecraft.world.entity.Entity;

import net.mcreator.dungeondefenders.network.DungeonDefendersModVariables;
import net.mcreator.dungeondefenders.DungeonDefendersMod;

public class ManaAddPossibleProcedure {
	public static double execute(Entity entity, double ManaValue) {
		if (entity == null)
			return 0;
		double Value = 0;
		Value = ManaValue;
		if (entity.getData(DungeonDefendersModVariables.PLAYER_VARIABLES).Mana_Current == entity.getData(DungeonDefendersModVariables.PLAYER_VARIABLES).Mana_Max) {
			return Value;
		}
		if (Value + entity.getData(DungeonDefendersModVariables.PLAYER_VARIABLES).Mana_Current <= entity.getData(DungeonDefendersModVariables.PLAYER_VARIABLES).Mana_Max) {
			{
				DungeonDefendersModVariables.PlayerVariables _vars = entity.getData(DungeonDefendersModVariables.PLAYER_VARIABLES);
				_vars.Mana_Current = Value + entity.getData(DungeonDefendersModVariables.PLAYER_VARIABLES).Mana_Current;
				_vars.markSyncDirty();
			}
			return 0;
		}
		Value = (Value + entity.getData(DungeonDefendersModVariables.PLAYER_VARIABLES).Mana_Current) - entity.getData(DungeonDefendersModVariables.PLAYER_VARIABLES).Mana_Max;
		{
			DungeonDefendersModVariables.PlayerVariables _vars = entity.getData(DungeonDefendersModVariables.PLAYER_VARIABLES);
			_vars.Mana_Current = entity.getData(DungeonDefendersModVariables.PLAYER_VARIABLES).Mana_Max;
			_vars.markSyncDirty();
		}
		DungeonDefendersMod.LOGGER.warn((new java.text.DecimalFormat("##.##").format(Value)));
		return Value;
	}
}