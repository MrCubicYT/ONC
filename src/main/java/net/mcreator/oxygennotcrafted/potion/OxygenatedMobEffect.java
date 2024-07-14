
package net.mcreator.oxygennotcrafted.potion;

public class OxygenatedMobEffect extends MobEffect {
	public OxygenatedMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -5177358);
	}

	@Override
	public boolean isInstantenous() {
		return true;
	}

	@Override
	public void applyInstantenousEffect(Entity source, Entity indirectSource, LivingEntity entity, int amplifier, double health) {
		OxygenatedEffectStartedappliedProcedure.execute();
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}