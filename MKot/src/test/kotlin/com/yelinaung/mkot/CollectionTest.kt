package com.yelinaung.mkot

import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class CollectionTest {

    private val unicodeList = listOf(
            "မင်္ဂလာပါ",
            "သီဟိုဠ်မှ ဉာဏ်ကြီးရှင်",
            "အာယုဝဍ္ဎနဆေးညွှန်းစာ",
            "ဗာဒံပင်ထက် အဓိဋ္ဌာန်လျက်",
            "ဂဃနဏဖတ်ခဲ့သည်"
    )

    private val zawgyiList = listOf(
            "မဂၤလာပါ",
            "သီဟိုဠ္မွ ဉာဏ္ႀကီးရွင္",
            "အာယုဝၯနေဆးၫႊန္းစာ",
            "ဗာဒံပင္ထက္ အဓိ႒ာန္လ်က္",
            "ဂဃနဏဖတ္ခဲ့သည္"
    )

    private val combinedList = unicodeList + zawgyiList


    @Test
    fun testFilterUnicode() {
        val expected = unicodeList
        val actual = combinedList.filterUniText()

        assertEquals(expected, actual)
    }

    @Test
    fun testFilterZawgyi() {
        val expected = zawgyiList
        val actual = combinedList.filterZgText()

        assertEquals(expected, actual)
    }

    @Test
    fun testUnicodeTextCount() {
        val expected = unicodeList.size
        val actual = combinedList.uniCount()
        assertEquals(expected, actual)
    }

    @Test
    fun testZawgyiTextCount() {
        val expected = zawgyiList.size
        val actual = combinedList.zgCount()
        assertEquals(expected, actual)
    }

    @Test
    fun testConvertUnicode() {
        val expected = unicodeList + unicodeList
        val actual = combinedList.toUnicode()

        assertEquals(expected, actual)
    }

    @Test
    fun testZawgyiConvert() {
        val expected = zawgyiList + zawgyiList
        val actual = combinedList.toZawgyi()

        assertEquals(expected, actual)
    }

    //
    @Test
    fun testUnicodeSorting() {
        val expected = listOf(
                "ဂဃနဏဖတ်ခဲ့သည်",
                "ဗာဒံပင်ထက် အဓိဋ္ဌာန်လျက်",
                "မင်္ဂလာပါ",
                "သီဟိုဠ်မှ ဉာဏ်ကြီးရှင်",
                "အာယုဝဍ္ဎနဆေးညွှန်းစာ"
        )

        val actual = unicodeList.sortUnicodeList()

        assertEquals(expected, actual)
    }

    @Test
    fun testZawgyiSorting() {
        val expected = listOf(
                "ဂဃနဏဖတ္ခဲ့သည္",
                "ဗာဒံပင္ထက္ အဓိ႒ာန္လ်က္",
                "မဂၤလာပါ",
                "သီဟိုဠ္မွ ဉာဏ္ႀကီးရွင္",
                "အာယုဝၯနေဆးၫႊန္းစာ"
        )

        val actual = zawgyiList.sortZawgyiList()

        assertEquals(expected, actual)
    }
}