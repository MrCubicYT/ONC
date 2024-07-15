package net.mcreator.onc.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

import net.mcreator.onc.init.OncModBlocks;

public class GasNavigationProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double rx = 0;
		double ry = 0;
		double rz = 0;
		double rand = 0;
		rx = x + Mth.nextInt(RandomSource.create(), -1, 1);
		rz = z + Mth.nextInt(RandomSource.create(), -1, 1);
		if (rx + rz == x + z) {
			ry = y + 1;
		} else {
			ry = y + Mth.nextInt(RandomSource.create(), -1, 1);
		}
		ry = y + 1;
		if ((world.getBlockState(BlockPos.containing(rx, ry, rz))).getBlock() == Blocks.AIR) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(rx, ry, rz), OncModBlocks.OXYGEN.get().defaultBlockState(), 3);
		} else {
			rand = Mth.nextInt(RandomSource.create(), 1, 3);
			if (rand == 1) {
				if ((world.getBlockState(BlockPos.containing(rx * (-1), ry, rz * (-1)))).getBlock() == Blocks.AIR) {
					world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(rx * (-1), ry, rz * (-1)), OncModBlocks.OXYGEN.get().defaultBlockState(), 3);
				} else {
					rand = Mth.nextInt(RandomSource.create(), 0, 1);
					if (rand == 0) {
						if ((world.getBlockState(BlockPos.containing(rx * (-1), ry, rz))).getBlock() == Blocks.AIR) {
							world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
							world.setBlock(BlockPos.containing(rx * (-1), ry, rz), OncModBlocks.OXYGEN.get().defaultBlockState(), 3);
						} else {
							if ((world.getBlockState(BlockPos.containing(rx, ry, rz * (-1)))).getBlock() == Blocks.AIR) {
								world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
								world.setBlock(BlockPos.containing(rx, ry, rz * (-1)), OncModBlocks.OXYGEN.get().defaultBlockState(), 3);
							}
						}
					} else {
						if ((world.getBlockState(BlockPos.containing(rx, ry, rz * (-1)))).getBlock() == Blocks.AIR) {
							world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
							world.setBlock(BlockPos.containing(rx, ry, rz * (-1)), OncModBlocks.OXYGEN.get().defaultBlockState(), 3);
						} else {
							if ((world.getBlockState(BlockPos.containing(rx * (-1), ry, rz))).getBlock() == Blocks.AIR) {
								world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
								world.setBlock(BlockPos.containing(rx * (-1), ry, rz), OncModBlocks.OXYGEN.get().defaultBlockState(), 3);
							}
						}
					}
				}
			} else if (rand == 2) {
				if ((world.getBlockState(BlockPos.containing(rx * (-1), ry, rz))).getBlock() == Blocks.AIR) {
					world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(rx * (-1), ry, rz), OncModBlocks.OXYGEN.get().defaultBlockState(), 3);
				} else {
					rand = Mth.nextInt(RandomSource.create(), 0, 1);
					if (rand == 0) {
						if ((world.getBlockState(BlockPos.containing(rx * (-1), ry, rz * (-1)))).getBlock() == Blocks.AIR) {
							world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
							world.setBlock(BlockPos.containing(rx * (-1), ry, rz * (-1)), OncModBlocks.OXYGEN.get().defaultBlockState(), 3);
						} else {
							if ((world.getBlockState(BlockPos.containing(rx, ry, rz * (-1)))).getBlock() == Blocks.AIR) {
								world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
								world.setBlock(BlockPos.containing(rx, ry, rz * (-1)), OncModBlocks.OXYGEN.get().defaultBlockState(), 3);
							}
						}
					} else {
						if ((world.getBlockState(BlockPos.containing(rx, ry, rz * (-1)))).getBlock() == Blocks.AIR) {
							world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
							world.setBlock(BlockPos.containing(rx, ry, rz * (-1)), OncModBlocks.OXYGEN.get().defaultBlockState(), 3);
						} else {
							if ((world.getBlockState(BlockPos.containing(rx * (-1), ry, rz * (-1)))).getBlock() == Blocks.AIR) {
								world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
								world.setBlock(BlockPos.containing(rx * (-1), ry, rz * (-1)), OncModBlocks.OXYGEN.get().defaultBlockState(), 3);
							}
						}
					}
				}
			} else {
				if ((world.getBlockState(BlockPos.containing(rx, ry, rz * (-1)))).getBlock() == Blocks.AIR) {
					world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(rx, ry, rz * (-1)), OncModBlocks.OXYGEN.get().defaultBlockState(), 3);
				} else {
					rand = Mth.nextInt(RandomSource.create(), 0, 1);
					if (rand == 0) {
						if ((world.getBlockState(BlockPos.containing(rx * (-1), ry, rz * (-1)))).getBlock() == Blocks.AIR) {
							world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
							world.setBlock(BlockPos.containing(rx * (-1), ry, rz * (-1)), OncModBlocks.OXYGEN.get().defaultBlockState(), 3);
						} else {
							if ((world.getBlockState(BlockPos.containing(rx * (-1), ry, rz))).getBlock() == Blocks.AIR) {
								world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
								world.setBlock(BlockPos.containing(rx * (-1), ry, rz), OncModBlocks.OXYGEN.get().defaultBlockState(), 3);
							}
						}
					} else {
						if ((world.getBlockState(BlockPos.containing(rx * (-1), ry, rz))).getBlock() == Blocks.AIR) {
							world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
							world.setBlock(BlockPos.containing(rx * (-1), ry, rz), OncModBlocks.OXYGEN.get().defaultBlockState(), 3);
						} else {
							if ((world.getBlockState(BlockPos.containing(rx * (-1), ry, rz * (-1)))).getBlock() == Blocks.AIR) {
								world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
								world.setBlock(BlockPos.containing(rx * (-1), ry, rz * (-1)), OncModBlocks.OXYGEN.get().defaultBlockState(), 3);
							}
						}
					}
				}
			}
		}
	}
}
