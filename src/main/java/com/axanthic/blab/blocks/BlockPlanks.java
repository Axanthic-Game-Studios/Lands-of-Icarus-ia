package com.axanthic.blab.blocks;

import com.axanthic.blab.Blab;
import com.axanthic.blab.ModInformation;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockPlanks extends BlockMeta {

	public static PropertyEnum TYPES = PropertyEnum.create("type", WoodTypes.class);
	public static int metaCount = WoodTypes.values().length;

	public BlockPlanks() {
		super(Material.WOOD);
		this.setCreativeTab(Blab.modTab);
		this.setHardness(1.2F);
		this.setUnlocalizedName("planks");
		this.setRegistryName(ModInformation.ID, "planks");
		this.setDefaultState(getStateFromMeta(0));
	}

	@Override
	public String getNameForMeta(int meta) {
		return WoodTypes.byMetadata(meta).getName();
	}

	@Override
	public String[] getNames() {
		return WoodTypes.getNames();
	}

	@Override
	public int getMetaFromState(IBlockState state) {
		return ((WoodTypes) state.getValue(TYPES)).meta;
	}

	@Override
	public IBlockState getStateFromMeta(int meta) {
		return getDefaultState().withProperty(TYPES, WoodTypes.byMetadata(meta));
	}

	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, new IProperty[]{TYPES});
	}

	@Override
	public int damageDropped(IBlockState state) {
		return getMetaFromState(state);
	}

	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
		return new ItemStack(this, 1, this.getMetaFromState(world.getBlockState(pos)));
	}

	@Override
	public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items) {
		for (WoodTypes woodType : WoodTypes.values()) {
			items.add(new ItemStack(this, 1, woodType.meta));
		}
	}

	@Override
	public MapColor getMapColor(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
		return ((WoodTypes) state.getValue(TYPES)).mapColor;
	}

	public enum WoodTypes implements IStringSerializable {
		PLANE(0, "plane", MapColor.DIRT, MapColor.STONE, MapColor.GRASS),
		POPULUS(1, "populus", MapColor.SAND, MapColor.QUARTZ, MapColor.LIME_STAINED_HARDENED_CLAY);

		public static final WoodTypes[] META_LOOKUP = new WoodTypes[values().length];
		public final int meta;
		public final String unlocalizedName;
		public final MapColor mapColor;
		public final MapColor logColor;
		public final MapColor leafColor;

		WoodTypes(int metaIn, String unlocalizedNameIn, MapColor mapColorIn, MapColor logColorIn, MapColor leafColorIn) {
			this.meta = metaIn;
			this.unlocalizedName = unlocalizedNameIn;
			this.mapColor = mapColorIn;
			this.logColor = logColorIn;
			this.leafColor = leafColorIn;
		}

		public static WoodTypes byMetadata(int meta) {
			if (meta < 0 || meta >= META_LOOKUP.length) {
				meta = 0;
			}

			return META_LOOKUP[meta];
		}

		public String getName() {
			return this.unlocalizedName;
		}

		public static String[] getNames() {
			String[] names = new String[META_LOOKUP.length];
			for (int i = 0; i < META_LOOKUP.length; i++) {
				names[i] = META_LOOKUP[i].getName();
			}
			return names;
		}

		static {
			for (WoodTypes stoneType : values()) {
				META_LOOKUP[stoneType.meta] = stoneType;
			}
		}
	}
}