package dev.tobynguyen27.flamme.utils

import net.fabricmc.loader.api.FabricLoader

object ModHelper {
    fun isModLoaded(modId: String): Boolean = FabricLoader.getInstance().isModLoaded(modId)
}
