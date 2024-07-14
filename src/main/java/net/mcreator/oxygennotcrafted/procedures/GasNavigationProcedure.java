package net.mcreator.oxygennotcrafted.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class GasNavigationProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		double rx = 0;
		double ry = 0;
		double rz = 0;
		rx = x + Math.random();
		ry = y + Math.random();
		rz = z + Math.random();
		if (blockstate.canSurvive(world, BlockPos.containing(rx, ry, rz))) {
			world.setBlock(BlockPos.containing(rx, ry, rz), blockstate, 3);
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		}
	}
}
