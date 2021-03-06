package com.axanthic.loi.blocks;

import com.axanthic.loi.LandsOfIcaria;
import com.axanthic.loi.ModInformation;

import net.minecraft.block.BlockCake;
import net.minecraft.block.SoundType;

public class BlockCustomCake extends BlockCake {

	public BlockCustomCake(String name) {
		this.setCreativeTab(LandsOfIcaria.modTabItems);
		this.setHardness(0.5F);
		this.setUnlocalizedName(name);
		this.setRegistryName(ModInformation.ID, name);
		this.disableStats();
		this.setSoundType(SoundType.CLOTH);
        this.setTickRandomly(false);
	}
}
