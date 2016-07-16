package com.yelinaung.mkot

/**
 * Created by user on 7/16/16.
 */
fun main(args: Array<String>) {
    var v :List<String> = mutableListOf("aa","bb","cc","aa");
    v.searchTexts("aa").forEach { println(it) }
}