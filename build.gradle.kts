import gg.meza.stonecraft.mod

plugins {
    id("gg.meza.stonecraft")
}

modSettings {
    clientOptions {
        fov = 90
        guiScale = 3
        narrator = false
        darkBackground = true
        musicVolume = 0.0
    }
}

repositories {
    mavenCentral()
}

dependencies {
    if (mod.isFabric) {
        modImplementation("net.fabricmc.fabric-api:fabric-api:${mod.prop("fabric_version")}")
    }
}
