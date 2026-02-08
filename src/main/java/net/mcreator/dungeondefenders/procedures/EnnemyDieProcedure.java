package net.mcreator.dungeondefenders.procedures;

import net.minecraft.world.level.LevelAccessor;

public class EnnemyDieProcedure {
	public static void execute(LevelAccessor world) {
		UpdateEnnemyLeftProcedure.execute(world);
	}
}