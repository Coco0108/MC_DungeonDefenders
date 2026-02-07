package net.mcreator.dungeondefenders.procedures;

import net.minecraft.world.level.storage.WritableLevelData;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class ChooseMapProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double currentMapId = 0;
		currentMapId = getBlockNBTNumber(world, BlockPos.containing(x, y, z), "mapId");
		ClearZoneProcedure.execute(world, x, y, z);
		if (currentMapId == 0) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("dungeon_defenders", "testspawner"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(100, 55, 100), new BlockPos(100, 55, 100), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
				}
			}
		} else if (currentMapId == 1) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("dungeon_defenders", "corridor"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(100, 55, 100), new BlockPos(100, 55, 100), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
				}
			}
		}
		{
			Entity _ent = entity;
			_ent.teleportTo(102, 56, 102);
			if (_ent instanceof ServerPlayer _serverPlayer)
				_serverPlayer.connection.teleport(102, 56, 102, _ent.getYRot(), _ent.getXRot());
		}
		if (world.getLevelData() instanceof WritableLevelData _levelData)
			_levelData.setSpawn(new BlockPos(102, 56, 102), 0);
		if (entity instanceof Player _player)
			_player.closeContainer();
	}

	private static double getBlockNBTNumber(LevelAccessor world, BlockPos pos, String tag) {
		BlockEntity blockEntity = world.getBlockEntity(pos);
		if (blockEntity != null)
			return blockEntity.getPersistentData().getDoubleOr(tag, 0);
		return -1;
	}
}