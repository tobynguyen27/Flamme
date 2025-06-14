package dev.tobynguyen27.flamme.math

object MathHelper {
    /**
     * Converts degrees to radians.
     *
     * @param degrees the degrees
     * @return the radians
     */
    fun toRadians(degrees: Double): Double = degrees * Math.PI / 180f

    /**
     * Converts degrees to radians.
     *
     * @param degrees the degrees
     * @return the radians
     */
    fun toRadians(degrees: Float): Double = degrees * Math.PI / 180f

    /**
     * Converts radians to degrees.
     *
     * @param radians the radians
     * @return the degrees
     */
    fun toDegrees(radians: Double): Double = radians * 180f / Math.PI

    /**
     * Converts radians to degrees.
     *
     * @param radians the radians
     * @return the degrees
     */
    fun toDegrees(radians: Float): Double = radians * 180f / Math.PI
}
