@file:JvmName("MKot")
package com.yelinaung.mkot

import com.comquas.rabbit.Rabbit

fun String.isZawgyi(): Boolean = this.isZawgyiEncoded()

fun String.isUnicode(): Boolean = !this.isZawgyiEncoded()
fun String.uni2zg(): String = Rabbit.uni2zg(this)
fun String.zg2uni(): String = Rabbit.zg2uni(this)
