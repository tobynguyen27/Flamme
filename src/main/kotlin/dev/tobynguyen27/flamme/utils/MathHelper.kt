package dev.tobynguyen27.flamme.utils

import kotlin.math.pow

object MathHelper {
  /**
   * Calculates 10 raised to the power of n.
   */
  fun tenPowerTo(n: Int): Long = 10.0.pow(n).toLong()
}
