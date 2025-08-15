package dev.tobynguyen27.flamme.utils

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MathHelperTest {
  // tenPowerTo() tests
  @Test
  fun `tenPowerTo - zero`() {
    assertEquals(1L, MathHelper.tenPowerTo(0))
  }

  @Test
  fun `tenPowerTo - positive exponent`() {
    assertEquals(1000L, MathHelper.tenPowerTo(3))
  }

  @Test
  fun `tenPowerTo - negative exponent`() {
    assertEquals(0.001.toLong(), MathHelper.tenPowerTo(-3))
  }
}
