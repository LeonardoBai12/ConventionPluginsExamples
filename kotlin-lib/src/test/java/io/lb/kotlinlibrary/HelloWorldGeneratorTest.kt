package io.lb.kotlinlibrary

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class HelloWorldGeneratorTest {
    @Test
    fun testHelloWorld() {
        val expected = "Hello, World!"
        val actual = generateHelloWorld()
        assertEquals(expected, actual)
    }
}
