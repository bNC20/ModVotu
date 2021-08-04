
package net.mcreator.votucraft.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.votucraft.itemgroup.VotucraftItemGroup;
import net.mcreator.votucraft.VotucraftModElements;

@VotucraftModElements.ModElement.Tag
public class PazapItem extends VotucraftModElements.ModElement {
	@ObjectHolder("votucraft:pazap")
	public static final Item block = null;
	public PazapItem(VotucraftModElements instance) {
		super(instance, 6);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
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
		}, 1, -3f, new Item.Properties().group(VotucraftItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("pazap"));
	}
}
