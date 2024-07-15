
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.onc.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.onc.potion.OxygenatedMobEffect;
import net.mcreator.onc.OncMod;

public class OncModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, OncMod.MODID);
	public static final RegistryObject<MobEffect> OXYGENATED = REGISTRY.register("oxygenated", () -> new OxygenatedMobEffect());
}
