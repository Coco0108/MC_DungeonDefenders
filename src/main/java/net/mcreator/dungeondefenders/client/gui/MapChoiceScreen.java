package net.mcreator.dungeondefenders.client.gui;

import net.neoforged.neoforge.client.network.ClientPacketDistributor;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.dungeondefenders.world.inventory.MapChoiceMenu;
import net.mcreator.dungeondefenders.procedures.GetRightArrowVisibilityProcedure;
import net.mcreator.dungeondefenders.procedures.GetMapNameProcedure;
import net.mcreator.dungeondefenders.procedures.GetLeftArrowVisibilityProcedure;
import net.mcreator.dungeondefenders.network.MapChoiceButtonMessage;
import net.mcreator.dungeondefenders.init.DungeonDefendersModScreens;

public class MapChoiceScreen extends AbstractContainerScreen<MapChoiceMenu> implements DungeonDefendersModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	private Button button_map_test;
	private Button button_empty;
	private Button button_empty1;

	public MapChoiceScreen(MapChoiceMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 220;
		this.imageHeight = 160;
	}

	@Override
	public void updateMenuState(int elementType, String name, Object elementState) {
		menuStateUpdateActive = true;
		menuStateUpdateActive = false;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("dungeon_defenders:textures/screens/map_choice.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int mouseX, int mouseY) {
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ResourceLocation.parse("dungeon_defenders:textures/screens/choicemapgui.png"), this.leftPos + -11, this.topPos + -7, 0, 0, 240, 180, 240, 180);
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, GetMapNameProcedure.execute(world, x, y, z), 83, 104, -1, false);
	}

	@Override
	public void init() {
		super.init();
		button_map_test = Button.builder(Component.translatable("gui.dungeon_defenders.map_choice.button_map_test"), e -> {
			int x = MapChoiceScreen.this.x;
			int y = MapChoiceScreen.this.y;
			if (true) {
				ClientPacketDistributor.sendToServer(new MapChoiceButtonMessage(0, x, y, z));
				MapChoiceButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 77, this.topPos + 121, 66, 20).build();
		this.addRenderableWidget(button_map_test);
		button_empty = Button.builder(Component.translatable("gui.dungeon_defenders.map_choice.button_empty"), e -> {
			int x = MapChoiceScreen.this.x;
			int y = MapChoiceScreen.this.y;
			if (GetRightArrowVisibilityProcedure.execute(world, x, y, z)) {
				ClientPacketDistributor.sendToServer(new MapChoiceButtonMessage(1, x, y, z));
				MapChoiceButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 163, this.topPos + 121, 30, 20).build();
		this.addRenderableWidget(button_empty);
		button_empty1 = Button.builder(Component.translatable("gui.dungeon_defenders.map_choice.button_empty1"), e -> {
			int x = MapChoiceScreen.this.x;
			int y = MapChoiceScreen.this.y;
			if (GetLeftArrowVisibilityProcedure.execute(world, x, y, z)) {
				ClientPacketDistributor.sendToServer(new MapChoiceButtonMessage(2, x, y, z));
				MapChoiceButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 28, this.topPos + 121, 30, 20).build();
		this.addRenderableWidget(button_empty1);
	}

	@Override
	protected void containerTick() {
		super.containerTick();
		this.button_empty.visible = GetRightArrowVisibilityProcedure.execute(world, x, y, z);
		this.button_empty1.visible = GetLeftArrowVisibilityProcedure.execute(world, x, y, z);
	}
}