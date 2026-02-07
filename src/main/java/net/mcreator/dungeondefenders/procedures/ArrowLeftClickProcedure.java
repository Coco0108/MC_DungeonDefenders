package net.mcreator.dungeondefenders.procedures;

import net.minecraft.world.level.LevelAccessor;

public class ArrowLeftClickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		ChangeSelectedMapProcedure.execute(world, x, y, z, false);
	}
}