fun String.isZawgyi(): Boolean = this.isZawgyiEncoded()
fun String.isUnicode(): Boolean = !this.isZawgyiEncoded()
//fun String.uni2zg(): String = Rabbit.
//fun String.zg2uni(): String = replace_with_rule(zg2uni_rule, this)
//
//private fun replace_with_rule(rule: String, output: String): String {
//    var output = output
//    try {
//        val rule_array = JSONArray(rule)
//        val max_loop = rule_array.length()
//        //because of JDK 7 bugs in Android
//
//        output = output.replace("null", "\uFFFF\uFFFF")
//        for (i in 0..max_loop - 1) {
//            val obj = rule_array.getJSONObject(i)
//            val from = obj.getString("from")
//            val to = obj.getString("to")
//            output = output.replace(from.toRegex(), to)
//            output = output.replace("null", "")
//        }
//    } catch (e: JSONException) {
//        e.printStackTrace()
//    }
//    output = output.replace("\uFFFF\uFFFF", "null")
//    return output
//}
//
//
