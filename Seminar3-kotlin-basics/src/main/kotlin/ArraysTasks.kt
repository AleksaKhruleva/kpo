fun makeArray(): Array<Int> {
    print("Введите n - количество элементов массива: ")
    val n = readln().toInt()

    val arr = Array(n) { 0 }

    for (i in 0..<n) {
        print("Введите ${i + 1}-й элемент: ")
        val num = readln().toInt()
        arr[i] = num
    }

    print("Ваш массив: ")
    println(arr.joinToString(" "))

    return arr
}

fun sortArrayDesc(arr: Array<Int>) {
    arr.sortDescending()
    print("Ваш массив, отсортированный по убыванию: ")
    println(arr.joinToString(" "))
}

fun main() {
    val arr = makeArray()
    sortArrayDesc(arr)
}