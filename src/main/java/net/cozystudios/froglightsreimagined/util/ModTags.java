package net.cozystudios.froglightsreimagined.util;

import net.cozystudios.froglightsreimagined.FroglightsReimaginedCore;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {

    public static class Blocks {
        public static final TagKey<Block> FROGLIGHTS =
                createBlockTag("froglights");

        private static TagKey<Block> createBlockTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(FroglightsReimaginedCore.MOD_ID, name));
        }
    }
}
