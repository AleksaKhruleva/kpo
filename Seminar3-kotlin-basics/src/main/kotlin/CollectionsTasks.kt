/**
 *  Задание 1: Заменить все повторяющиеся элементы входного списка на "blahblah".
 *  (1 балл)
 */
fun replaceElements(array: List<String>): List<String> {
    for (el in array) {
        if (array.count { it == el } > 1) {
            println("a")
        }
    }

    return listOfNotNull()
}

fun uniqueWords(text: String): Int {
    val splitted = text.split(' ')
    return splitted.toSet().size
}

fun main() {
    val text = "a a a b c c c c d"
    println(uniqueWords(text))

    // Вызвать для text и вывести результат замены на экран
    replaceElements(text.split(' '))
}