package dev.tobynguyen27.flamme.math

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class MathHelperTest {
    // tenPowerTo() tests
    @Test
    fun `tenPowerTo - zero`() {
        Assertions.assertEquals(1L, MathHelper.tenPowerTo(0))
    }

    @Test
    fun `tenPowerTo - positive exponent`() {
        Assertions.assertEquals(1000L, MathHelper.tenPowerTo(3))
    }

    @Test
    fun `tenPowerTo - negative exponent`() {
        Assertions.assertEquals(0.001.toLong(), MathHelper.tenPowerTo(-3))
    }

    // calculateFormattedPercentage() tests
    @Test
    fun `should return correct percentage formatted to two decimals`() {
        val result = MathHelper.calculateFormattedPercentage(25.0, 200.0)
        Assertions.assertEquals("12.50", result)
    }

    @Test
    fun `should return 100 when a equals b`() {
        val result = MathHelper.calculateFormattedPercentage(50.0, 50.0)
        Assertions.assertEquals("100.00", result)
    }

    @Test
    fun `should return 0 when a is 0`() {
        val result = MathHelper.calculateFormattedPercentage(0.0, 123.45)
        Assertions.assertEquals("0.00", result)
    }

    @Test
    fun `should return NaN when b is 0`() {
        val result = MathHelper.calculateFormattedPercentage(10.0, 0.0)
        Assertions.assertEquals("NaN", result)
    }

    @Test
    fun `should handle negative numbers correctly`() {
        val result = MathHelper.calculateFormattedPercentage(-50.0, 100.0)
        Assertions.assertEquals("-50.00", result)
    }

    @Test
    fun `should handle both negative a and b`() {
        val result = MathHelper.calculateFormattedPercentage(-25.0, -50.0)
        Assertions.assertEquals("50.00", result)
    }
}
