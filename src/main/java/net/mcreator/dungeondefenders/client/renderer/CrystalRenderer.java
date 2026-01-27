package net.mcreator.dungeondefenders.client.renderer;

public class CrystalRenderer extends MobRenderer<CrystalEntity, LivingEntityRenderState, ModelCrystal> {
	private CrystalEntity entity = null;

	public CrystalRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelCrystal(context.bakeLayer(ModelCrystal.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(CrystalEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("dungeon_defenders:textures/entities/crystal.png");
	}
}