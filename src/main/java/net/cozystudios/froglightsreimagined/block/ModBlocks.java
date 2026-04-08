package net.cozystudios.froglightsreimagined.block;

import net.cozystudios.froglightsreimagined.FroglightsReimaginedCore;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.LanternBlock;
import net.minecraft.block.PillarBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    // Froglights
    public static final Block RED_FROGLIGHT = registerFroglight("red_froglight");
    public static final Block ORANGE_FROGLIGHT = registerFroglight("orange_froglight");
    public static final Block YELLOW_FROGLIGHT = registerFroglight("yellow_froglight");
    public static final Block LIME_FROGLIGHT = registerFroglight("lime_froglight");
    public static final Block GREEN_FROGLIGHT = registerFroglight("green_froglight");
    public static final Block BLUE_FROGLIGHT = registerFroglight("blue_froglight");
    public static final Block CYAN_FROGLIGHT = registerFroglight("cyan_froglight");
    public static final Block LIGHT_BLUE_FROGLIGHT = registerFroglight("light_blue_froglight");
    public static final Block MAGENTA_FROGLIGHT = registerFroglight("magenta_froglight");
    public static final Block PURPLE_FROGLIGHT = registerFroglight("purple_froglight");
    public static final Block PINK_FROGLIGHT = registerFroglight("pink_froglight");
    public static final Block WHITE_FROGLIGHT = registerFroglight("white_froglight");
    public static final Block LIGHT_GRAY_FROGLIGHT = registerFroglight("light_gray_froglight");
    public static final Block GRAY_FROGLIGHT = registerFroglight("gray_froglight");
    public static final Block BLACK_FROGLIGHT = registerFroglight("black_froglight");
    public static final Block BROWN_FROGLIGHT = registerFroglight("brown_froglight");

    public static final Block RED_FROGLIGHT_LANTERN = registerFroglightLantern("red_froglight_lantern");
    public static final Block ORANGE_FROGLIGHT_LANTERN = registerFroglightLantern("orange_froglight_lantern");
    public static final Block YELLOW_FROGLIGHT_LANTERN = registerFroglightLantern("yellow_froglight_lantern");
    public static final Block LIME_FROGLIGHT_LANTERN = registerFroglightLantern("lime_froglight_lantern");
    public static final Block GREEN_FROGLIGHT_LANTERN = registerFroglightLantern("green_froglight_lantern");
    public static final Block BLUE_FROGLIGHT_LANTERN = registerFroglightLantern("blue_froglight_lantern");
    public static final Block CYAN_FROGLIGHT_LANTERN = registerFroglightLantern("cyan_froglight_lantern");
    public static final Block LIGHT_BLUE_FROGLIGHT_LANTERN = registerFroglightLantern("light_blue_froglight_lantern");
    public static final Block MAGENTA_FROGLIGHT_LANTERN = registerFroglightLantern("magenta_froglight_lantern");
    public static final Block PURPLE_FROGLIGHT_LANTERN = registerFroglightLantern("purple_froglight_lantern");
    public static final Block PINK_FROGLIGHT_LANTERN = registerFroglightLantern("pink_froglight_lantern");
    public static final Block WHITE_FROGLIGHT_LANTERN = registerFroglightLantern("white_froglight_lantern");
    public static final Block LIGHT_GRAY_FROGLIGHT_LANTERN = registerFroglightLantern("light_gray_froglight_lantern");
    public static final Block GRAY_FROGLIGHT_LANTERN = registerFroglightLantern("gray_froglight_lantern");
    public static final Block BLACK_FROGLIGHT_LANTERN = registerFroglightLantern("black_froglight_lantern");
    public static final Block BROWN_FROGLIGHT_LANTERN = registerFroglightLantern("brown_froglight_lantern");



    private static Block registerFroglightLantern(String name) {
        return registerBlock(name,
                new LanternBlock(FabricBlockSettings.copy(Blocks.LANTERN)
                        .requiresTool()
                )
        );
    }

    private static Block registerFroglight(String name) {
        return registerBlock(name,
                new PillarBlock(FabricBlockSettings.copyOf(Blocks.OCHRE_FROGLIGHT)
                        .luminance(15)
                        .requiresTool()
                )
        );
    }

    @SuppressWarnings("SameParameterValue")
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(FroglightsReimaginedCore.MOD_ID, name), block);
    }

    @SuppressWarnings("UnusedReturnValue")
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(FroglightsReimaginedCore.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        FroglightsReimaginedCore.LOGGER.info("Registering ModBlocks for " + FroglightsReimaginedCore.MOD_ID);
    }
}
