/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dungeondefenders.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.dungeondefenders.item.*;
import net.mcreator.dungeondefenders.DungeonDefendersMod;

import java.util.function.Function;

public class DungeonDefendersModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(DungeonDefendersMod.MODID);
	public static final DeferredItem<Item> MANA_TEST_1;
	public static final DeferredItem<Item> MANA_TEST_5;
	public static final DeferredItem<Item> MANA_TEST_10;
	public static final DeferredItem<Item> MANA_TEST_50;
	public static final DeferredItem<Item> MANA_TEST_500;
	public static final DeferredItem<Item> MANA_TEST_2000;
	public static final DeferredItem<Item> MANA_RESET;
	public static final DeferredItem<Item> CRYSTAL_SPAWN_EGG;
	public static final DeferredItem<Item> MANA_CHEST;
	static {
		MANA_TEST_1 = register("mana_test_1", ManaTest1Item::new);
		MANA_TEST_5 = register("mana_test_5", ManaTest5Item::new);
		MANA_TEST_10 = register("mana_test_10", ManaTest10Item::new);
		MANA_TEST_50 = register("mana_test_50", ManaTest50Item::new);
		MANA_TEST_500 = register("mana_test_500", ManaTest500Item::new);
		MANA_TEST_2000 = register("mana_test_2000", ManaTest2000Item::new);
		MANA_RESET = register("mana_reset", ManaResetItem::new);
		CRYSTAL_SPAWN_EGG = register("crystal_spawn_egg", properties -> new SpawnEggItem(DungeonDefendersModEntities.CRYSTAL.get(), properties));
		MANA_CHEST = block(DungeonDefendersModBlocks.MANA_CHEST, new Item.Properties().fireResistant());
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.registerItem(block.getId().getPath(), prop -> new BlockItem(block.get(), prop), properties);
	}
}