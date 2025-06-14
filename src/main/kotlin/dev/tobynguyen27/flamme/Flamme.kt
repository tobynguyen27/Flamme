package dev.tobynguyen27.flamme

import dev.tobynguyen27.flamme.math.MathHelper
import net.fabricmc.api.ModInitializer
import org.slf4j.LoggerFactory

object Flamme : ModInitializer {
	const val MOD_ID = "flamme"
    val LOGGER = LoggerFactory.getLogger(MOD_ID)

	override fun onInitialize() {
		LOGGER.info("Making a field of flowers ✨")
	}
}
