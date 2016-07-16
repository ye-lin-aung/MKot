package kotlintest

import com.yelinaung.mkot.searchTexts
import com.yelinaung.mkot.toUnicode

/**
 * Created by user on 7/16/16.
 */
fun main(args: Array<String>) {
    val map: MutableMap<Int, String> = mutableMapOf()
    map[1] = "မင်္ဂလာပါ"
    map[2] = "bb"
    map[3] = "မင်္ဂလာပါ"
    map[7] = "မဂၤလာပါ"
    map[4] = "dd"
    map[5] = "ee"
    map[6] = "ff"
    //Can use list too
    map.searchTexts("မင်္ဂလာပါ").forEach {
        println(it)
    }

}