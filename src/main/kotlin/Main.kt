fun main() {
    println("Hello World!")

    mergeSort((0..10000000).map { it })
}

fun merge(left: List<Int>, right: List<Int>): List<Int> {
    var i = 0
    var j = 0

    val out = ArrayList<Int>()

    while (i <= left.size - 1 && j <= right.size - 1) {
        if (left[i] < right[j]) {
            out.add(left[i])
            i++
        } else {
            out.add(right[j])
            j++
        }
    }

    while (i <= left.size - 1) {
        out.add(left[i])
        i++
    }
    while (j <= right.size - 1) {
        out.add(right[j])
        j++
    }

    return out
}

fun mergeSort(list: List<Int>): List<Int> {
    val sublist = ArrayList<List<Int>>()
    val subList2 = ArrayList<List<Int>>()
    list.forEach { sublist.add(listOf(it)) }

    while (sublist.size >= 2) {
        subList2.clear()
        for (i in 0..sublist.size - 2 step 2) {
            subList2.add(merge(sublist[i], sublist[i + 1]))
        }
        if (sublist.size % 2 != 0)
            subList2.add(sublist.last())

        sublist.clear()
        sublist.addAll(subList2)
    }

    return sublist[0]
}
