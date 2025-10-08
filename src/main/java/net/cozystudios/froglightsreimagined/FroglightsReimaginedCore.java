package net.cozystudios.froglightsreimagined;

import net.cozystudios.froglightsreimagined.block.ModBlocks;
import net.cozystudios.froglightsreimagined.item.ModItemGroups;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FroglightsReimaginedCore implements ModInitializer {
	public static final String MOD_ID = "froglightsreimagined";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

        ModBlocks.registerModBlocks();
        ModItemGroups.registerItemGroups();


		LOGGER.info("FroglightsReimagined initialized!");
	}
}