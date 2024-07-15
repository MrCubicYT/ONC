package net.mcreator.onc.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

import net.mcreator.onc.network.OncModVariables;
import net.mcreator.onc.init.OncModGameRules;
import net.mcreator.onc.init.OncModBlocks;

import java.util.List;
import java.util.ArrayList;

public class GasNavigationProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		List<Object> numeroloop = new ArrayList<>();
		List<Object> nonono = new ArrayList<>();
		double rx = 0;
		double ry = 0;
		double rz = 0;
		double rand = 0;
		double rxinverse = 0;
		double diffx = 0;
		double diffz = 0;
		double rzinverse = 0;
		double diffy = 0;
		double densitytgravity = 0;
		double density = 0;
		double zd = 0;
		double zu = 0;
		double xu = 0;
		double xd = 0;
		double yu = 0;
		double yd = 0;
		double ryinverse = 0;
		if (blockstate == OncModBlocks.OXYGEN.get().defaultBlockState()) {
			density = OncModVariables.WorldVariables.get(world).oxygendensity;
		}
		densitytgravity = density * (world.getLevelData().getGameRules().getInt(OncModGameRules.GRAVITY));
		while (diffx == 0 && diffz == 0 && diffy == 0) {
			rand = Mth.nextInt(RandomSource.create(), 1, 4);
			if (rand == 1) {
				diffz = Mth.nextInt(RandomSource.create(), -1, 1);
			} else if (rand == 2) {
				diffx = Mth.nextInt(RandomSource.create(), -1, 1);
			} else if (rand == 3) {
				if (densitytgravity > Mth.nextInt(RandomSource.create(), 0, (int) (Math.ceil(densitytgravity / 10) * 10))) {
					diffy = Mth.nextInt(RandomSource.create(), 0, 1);
				} else {
					diffy = Mth.nextInt(RandomSource.create(), -1, 0);
				}
			} else {
				if (densitytgravity > Mth.nextInt(RandomSource.create(), 0, (int) (Math.ceil(densitytgravity / 10) * 10))) {
					diffy = Mth.nextInt(RandomSource.create(), 0, 1);
				} else {
					diffy = Mth.nextInt(RandomSource.create(), -1, 0);
				}
			}
		}
		nonono.add(1);
		nonono.add(2);
		nonono.add(3);
		nonono.add(4);
		nonono.add(5);
		rx = x + diffx;
		ry = y + diffy;
		rz = z + diffx;
		rxinverse = x + diffx * (-1);
		ryinverse = y + diffy * (-1);
		rzinverse = z + diffz * (-1);
		zd = z - 1;
		zu = z + 1;
		if ((world.getBlockState(BlockPos.containing(rx, ry, rz))).getBlock() == Blocks.AIR) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(rx, ry, rz), blockstate, 3);
		} else if (diffz == 0) {
			if (diffy == 0) {
				while (!numeroloop.contains(nonono)) {
					rand = Mth.nextInt(RandomSource.create(), 1, 5);
					if (!numeroloop.contains(rand)) {
						if (rand == 1) {
							numeroloop.add(rand);
							if ((world.getBlockState(BlockPos.containing(rxinverse, y, z))).getBlock() == Blocks.AIR) {
								world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
								world.setBlock(BlockPos.containing(rxinverse, y, z), blockstate, 3);
								break;
							}
						} else if (rand == 2) {
							if ((world.getBlockState(BlockPos.containing(x, y, zd))).getBlock() == Blocks.AIR) {
								world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
								world.setBlock(BlockPos.containing(x, y, zd), blockstate, 3);
								break;
							}
						} else if (rand == 3) {
							if ((world.getBlockState(BlockPos.containing(x, y, zu))).getBlock() == Blocks.AIR) {
								world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
								world.setBlock(BlockPos.containing(x, y, zu), blockstate, 3);
								break;
							}
						} else if (rand == 4) {
							if ((world.getBlockState(BlockPos.containing(x, yd, z))).getBlock() == Blocks.AIR) {
								world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
								world.setBlock(BlockPos.containing(x, yd, z), blockstate, 3);
								break;
							}
						} else {
							if ((world.getBlockState(BlockPos.containing(x, yu, z))).getBlock() == Blocks.AIR) {
								world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
								world.setBlock(BlockPos.containing(x, yu, z), blockstate, 3);
								break;
							}
						}
					}
				}
				nonono.clear();
			}
		} else if (diffx == 0) {
			if (diffy == 0) {
				while (!numeroloop.contains(nonono)) {
					rand = Mth.nextInt(RandomSource.create(), 1, 5);
					if (!numeroloop.contains(rand)) {
						if (rand == 1) {
							numeroloop.add(rand);
							if ((world.getBlockState(BlockPos.containing(z, y, rzinverse))).getBlock() == Blocks.AIR) {
								world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
								world.setBlock(BlockPos.containing(z, y, rzinverse), blockstate, 3);
								break;
							}
						} else if (rand == 2) {
							if ((world.getBlockState(BlockPos.containing(xd, y, z))).getBlock() == Blocks.AIR) {
								world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
								world.setBlock(BlockPos.containing(xd, y, z), blockstate, 3);
								break;
							}
						} else if (rand == 3) {
							if ((world.getBlockState(BlockPos.containing(xu, y, z))).getBlock() == Blocks.AIR) {
								world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
								world.setBlock(BlockPos.containing(xu, y, z), blockstate, 3);
								break;
							}
						} else if (rand == 4) {
							if ((world.getBlockState(BlockPos.containing(x, yd, z))).getBlock() == Blocks.AIR) {
								world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
								world.setBlock(BlockPos.containing(x, yd, z), blockstate, 3);
								break;
							}
						} else {
							if ((world.getBlockState(BlockPos.containing(x, yu, z))).getBlock() == Blocks.AIR) {
								world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
								world.setBlock(BlockPos.containing(x, yu, z), blockstate, 3);
								break;
							}
						}
					}
				}
				nonono.clear();
			}
		} else {
			while (!numeroloop.contains(nonono)) {
				rand = Mth.nextInt(RandomSource.create(), 1, 5);
				if (!numeroloop.contains(rand)) {
					if (rand == 1) {
						numeroloop.add(rand);
						if ((world.getBlockState(BlockPos.containing(z, ryinverse, z))).getBlock() == Blocks.AIR) {
							world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
							world.setBlock(BlockPos.containing(z, ryinverse, z), blockstate, 3);
							break;
						}
					} else if (rand == 2) {
						if ((world.getBlockState(BlockPos.containing(xd, y, z))).getBlock() == Blocks.AIR) {
							world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
							world.setBlock(BlockPos.containing(xd, y, z), blockstate, 3);
							break;
						}
					} else if (rand == 3) {
						if ((world.getBlockState(BlockPos.containing(xu, y, z))).getBlock() == Blocks.AIR) {
							world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
							world.setBlock(BlockPos.containing(xu, y, z), blockstate, 3);
							break;
						}
					} else if (rand == 4) {
						if ((world.getBlockState(BlockPos.containing(x, y, zd))).getBlock() == Blocks.AIR) {
							world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
							world.setBlock(BlockPos.containing(x, y, zd), blockstate, 3);
							break;
						}
					} else {
						if ((world.getBlockState(BlockPos.containing(x, y, zu))).getBlock() == Blocks.AIR) {
							world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
							world.setBlock(BlockPos.containing(x, y, zu), blockstate, 3);
							break;
						}
					}
				}
			}
			nonono.clear();
		}
	}
}
