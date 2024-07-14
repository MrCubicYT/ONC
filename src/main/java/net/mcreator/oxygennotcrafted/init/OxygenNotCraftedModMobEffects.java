
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.oxygennotcrafted.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.oxygennotcrafted.potion.OxygenatedMobEffect;
import net.mcreator.oxygennotcrafted.OxygenNotCraftedMod;

public class OxygenNotCraftedModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, OxygenNotCraftedMod.MODID);
	public static final RegistryObject<MobEffect> OXYGENATED = REGISTRY.register("oxygenated", () -> new OxygenatedMobEffect());
}