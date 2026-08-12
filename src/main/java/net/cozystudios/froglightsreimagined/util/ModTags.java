package net.cozystudios.froglightsreimagined.util;

import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;

public class ModTags {

    public static class Blocks {
        public static final TagKey<Block> FROGLIGHTS =
                createBlockTag("froglights");

        public static final TagKey<Block> FROGLIGHT_LANTERNS =
                createBlockTag("froglight_lanterns");

        private static TagKey<Block> createBlockTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, FroglightsId.of(name));
        }
    }
}
