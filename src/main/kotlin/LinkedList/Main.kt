package LinkedList

fun main() {
    val OurLinkeLst=ourLinkedList<Int>()
    OurLinkeLst.pushElement(1)
    OurLinkeLst.pushElement(2)
    OurLinkeLst.pushElement(3)
    OurLinkeLst.pushElement(4)
    OurLinkeLst.pushElement(5)
    println(" the size of the linked list= ${OurLinkeLst.size}")
    println(OurLinkeLst)
}