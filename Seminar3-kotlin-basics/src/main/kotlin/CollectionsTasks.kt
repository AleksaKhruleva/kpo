fun replaceElements(array: List<String>): List<String> {
    val res = mutableListOf<String>()
    val unique = mutableListOf<String>()

    for (el in array) {
        if (unique.contains(el)) {
            res.add("blahblah")
        } else {
            res.add(el)
            unique.add(el)
        }
    }

    return res
}

fun uniqueWords(text: String): Int {
    val splitText = text.split(' ')
    return splitText.toSet().size
}

fun main() {
    val text = "1 1 1 2 3 3 3 3 4 5 5"

    val uw = uniqueWords(text)
    println("В строке \"${text}\" кол-во уникальных значений = ${uw}")

    val res = replaceElements(text.split(' '))
    println("После замены всех повторяющихся элементов в строке мы получили \"${res.joinToString(" ")}\"")
}