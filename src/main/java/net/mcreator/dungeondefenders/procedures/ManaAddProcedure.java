package net.mcreator.dungeondefenders.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

import net.mcreator.dungeondefenders.init.DungeonDefendersModItems;

public class ManaAddProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double ManaToDrop = 0;
		if ((itemstack.getDisplayName().getString()).equals(new ItemStack(DungeonDefendersModItems.MANA_TEST_1.get()).getDisplayName().getString())) {
			ManaToDrop = ManaAddPossibleProcedure.execute(entity, 1);
			ManaDropProcedure.execute(world, x, y, z, ManaToDrop);
		} else if ((itemstack.getDisplayName().getString()).equals(new ItemStack(DungeonDefendersModItems.MANA_TEST_5.get()).getDisplayName().getString())) {
			ManaToDrop = ManaAddPossibleProcedure.execute(entity, 5);
			ManaDropProcedure.execute(world, x, y, z, ManaToDrop);
		} else if ((itemstack.getDisplayName().getString()).equals(new ItemStack(DungeonDefendersModItems.MANA_TEST_10.get()).getDisplayName().getString())) {
			ManaToDrop = ManaAddPossibleProcedure.execute(entity, 10);
			ManaDropProcedure.execute(world, x, y, z, ManaToDrop);
		} else if ((itemstack.getDisplayName().getString()).equals(new ItemStack(DungeonDefendersModItems.MANA_TEST_50.get()).getDisplayName().getString())) {
			ManaToDrop = ManaAddPossibleProcedure.execute(entity, 50);
			ManaDropProcedure.execute(world, x, y, z, ManaToDrop);
		} else if ((itemstack.getDisplayName().getString()).equals(new ItemStack(DungeonDefendersModItems.MANA_TEST_500.get()).getDisplayName().getString())) {
			ManaToDrop = ManaAddPossibleProcedure.execute(entity, 500);
			ManaDropProcedure.execute(world, x, y, z, ManaToDrop);
		} else if ((itemstack.getDisplayName().getString()).equals(new ItemStack(DungeonDefendersModItems.MANA_TEST_2000.get()).getDisplayName().getString())) {
			ManaToDrop = ManaAddPossibleProcedure.execute(entity, 2000);
			ManaDropProcedure.execute(world, x, y, z, ManaToDrop);
		}
		itemstack.setCount(0);
	}
}