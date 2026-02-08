package net.mcreator.dungeondefenders.procedures;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.dungeondefenders.init.DungeonDefendersModMenus;

public class RemplirGUIProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player && _player.containerMenu instanceof DungeonDefendersModMenus.MenuAccessor _menu)
			_menu.sendMenuStateUpdate(_player, 0, "SpawnInterval", ("" + getBlockNBTString(world, BlockPos.containing(x, y, z), "Interval")), true);
		if (entity instanceof Player _player && _player.containerMenu instanceof DungeonDefendersModMenus.MenuAccessor _menu)
			_menu.sendMenuStateUpdate(_player, 0, "Slot0Multiplier", (new java.text.DecimalFormat("##").format(getBlockNBTNumber(world, BlockPos.containing(x, y, z), "MultiplierSlot0"))), true);
		if (entity instanceof Player _player && _player.containerMenu instanceof DungeonDefendersModMenus.MenuAccessor _menu)
			_menu.sendMenuStateUpdate(_player, 0, "Slot1Multiplier", (new java.text.DecimalFormat("##").format(getBlockNBTNumber(world, BlockPos.containing(x, y, z), "MultiplierSlot1"))), true);
		if (entity instanceof Player _player && _player.containerMenu instanceof DungeonDefendersModMenus.MenuAccessor _menu)
			_menu.sendMenuStateUpdate(_player, 0, "Slot2Multiplier", (new java.text.DecimalFormat("##").format(getBlockNBTNumber(world, BlockPos.containing(x, y, z), "MultiplierSlot2"))), true);
		if (entity instanceof Player _player && _player.containerMenu instanceof DungeonDefendersModMenus.MenuAccessor _menu)
			_menu.sendMenuStateUpdate(_player, 0, "Slot3Multiplier", (new java.text.DecimalFormat("##").format(getBlockNBTNumber(world, BlockPos.containing(x, y, z), "MultiplierSlot3"))), true);
	}

	private static String getBlockNBTString(LevelAccessor world, BlockPos pos, String tag) {
		BlockEntity blockEntity = world.getBlockEntity(pos);
		if (blockEntity != null)
			return blockEntity.getPersistentData().getStringOr(tag, "");
		return "";
	}

	private static double getBlockNBTNumber(LevelAccessor world, BlockPos pos, String tag) {
		BlockEntity blockEntity = world.getBlockEntity(pos);
		if (blockEntity != null)
			return blockEntity.getPersistentData().getDoubleOr(tag, 0);
		return -1;
	}
}