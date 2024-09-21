package LinkedList
/*
* for general type of node values we can use 'Generics' datatype i.e; <T>
*  the linked list node which contain the two attribute such as the 'node value' and the 'nextNode reference'
*
*
* */
data class Node<T>(var value:T,var nextNode: Node<T>?) {

    override fun toString(): String {
       return if (nextNode != null) {
            ("$value -> ${nextNode.toString()}")
        }

    else{
       ("$value")
    }
    }
}

fun main() {

    var node1 = Node<Int>(1, null)
    var node2 = Node<Int>(2, null)
    var node3 = Node<Int>(3, null)
    var node4=Node<Int>(4,null)
    node1.nextNode =node2
    node2.nextNode =node3
    node3.nextNode=node4
    println(node1)
    println(node2)
}