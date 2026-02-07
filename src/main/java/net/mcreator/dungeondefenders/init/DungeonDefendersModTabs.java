/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dungeondefenders.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.dungeondefenders.DungeonDefendersMod;

@EventBusSubscriber
public class DungeonDefendersModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DungeonDefendersMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> GAMEPLAY = REGISTRY.register("gameplay",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.dungeon_defenders.gameplay")).icon(() -> new ItemStack(DungeonDefendersModItems.MANA_TEST_1.get())).displayItems((parameters, tabData) -> {
				tabData.accept(DungeonDefendersModItems.MANA_TEST_1.get());
				tabData.accept(DungeonDefendersModItems.MANA_TEST_5.get());
				tabData.accept(DungeonDefendersModItems.MANA_TEST_10.get());
				tabData.accept(DungeonDefendersModItems.MANA_TEST_50.get());
				tabData.accept(DungeonDefendersModItems.MANA_TEST_500.get());
				tabData.accept(DungeonDefendersModItems.MANA_TEST_2000.get());
				tabData.accept(DungeonDefendersModItems.MANA_RESET.get());
				tabData.accept(DungeonDefendersModItems.CRYSTAL_SPAWN_EGG.get());
				tabData.accept(DungeonDefendersModBlocks.MANA_CHEST.get().asItem());
				tabData.accept(DungeonDefendersModBlocks.SPAWNER.get().asItem());
			}).build());
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> TOWER = REGISTRY.register("tower",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.dungeon_defenders.tower")).icon(() -> new ItemStack(DungeonDefendersModItems.SPIKE_BLOCKADE_EGG.get())).displayItems((parameters, tabData) -> {
				tabData.accept(DungeonDefendersModItems.SPIKE_BLOCKADE_EGG.get());
			}).withTabsBefore(GAMEPLAY.getId()).build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(DungeonDefendersModItems.GOBELIN_SPAWN_EGG.get());
			tabData.accept(DungeonDefendersModItems.ORC_SPAWN_EGG.get());
			tabData.accept(DungeonDefendersModItems.SPIKE_BLOCKADE_SPAWN_EGG.get());
		}
	}
}