/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dungeondefenders.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.dungeondefenders.client.gui.SpawnerGUIScreen;

@EventBusSubscriber(Dist.CLIENT)
public class DungeonDefendersModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(DungeonDefendersModMenus.SPAWNER_GUI.get(), SpawnerGUIScreen::new);
	}

	public interface ScreenAccessor {
		void updateMenuState(int elementType, String name, Object elementState);
	}
}