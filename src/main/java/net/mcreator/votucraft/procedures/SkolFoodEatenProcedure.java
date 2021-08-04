package net.mcreator.votucraft.procedures;

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
