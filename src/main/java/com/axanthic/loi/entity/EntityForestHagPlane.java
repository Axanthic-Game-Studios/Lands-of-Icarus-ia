package com.axanthic.loi.entity;

import net.minecraft.world.World;

public class EntityForestHagPlane extends EntityForestHag {

	public EntityForestHagPlane(World worldIn) {
		super(worldIn, 0);
		this.setSize(0.8f, 2.5f);
		this.eyeHeight = 2.25f;
	}
}
