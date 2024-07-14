package net.mcreator.oxygennotcrafted.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class GasNavigationProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		world.setBlock(BlockPos.containing(x + Math.random(), y + Math.random(), z + Math.random()), blockstate, 3);
	}
}
