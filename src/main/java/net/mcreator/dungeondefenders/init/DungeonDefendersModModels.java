/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dungeondefenders.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.dungeondefenders.client.model.Modelspikeblockade;
import net.mcreator.dungeondefenders.client.model.Modelorc;
import net.mcreator.dungeondefenders.client.model.ModelPetitbelin;
import net.mcreator.dungeondefenders.client.model.ModelCrystal;

@EventBusSubscriber(Dist.CLIENT)
public class DungeonDefendersModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelorc.LAYER_LOCATION, Modelorc::createBodyLayer);
		event.registerLayerDefinition(Modelspikeblockade.LAYER_LOCATION, Modelspikeblockade::createBodyLayer);
		event.registerLayerDefinition(ModelCrystal.LAYER_LOCATION, ModelCrystal::createBodyLayer);
		event.registerLayerDefinition(ModelPetitbelin.LAYER_LOCATION, ModelPetitbelin::createBodyLayer);
	}
}