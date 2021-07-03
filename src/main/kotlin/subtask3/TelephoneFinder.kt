package subtask3

class TelephoneFinder {
    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {
        if(number.startsWith('-')) return null
        val list = mutableListOf<String>()

        for(i in 0..number.lastIndex){
            when(number[i]){
                '0'->{
                    list.add(number.replaceRange(i..i, "8"))
                }
                '1'->{
                    list.add(number.replaceRange(i..i, "2"))
                    list.add(number.replaceRange(i..i, "4"))
                }
                '2'->{
                    list.add(number.replaceRange(i..i, "1"))
                    list.add(number.replaceRange(i..i, "3"))
                    list.add(number.replaceRange(i..i, "5"))
                }
                '3'->{
                    list.add(number.replaceRange(i..i, "2"))
                    list.add(number.replaceRange(i..i, "6"))
                }
                '4'->{
                    list.add(number.replaceRange(i..i, "1"))
                    list.add(number.replaceRange(i..i, "7"))
                    list.add(number.replaceRange(i..i, "5"))
                }
                '5'->{
                    list.add(number.replaceRange(i..i, "8"))
                    list.add(number.replaceRange(i..i, "2"))
                    list.add(number.replaceRange(i..i, "6"))
                    list.add(number.replaceRange(i..i, "4"))
                }
                '6'->{
                    list.add(number.replaceRange(i..i, "5"))
                    list.add(number.replaceRange(i..i, "3"))
                    list.add(number.replaceRange(i..i, "9"))
                }
                '7'->{
                    list.add(number.replaceRange(i..i, "4"))
                    list.add(number.replaceRange(i..i, "8"))
                }
                '8'->{
                    list.add(number.replaceRange(i..i, "5"))
                    list.add(number.replaceRange(i..i, "7"))
                    list.add(number.replaceRange(i..i, "9"))
                    list.add(number.replaceRange(i..i, "0"))
                }
                '9'->{
                    list.add(number.replaceRange(i..i, "6"))
                    list.add(number.replaceRange(i..i, "8"))
                }

            }
        }
        return list.toTypedArray()
    }
}
