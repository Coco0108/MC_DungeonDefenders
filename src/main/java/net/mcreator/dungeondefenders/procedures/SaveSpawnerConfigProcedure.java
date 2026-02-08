package net.mcreator.dungeondefenders.procedures;

import org.checkerframework.checker.units.qual.s;

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
		String eggName = "";
		eggName = "" + itemFromBlockInventory(world, BlockPos.containing(x, y, z), 3).copy();
		if ((eggName).equals("0 minecraft:air")) {
			eggNumber = 2;
		} else {
			eggName = eggName.replace("_spawn_egg", "");
			eggName = eggName.replace("1 ", "");
			eggName = eggName.replace("dungeon_defenders:", "");
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null) {
					_blockEntity.getPersistentData().putString("eggName3", eggName);
				}
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		}
		eggName = "" + itemFromBlockInventory(world, BlockPos.containing(x, y, z), 2).copy();
		if ((eggName).equals("0 minecraft:air")) {
			eggNumber = 1;
		} else {
			eggName = eggName.replace("_spawn_egg", "");
			eggName = eggName.replace("1 ", "");
			eggName = eggName.replace("dungeon_defenders:", "");
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null) {
					_blockEntity.getPersistentData().putString("eggName2", eggName);
				}
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		}
		eggName = "" + itemFromBlockInventory(world, BlockPos.containing(x, y, z), 1).copy();
		if ((eggName).equals("0 minecraft:air")) {
			eggNumber = 0;
		} else {
			eggName = eggName.replace("_spawn_egg", "");
			eggName = eggName.replace("1 ", "");
			eggName = eggName.replace("dungeon_defenders:", "");
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null) {
					_blockEntity.getPersistentData().putString("eggName1", eggName);
				}
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		}
		eggName = "" + itemFromBlockInventory(world, BlockPos.containing(x, y, z), 0).copy();
		if ((eggName).equals("0 minecraft:air")) {
			eggNumber = 0;
		} else {
			eggName = eggName.replace("_spawn_egg", "");
			eggName = eggName.replace("1 ", "");
			eggName = eggName.replace("dungeon_defenders:", "");
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null) {
					_blockEntity.getPersistentData().putString("eggName0", eggName);
				}
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
		}
		if (!world.isClientSide()) {
			BlockPos _bp = BlockPos.containing(x, y, z);
			BlockEntity _blockEntity = world.getBlockEntity(_bp);
			BlockState _bs = world.getBlockState(_bp);
			if (_blockEntity != null) {
				_blockEntity.getPersistentData().putDouble("DifferentEggToSpawn", eggNumber);
				_blockEntity.getPersistentData().putString("Interval", ((entity instanceof Player _entity9 && _entity9.containerMenu instanceof DungeonDefendersModMenus.MenuAccessor _menu9) ? _menu9.getMenuState(0, "SpawnInterval", "") : ""));
				_blockEntity.getPersistentData().putDouble("CurrentInterval", 0);
				_blockEntity.getPersistentData().putDouble("MultiplierSlot0", new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(new java.text.DecimalFormat("##").format(new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert((entity instanceof Player _entity12 && _entity12.containerMenu instanceof DungeonDefendersModMenus.MenuAccessor _menu12) ? _menu12.getMenuState(0, "Slot0Multiplier", "") : ""))));
				_blockEntity.getPersistentData().putDouble("MultiplierSlot1", new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(new java.text.DecimalFormat("##").format(new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert((entity instanceof Player _entity14 && _entity14.containerMenu instanceof DungeonDefendersModMenus.MenuAccessor _menu14) ? _menu14.getMenuState(0, "Slot1Multiplier", "") : ""))));
				_blockEntity.getPersistentData().putDouble("MultiplierSlot2", new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(new java.text.DecimalFormat("##").format(new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert((entity instanceof Player _entity16 && _entity16.containerMenu instanceof DungeonDefendersModMenus.MenuAccessor _menu16) ? _menu16.getMenuState(0, "Slot2Multiplier", "") : ""))));
				_blockEntity.getPersistentData().putDouble("MultiplierSlot3", new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert(new java.text.DecimalFormat("##").format(new Object() {
					double convert(String s) {
						try {
							return Double.parseDouble(s.trim());
						} catch (Exception e) {
						}
						return 0;
					}
				}.convert((entity instanceof Player _entity18 && _entity18.containerMenu instanceof DungeonDefendersModMenus.MenuAccessor _menu18) ? _menu18.getMenuState(0, "Slot3Multiplier", "") : ""))));
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