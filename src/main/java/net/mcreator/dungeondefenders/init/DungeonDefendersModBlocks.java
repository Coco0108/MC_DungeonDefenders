/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dungeondefenders.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import net.mcreator.dungeondefenders.block.ManaChestBlock;
import net.mcreator.dungeondefenders.DungeonDefendersMod;

import java.util.function.Function;

public class DungeonDefendersModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(DungeonDefendersMod.MODID);
	public static final DeferredBlock<Block> MANA_CHEST;
	static {
		MANA_CHEST = register("mana_chest", ManaChestBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier);
	}
}