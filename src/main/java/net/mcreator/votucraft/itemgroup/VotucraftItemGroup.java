
package net.mcreator.votucraft.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.votucraft.item.WhatsappItem;
import net.mcreator.votucraft.VotucraftModElements;

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
