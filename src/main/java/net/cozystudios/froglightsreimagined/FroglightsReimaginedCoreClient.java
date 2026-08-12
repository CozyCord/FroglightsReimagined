package net.cozystudios.froglightsreimagined;

import net.cozystudios.froglightsreimagined.block.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
//? if <1.21.6 {
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
//?} else {
/*import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.minecraft.client.render.BlockRenderLayer;
*///?}

public class FroglightsReimaginedCoreClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        //? if <1.21.6 {
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
        //?} else {
        /*BlockRenderLayerMap.putBlock(ModBlocks.RED_FROGLIGHT_LANTERN, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.ORANGE_FROGLIGHT_LANTERN, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.YELLOW_FROGLIGHT_LANTERN, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.LIME_FROGLIGHT_LANTERN, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.GREEN_FROGLIGHT_LANTERN, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.BLUE_FROGLIGHT_LANTERN, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.LIGHT_BLUE_FROGLIGHT_LANTERN, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.CYAN_FROGLIGHT_LANTERN, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.MAGENTA_FROGLIGHT_LANTERN, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.PURPLE_FROGLIGHT_LANTERN, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.PINK_FROGLIGHT_LANTERN, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.WHITE_FROGLIGHT_LANTERN, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.BROWN_FROGLIGHT_LANTERN, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.BLACK_FROGLIGHT_LANTERN, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.LIGHT_GRAY_FROGLIGHT_LANTERN, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.GRAY_FROGLIGHT_LANTERN, BlockRenderLayer.CUTOUT);
        *///?}
    }
}
