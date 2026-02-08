package net.mcreator.dungeondefenders.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.dungeondefenders.network.DungeonDefendersModVariables;

public class GetEnnemyLeftProcedure {
	public static String execute(LevelAccessor world) {
		return "" + new java.text.DecimalFormat("##").format(DungeonDefendersModVariables.MapVariables.get(world).EnemyLeft);
	}
}