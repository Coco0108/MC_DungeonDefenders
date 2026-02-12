package net.mcreator.dungeondefenders.procedures;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.dungeondefenders.DungeonDefendersMod;

import com.mojang.brigadier.Command;

public class FindEggToSpawnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		String Command = "";
		String EggName = "";
		double currentEgg = 0;
		double CurrentEggData = 0;
		if (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "DifferentEggToSpawn") == getBlockNBTNumber(world, BlockPos.containing(x, y, z), "CurrentEggSpawning")) {
			currentEgg = 0;
		} else {
			currentEgg = getBlockNBTNumber(world, BlockPos.containing(x, y, z), "CurrentEggSpawning") + 1;
		}
		if (getBlockNBTNumber(world, BlockPos.containing(x, y, z), ("NumberSpawnedSlot" + new java.text.DecimalFormat("##").format(getBlockNBTNumber(world, BlockPos.containing(x, y, z), "CurrentEggSpawning")))) == getBlockNBTNumber(world,
				BlockPos.containing(x, y, z), ("NumberToSpawnSlot" + new java.text.DecimalFormat("##").format(getBlockNBTNumber(world, BlockPos.containing(x, y, z), "CurrentEggSpawning"))))) {
			DungeonDefendersMod.LOGGER.info("JSP ENCORE");
		}
	}

	private static double getBlockNBTNumber(LevelAccessor world, BlockPos pos, String tag) {
		BlockEntity blockEntity = world.getBlockEntity(pos);
		if (blockEntity != null)
			return blockEntity.getPersistentData().getDoubleOr(tag, 0);
		return -1;
	}
}