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
	}

	private static String getBlockNBTString(LevelAccessor world, BlockPos pos, String tag) {
		BlockEntity blockEntity = world.getBlockEntity(pos);
		if (blockEntity != null)
			return blockEntity.getPersistentData().getStringOr(tag, "");
		return "";
	}
}