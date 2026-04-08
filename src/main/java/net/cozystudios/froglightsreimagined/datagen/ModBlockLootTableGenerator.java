package net.cozystudios.froglightsreimagined.datagen;

import net.cozystudios.froglightsreimagined.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

    public class ModBlockLootTableGenerator extends FabricBlockLootTableProvider {
        public ModBlockLootTableGenerator(FabricDataOutput dataOutput) {
            super(dataOutput);
        }

        @Override
        public void generate() {
            addDrop(ModBlocks.RED_FROGLIGHT);
            addDrop(ModBlocks.BLACK_FROGLIGHT);
            addDrop(ModBlocks.BLUE_FROGLIGHT);
            addDrop(ModBlocks.BROWN_FROGLIGHT);
            addDrop(ModBlocks.CYAN_FROGLIGHT);
            addDrop(ModBlocks.GRAY_FROGLIGHT);
            addDrop(ModBlocks.GREEN_FROGLIGHT);
            addDrop(ModBlocks.LIGHT_BLUE_FROGLIGHT);
            addDrop(ModBlocks.LIGHT_GRAY_FROGLIGHT);
            addDrop(ModBlocks.LIME_FROGLIGHT);
            addDrop(ModBlocks.MAGENTA_FROGLIGHT);
            addDrop(ModBlocks.ORANGE_FROGLIGHT);
            addDrop(ModBlocks.PINK_FROGLIGHT);
            addDrop(ModBlocks.PURPLE_FROGLIGHT);
            addDrop(ModBlocks.WHITE_FROGLIGHT);
            addDrop(ModBlocks.YELLOW_FROGLIGHT);
            addDrop(ModBlocks.RED_FROGLIGHT_LANTERN);
            addDrop(ModBlocks.BLACK_FROGLIGHT_LANTERN);
            addDrop(ModBlocks.BLUE_FROGLIGHT_LANTERN);
            addDrop(ModBlocks.BROWN_FROGLIGHT_LANTERN);
            addDrop(ModBlocks.CYAN_FROGLIGHT_LANTERN);
            addDrop(ModBlocks.GRAY_FROGLIGHT_LANTERN);
            addDrop(ModBlocks.GREEN_FROGLIGHT_LANTERN);
            addDrop(ModBlocks.LIGHT_BLUE_FROGLIGHT_LANTERN);
            addDrop(ModBlocks.LIGHT_GRAY_FROGLIGHT_LANTERN);
            addDrop(ModBlocks.LIME_FROGLIGHT_LANTERN);
            addDrop(ModBlocks.MAGENTA_FROGLIGHT_LANTERN);
            addDrop(ModBlocks.ORANGE_FROGLIGHT_LANTERN);
            addDrop(ModBlocks.PINK_FROGLIGHT_LANTERN);
            addDrop(ModBlocks.PURPLE_FROGLIGHT_LANTERN);
            addDrop(ModBlocks.WHITE_FROGLIGHT_LANTERN);
            addDrop(ModBlocks.YELLOW_FROGLIGHT_LANTERN);
        }
    }