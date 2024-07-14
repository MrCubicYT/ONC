
package net.mcreator.oxygennotcrafted.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.oxygennotcrafted.procedures.KillmepleaseProcedure;

public class OxygenatedMobEffect extends MobEffect {
	public OxygenatedMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -5177358);
	}

	@Override
	public boolean isInstantenous() {
		return true;
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		KillmepleaseProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
