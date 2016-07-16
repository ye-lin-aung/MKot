package kotlintest

import com.yelinaung.mkot.filterUniText
import com.yelinaung.mkot.toUnicode

/**
 * Created by user on 7/16/16.
 */
fun main(args: Array<String>) {
    val map: MutableMap<Int, String> = mutableMapOf()
    map[1] = "မဂၤလာပါ"
    map[2] = "bb"
    map[3] = "မဂၤလာပါ"
    map[4] = "dd"
    map[5] = "ee"
    map[6] = "ff"
    val list: MutableList<String> = map.values.toMutableList()
    map.filterUniText().forEach {
        println(it)
    }

}