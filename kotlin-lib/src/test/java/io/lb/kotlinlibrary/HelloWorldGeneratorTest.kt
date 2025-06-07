package io.lb.kotlinlibrary

import org.junit.Test
import org.junit.Assert.assertEquals

internal class HelloWorldGeneratorTest {
    @Test
    fun testHelloWorld() {
        val expected = "Hello, World!"
        val actual = generateHelloWorld()
        assertEquals(expected, actual)
    }
}
