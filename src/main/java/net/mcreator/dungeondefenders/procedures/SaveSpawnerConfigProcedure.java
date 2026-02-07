package net.mcreator.dungeondefenders.procedures;

import net.neoforged.neoforge.items.IItemHandler;
import net.neoforged.neoforge.common.extensions.ILevelExtension;
import net.neoforged.neoforge.capabilities.Capabilities;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.dungeondefenders.init.DungeonDefendersModMenus;

public class SaveSpawnerConfigProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double eggNumber = 0;
		if (("" + itemFromBlockInventory(world, BlockPos.containing(x, y, z), 0).copy()).equals("0 minecraft:air")) {
			eggNumber = 0;
		} else if (("" + itemFromBlockInventory(world, BlockPos.containing(x, y, z), 1).copy()).equals("0 minecraft:air")) {
			eggNumber = 0;
		} else if (("" + itemFromBlockInventory(world, BlockPos.containing(x, y, z), 2).copy()).equals("0 minecraft:air")) {
			eggNumber = 1;
		} else if (("" + itemFromBlockInventory(world, BlockPos.containing(x, y, z), 3).copy()).equals("0 minecraft:air")) {
			eggNumber = 2;
		} else {
			eggNumber = 3;
		}
		if (!world.isClientSide()) {
			BlockPos _bp = BlockPos.containing(x, y, z);
			BlockEntity _blockEntity = world.getBlockEntity(_bp);
			BlockState _bs = world.getBlockState(_bp);
			if (_blockEntity != null) {
				_blockEntity.getPersistentData().putDouble("DifferentEggToSpawn", eggNumber);
				_blockEntity.getPersistentData().putString("Interval", ((entity instanceof Player _entity5 && _entity5.containerMenu instanceof DungeonDefendersModMenus.MenuAccessor _menu5) ? _menu5.getMenuState(0, "SpawnInterval", "") : ""));
				_blockEntity.getPersistentData().putDouble("CurrentInterval", 0);
			}
			if (world instanceof Level _level)
				_level.sendBlockUpdated(_bp, _bs, _bs, 3);
		}
		if (entity instanceof Player _player)
			_player.closeContainer();
	}

	private static ItemStack itemFromBlockInventory(LevelAccessor world, BlockPos pos, int slot) {
		if (world instanceof ILevelExtension ext) {
			IItemHandler itemHandler = ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
			if (itemHandler != null)
				return itemHandler.getStackInSlot(slot);
		}
		return ItemStack.EMPTY;
	}
}