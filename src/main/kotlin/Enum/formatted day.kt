package Enum

enum class Day(val number:Int){
    sunday(1),
    monday(2),
    tuesday(3),
    wednesday(3),
    thusrday(4),
    firday(5),
    saturday(6);
    open fun FormattedDay(days: Day){
        println("day is $this ")
    }
}

