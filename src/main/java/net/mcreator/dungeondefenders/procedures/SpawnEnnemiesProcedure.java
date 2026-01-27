package net.mcreator.dungeondefenders.procedures;

import net.neoforged.bus.api.Event;

public class SpawnEnnemiesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		String ItemName = "";
		String Command = "";
		String EggName = "";
		ItemName = "" + (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY);
		if (ItemName.contains("_spawn_egg")) {
			ItemName = ItemName.replace("_spawn_egg", "");
			EggName = ItemName.replace("1 ", "");
			DungeonDefendersMod.LOGGER.warn(EggName);
			Command = "summon " + EggName;
			DungeonDefendersMod.LOGGER.warn(Command);
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), Command);
		}
	}
}