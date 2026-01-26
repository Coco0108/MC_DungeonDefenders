/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dungeondefenders.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.dungeondefenders.client.renderer.SpikeBlockadeRenderer;
import net.mcreator.dungeondefenders.client.renderer.OrcRenderer;
import net.mcreator.dungeondefenders.client.renderer.CrystalRenderer;

@EventBusSubscriber(Dist.CLIENT)
public class DungeonDefendersModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(DungeonDefendersModEntities.CRYSTAL.get(), CrystalRenderer::new);
		event.registerEntityRenderer(DungeonDefendersModEntities.SPIKE_BLOCKADE.get(), SpikeBlockadeRenderer::new);
		event.registerEntityRenderer(DungeonDefendersModEntities.ORC.get(), OrcRenderer::new);
	}
}