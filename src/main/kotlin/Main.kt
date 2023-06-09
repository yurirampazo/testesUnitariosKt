fun countXO(str: String): Boolean {
    val strLower = str.lowercase()

    var i = 0
    var countX = 0
    var countO = 0
    while (i < strLower.length) {
        if (strLower[i] == 'x'){
            countX++
        } else if (strLower[i] == 'o') {
            countO++
        }
        i++
    }
    return countO == countX && countO != 0
}

fun main() {
   println(countXO("xxoo"))
   println(countXO("xxxoo"))
}

fun abc(): Boolean {
    return true
}

fun exception(){

//    NullPointerException
//    throw NullPointerException()
    val str: String? = null
    str!!.length
}

fun portaria(idade: Int, tpConvite: String, cod: String): String {
    if (idade < 18) return "NEGADO"

    if (tpConvite.isNotBlank()) {
        val tipoConvite = tpConvite.lowercase()

        if (tipoConvite != "comum" && tipoConvite != "premium" && tipoConvite != "luxo") {
            return "NEGADO"
        }

        if (cod.isNotBlank()) {
            val codigo = cod.lowercase()
            return if (tipoConvite == "comum" && codigo.startsWith("xt")) {
                "WELCOME"
            } else if ((tipoConvite == "premium" || tipoConvite == "luxo") && codigo.startsWith("xl")) {
                "WELCOME"
            } else {
                "NEGADO"
            }
        }
    }
    return "NEGADO"
}

