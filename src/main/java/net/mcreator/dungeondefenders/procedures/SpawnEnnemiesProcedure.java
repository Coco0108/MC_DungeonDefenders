package net.mcreator.dungeondefenders.procedures;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.dungeondefenders.network.DungeonDefendersModVariables;

import com.mojang.brigadier.Command;

public class SpawnEnnemiesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		String Command = "";
		String EggName = "";
		double currentEgg = 0;
		double CurrentEggData = 0;
		if (DungeonDefendersModVariables.MapVariables.get(world).IsInGame && DungeonDefendersModVariables.MapVariables.get(world).IsCombatPhase) {
			if (getBlockNBTLogic(world, BlockPos.containing(x, y, z), "HasGivenData")) {
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null) {
						_blockEntity.getPersistentData().putBoolean("HasGivenData", false);
					}
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
			}
			if (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "CurrentInterval") == new Object() {
				double convert(String s) {
					try {
						return Double.parseDouble(s.trim());
					} catch (Exception e) {
					}
					return 0;
				}
			}.convert(getBlockNBTString(world, BlockPos.containing(x, y, z), "Interval"))) {
				EggName = "dungeon_defenders:" + getBlockNBTString(world, BlockPos.containing(x, y, z), ("eggName" + new java.text.DecimalFormat("##").format(getBlockNBTNumber(world, BlockPos.containing(x, y, z), "CurrentEggSpawning"))));
				Command = "summon " + EggName;
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), Command);
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null) {
						_blockEntity.getPersistentData().putDouble("CurrentInterval", 0);
						_blockEntity.getPersistentData().putDouble(("NumberSpawnedSlot" + new java.text.DecimalFormat("##").format(getBlockNBTNumber(world, BlockPos.containing(x, y, z), "CurrentEggSpawning"))),
								(getBlockNBTNumber(world, BlockPos.containing(x, y, z), "NumberSpawnedSlot0") + 1));
					}
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "DifferentEggToSpawn") == getBlockNBTNumber(world, BlockPos.containing(x, y, z), "CurrentEggSpawning")) {
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null) {
							_blockEntity.getPersistentData().putDouble("CurrentEggSpawning", 0);
						}
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				} else {
					if (!world.isClientSide()) {
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null) {
							_blockEntity.getPersistentData().putDouble("CurrentEggSpawning", (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "CurrentEggSpawning") + 1));
						}
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
				}
			}
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null) {
					_blockEntity.getPersistentData().putDouble("CurrentInterval", (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "CurrentInterval") + 1));
				}
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		} else if (DungeonDefendersModVariables.MapVariables.get(world).IsInGame && !DungeonDefendersModVariables.MapVariables.get(world).IsCombatPhase && !getBlockNBTLogic(world, BlockPos.containing(x, y, z), "HasGivenData")) {
			CurrentEggData = 0;
			for (int index0 = 0; index0 < (int) (getBlockNBTNumber(world, BlockPos.containing(x, y, z), "DifferentEggToSpawn") + 1); index0++) {
				DungeonDefendersModVariables.MapVariables.get(world).EnemyLeft = 1 * getBlockNBTNumber(world, BlockPos.containing(x, y, z), ("MultiplierSlot" + new java.text.DecimalFormat("##").format(CurrentEggData)))
						* DungeonDefendersModVariables.MapVariables.get(world).Wave_Current + DungeonDefendersModVariables.MapVariables.get(world).EnemyLeft;
				DungeonDefendersModVariables.MapVariables.get(world).markSyncDirty();
				CurrentEggData = CurrentEggData + 1;
			}
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null) {
					_blockEntity.getPersistentData().putBoolean("HasGivenData", true);
				}
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		}
	}

	private static boolean getBlockNBTLogic(LevelAccessor world, BlockPos pos, String tag) {
		BlockEntity blockEntity = world.getBlockEntity(pos);
		if (blockEntity != null)
			return blockEntity.getPersistentData().getBooleanOr(tag, false);
		return false;
	}

	private static double getBlockNBTNumber(LevelAccessor world, BlockPos pos, String tag) {
		BlockEntity blockEntity = world.getBlockEntity(pos);
		if (blockEntity != null)
			return blockEntity.getPersistentData().getDoubleOr(tag, 0);
		return -1;
	}

	private static String getBlockNBTString(LevelAccessor world, BlockPos pos, String tag) {
		BlockEntity blockEntity = world.getBlockEntity(pos);
		if (blockEntity != null)
			return blockEntity.getPersistentData().getStringOr(tag, "");
		return "";
	}
}