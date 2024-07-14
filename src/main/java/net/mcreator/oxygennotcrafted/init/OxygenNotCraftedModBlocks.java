
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.oxygennotcrafted.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.oxygennotcrafted.block.OxygenBlock;
import net.mcreator.oxygennotcrafted.OxygenNotCraftedMod;

public class OxygenNotCraftedModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, OxygenNotCraftedMod.MODID);
	public static final RegistryObject<Block> OXYGEN = REGISTRY.register("oxygen", () -> new OxygenBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
