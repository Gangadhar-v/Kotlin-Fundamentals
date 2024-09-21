package LinkedList

/*
*  linked list which contain 'head' node and 'tail' node
* */
class ourLinkedList<T>{
   private var head:Node<T>?=null
   private var tail:Node<T>?=null
    var size:Int=0

    fun isOurLinkedListEmpty():Boolean{
        return size==0
    }

    override fun toString(): String {
         if(isOurLinkedListEmpty()){
             return "our linked list is empty"
         }
        else{
            return "$head"
         }
    }
    fun pushElement(value:T){
        head=Node(value,nextNode=head)
        if(tail==null){
            tail==head
        }
        size+=1
    }
    /*
    * 3 -> 2 -> 1
    *
    * */
    fun appendElement(value:T){
        if(isOurLinkedListEmpty()){
            pushElement(value)
            return
        }
        tail?.nextNode=Node(value,null)
        tail=tail?.nextNode
        size+=1

    }
}

fun main() {
var linkedlist=ourLinkedList<Int>()
    linkedlist.appendElement(1)
    linkedlist.appendElement(2)
    linkedlist.appendElement(3)
    linkedlist.appendElement(4)
    println(linkedlist)
}
