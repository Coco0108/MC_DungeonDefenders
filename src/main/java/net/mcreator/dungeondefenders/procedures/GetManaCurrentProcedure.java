package net.mcreator.dungeondefenders.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.dungeondefenders.network.DungeonDefendersModVariables;

public class GetManaCurrentProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return new java.text.DecimalFormat("##").format(entity.getData(DungeonDefendersModVariables.PLAYER_VARIABLES).Mana_Current) + "";
	}
}