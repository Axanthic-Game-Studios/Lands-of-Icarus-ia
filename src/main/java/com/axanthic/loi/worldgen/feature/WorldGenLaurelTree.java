package com.axanthic.loi.worldgen.feature;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.axanthic.loi.Resources;

import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class WorldGenLaurelTree extends WorldGenLOITree {

	public WorldGenLaurelTree(boolean notify) {
		super(notify);
	}

	public WorldGenLaurelTree init() {
		this.TRUNK = Resources.laurel.log.getBlock().getDefaultState();
		this.LEAF = Resources.laurel.leaf.getBlock().getDefaultState();
		this.WOODTYPE = Resources.laurel;
		return this;
	}

	@Override
	public boolean generate(World worldIn, Random rand, BlockPos position) {
		int heightTrunk = rand.nextInt(3) + 1;
		int branches = rand.nextInt(2) + 3;
		rand = new Random(rand.nextLong());
		int heightTotal = heightTrunk + 4;
		boolean flag = true;

		if (position.getY() >= 1 && position.getY() + heightTotal + 1 <= 256) {
			for (int j = position.getY(); j <= position.getY() + 1 + heightTotal; ++j) {
				BlockPos.MutableBlockPos blockpos$mutableblockpos = new BlockPos.MutableBlockPos();
				if (j >= 0 && j < worldIn.getHeight()) {
					if (!this.canGrowThrough(worldIn, blockpos$mutableblockpos.setPos(position.getX(), j, position.getZ()))) {
						flag = false;
					}
				} else {
					flag = false;
				}
			}
			if (!flag) {
				return false;
			} else {
				BlockPos down = position.down();
				IBlockState state = worldIn.getBlockState(down);
				boolean isSoil = state.getBlock().canSustainPlant(state, worldIn, down, net.minecraft.util.EnumFacing.UP, (net.minecraft.block.BlockSapling)Blocks.SAPLING);

				if (isSoil && position.getY() < worldIn.getHeight() - heightTotal - 1) {
					state.getBlock().onPlantGrow(state, worldIn, down, position);

					for (int trunkLevel = 1; trunkLevel <= heightTrunk; ++trunkLevel) {
						this.placeLogAt(worldIn, down.up(trunkLevel));
					}

					BlockPos ori = position.up(heightTrunk - 1);
					List<EnumFacing> directions = new ArrayList<EnumFacing>();
					for (EnumFacing facing : EnumFacing.HORIZONTALS)
						directions.add(facing);

					for (int branch = 0; branch < branches; ++branch) {
						EnumFacing dir1 = directions.get(rand.nextInt(directions.size()));
						directions.remove(dir1);
						EnumFacing dir2 = dir1.rotateY();
						BlockPos pos = new BlockPos(ori);
						int length = rand.nextInt(2) + 4;
						for (int level = 0; level < length; ++level) {
							pos = pos.up();
							if (rand.nextInt(level * 2 + 1) == 0)
								pos = pos.offset(dir1);
							if (rand.nextInt(level * 2 + 3) == 0)
								pos = pos.offset(dir2);
							this.placeLogAt(worldIn, pos);
							this.placeLeafAt(worldIn, pos.up());
							this.placeLeafAt(worldIn, pos.north());
							this.placeLeafAt(worldIn, pos.east());
							this.placeLeafAt(worldIn, pos.south());
							this.placeLeafAt(worldIn, pos.west());
							this.placeLeafAt(worldIn, pos.down());
						}
					}

					return true;
				} else {
					return false;
				}
			}
		} else {
			return false;
		}
	}
}
