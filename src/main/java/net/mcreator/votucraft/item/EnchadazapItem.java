
package net.mcreator.votucraft.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.mcreator.votucraft.itemgroup.VotucraftItemGroup;
import net.mcreator.votucraft.VotucraftModElements;

@VotucraftModElements.ModElement.Tag
public class EnchadazapItem extends VotucraftModElements.ModElement {
	@ObjectHolder("votucraft:enchadazap")
	public static final Item block = null;
	public EnchadazapItem(VotucraftModElements instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 2048;
			}

			public float getEfficiency() {
				return 16f;
			}

			public float getAttackDamage() {
				return 3f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 15;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(WhatsappItem.block, (int) (1)));
			}
		}, 0, -3f, new Item.Properties().group(VotucraftItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("enchadazap"));
	}
}
