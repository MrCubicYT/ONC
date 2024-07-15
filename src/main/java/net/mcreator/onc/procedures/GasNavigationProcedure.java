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
		double rxinverse = 0;
		double diffx = 0;
		double diffz = 0;
		double rzinverse = 0;
		double zup = 0;
		double zdown = 0;
		double xup = 0;
		double xdown = 0;
		diffx = Mth.nextInt(RandomSource.create(), -1, 1);
		if (diffx == 0) {
			diffz = Mth.nextInt(RandomSource.create(), -1, 1);
		} else {
			diffz = 0;
		}
		rx = x + diffx;
		rz = z + diffz;
		rxinverse = x + diffx * (-1);
		rzinverse = z + diffz * (-1);
		ry = y + 1;
		zup = z + 1;
		zdown = z - 1;
		xup = x + 1;
		xdown = x - 1;
		if ((world.getBlockState(BlockPos.containing(rx, ry, rz))).getBlock() == Blocks.AIR) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(rx, ry, rz), OncModBlocks.OXYGEN.get().defaultBlockState(), 3);
		} else {
			if (diffx == 0) {
				rand = Mth.nextInt(RandomSource.create(), 1, 3);
				if (rand == 1) {
					if ((world.getBlockState(BlockPos.containing(x, ry, rzinverse))).getBlock() == Blocks.AIR) {
						world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
						world.setBlock(BlockPos.containing(x, ry, rzinverse), OncModBlocks.OXYGEN.get().defaultBlockState(), 3);
					} else {
						rand = Mth.nextInt(RandomSource.create(), 1, 2);
						if (rand == 1) {
							if ((world.getBlockState(BlockPos.containing(x, y, rzinverse))).getBlock() == Blocks.AIR) {
								world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
								world.setBlock(BlockPos.containing(x, y, rzinverse), OncModBlocks.OXYGEN.get().defaultBlockState(), 3);
							} else {
								if ((world.getBlockState(BlockPos.containing(x, y, rz))).getBlock() == Blocks.AIR) {
									world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
									world.setBlock(BlockPos.containing(x, y, rz), OncModBlocks.OXYGEN.get().defaultBlockState(), 3);
								}
							}
						} else {
							if ((world.getBlockState(BlockPos.containing(x, y, rz))).getBlock() == Blocks.AIR) {
								world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
								world.setBlock(BlockPos.containing(x, y, rz), OncModBlocks.OXYGEN.get().defaultBlockState(), 3);
							} else {
								if ((world.getBlockState(BlockPos.containing(x, y, rzinverse))).getBlock() == Blocks.AIR) {
									world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
									world.setBlock(BlockPos.containing(x, y, rzinverse), OncModBlocks.OXYGEN.get().defaultBlockState(), 3);
								}
							}
						}
					}
				} else if (rand == 2) {
					if ((world.getBlockState(BlockPos.containing(x, y, rzinverse))).getBlock() == Blocks.AIR) {
						world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
						world.setBlock(BlockPos.containing(x, y, rzinverse), OncModBlocks.OXYGEN.get().defaultBlockState(), 3);
					} else {
						rand = Mth.nextInt(RandomSource.create(), 1, 2);
						if (rand == 1) {
							if ((world.getBlockState(BlockPos.containing(x, ry, rzinverse))).getBlock() == Blocks.AIR) {
								world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
								world.setBlock(BlockPos.containing(x, ry, rzinverse), OncModBlocks.OXYGEN.get().defaultBlockState(), 3);
							} else {
								if ((world.getBlockState(BlockPos.containing(x, y, rz))).getBlock() == Blocks.AIR) {
									world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
									world.setBlock(BlockPos.containing(x, y, rz), OncModBlocks.OXYGEN.get().defaultBlockState(), 3);
								}
							}
						} else {
							if ((world.getBlockState(BlockPos.containing(x, y, rz))).getBlock() == Blocks.AIR) {
								world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
								world.setBlock(BlockPos.containing(x, y, rz), OncModBlocks.OXYGEN.get().defaultBlockState(), 3);
							} else {
								if ((world.getBlockState(BlockPos.containing(x, ry, rzinverse))).getBlock() == Blocks.AIR) {
									world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
									world.setBlock(BlockPos.containing(x, ry, rzinverse), OncModBlocks.OXYGEN.get().defaultBlockState(), 3);
								}
							}
						}
					}
				} else {
					if ((world.getBlockState(BlockPos.containing(x, y, rz))).getBlock() == Blocks.AIR) {
						world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
						world.setBlock(BlockPos.containing(x, y, rz), OncModBlocks.OXYGEN.get().defaultBlockState(), 3);
					} else {
						rand = Mth.nextInt(RandomSource.create(), 1, 2);
						if (rand == 1) {
							if ((world.getBlockState(BlockPos.containing(x, ry, rzinverse))).getBlock() == Blocks.AIR) {
								world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
								world.setBlock(BlockPos.containing(x, ry, rzinverse), OncModBlocks.OXYGEN.get().defaultBlockState(), 3);
							} else {
								if ((world.getBlockState(BlockPos.containing(x, y, rzinverse))).getBlock() == Blocks.AIR) {
									world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
									world.setBlock(BlockPos.containing(x, y, rzinverse), OncModBlocks.OXYGEN.get().defaultBlockState(), 3);
								}
							}
						} else {
							if ((world.getBlockState(BlockPos.containing(x, y, rzinverse))).getBlock() == Blocks.AIR) {
								world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
								world.setBlock(BlockPos.containing(x, y, rzinverse), OncModBlocks.OXYGEN.get().defaultBlockState(), 3);
							} else {
								if ((world.getBlockState(BlockPos.containing(x, ry, rzinverse))).getBlock() == Blocks.AIR) {
									world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
									world.setBlock(BlockPos.containing(x, ry, rzinverse), OncModBlocks.OXYGEN.get().defaultBlockState(), 3);
								}
							}
						}
					}
				}
			} else {
				rand = Mth.nextInt(RandomSource.create(), 1, 3);
				if (rand == 1) {
					if ((world.getBlockState(BlockPos.containing(rxinverse, ry, z))).getBlock() == Blocks.AIR) {
						world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
						world.setBlock(BlockPos.containing(rxinverse, ry, z), OncModBlocks.OXYGEN.get().defaultBlockState(), 3);
					} else {
						rand = Mth.nextInt(RandomSource.create(), 1, 2);
						if (rand == 1) {
							if ((world.getBlockState(BlockPos.containing(rxinverse, y, z))).getBlock() == Blocks.AIR) {
								world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
								world.setBlock(BlockPos.containing(rxinverse, y, z), OncModBlocks.OXYGEN.get().defaultBlockState(), 3);
							} else {
								if ((world.getBlockState(BlockPos.containing(rx, y, z))).getBlock() == Blocks.AIR) {
									world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
									world.setBlock(BlockPos.containing(rx, y, z), OncModBlocks.OXYGEN.get().defaultBlockState(), 3);
								}
							}
						} else {
							if ((world.getBlockState(BlockPos.containing(rx, y, z))).getBlock() == Blocks.AIR) {
								world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
								world.setBlock(BlockPos.containing(rx, y, z), OncModBlocks.OXYGEN.get().defaultBlockState(), 3);
							} else {
								if ((world.getBlockState(BlockPos.containing(rxinverse, y, z))).getBlock() == Blocks.AIR) {
									world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
									world.setBlock(BlockPos.containing(rxinverse, y, z), OncModBlocks.OXYGEN.get().defaultBlockState(), 3);
								}
							}
						}
					}
				} else if (rand == 2) {
					if ((world.getBlockState(BlockPos.containing(rxinverse, y, z))).getBlock() == Blocks.AIR) {
						world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
						world.setBlock(BlockPos.containing(rxinverse, y, z), OncModBlocks.OXYGEN.get().defaultBlockState(), 3);
					} else {
						rand = Mth.nextInt(RandomSource.create(), 1, 2);
						if (rand == 1) {
							if ((world.getBlockState(BlockPos.containing(rxinverse, ry, z))).getBlock() == Blocks.AIR) {
								world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
								world.setBlock(BlockPos.containing(rxinverse, ry, z), OncModBlocks.OXYGEN.get().defaultBlockState(), 3);
							} else {
								if ((world.getBlockState(BlockPos.containing(rx, y, z))).getBlock() == Blocks.AIR) {
									world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
									world.setBlock(BlockPos.containing(rx, y, z), OncModBlocks.OXYGEN.get().defaultBlockState(), 3);
								}
							}
						} else {
							if ((world.getBlockState(BlockPos.containing(rx, y, z))).getBlock() == Blocks.AIR) {
								world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
								world.setBlock(BlockPos.containing(rx, y, z), OncModBlocks.OXYGEN.get().defaultBlockState(), 3);
							} else {
								if ((world.getBlockState(BlockPos.containing(rxinverse, ry, z))).getBlock() == Blocks.AIR) {
									world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
									world.setBlock(BlockPos.containing(rxinverse, ry, z), OncModBlocks.OXYGEN.get().defaultBlockState(), 3);
								}
							}
						}
					}
				} else {
					if ((world.getBlockState(BlockPos.containing(rx, y, z))).getBlock() == Blocks.AIR) {
						world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
						world.setBlock(BlockPos.containing(rx, y, z), OncModBlocks.OXYGEN.get().defaultBlockState(), 3);
					} else {
						rand = Mth.nextInt(RandomSource.create(), 1, 2);
						if (rand == 1) {
							if ((world.getBlockState(BlockPos.containing(rxinverse, ry, z))).getBlock() == Blocks.AIR) {
								world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
								world.setBlock(BlockPos.containing(rxinverse, ry, z), OncModBlocks.OXYGEN.get().defaultBlockState(), 3);
							} else {
								if ((world.getBlockState(BlockPos.containing(rxinverse, y, z))).getBlock() == Blocks.AIR) {
									world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
									world.setBlock(BlockPos.containing(rxinverse, y, z), OncModBlocks.OXYGEN.get().defaultBlockState(), 3);
								}
							}
						} else {
							if ((world.getBlockState(BlockPos.containing(rxinverse, y, z))).getBlock() == Blocks.AIR) {
								world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
								world.setBlock(BlockPos.containing(rxinverse, y, z), OncModBlocks.OXYGEN.get().defaultBlockState(), 3);
							} else {
								if ((world.getBlockState(BlockPos.containing(rxinverse, ry, z))).getBlock() == Blocks.AIR) {
									world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
									world.setBlock(BlockPos.containing(rxinverse, ry, z), OncModBlocks.OXYGEN.get().defaultBlockState(), 3);
								}
							}
						}
					}
				}
			}
		}
	}
}
