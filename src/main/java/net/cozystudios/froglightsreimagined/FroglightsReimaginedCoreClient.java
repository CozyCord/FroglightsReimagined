package net.cozystudios.froglightsreimagined;

import net.cozystudios.froglightsreimagined.block.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class FroglightsReimaginedCoreClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RED_FROGLIGHT_LANTERN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ORANGE_FROGLIGHT_LANTERN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.YELLOW_FROGLIGHT_LANTERN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LIME_FROGLIGHT_LANTERN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GREEN_FROGLIGHT_LANTERN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLUE_FROGLIGHT_LANTERN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LIGHT_BLUE_FROGLIGHT_LANTERN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CYAN_FROGLIGHT_LANTERN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MAGENTA_FROGLIGHT_LANTERN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PURPLE_FROGLIGHT_LANTERN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PINK_FROGLIGHT_LANTERN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WHITE_FROGLIGHT_LANTERN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BROWN_FROGLIGHT_LANTERN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLACK_FROGLIGHT_LANTERN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LIGHT_GRAY_FROGLIGHT_LANTERN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GRAY_FROGLIGHT_LANTERN, RenderLayer.getCutout());
    }
}