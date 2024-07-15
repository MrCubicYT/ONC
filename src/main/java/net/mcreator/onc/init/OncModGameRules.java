
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.onc.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class OncModGameRules {
	public static final GameRules.Key<GameRules.IntegerValue> GRAVITY = GameRules.register("gravity", GameRules.Category.UPDATES, GameRules.IntegerValue.create(10));
}
