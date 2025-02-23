fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val evenNumbers = list.filter { it % 2 == 0 }
    println(evenNumbers.joinToString()) //This will print 2,4 as expected

    val emptyList = emptyList<Int>()
    val evenNumbersEmpty = emptyList.filter { it % 2 == 0 }
    println(evenNumbersEmpty.joinToString()) // This will print nothing as expected

    val nullList: List<Int?>? = null
    val evenNumbersNull = nullList?.let { it.filter { it % 2 == 0 } } ?: emptyList<Int?>()
    println(evenNumbersNull.joinToString()) // This will now print nothing, correctly handling the null case
} 