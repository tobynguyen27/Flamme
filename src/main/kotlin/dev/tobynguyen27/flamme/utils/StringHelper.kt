package dev.tobynguyen27.flamme.utils

import java.util.Locale

object StringHelper {
    /**
     * Capitalizes the first letter of a string.
     * Example:
     * - `hello world` -> `Hello world`
     *
     * @param string The string to capitalize.
     * @return The capitalized string.
     */
    fun capitalize(string: String): String {
        return string.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
    }

    /**
     * Converts a string to snake case. Handles acronyms and consecutive uppercase letters properly.
     * Example:
     * - `HelloWorld` -> `hello_world`
     * - `PersonalID` -> `personal_id`
     *
     * @param string The string to convert.
     * @return The snake case string.
     */
    fun upperCamelToLowerUnderscore(string: String): String {
        return string
            .replace(Regex("([a-z0-9])([A-Z])"), "$1_$2")
            .replace(Regex("([A-Z])([A-Z][a-z])"), "$1_$2")
            .lowercase()
    }
}
