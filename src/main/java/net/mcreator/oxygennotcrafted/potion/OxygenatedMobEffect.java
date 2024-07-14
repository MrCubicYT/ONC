
package net.mcreator.oxygennotcrafted.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class OxygenatedMobEffect extends MobEffect {
	public OxygenatedMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -5177358);
	}

	@Override
	public boolean isInstantenous() {
		return true;
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
