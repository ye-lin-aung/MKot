@file:JvmName("MCollection")

package com.yelinaung.mkot


//region : predicate functions
val unicodeFilterPredicate: ((String) -> (Boolean)) = {
    !it.isZawgyiEncoded()
}


val zawgyiFilterPredicate: ((String) -> (Boolean)) = {
    it.isZawgyiEncoded()
}

val unicodeMapPredicate: ((String) -> (String)) = {
    if (it.isZawgyiEncoded()) it.zg2uni()
    else it
}

val zawgyieMapPredicate: ((String) -> (String)) = {
    if (!it.isZawgyiEncoded()) it.uni2zg()
    else it
}
//endregion

//region : Collection
fun Collection<String>.filterUniText(): Collection<String> {
    return this.filter(unicodeFilterPredicate)
}

fun Collection<String>.filterZgText(): Collection<String> {
    return this.filter(zawgyiFilterPredicate)
}

fun Collection<String>.zgCount(): Int = this.filterZgText().size

fun Collection<String>.uniCount(): Int = this.filterUniText().size

fun List<String>.toZawgyi(): List<String> {
    return this.map(zawgyieMapPredicate)
}

fun List<String>.toUnicode(): List<String> {
    return this.map(unicodeMapPredicate)
}

fun List<String>.sortUnicodeList(): List<String> {
    return this.sorted()
}

fun List<String>.sortZawgyiList(): List<String> {
    return this.map(unicodeMapPredicate).sorted().map(zawgyieMapPredicate)
}


fun List<String>.searchText(keyword: String): List<Int> {
    val standardizedKeyword = unicodeMapPredicate(keyword)
    val indexList = mutableListOf<Int>()
    this.toUnicode().forEachIndexed { index, value ->
        if (value == standardizedKeyword) {
            indexList.add(index)
        }
    }
    return indexList
}

//endregion

//region: Map
fun <K> Map<K, String>.filterUniText(): Map<K, String> {
    return this.filterValues(unicodeFilterPredicate)
}


fun <K> Map<K, String>.filterZgText(): Map<K, String> {
    return this.filterValues(zawgyiFilterPredicate)
}


fun <K> Map<K, String>.uniCount(): Int = this.values.filterUniText().size

fun <K> Map<K, String>.zgCount(): Int = this.values.filterZgText().size

fun <K> Map<K, String>.toZawgyi(): Map<K, String> {
    return this.mapValues {
        zawgyieMapPredicate(it.value)
    }
}

fun <K> Map<K, String>.toUnicode(): Map<K, String> {
    return this.mapValues {
        unicodeMapPredicate(it.value)
    }
}

fun <K> Map<K, String>.searchText(keyword: String): List<K> {
    val standardizedKeyword = unicodeMapPredicate(keyword)
    val keyList = mutableListOf<K>()
    this.toUnicode().forEach { (key, value) ->
        if (value == standardizedKeyword) {
            keyList.add(key)
        }
    }
    return keyList.toList()
}

//endregion