package net.mcreator.dungeondefenders.procedures;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.dungeondefenders.DungeonDefendersMod;

public class GetRightArrowVisibilityProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		DungeonDefendersMod.LOGGER.warn((getBlockNBTNumber(world, BlockPos.containing(x, y, z), "mapId") + "  -  " + getBlockNBTNumber(world, BlockPos.containing(x, y, z), "mapMaxId")));
		return !(getBlockNBTNumber(world, BlockPos.containing(x, y, z), "mapId") == getBlockNBTNumber(world, BlockPos.containing(x, y, z), "mapMaxId"));
	}

	private static double getBlockNBTNumber(LevelAccessor world, BlockPos pos, String tag) {
		BlockEntity blockEntity = world.getBlockEntity(pos);
		if (blockEntity != null)
			return blockEntity.getPersistentData().getDoubleOr(tag, 0);
		return -1;
	}
}