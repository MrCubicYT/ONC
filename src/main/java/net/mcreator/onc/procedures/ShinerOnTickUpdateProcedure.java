package net.mcreator.onc.procedures;

import net.minecraftforge.eventbus.api.Event;

public class ShinerOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
	}
}
