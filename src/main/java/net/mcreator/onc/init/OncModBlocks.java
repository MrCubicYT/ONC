
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.onc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.onc.block.OxygenBlock;
import net.mcreator.onc.OncMod;

public class OncModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, OncMod.MODID);
	public static final RegistryObject<Block> OXYGEN = REGISTRY.register("oxygen", () -> new OxygenBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
