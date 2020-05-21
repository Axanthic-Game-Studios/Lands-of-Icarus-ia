package com.axanthic.loi.render;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelRevenantPyromancer extends ModelRevenantCivilian {
	public ModelRenderer robe_shoulder;
	public ModelRenderer skull_1;
	public ModelRenderer robe_2nd;
	public ModelRenderer bag_band;
	public ModelRenderer robe_2nd_1;
	public ModelRenderer bag;

	public ModelRevenantPyromancer() {
		this.textureWidth = 128;
		this.textureHeight = 64;
		this.lower_jaw = new ModelRenderer(this, 92, 0);
		this.lower_jaw.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lower_jaw.addBox(-2.5F, -0.8F, -3.3F, 5, 1, 6, 0.0F);
		this.setRotateAngle(lower_jaw, 0.10471975511965977F, 0.0F, 0.0F);
		this.skull = new ModelRenderer(this, 0, 0);
		this.skull.setRotationPoint(0.0F, -4.0F, 0.0F);
		this.skull.addBox(-3.5F, -8.0F, -4.0F, 7, 6, 8, 0.0F);
		this.rib_3rd_front_right = new ModelRenderer(this, 0, 4);
		this.rib_3rd_front_right.setRotationPoint(0.0F, -2.0F, 0.0F);
		this.rib_3rd_front_right.addBox(-5.0F, 7.0F, -2.0F, 3, 1, 1, 0.0F);
		this.leg_right = new ModelRenderer(this, 46, 0);
		this.leg_right.setRotationPoint(-2.5F, 10.2F, 0.1F);
		this.leg_right.addBox(-1.4F, 0.0F, -1.0F, 2, 7, 2, 0.0F);
		this.setRotateAngle(leg_right, -0.10471975511965977F, 0.20943951023931953F, 0.0F);
		this.rib_3rd_side_left = new ModelRenderer(this, 84, 13);
		this.rib_3rd_side_left.setRotationPoint(0.0F, -2.0F, 0.0F);
		this.rib_3rd_side_left.addBox(5.0F, 5.0F, 0.0F, 1, 1, 2, 0.0F);
		this.arm_left_lower = new ModelRenderer(this, 86, 27);
		this.arm_left_lower.mirror = true;
		this.arm_left_lower.setRotationPoint(0.0F, 7.0F, 0.0F);
		this.arm_left_lower.addBox(-0.2F, -0.2F, -0.5F, 2, 7, 2, 0.0F);
		this.setRotateAngle(arm_left_lower, -0.10471975511965977F, 0.0F, 0.10471975511965977F);
		this.rib_top_backplate_right = new ModelRenderer(this, 82, 9);
		this.rib_top_backplate_right.setRotationPoint(-1.5F, -2.0F, 0.0F);
		this.rib_top_backplate_right.addBox(-5.0F, 5.5F, 0.2F, 13, 1, 1, 0.0F);
		this.spine_legplate_right = new ModelRenderer(this, 64, 11);
		this.spine_legplate_right.setRotationPoint(0.0F, 19.0F, 0.0F);
		this.spine_legplate_right.addBox(-3.8F, 0.5F, -1.0F, 2, 1, 3, 0.0F);
		this.setRotateAngle(spine_legplate_right, 0.20943951023931953F, -0.10471975511965977F, 0.0F);
		this.rib_4th_back_left = new ModelRenderer(this, 110, 7);
		this.rib_4th_back_left.setRotationPoint(0.4F, 2.0F, 0.0F);
		this.rib_4th_back_left.addBox(1.0F, 3.0F, 1.0F, 4, 1, 1, 0.0F);
		this.setRotateAngle(rib_4th_back_left, 0.0F, 0.0F, 0.3141592653589793F);
		this.rib_2nd_back_right = new ModelRenderer(this, 22, 0);
		this.rib_2nd_back_right.setRotationPoint(-0.3F, 0.0F, 0.0F);
		this.rib_2nd_back_right.addBox(-5.0F, 3.0F, 1.0F, 4, 1, 1, 0.0F);
		this.setRotateAngle(rib_2nd_back_right, 0.0F, 0.0F, -0.10471975511965977F);
		this.rib_5th_front_left = new ModelRenderer(this, 44, 11);
		this.rib_5th_front_left.setRotationPoint(0.0F, -2.0F, 0.0F);
		this.rib_5th_front_left.addBox(2.0F, 7.0F, -2.0F, 2, 1, 1, 0.0F);
		this.leg_left = new ModelRenderer(this, 38, 0);
		this.leg_left.mirror = true;
		this.leg_left.setRotationPoint(2.5F, 10.2F, 0.1F);
		this.leg_left.addBox(-0.6F, 0.0F, -1.0F, 2, 7, 2, 0.0F);
		this.setRotateAngle(leg_left, -0.10471975511965977F, -0.20943951023931953F, 0.0F);
		this.rib_top_back_right = new ModelRenderer(this, 86, 0);
		this.rib_top_back_right.setRotationPoint(0.0F, -2.0F, 0.0F);
		this.rib_top_back_right.addBox(-5.0F, 3.0F, 1.0F, 4, 2, 1, 0.0F);
		this.spine_legplate_left = new ModelRenderer(this, 19, 14);
		this.spine_legplate_left.setRotationPoint(0.0F, 19.0F, 0.0F);
		this.spine_legplate_left.addBox(1.8F, 0.5F, -1.0F, 2, 1, 3, 0.0F);
		this.setRotateAngle(spine_legplate_left, 0.20943951023931953F, 0.10471975511965977F, 0.0F);
		this.spine_legplate_bottom = new ModelRenderer(this, 6, 14);
		this.spine_legplate_bottom.setRotationPoint(0.0F, -2.0F, 0.0F);
		this.spine_legplate_bottom.addBox(-3.5F, 19.8F, -1.5F, 7, 1, 1, 0.0F);
		this.upper_jaw = new ModelRenderer(this, 70, 0);
		this.upper_jaw.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.upper_jaw.addBox(-2.5F, -2.0F, -3.5F, 5, 1, 6, 0.0F);
		this.leg_right_bottom = new ModelRenderer(this, 115, 18);
		this.leg_right_bottom.mirror = true;
		this.leg_right_bottom.setRotationPoint(0.0F, 7.0F, 0.0F);
		this.leg_right_bottom.addBox(-1.4F, 0.0F, -1.0F, 2, 7, 2, 0.0F);
		this.setRotateAngle(leg_right_bottom, 0.20943951023931953F, 0.0F, 0.0F);
		this.rib_5th_back_left = new ModelRenderer(this, 48, 9);
		this.rib_5th_back_left.setRotationPoint(0.3F, 3.0F, 0.0F);
		this.rib_5th_back_left.addBox(1.0F, 3.0F, 1.0F, 4, 1, 1, 0.0F);
		this.setRotateAngle(rib_5th_back_left, 0.0F, 0.0F, 0.41887902047863906F);
		this.rib_2nd_front_left = new ModelRenderer(this, 22, 2);
		this.rib_2nd_front_left.setRotationPoint(0.0F, -2.0F, 0.0F);
		this.rib_2nd_front_left.addBox(2.0F, 7.0F, -2.0F, 3, 1, 1, 0.0F);
		this.rib_2nd_front_right = new ModelRenderer(this, 0, 2);
		this.rib_2nd_front_right.setRotationPoint(0.0F, -2.0F, 0.0F);
		this.rib_2nd_front_right.addBox(-5.0F, 7.0F, -2.0F, 3, 1, 1, 0.0F);
		this.rib_4th_side_left = new ModelRenderer(this, 100, 14);
		this.rib_4th_side_left.setRotationPoint(0.0F, -2.0F, 0.0F);
		this.rib_4th_side_left.addBox(5.0F, 5.0F, 0.0F, 1, 1, 2, 0.0F);
		this.rib_top_side_left = new ModelRenderer(this, 106, 9);
		this.rib_top_side_left.setRotationPoint(0.0F, -2.0F, 0.0F);
		this.rib_top_side_left.addBox(5.0F, 5.0F, -2.0F, 1, 2, 4, 0.0F);
		this.bag_band = new ModelRenderer(this, 64, 42);
		this.bag_band.setRotationPoint(-0.5F, 0.5F, 0.0F);
		this.bag_band.addBox(0.0F, -5.0F, -3.0F, 1, 16, 6, 0.0F);
		this.setRotateAngle(bag_band, 0.0F, 0.0F, 0.5890486225480862F);
		this.rib_5th_side_left = new ModelRenderer(this, 1, 15);
		this.rib_5th_side_left.setRotationPoint(0.0F, -2.0F, 0.0F);
		this.rib_5th_side_left.addBox(5.0F, 5.0F, -1.0F, 1, 1, 3, 0.0F);
		this.robe_shoulder = new ModelRenderer(this, 0, 53);
		this.robe_shoulder.setRotationPoint(0.3F, 0.0F, 0.0F);
		this.robe_shoulder.addBox(-6.2F, -3.5F, -2.3F, 4, 6, 5, 0.0F);
		this.rib_4th_front_left = new ModelRenderer(this, 22, 6);
		this.rib_4th_front_left.setRotationPoint(0.0F, -2.0F, 0.0F);
		this.rib_4th_front_left.addBox(2.0F, 7.0F, -2.0F, 2, 1, 1, 0.0F);
		this.rib_2nd_side_right = new ModelRenderer(this, 38, 11);
		this.rib_2nd_side_right.setRotationPoint(0.0F, -2.0F, 0.0F);
		this.rib_2nd_side_right.addBox(-6.0F, 5.0F, -2.0F, 1, 1, 4, 0.0F);
		this.rib_2nd_back_left = new ModelRenderer(this, 70, 7);
		this.rib_2nd_back_left.setRotationPoint(0.3F, 0.0F, 0.0F);
		this.rib_2nd_back_left.addBox(1.0F, 3.0F, 1.0F, 4, 1, 1, 0.0F);
		this.setRotateAngle(rib_2nd_back_left, 0.0F, 0.0F, 0.10471975511965977F);
		this.robe_2nd = new ModelRenderer(this, 18, 54);
		this.robe_2nd.setRotationPoint(-0.2F, 0.0F, 0.0F);
		this.robe_2nd.addBox(-6.5F, 0.0F, -2.27F, 4, 5, 5, 0.0F);
		this.setRotateAngle(robe_2nd, 0.0F, 0.0F, -0.39269908169872414F);
		this.rib_3rd_back_left = new ModelRenderer(this, 90, 7);
		this.rib_3rd_back_left.setRotationPoint(0.4F, 1.0F, 0.0F);
		this.rib_3rd_back_left.addBox(1.0F, 3.0F, 1.0F, 4, 1, 1, 0.0F);
		this.setRotateAngle(rib_3rd_back_left, 0.0F, 0.0F, 0.20943951023931953F);
		this.bag = new ModelRenderer(this, 78, 48);
		this.bag.setRotationPoint(-2.5F, 9.5F, -4.0F);
		this.bag.addBox(0.0F, 0.0F, 0.0F, 3, 8, 8, 0.0F);
		this.setRotateAngle(bag, 0.0F, 0.0F, -0.5890486225480862F);
		this.arm_right = new ModelRenderer(this, 54, 0);
		this.arm_right.setRotationPoint(-5.7F, -2.0F, 0.0F);
		this.arm_right.addBox(-1.8F, 0.0F, -0.5F, 2, 7, 2, 0.0F);
		this.setRotateAngle(arm_right, 0.0F, 0.0F, 0.39269908169872414F);
		this.skull_1 = new ModelRenderer(this, 0, 27);
		this.skull_1.setRotationPoint(0.0F, -10.0F, 0.0F);
		this.skull_1.addBox(-3.7F, 0.0F, -4.1F, 8, 3, 9, 0.0F);
		this.setRotateAngle(skull_1, -0.07853981633974483F, 0.0F, 0.07853981633974483F);
		this.spine_legplate_top = new ModelRenderer(this, 58, 9);
		this.spine_legplate_top.setRotationPoint(0.0F, -4.0F, 0.0F);
		this.spine_legplate_top.addBox(-4.0F, 16.8F, 1.0F, 8, 1, 1, 0.0F);
		this.rib_3rd_side_right = new ModelRenderer(this, 58, 11);
		this.rib_3rd_side_right.setRotationPoint(0.0F, -2.0F, 0.0F);
		this.rib_3rd_side_right.addBox(-6.0F, 5.0F, -2.0F, 1, 1, 4, 0.0F);
		this.front_chest_bone = new ModelRenderer(this, 114, 0);
		this.front_chest_bone.setRotationPoint(0.0F, -2.0F, -0.2F);
		this.front_chest_bone.addBox(-2.0F, 3.5F, -2.0F, 4, 6, 1, 0.0F);
		this.rib_3rd_back_right = new ModelRenderer(this, 80, 7);
		this.rib_3rd_back_right.setRotationPoint(-0.4F, 1.0F, 0.0F);
		this.rib_3rd_back_right.addBox(-5.0F, 3.0F, 1.0F, 4, 1, 1, 0.0F);
		this.setRotateAngle(rib_3rd_back_right, 0.0F, 0.0F, -0.20943951023931953F);
		this.spine = new ModelRenderer(this, 30, 0);
		this.spine.setRotationPoint(0.0F, -4.0F, 0.0F);
		this.spine.addBox(-1.0F, -2.0F, 0.4F, 2, 16, 2, 0.0F);
		this.rib_3rd_front_left = new ModelRenderer(this, 22, 4);
		this.rib_3rd_front_left.setRotationPoint(0.0F, -2.0F, 0.0F);
		this.rib_3rd_front_left.addBox(2.0F, 7.0F, -2.0F, 3, 1, 1, 0.0F);
		this.arm_right_lower = new ModelRenderer(this, 78, 27);
		this.arm_right_lower.setRotationPoint(-0.1F, 6.3F, 0.0F);
		this.arm_right_lower.addBox(-1.8F, 0.0F, -0.5F, 2, 7, 2, 0.0F);
		this.setRotateAngle(arm_right_lower, -0.10471975511965977F, 0.0F, -0.39269908169872414F);
		this.rib_top_back_left = new ModelRenderer(this, 86, 3);
		this.rib_top_back_left.setRotationPoint(0.0F, -2.0F, 0.0F);
		this.rib_top_back_left.addBox(1.0F, 3.0F, 1.0F, 4, 2, 1, 0.0F);
		this.rib_top_front_left = new ModelRenderer(this, 68, 0);
		this.rib_top_front_left.setRotationPoint(0.0F, -2.0F, 0.0F);
		this.rib_top_front_left.addBox(2.0F, 8.0F, -2.0F, 3, 1, 1, 0.0F);
		this.rib_2nd_side_left = new ModelRenderer(this, 48, 11);
		this.rib_2nd_side_left.setRotationPoint(0.0F, -2.0F, 0.0F);
		this.rib_2nd_side_left.addBox(5.0F, 5.0F, -2.0F, 1, 1, 4, 0.0F);
		this.robe_2nd_1 = new ModelRenderer(this, 36, 52);
		this.robe_2nd_1.setRotationPoint(0.0F, 5.0F, 0.0F);
		this.robe_2nd_1.addBox(-6.5F, 0.0F, -2.06F, 9, 7, 5, 0.0F);
		this.setRotateAngle(robe_2nd_1, -0.07853981633974483F, 0.0F, 0.39269908169872414F);
		this.arm_left = new ModelRenderer(this, 62, 0);
		this.arm_left.mirror = true;
		this.arm_left.setRotationPoint(6.0F, -2.0F, 0.0F);
		this.arm_left.addBox(-0.2F, 0.0F, -0.5F, 2, 7, 2, 0.0F);
		this.setRotateAngle(arm_left, 0.0F, 0.0F, -0.10471975511965977F);
		this.leg_left_bottom = new ModelRenderer(this, 22, 18);
		this.leg_left_bottom.mirror = true;
		this.leg_left_bottom.setRotationPoint(0.0F, 7.0F, 0.0F);
		this.leg_left_bottom.addBox(-0.6F, 0.0F, -1.0F, 2, 7, 2, 0.0F);
		this.setRotateAngle(leg_left_bottom, 0.20943951023931953F, 0.0F, 0.0F);
		this.rib_top_side_right = new ModelRenderer(this, 116, 7);
		this.rib_top_side_right.setRotationPoint(0.0F, -2.0F, 0.0F);
		this.rib_top_side_right.addBox(-6.0F, 5.0F, -2.0F, 1, 2, 4, 0.0F);
		this.rib_top_front_right = new ModelRenderer(this, 0, 0);
		this.rib_top_front_right.setRotationPoint(0.0F, -2.0F, 0.0F);
		this.rib_top_front_right.addBox(-5.0F, 8.0F, -2.0F, 3, 1, 1, 0.0F);
		this.upper_jaw.addChild(this.lower_jaw);
		this.rib_3rd_side_right.addChild(this.rib_3rd_front_right);
		this.rib_3rd_back_left.addChild(this.rib_3rd_side_left);
		this.arm_left.addChild(this.arm_left_lower);
		this.front_chest_bone.addChild(this.rib_top_backplate_right);
		this.spine_legplate_bottom.addChild(this.spine_legplate_right);
		this.spine.addChild(this.rib_4th_back_left);
		this.spine.addChild(this.rib_2nd_back_right);
		this.rib_5th_side_left.addChild(this.rib_5th_front_left);
		this.spine.addChild(this.rib_top_back_right);
		this.spine_legplate_bottom.addChild(this.spine_legplate_left);
		this.spine_legplate_top.addChild(this.spine_legplate_bottom);
		this.skull.addChild(this.upper_jaw);
		this.leg_right.addChild(this.leg_right_bottom);
		this.spine.addChild(this.rib_5th_back_left);
		this.rib_2nd_side_left.addChild(this.rib_2nd_front_left);
		this.rib_2nd_side_right.addChild(this.rib_2nd_front_right);
		this.rib_4th_back_left.addChild(this.rib_4th_side_left);
		this.rib_top_back_left.addChild(this.rib_top_side_left);
		this.robe_shoulder.addChild(this.bag_band);
		this.rib_5th_back_left.addChild(this.rib_5th_side_left);
		this.rib_4th_side_left.addChild(this.rib_4th_front_left);
		this.rib_2nd_back_right.addChild(this.rib_2nd_side_right);
		this.spine.addChild(this.rib_2nd_back_left);
		this.robe_shoulder.addChild(this.robe_2nd);
		this.spine.addChild(this.rib_3rd_back_left);
		this.bag_band.addChild(this.bag);
		this.skull.addChild(this.skull_1);
		this.spine.addChild(this.spine_legplate_top);
		this.rib_3rd_back_right.addChild(this.rib_3rd_side_right);
		this.spine.addChild(this.front_chest_bone);
		this.spine.addChild(this.rib_3rd_back_right);
		this.rib_3rd_side_left.addChild(this.rib_3rd_front_left);
		this.arm_right.addChild(this.arm_right_lower);
		this.spine.addChild(this.rib_top_back_left);
		this.rib_top_side_left.addChild(this.rib_top_front_left);
		this.rib_2nd_back_left.addChild(this.rib_2nd_side_left);
		this.robe_2nd.addChild(this.robe_2nd_1);
		this.leg_left.addChild(this.leg_left_bottom);
		this.rib_top_back_right.addChild(this.rib_top_side_right);
		this.rib_top_side_right.addChild(this.rib_top_front_right);
	}

	@Override
	public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) { 
		GlStateManager.pushMatrix();
		GlStateManager.translate(0.0F, -MathHelper.cos(limbSwing * 0.6662F * 2.0f + 2.7f) * limbSwingAmount / 16.0f + limbSwingAmount / 31.05f, 0.0F);
		this.skull.render(scale);
		this.leg_right.render(scale);
		this.leg_left.render(scale);
		this.robe_shoulder.render(scale);
		this.arm_right.render(scale);
		this.spine.render(scale);
		this.arm_left.render(scale);
		GlStateManager.popMatrix();
	}
}

