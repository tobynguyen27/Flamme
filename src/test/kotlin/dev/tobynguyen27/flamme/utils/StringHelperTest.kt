package dev.tobynguyen27.flamme.utils

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class StringHelperTest {
    // capitalize() tests
    @Test
    fun `capitalize - lowercase first letter`() {
        assertEquals("Hello world", StringHelper.capitalize("hello world"))
    }

    @Test
    fun `capitalize - already capitalized`() {
        assertEquals("Hello world", StringHelper.capitalize("Hello world"))
    }

    @Test
    fun `capitalize - empty string`() {
        assertEquals("", StringHelper.capitalize(""))
    }

    @Test
    fun `capitalize - single lowercase letter`() {
        assertEquals("A", StringHelper.capitalize("a"))
    }

    @Test
    fun `capitalize - first char is non-letter`() {
        assertEquals("1hello", StringHelper.capitalize("1hello"))
    }

    // toEnglishName() tests
    @Test
    fun `toEnglishName - single word lowercase`() {
        assertEquals("Hello", StringHelper.toEnglishName("hello"))
    }

    @Test
    fun `toEnglishName - snake case`() {
        assertEquals("Steel Ingot", StringHelper.toEnglishName("steel_ingot"))
    }

    @Test
    fun `toEnglishName - mixed case input`() {
        assertEquals("Steel Ingot", StringHelper.toEnglishName("StEeL_InGoT"))
    }

    @Test
    fun `toEnglishName - multiple underscores`() {
        assertEquals("Multiple Underscores Here", StringHelper.toEnglishName("MULTIPLE_UNDERSCORES_HERE"))
    }

    @Test
    fun `toEnglishName - empty string`() {
        assertEquals("", StringHelper.toEnglishName(""))
    }

    // upperCamelToLowerUnderscore() tests
    @Test
    fun `upperCamelToLowerUnderscore - simple case`() {
        assertEquals("hello_world", StringHelper.upperCamelToLowerUnderscore("HelloWorld"))
    }

    @Test
    fun `upperCamelToLowerUnderscore - with acronym`() {
        assertEquals("personal_id", StringHelper.upperCamelToLowerUnderscore("PersonalID"))
    }

    @Test
    fun `upperCamelToLowerUnderscore - single word`() {
        assertEquals("word", StringHelper.upperCamelToLowerUnderscore("Word"))
    }

    @Test
    fun `upperCamelToLowerUnderscore - already lowercase`() {
        assertEquals("hello_world", StringHelper.upperCamelToLowerUnderscore("helloWorld"))
    }

    @Test
    fun `upperCamelToLowerUnderscore - consecutive uppercase letters`() {
        assertEquals("http_request", StringHelper.upperCamelToLowerUnderscore("HTTPRequest"))
    }

    @Test
    fun `upperCamelToLowerUnderscore - empty string`() {
        assertEquals("", StringHelper.upperCamelToLowerUnderscore(""))
    }

    // toReadableNumberString() tests
    @Test
    fun `toReadableNumberString - simple number`() {
        assertEquals("1,000", StringHelper.toReadableNumberString(1000))
    }

    @Test
    fun `toReadableNumberString - large number`() {
        assertEquals("1,000,000", StringHelper.toReadableNumberString(1000000))
    }

    @Test
    fun `toReadableNumberString - small number`() {
        assertEquals("1", StringHelper.toReadableNumberString(1))
    }

    @Test
    fun `toReadableNumberString - zero`() {
        assertEquals("0", StringHelper.toReadableNumberString(0))
    }

    @Test
    fun `toReadableNumberString - negative number`() {
        assertEquals("-1,000", StringHelper.toReadableNumberString(-1000))
    }
}
