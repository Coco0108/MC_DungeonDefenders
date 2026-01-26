package net.mcreator.dungeondefenders.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.dungeondefenders.network.DungeonDefendersModVariables;

public class ChestOpenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		ChestManaDropProcedure.execute(world, x, y, z, DungeonDefendersModVariables.MapVariables.get(world).ChestManaValue);
		world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
	}
}