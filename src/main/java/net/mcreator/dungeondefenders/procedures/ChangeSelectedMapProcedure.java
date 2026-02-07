package net.mcreator.dungeondefenders.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

public class ChangeSelectedMapProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, boolean More) {
		double blockX = 0;
		double blockY = 0;
		double blockZ = 0;
		double mapID = 0;
		blockX = x;
		blockY = y;
		blockZ = z;
		mapID = getBlockNBTNumber(world, BlockPos.containing(blockX, blockY, blockZ), "mapId");
		if (More) {
			mapID = mapID + 1;
		} else {
			mapID = mapID - 1;
		}
		if (!world.isClientSide()) {
			BlockPos _bp = BlockPos.containing(blockX, blockY, blockZ);
			BlockEntity _blockEntity = world.getBlockEntity(_bp);
			BlockState _bs = world.getBlockState(_bp);
			if (_blockEntity != null) {
				_blockEntity.getPersistentData().putDouble("mapId", mapID);
			}
			if (world instanceof Level _level)
				_level.sendBlockUpdated(_bp, _bs, _bs, 3);
		}
	}

	private static double getBlockNBTNumber(LevelAccessor world, BlockPos pos, String tag) {
		BlockEntity blockEntity = world.getBlockEntity(pos);
		if (blockEntity != null)
			return blockEntity.getPersistentData().getDoubleOr(tag, 0);
		return -1;
	}
}