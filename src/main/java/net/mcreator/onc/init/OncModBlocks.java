
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.onc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.onc.block.ShinerBlock;
import net.mcreator.onc.block.OxygenBlock;
import net.mcreator.onc.block.BasicTileBlock;
import net.mcreator.onc.block.AirflowTileBlock;
import net.mcreator.onc.OncMod;

public class OncModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, OncMod.MODID);
	public static final RegistryObject<Block> OXYGEN = REGISTRY.register("oxygen", () -> new OxygenBlock());
	public static final RegistryObject<Block> BASIC_TILE = REGISTRY.register("basic_tile", () -> new BasicTileBlock());
	public static final RegistryObject<Block> AIRFLOW_TILE = REGISTRY.register("airflow_tile", () -> new AirflowTileBlock());
	public static final RegistryObject<Block> SHINER = REGISTRY.register("shiner", () -> new ShinerBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
