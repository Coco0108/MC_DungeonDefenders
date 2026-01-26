package net.mcreator.dungeondefenders.client.renderer;

public class OrcRenderer extends MobRenderer<OrcEntity, LivingEntityRenderState, Modelorc> {
	private OrcEntity entity = null;

	public OrcRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelorc(context.bakeLayer(Modelorc.LAYER_LOCATION)), 1f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(OrcEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("dungeon_defenders:textures/entities/orc.png");
	}
}