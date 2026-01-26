/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dungeondefenders.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.dungeondefenders.DungeonDefendersMod;

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
			}).build());
}