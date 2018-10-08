package com.yelinaung.mkot

import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class MapTest {


    private val unicodeMap = mapOf(
            1 to "မင်္ဂလာပါ",
            2 to "သီဟိုဠ်မှ ဉာဏ်ကြီးရှင်",
            3 to "အာယုဝဍ္ဎနဆေးညွှန်းစာ",
            4 to "ဗာဒံပင်ထက် အဓိဋ္ဌာန်လျက်",
            5 to "ဂဃနဏဖတ်ခဲ့သည်"
    )


    private val zawgyiMap = mapOf(
            6 to "မဂၤလာပါ",
            7 to "သီဟိုဠ္မွ ဉာဏ္ႀကီးရွင္",
            8 to "အာယုဝၯနေဆးၫႊန္းစာ",
            9 to "ဗာဒံပင္ထက္ အဓိ႒ာန္လ်က္",
            10 to "ဂဃနဏဖတ္ခဲ့သည္"
    )


    private val combinedMap = zawgyiMap + unicodeMap

    @Test
    fun testFilterUnicode() {
        val expected = unicodeMap
        val actual = combinedMap.filterUniText()

        assertEquals(expected, actual)
    }

    @Test
    fun testFilterZawgyi() {
        val expected = zawgyiMap
        val actual = combinedMap.filterZgText()

        assertEquals(expected, actual)
    }

    @Test
    fun testUnicodeCount() {
        val expected = unicodeMap.size
        val actual = combinedMap.uniCount()

        assertEquals(expected, actual)
    }

    @Test
    fun testZawgyiCount() {
        val expected = zawgyiMap.size
        val actual = combinedMap.zgCount()

        assertEquals(expected, actual)
    }

    @Test
    fun testConvertUnicode() {
        val expected = unicodeMap.values + unicodeMap.values
        val actual = combinedMap.toUnicode().values

        assertEquals(expected.toList(), actual.toList())
    }

    @Test
    fun testConvertZawgyi() {
        val expected = zawgyiMap.values + zawgyiMap.values
        val actual = combinedMap.toZawgyi().values

        assertEquals(expected.toList(), actual.toList())
    }

    @Test
    fun testSearchWithZawgyiText() {
        val input = "မဂၤလာပါ"
        val expected = listOf(
                1, 6
        )
        val actual = combinedMap.searchText(input)

        assertEquals(expected, actual)
    }

    @Test
    fun testSearchWithUnicodeText() {
        val input = "မင်္ဂလာပါ"
        val expected = listOf(
                1, 6
        )
        val actual = combinedMap.searchText(input)

        assertEquals(expected, actual)
    }
}
