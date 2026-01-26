package net.mcreator.dungeondefenders.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.dungeondefenders.entity.SpikeBlockadeEntity;
import net.mcreator.dungeondefenders.client.model.Modelspikewall;

public class SpikeBlockadeRenderer extends MobRenderer<SpikeBlockadeEntity, LivingEntityRenderState, Modelspikewall> {
	private SpikeBlockadeEntity entity = null;

	public SpikeBlockadeRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelspikewall(context.bakeLayer(Modelspikewall.LAYER_LOCATION)), 1f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(SpikeBlockadeEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return ResourceLocation.parse("dungeon_defenders:textures/entities/spikeblockade.png");
	}
}