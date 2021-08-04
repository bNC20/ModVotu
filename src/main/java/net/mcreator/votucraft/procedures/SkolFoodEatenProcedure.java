package net.mcreator.votucraft.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.votucraft.VotucraftModElements;
import net.mcreator.votucraft.VotucraftMod;

import java.util.Map;

@VotucraftModElements.ModElement.Tag
public class SkolFoodEatenProcedure extends VotucraftModElements.ModElement {
	public SkolFoodEatenProcedure(VotucraftModElements instance) {
		super(instance, 17);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				VotucraftMod.LOGGER.warn("Failed to load dependency entity for procedure SkolFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NAUSEA, (int) 200, (int) 1));
	}
}
