package net.cozystudios.froglightsreimagined.datagen;

import net.cozystudios.froglightsreimagined.block.ModBlocks;
import net.cozystudios.froglightsreimagined.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.RED_FROGLIGHT,
                        ModBlocks.BLACK_FROGLIGHT,
                        ModBlocks.BLUE_FROGLIGHT,
                        ModBlocks.BROWN_FROGLIGHT,
                        ModBlocks.CYAN_FROGLIGHT,
                        ModBlocks.GRAY_FROGLIGHT,
                        ModBlocks.GREEN_FROGLIGHT,
                        ModBlocks.LIGHT_BLUE_FROGLIGHT,
                        ModBlocks.LIGHT_GRAY_FROGLIGHT,
                        ModBlocks.LIME_FROGLIGHT,
                        ModBlocks.MAGENTA_FROGLIGHT,
                        ModBlocks.ORANGE_FROGLIGHT,
                        ModBlocks.PINK_FROGLIGHT,
                        ModBlocks.PURPLE_FROGLIGHT,
                        ModBlocks.WHITE_FROGLIGHT,
                        ModBlocks.YELLOW_FROGLIGHT);

        getOrCreateTagBuilder(ModTags.Blocks.FROGLIGHTS)
                .add(ModBlocks.RED_FROGLIGHT,
                        ModBlocks.BLACK_FROGLIGHT,
                        ModBlocks.BLUE_FROGLIGHT,
                        ModBlocks.BROWN_FROGLIGHT,
                        ModBlocks.CYAN_FROGLIGHT,
                        ModBlocks.GRAY_FROGLIGHT,
                        ModBlocks.GREEN_FROGLIGHT,
                        ModBlocks.LIGHT_BLUE_FROGLIGHT,
                        ModBlocks.LIGHT_GRAY_FROGLIGHT,
                        ModBlocks.LIME_FROGLIGHT,
                        ModBlocks.MAGENTA_FROGLIGHT,
                        ModBlocks.ORANGE_FROGLIGHT,
                        ModBlocks.PINK_FROGLIGHT,
                        ModBlocks.PURPLE_FROGLIGHT,
                        ModBlocks.WHITE_FROGLIGHT,
                        ModBlocks.YELLOW_FROGLIGHT,
                        Blocks.OCHRE_FROGLIGHT,
                        Blocks.PEARLESCENT_FROGLIGHT,
                        Blocks.VERDANT_FROGLIGHT);
    }
}
