
package net.mcreator.votucraft.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.votucraft.itemgroup.VotucraftItemGroup;
import net.mcreator.votucraft.VotucraftModElements;

@VotucraftModElements.ModElement.Tag
public class MachadozapItem extends VotucraftModElements.ModElement {
	@ObjectHolder("votucraft:machadozap")
	public static final Item block = null;
	public MachadozapItem(VotucraftModElements instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 2048;
			}

			public float getEfficiency() {
				return 16f;
			}

			public float getAttackDamage() {
				return 18f;
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
		}, 1, -3.5f, new Item.Properties().group(VotucraftItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("machadozap"));
	}
}
