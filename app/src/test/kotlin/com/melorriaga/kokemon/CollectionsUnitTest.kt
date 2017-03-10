package com.melorriaga.kokemon

import org.junit.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class CollectionsUnitTest {

    @Test
    fun testAny() { // Returns `true` if at least one element matches the given [predicate].
        val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
        assertTrue { list.any { it > 5 } }
        assertFalse { list.any { it > 15 } }
    }

    @Test
    fun testAll() { // Returns `true` if all elements match the given [predicate].
        val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
        assertTrue { list.all { it > 0 } }
        assertFalse { list.all { it > 5 } }
    }

}
