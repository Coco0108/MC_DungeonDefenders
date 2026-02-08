package net.mcreator.dungeondefenders.client.gui;

import net.neoforged.neoforge.client.network.ClientPacketDistributor;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.Minecraft;

import net.mcreator.dungeondefenders.world.inventory.SpawnerGUIMenu;
import net.mcreator.dungeondefenders.procedures.GetEggName3Procedure;
import net.mcreator.dungeondefenders.procedures.GetEggName2Procedure;
import net.mcreator.dungeondefenders.procedures.GetEggName1Procedure;
import net.mcreator.dungeondefenders.procedures.GetEggName0Procedure;
import net.mcreator.dungeondefenders.network.SpawnerGUIButtonMessage;
import net.mcreator.dungeondefenders.init.DungeonDefendersModScreens;

public class SpawnerGUIScreen extends AbstractContainerScreen<SpawnerGUIMenu> implements DungeonDefendersModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	private EditBox SpawnInterval;
	private EditBox Slot0Multiplier;
	private EditBox Slot1Multiplier;
	private EditBox Slot2Multiplier;
	private EditBox Slot3Multiplier;
	private Button button_confirmer;

	public SpawnerGUIScreen(SpawnerGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 260;
		this.imageHeight = 220;
	}

	@Override
	public void updateMenuState(int elementType, String name, Object elementState) {
		menuStateUpdateActive = true;
		if (elementType == 0 && elementState instanceof String stringState) {
			if (name.equals("SpawnInterval"))
				SpawnInterval.setValue(stringState);
			else if (name.equals("Slot0Multiplier"))
				Slot0Multiplier.setValue(stringState);
			else if (name.equals("Slot1Multiplier"))
				Slot1Multiplier.setValue(stringState);
			else if (name.equals("Slot2Multiplier"))
				Slot2Multiplier.setValue(stringState);
			else if (name.equals("Slot3Multiplier"))
				Slot3Multiplier.setValue(stringState);
		}
		menuStateUpdateActive = false;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("dungeon_defenders:textures/screens/spawner_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		SpawnInterval.render(guiGraphics, mouseX, mouseY, partialTicks);
		Slot0Multiplier.render(guiGraphics, mouseX, mouseY, partialTicks);
		Slot1Multiplier.render(guiGraphics, mouseX, mouseY, partialTicks);
		Slot2Multiplier.render(guiGraphics, mouseX, mouseY, partialTicks);
		Slot3Multiplier.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int mouseX, int mouseY) {
		guiGraphics.blit(RenderPipelines.GUI_TEXTURED, texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		if (SpawnInterval.isFocused())
			return SpawnInterval.keyPressed(key, b, c);
		if (Slot0Multiplier.isFocused())
			return Slot0Multiplier.keyPressed(key, b, c);
		if (Slot1Multiplier.isFocused())
			return Slot1Multiplier.keyPressed(key, b, c);
		if (Slot2Multiplier.isFocused())
			return Slot2Multiplier.keyPressed(key, b, c);
		if (Slot3Multiplier.isFocused())
			return Slot3Multiplier.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void resize(Minecraft minecraft, int width, int height) {
		String SpawnIntervalValue = SpawnInterval.getValue();
		String Slot0MultiplierValue = Slot0Multiplier.getValue();
		String Slot1MultiplierValue = Slot1Multiplier.getValue();
		String Slot2MultiplierValue = Slot2Multiplier.getValue();
		String Slot3MultiplierValue = Slot3Multiplier.getValue();
		super.resize(minecraft, width, height);
		SpawnInterval.setValue(SpawnIntervalValue);
		Slot0Multiplier.setValue(Slot0MultiplierValue);
		Slot1Multiplier.setValue(Slot1MultiplierValue);
		Slot2Multiplier.setValue(Slot2MultiplierValue);
		Slot3Multiplier.setValue(Slot3MultiplierValue);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.dungeon_defenders.spawner_gui.label_spawn_interval"), 22, 97, -12829636, false);
		guiGraphics.drawString(this.font, GetEggName0Procedure.execute(world, x, y, z), 22, 7, -12829636, false);
		guiGraphics.drawString(this.font, GetEggName1Procedure.execute(world, x, y, z), 82, 7, -12829636, false);
		guiGraphics.drawString(this.font, GetEggName2Procedure.execute(world, x, y, z), 142, 7, -12829636, false);
		guiGraphics.drawString(this.font, GetEggName3Procedure.execute(world, x, y, z), 202, 7, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		SpawnInterval = new EditBox(this.font, this.leftPos + 23, this.topPos + 107, 118, 18, Component.translatable("gui.dungeon_defenders.spawner_gui.SpawnInterval"));
		SpawnInterval.setMaxLength(8192);
		SpawnInterval.setResponder(content -> {
			if (!menuStateUpdateActive)
				menu.sendMenuStateUpdate(entity, 0, "SpawnInterval", content, false);
		});
		this.addWidget(this.SpawnInterval);
		Slot0Multiplier = new EditBox(this.font, this.leftPos + 33, this.topPos + 53, 118, 18, Component.translatable("gui.dungeon_defenders.spawner_gui.Slot0Multiplier"));
		Slot0Multiplier.setMaxLength(8192);
		Slot0Multiplier.setResponder(content -> {
			if (!menuStateUpdateActive)
				menu.sendMenuStateUpdate(entity, 0, "Slot0Multiplier", content, false);
		});
		this.addWidget(this.Slot0Multiplier);
		Slot1Multiplier = new EditBox(this.font, this.leftPos + 93, this.topPos + 53, 118, 18, Component.translatable("gui.dungeon_defenders.spawner_gui.Slot1Multiplier"));
		Slot1Multiplier.setMaxLength(8192);
		Slot1Multiplier.setResponder(content -> {
			if (!menuStateUpdateActive)
				menu.sendMenuStateUpdate(entity, 0, "Slot1Multiplier", content, false);
		});
		this.addWidget(this.Slot1Multiplier);
		Slot2Multiplier = new EditBox(this.font, this.leftPos + 153, this.topPos + 53, 118, 18, Component.translatable("gui.dungeon_defenders.spawner_gui.Slot2Multiplier"));
		Slot2Multiplier.setMaxLength(8192);
		Slot2Multiplier.setResponder(content -> {
			if (!menuStateUpdateActive)
				menu.sendMenuStateUpdate(entity, 0, "Slot2Multiplier", content, false);
		});
		this.addWidget(this.Slot2Multiplier);
		Slot3Multiplier = new EditBox(this.font, this.leftPos + 213, this.topPos + 53, 118, 18, Component.translatable("gui.dungeon_defenders.spawner_gui.Slot3Multiplier"));
		Slot3Multiplier.setMaxLength(8192);
		Slot3Multiplier.setResponder(content -> {
			if (!menuStateUpdateActive)
				menu.sendMenuStateUpdate(entity, 0, "Slot3Multiplier", content, false);
		});
		this.addWidget(this.Slot3Multiplier);
		button_confirmer = Button.builder(Component.translatable("gui.dungeon_defenders.spawner_gui.button_confirmer"), e -> {
			int x = SpawnerGUIScreen.this.x;
			int y = SpawnerGUIScreen.this.y;
			if (true) {
				ClientPacketDistributor.sendToServer(new SpawnerGUIButtonMessage(0, x, y, z));
				SpawnerGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 162, this.topPos + 106, 72, 20).build();
		this.addRenderableWidget(button_confirmer);
	}
}