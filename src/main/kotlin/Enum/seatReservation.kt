                                /*---------TECH GANG----------*/
enum class SeatType{
    WINDOW,MIDDLE,AISLE
}
class SeatReservation{
    fun seatPreff(seatType:SeatType ){
        println("your seat is $seatType")
    }
}

fun main() {
    var p1=SeatReservation ()
    p1.seatPreff(SeatType.WINDOW )
}