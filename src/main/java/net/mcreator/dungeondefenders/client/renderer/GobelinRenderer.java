package net.mcreator.dungeondefenders.client.renderer;

public class GobelinRenderer extends MobRenderer<GobelinEntity, LivingEntityRenderState, ModelPetitbelin> {
	private GobelinEntity entity = null;

	public GobelinRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelPetitbelin(context.bakeLayer(ModelPetitbelin.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(GobelinEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("dungeon_defenders:textures/entities/gobelin.png");
	}
}