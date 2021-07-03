package subtask1

class Combinator {
    fun checkChooseFromArray(array: Array<Int>): Int? =
        (1..array[1] / 2).firstOrNull {
            ((array[1] + 1 - it)..array[1]).reduce { acc, i -> acc * i } ==
                    (1..it).reduce { acc, i -> acc * i } * array[0]
        }
}