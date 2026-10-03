package net.kaidon.chicken;

import net.fabricmc.api.ModInitializer;

import net.kaidon.chicken.block.ModBlocks;
import net.kaidon.chicken.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KaidonIronChickenGolem implements ModInitializer {
	public static final String MOD_ID = "kaidon-iron-chicken-golem";
public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
	}
}