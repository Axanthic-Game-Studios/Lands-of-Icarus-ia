package com.axanthic.blab.items;

import com.axanthic.blab.Blab;
import com.axanthic.blab.ModInformation;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class ItemFoods extends ItemFood implements IItemMeta {

	public foodStats[] foods = new foodStats[] {new foodStats("olive_green", 2, 0.3F), new foodStats("olive_black", 2, 0.3F)};

	public ItemFoods() {
		super(0, false);
		this.setCreativeTab(Blab.modTabItems);
		this.setUnlocalizedName("food");
		this.setRegistryName(ModInformation.ID, "food");
		this.setHasSubtypes(true);
	}

	@Override
	public int getMetadata(int damage) {
		return damage;
	}

	@Override
	public String getUnlocalizedName(ItemStack stack) {
		return super.getUnlocalizedName() + "." + foods[stack.getMetadata()].name;
	}

	@Override
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items) {
		if (tab.equals(this.getCreativeTab()))
			for (int i = 0; i < foods.length; i++) {
				items.add(new ItemStack(this, 1, i));
			}
	}

	@Override
	public int getHealAmount(ItemStack stack) {
		return foods[stack.getMetadata()].food;
	}

	@Override
	public float getSaturationModifier(ItemStack stack) {
		return foods[stack.getMetadata()].saturation;
	}

	@Override
	public String[] getNames() {
		String[] names = new String[foods.length];
		for (int i = 0; i < foods.length; ++i) {
			names[i] = foods[i].name;
		}
		return names;
	}

	public class foodStats {
		String name;
		int food;
		float saturation;

		public foodStats(String name, int food, float saturation) {
			this.name = name;
			this.food = food;
			this.saturation = saturation;
		}
	}
}
