package com.axanthic.loi.worldgen.dimension;

import com.axanthic.blab.Blab;

import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class WorldProviderLOI extends WorldProvider {

	@Override
	public DimensionType getDimensionType()
	{
		return Blab.dimensionTypeLoi;
	}

	@Override
	public boolean isSurfaceWorld()
	{
		return true;
	}
	
	@Override
	protected void init() {
        this.hasSkyLight = true;
        this.biomeProvider = Blab.LOI_WORLD_TYPE.getBiomeProvider(world);
    }

	/**
	 * Must point the chunk generator for this dimension.
	 */
	@Override
	public IChunkGenerator createChunkGenerator()
	{
		return new ChunkGeneratorLOI(this.world, this.world.getSeed(), this.world.getWorldInfo().isMapFeaturesEnabled());
	}

	/**
	 * Will check if the x, z position specified is alright to be set as the map spawn point
	 */
	@Override
	public boolean canCoordinateBeSpawn(final int x, final int z)
	{
		final BlockPos blockpos = new BlockPos(x, 0, z);

		if (this.world.getBiome(blockpos).ignorePlayerSpawnSuitability())
		{
			return true;
		}
		else
		{
			return this.world.getGroundAboveSeaLevel(blockpos).getBlock() == Blocks.GRASS;
		}
	}

	/**
	 * True if the player can respawn in this dimension (true = overworld, false = nether).
	 */
	@Override
	public boolean canRespawnHere()
	{
		return true;
	}

	/**********************************************************************/
	// LIGHTNING
	/**********************************************************************/

	/**
	 * Creates the light to brightness table
	 */
	@Override
	protected void generateLightBrightnessTable()
	{
		final float f = 0.0F;

		for (int i = 0; i <= 15; ++i)
		{
			final float f1 = 1.0F - (i / 15.0F);
			this.lightBrightnessTable[i] = (((1.0F - f1) / ((f1 * 3.0F) + 1.0F)) * 1.0F) + 0.0F;
		}
	}

	/**
	 * Calculates the angle of sun and moon in the sky relative to a specified time (usually worldTime)
	 */
	@Override
	public float calculateCelestialAngle(final long worldTime, final float partialTicks)
	{
		final int i = (int)(worldTime % 24000L);
		float f = ((i + partialTicks) / 24000.0F) - 0.25F;

		if (f < 0.0F)
		{
			++f;
		}

		if (f > 1.0F)
		{
			--f;
		}

		final float f1 = 1.0F - (float)((Math.cos(f * Math.PI) + 1.0D) / 2.0D);
		f = f + ((f1 - f) / 3.0F);
		return f;
	}

	@Override
	public int getMoonPhase(final long worldTime)
	{
		return (int)(((worldTime / 24000L) % 8L) + 8L) % 8;
	}

	/**
	 * Used for the specific color of the fog
	 */
	@Override
	@SideOnly(Side.CLIENT)
	public Vec3d getFogColor(final float p_76562_1_, final float p_76562_2_)
	{
		return new Vec3d(0.929411D, 0.828125D, 0.3529411D);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public boolean isSkyColored()
	{
		return true;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public boolean doesXZShowFog(final int x, final int z)
	{
		return false;
	}

	/**********************************************************************/
	// FORGE
	/**********************************************************************/

	@Override
	public boolean canDoLightning(final net.minecraft.world.chunk.Chunk chunk)
	{
		return true;
	}

	@Override
	public boolean canDoRainSnowIce(final Chunk chunk)
	{
		return false;
	}

	@Override
	public boolean canSnowAt(final BlockPos pos, final boolean checkLight)
	{
		return false;
	}
}
