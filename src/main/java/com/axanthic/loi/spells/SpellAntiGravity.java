package com.axanthic.loi.spells;

import com.axanthic.loi.entity.EntityFloatingBlock;
import com.axanthic.loi.entity.EntitySpellWisp;

import net.minecraft.block.BlockPistonBase;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class SpellAntiGravity extends AbstractSpell {

	@Override
	public int getColor() {
		return 0x1062A7;
	}

	@Override
	public ActionResult<ItemStack> castSpell(World worldIn, EntityPlayer playerIn, EnumHand handIn) {
		if (!playerIn.isCreative())
			playerIn.getHeldItem(handIn).shrink(1);
		if (!worldIn.isRemote) {
			EntitySpellWisp entityWisp = new EntitySpellWisp(worldIn, playerIn, this);
			entityWisp.shoot(playerIn, playerIn.rotationPitch, playerIn.rotationYaw, 0.0F, 1.0F, 1.0F);
			worldIn.spawnEntity(entityWisp);
		}
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
	}

	@Override
	public void drinkConcoction(ItemStack stack, World worldIn, EntityLivingBase entityLiving) {
		entityLiving.addPotionEffect(new PotionEffect(MobEffects.LEVITATION, 400));
	}

	@Override
	public void spellHit(RayTraceResult result, World worldIn) {
		if (result.typeOfHit.equals(RayTraceResult.Type.ENTITY) && result.entityHit instanceof EntityLivingBase) {
			((EntityLivingBase) result.entityHit).addPotionEffect(new PotionEffect(MobEffects.LEVITATION, 100));
		} else if (result.typeOfHit.equals(RayTraceResult.Type.BLOCK) && BlockPistonBase.canPush(worldIn.getBlockState(result.getBlockPos()), worldIn, result.getBlockPos(), EnumFacing.UP, false, EnumFacing.UP)) {
			EntityFloatingBlock block = new EntityFloatingBlock(worldIn, (double)result.getBlockPos().getX() + 0.5D, (double)result.getBlockPos().getY(), (double)result.getBlockPos().getZ() + 0.5D, worldIn.getBlockState(result.getBlockPos()));
			block.setNoGravity(true);
			block.setVelocity(0, 0.05 + 0.025 * worldIn.rand.nextFloat(), 0);
			worldIn.spawnEntity(block);
		}
	}
}
