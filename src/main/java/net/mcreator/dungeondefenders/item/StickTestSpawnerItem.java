package net.mcreator.dungeondefenders.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;

import net.mcreator.dungeondefenders.procedures.StickTestSpawnerRightclickedProcedure;

public class StickTestSpawnerItem extends Item {
	public StickTestSpawnerItem(Item.Properties properties) {
		super(properties.stacksTo(1));
	}

	@Override
	public InteractionResult use(Level world, Player entity, InteractionHand hand) {
		InteractionResult ar = super.use(world, entity, hand);
		StickTestSpawnerRightclickedProcedure.execute(world);
		return ar;
	}
}