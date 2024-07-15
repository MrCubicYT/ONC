package net.mcreator.onc.procedures;

import net.minecraftforge.eventbus.api.Event;

public class ShineBugsOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x, y, z), OncModItems.DELETED_MOD_ELEMENT.get().defaultBlockState(), 3);
	}
}
