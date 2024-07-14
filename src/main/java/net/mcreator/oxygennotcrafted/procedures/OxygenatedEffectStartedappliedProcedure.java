package net.mcreator.oxygennotcrafted.procedures;

import net.minecraftforge.eventbus.api.Event;

public class OxygenatedEffectStartedappliedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(MobEffects.WITHER);
	}
}
