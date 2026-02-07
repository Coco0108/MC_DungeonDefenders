package net.mcreator.dungeondefenders.procedures;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class GetMapNameProcedure {
	public static String execute(LevelAccessor world, double x, double y, double z) {
		double currentMapId = 0;
		currentMapId = getBlockNBTNumber(world, BlockPos.containing(x, y, z), "mapId");
		if (currentMapId == 0) {
			return "Map Test";
		} else if (currentMapId == 1) {
			return "El Corridor";
		}
		return "No map selected";
	}

	private static double getBlockNBTNumber(LevelAccessor world, BlockPos pos, String tag) {
		BlockEntity blockEntity = world.getBlockEntity(pos);
		if (blockEntity != null)
			return blockEntity.getPersistentData().getDoubleOr(tag, 0);
		return -1;
	}
}