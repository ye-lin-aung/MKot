package com.yelinaung.mkot

import isZawgyiEncoded
import uni2zg
import zg2uni
import java.util.*

/**
 * Created by user on 7/13/16.
 */
class MCollection


fun Collection<String>.filterUniText():List<String>{
    val result = arrayListOf<String>()
    for (item in this)
        if(!item.isZawgyiEncoded()) {
            var item = item.toString()
            result.add(item)
        }
    return result
}
fun Collection<String>.filterZgText():List<String>{
    val result = arrayListOf<String>()
    for (item in this)
        if(item.isZawgyiEncoded()) {
            var item = item.toString()
            result.add(item)
        }
    return result
}


fun Collection<String>.sortByUnicode():List<String>{
    val result = this as ArrayList
    result.sort()
    return result
}


fun Collection<String>.sortByZawgyi():List<String>{
    val result = this as ArrayList
    result.toUnicode()
    result.sort()
    result.toZawgyi()
    return result
}

fun Collection<String>.zgCount():Int = this.filterZgText().size

fun Collection<String>.uniCount():Int = this.filterUniText().size




fun Collection<String>.toZawgyi():List<String>{
    val result = arrayListOf<String>()
    for (item in this) {
        if(!item.isZawgyiEncoded()) {
            result.add(item.uni2zg())
        }else{
            result.add(item)
        }
    }
    return result
}

fun Collection<String>.toUnicode():List<String>{
    val result = arrayListOf<String>()
    for (item in this) {
        if(item.isZawgyiEncoded()) {
            result.add(item.zg2uni())
        }else{
            result.add(item)
        }
    }

    return result
}
