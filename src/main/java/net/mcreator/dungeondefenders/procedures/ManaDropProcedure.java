package net.mcreator.dungeondefenders.procedures;

import org.objectweb.asm.tree.analysis.Value;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.dungeondefenders.init.DungeonDefendersModItems;
import net.mcreator.dungeondefenders.DungeonDefendersMod;

public class ManaDropProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, double ManaValue) {
		double Value = 0;
		double NumberOfRepeat = 0;
		Value = ManaValue;
		if (Value >= 2000) {
			NumberOfRepeat = Math.floor(Value / 2000);
			for (int index0 = 0; index0 < (int) NumberOfRepeat; index0++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(DungeonDefendersModItems.MANA_TEST_2000.get()));
					entityToSpawn.setPickUpDelay(600);
					_level.addFreshEntity(entityToSpawn);
				}
				Value = Value - 2000;
			}
		}
		if (Value >= 500) {
			NumberOfRepeat = Math.floor(Value / 500);
			for (int index1 = 0; index1 < (int) NumberOfRepeat; index1++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(DungeonDefendersModItems.MANA_TEST_500.get()));
					entityToSpawn.setPickUpDelay(600);
					_level.addFreshEntity(entityToSpawn);
				}
				Value = Value - 500;
			}
		}
		if (Value >= 50) {
			NumberOfRepeat = Math.floor(Value / 50);
			DungeonDefendersMod.LOGGER.warn((new java.text.DecimalFormat("##.##").format(NumberOfRepeat)));
			for (int index2 = 0; index2 < (int) NumberOfRepeat; index2++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(DungeonDefendersModItems.MANA_TEST_50.get()));
					entityToSpawn.setPickUpDelay(600);
					_level.addFreshEntity(entityToSpawn);
				}
				Value = Value - 50;
			}
		}
		if (Value >= 10) {
			NumberOfRepeat = Math.floor(Value / 10);
			DungeonDefendersMod.LOGGER.warn((new java.text.DecimalFormat("##.##").format(NumberOfRepeat)));
			for (int index3 = 0; index3 < (int) NumberOfRepeat; index3++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(DungeonDefendersModItems.MANA_TEST_10.get()));
					entityToSpawn.setPickUpDelay(600);
					_level.addFreshEntity(entityToSpawn);
				}
				Value = Value - 10;
			}
		}
		if (Value >= 5) {
			NumberOfRepeat = Math.floor(Value / 5);
			for (int index4 = 0; index4 < (int) NumberOfRepeat; index4++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(DungeonDefendersModItems.MANA_TEST_5.get()));
					entityToSpawn.setPickUpDelay(600);
					_level.addFreshEntity(entityToSpawn);
				}
				Value = Value - 5;
			}
		}
		if (Value >= 1) {
			NumberOfRepeat = Value;
			for (int index5 = 0; index5 < (int) NumberOfRepeat; index5++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(DungeonDefendersModItems.MANA_TEST_1.get()));
					entityToSpawn.setPickUpDelay(600);
					_level.addFreshEntity(entityToSpawn);
				}
				Value = Value - 1;
			}
		}
	}
}