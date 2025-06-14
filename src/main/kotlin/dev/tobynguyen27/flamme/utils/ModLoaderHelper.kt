package dev.tobynguyen27.flamme.utils

import net.fabricmc.loader.api.FabricLoader

object ModLoaderHelper {

    /**
     * Checks if a mod is loaded.
     *
     * @param modId the mod id
     * @return true if the mod is loaded, false otherwise
     */
    fun isModLoaded(modId: String): Boolean {
        return FabricLoader.getInstance().isModLoaded(modId)
    }

}
