package net.cozystudios.froglightsreimagined.item;

import net.cozystudios.froglightsreimagined.FroglightsReimaginedCore;
import net.cozystudios.froglightsreimagined.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup CORE_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(FroglightsReimaginedCore.MOD_ID, "core"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.core"))
                    .icon(() -> new ItemStack(ModBlocks.RED_FROGLIGHT)).entries((displayContext, entries) -> {

                        entries.add(ModBlocks.RED_FROGLIGHT);
                        entries.add(ModBlocks.ORANGE_FROGLIGHT);
                        entries.add(ModBlocks.YELLOW_FROGLIGHT);
                        entries.add(ModBlocks.LIME_FROGLIGHT);
                        entries.add(ModBlocks.GREEN_FROGLIGHT);
                        entries.add(ModBlocks.BLUE_FROGLIGHT);
                        entries.add(ModBlocks.CYAN_FROGLIGHT);
                        entries.add(ModBlocks.LIGHT_BLUE_FROGLIGHT);
                        entries.add(ModBlocks.MAGENTA_FROGLIGHT);
                        entries.add(ModBlocks.PURPLE_FROGLIGHT);
                        entries.add(ModBlocks.PINK_FROGLIGHT);
                        entries.add(ModBlocks.WHITE_FROGLIGHT);
                        entries.add(ModBlocks.LIGHT_GRAY_FROGLIGHT);
                        entries.add(ModBlocks.GRAY_FROGLIGHT);
                        entries.add(ModBlocks.BLACK_FROGLIGHT);
                        entries.add(ModBlocks.BROWN_FROGLIGHT);
                    }).build());

    public static void registerItemGroups() {
        FroglightsReimaginedCore.LOGGER.info("Registering Item Groups for" + FroglightsReimaginedCore.MOD_ID);
    }
}