package net.mcreator.dungeondefenders.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.neoforged.neoforge.client.event.RenderGuiEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.EventPriority;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.chat.Component;
import net.minecraft.client.Minecraft;

import net.mcreator.dungeondefenders.procedures.GetManaCurrentProcedure;
import net.mcreator.dungeondefenders.procedures.GetEnnemyLeftProcedure;

@EventBusSubscriber(Dist.CLIENT)
public class HUDOverlay {
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getGuiGraphics().guiWidth();
		int h = event.getGuiGraphics().guiHeight();
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level();
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		if (true) {
			event.getGuiGraphics().drawString(Minecraft.getInstance().font, Component.translatable("gui.dungeon_defenders.hud.label_mana"), 24, 8, -1, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					GetManaCurrentProcedure.execute(entity), w / 2 + -153, h / 2 + -112, -16776961, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					GetEnnemyLeftProcedure.execute(world), 357, 8, -65536, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font, Component.translatable("gui.dungeon_defenders.hud.label_ennemy_left"), w / 2 + 81, h / 2 + -112, -1, false);
		}
	}
}