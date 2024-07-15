
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.onc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.onc.OncMod;

public class OncModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, OncMod.MODID);
	public static final RegistryObject<Item> OXYGEN = block(OncModBlocks.OXYGEN);
	public static final RegistryObject<Item> BASIC_TILE = block(OncModBlocks.BASIC_TILE);
	public static final RegistryObject<Item> AIRFLOW_TILE = block(OncModBlocks.AIRFLOW_TILE);
	public static final RegistryObject<Item> SHINE_BUGS_SPAWN_EGG = REGISTRY.register("shine_bugs_spawn_egg", () -> new ForgeSpawnEggItem(OncModEntities.SHINE_BUGS, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> SHINER = block(OncModBlocks.SHINER);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
