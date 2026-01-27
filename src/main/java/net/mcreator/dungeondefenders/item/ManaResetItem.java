package net.mcreator.dungeondefenders.item;

public class ManaResetItem extends Item {
	public ManaResetItem(Item.Properties properties) {
		super(properties);
	}

	@Override
	public InteractionResult use(Level world, Player entity, InteractionHand hand) {
		InteractionResult ar = super.use(world, entity, hand);
		ProcedureManaResetProcedure.execute(entity);
		return ar;
	}
}