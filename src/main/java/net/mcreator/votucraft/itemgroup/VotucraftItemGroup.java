
package net.mcreator.votucraft.itemgroup;

@VotucraftModElements.ModElement.Tag
public class VotucraftItemGroup extends VotucraftModElements.ModElement {

	public VotucraftItemGroup(VotucraftModElements instance) {
		super(instance, 10);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabvotucraft") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(WhatsappItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;

}
