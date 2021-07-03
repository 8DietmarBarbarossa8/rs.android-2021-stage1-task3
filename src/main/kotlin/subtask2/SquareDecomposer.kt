package subtask2

import kotlin.math.sqrt

class SquareDecomposer {
    fun decomposeNumber(number: Int): Array<Int>? {
        var arr: Array<Int>?
        for (i in number - 1 downTo 1) {
            arr = (number * number - i * i).getMaxMember()
            if (arr != null) return arr.plus(i)
        }

        return null
    }

    private fun Int.getMaxMember(): Array<Int>? {
        val maxMemb = (sqrt(this.toDouble())).toInt()
        var arr: Array<Int>?
        for (i in maxMemb downTo 1) {
            if(this - i * i == 0) return Array(1){i}
            arr = (this - i * i).getMaxMember()
            if (arr?.sumBy { it * it } == this - i * i && !arr.contains(i)) return arr.plus(i)
        }

        return  null
    }
}
