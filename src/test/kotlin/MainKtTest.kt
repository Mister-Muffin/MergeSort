import org.junit.jupiter.api.Assertions.*

class MainKtTest {

    @org.junit.jupiter.api.Test
    fun merge() {
        assertEquals(listOf(3, 4), merge(listOf(4), listOf(3)))

        assertEquals(listOf(2, 1, 4, 3), merge(listOf(4, 3), listOf(2, 1)))
        assertEquals(listOf(1, 2, 3, 4), merge(listOf(2, 4), listOf(1, 3)))

    }

    @org.junit.jupiter.api.Test
    fun merge_sort() {
        var lst = listOf(8, 7, 6, 5, 4, 3, 2, 1)
        assertEquals(lst.sorted(), mergeSort(lst))
        lst = listOf(10, 9, 8, 7, 6, 5, 4, 3, 2, 1)
        assertEquals(lst.sorted(), mergeSort(lst))
        lst = listOf(9, 8, 7, 6, 5, 4, 3, 2, 1)
        assertEquals(lst.sorted(), mergeSort(lst))
    }
}
