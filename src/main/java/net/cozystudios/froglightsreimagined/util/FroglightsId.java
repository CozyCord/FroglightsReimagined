package net.cozystudios.froglightsreimagined.util;

import net.cozystudios.froglightsreimagined.FroglightsReimaginedCore;
import net.minecraft.util.Identifier;

public final class FroglightsId {

    private FroglightsId() {}

    public static Identifier of(String path) {
        return of(FroglightsReimaginedCore.MOD_ID, path);
    }

    public static Identifier of(String namespace, String path) {
        //? if >=1.21 {
        return Identifier.of(namespace, path);
        //?} else {
        /*return new Identifier(namespace, path);
        *///?}
    }
}
