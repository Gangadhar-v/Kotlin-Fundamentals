package kotlin_dsa.Stack

interface Stack<T:Any> {

    val isEmpty:Boolean

    val count:T

    fun peek():T?

    fun push(element:T)

    fun pop():T

}