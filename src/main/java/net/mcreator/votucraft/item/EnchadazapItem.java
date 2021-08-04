
package net.mcreator.votucraft.item;

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
