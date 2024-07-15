package net.mcreator.onc.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.onc.init.OncModBlocks;

public class ShineBugsOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x, y, z), OncModBlocks.SHINER.get().defaultBlockState(), 3);
	}
}
