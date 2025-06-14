package dev.tobynguyen27.flamme.math

object MathHelper {

    /**
     * Converts degrees to radians.
     *
     * @param degrees the degrees
     * @return the radians
     */
    fun toRadians(degrees: Double): Double {
        return degrees * Math.PI / 180f
    }

    /**
     * Converts degrees to radians.
     *
     * @param degrees the degrees
     * @return the radians
     */
    fun toRadians(degrees: Float): Double {
        return degrees * Math.PI / 180f
    }

    /**
     * Converts radians to degrees.
     *
     * @param radians the radians
     * @return the degrees
     */
    fun toDegrees(radians: Double): Double {
        return radians * 180f / Math.PI
    }

    /**
     * Converts radians to degrees.
     *
     * @param radians the radians
     * @return the degrees
     */
    fun toDegrees(radians: Float): Double {
        return radians * 180f / Math.PI
    }
}