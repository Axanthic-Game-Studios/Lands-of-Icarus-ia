package com.axanthic.loi.items;

import com.axanthic.loi.spells.AbstractSpell;
import com.axanthic.loi.utils.KettleRecipe;

import net.minecraft.item.ItemStack;
import net.minecraft.util.text.translation.I18n;

public class ItemScroll extends ItemBasic {

	public String name;
	public AbstractSpell spell;

	public ItemScroll(String name, AbstractSpell spell) {
		super("spell_scroll_" + name);
		this.name = name;
		this.spell = spell;
		this.setUnlocalizedName("generic.scroll");
	}

	@Override
	public String getItemStackDisplayName(ItemStack stack) {
		try {
			return String.format(I18n.translateToLocal(this.getUnlocalizedName() + ".name"), I18n.translateToLocal("spell." + name + ".name"));
		} catch (Exception e) {
			return String.format(I18n.translateToLocal(this.getUnlocalizedName() + ".name"), "");
		}
	}

	public KettleRecipe getRecipe() {
		return spell.getRecipe();
	}

	public AbstractSpell getSpell() {
		return spell;
	}

	public String getName() {
		return name;
	}
}
