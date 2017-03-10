package com.melorriaga.kokemon

import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.junit.MatcherAssert.assertThat
import org.junit.Test
import kotlin.test.assertTrue

class CollectionsUnitTest {

    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

    @Test
    fun testAny() { // Returns `true` if at least one element matches the given [predicate].
        assertTrue { list.any { it > 5 } }
    }

    @Test
    fun testAll() { // Returns `true` if all elements match the given [predicate].
        assertTrue { list.all { it > 0 } }
    }

    @Test
    fun testCount() { // Returns the number of elements matching the given [predicate].
        assertThat(list.count { it > 5 }, `is`(4))
    }

    @Test
    fun testFold() { // Accumulates value starting with [initial] value and applying [operation] from left to right to current accumulator value and each element.
        assertThat(list.fold(10) { total, next -> total + next }, `is`(55))
    }

    @Test
    fun testFoldRight() { // Accumulates value starting with [initial] value and applying [operation] from right to left to each element and current accumulator value.
        assertThat(list.foldRight(5) { total, next -> total + next }, `is`(50))
    }

}
