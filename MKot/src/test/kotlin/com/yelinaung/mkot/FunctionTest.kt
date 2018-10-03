package com.yelinaung.mkot

import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class FunctionTest {

    private val unicodeString = "သီဟိုဠ်မှ ဉာဏ်ကြီးရှင်"
    private val zawgyiString = "သီဟိုဠ္မွ ဉာဏ္ႀကီးရွင္"


    @Test
    fun unicodeFilterPredicateTestOnUnicodeString() {
        val expected = true
        val actual = unicodeFilterPredicate(unicodeString)

        assertEquals(expected, actual)
    }

    @Test
    fun unicodeFilterPredicateTestOnZawgyiString() {
        val expected = false
        val actual = unicodeFilterPredicate(zawgyiString)

        assertEquals(expected, actual)
    }

    @Test
    fun zawgyiFilterPredicateTestOnUnicodeString() {
        val expected = false
        val actual = zawgyiFilterPredicate(unicodeString)

        assertEquals(expected, actual)
    }

    @Test
    fun zawgyiFilterPredicateTestOnZawgyiString() {
        val expected = true
        val actual = zawgyiFilterPredicate(zawgyiString)

        assertEquals(expected, actual)
    }

    @Test
    fun unicodeMapPredicateTestOnUnicodeString() {
        val expected = unicodeString
        val actual = unicodeMapPredicate(unicodeString)

        assertEquals(expected, actual)
    }


    @Test
    fun unicodeMapPredicateTestOnZawgyitring() {
        val expected = unicodeString
        val actual = unicodeMapPredicate(zawgyiString)

        assertEquals(expected, actual)
    }


    @Test
    fun zawgyiMapPredicateTestOnUnicodeString() {
        val expected = zawgyiString
        val actual = zawgyieMapPredicate(unicodeString)

        assertEquals(expected, actual)
    }


    @Test
    fun zawgyiMapPredicateTestOnZawgyitring() {
        val expected = zawgyiString
        val actual = zawgyieMapPredicate(zawgyiString)

        assertEquals(expected, actual)
    }


}