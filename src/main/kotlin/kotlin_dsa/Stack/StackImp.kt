package kotlin_dsa.Stack

class StackImp:Stack<Int> {

    private val storage = arrayListOf<Int>()

    override val count: Int
        get() = storage.size
    override val isEmpty: Boolean
        get() = count == 0

    override fun peek(): Int? {
        return storage[storage.size-1]
    }

    override fun pop(): Int {
        return storage.removeAt(storage.size-1)
    }

    override fun push(element: Int) {
        return storage.add(storage.size,element)
    }
}

fun main() {
    val stack = StackImp()
    stack.push(4)
    stack.push(3)
    stack.push(2)
    stack.push(1)
    stack.push(0)
    println("peek of stack before pop ${stack.peek()}")
    stack.pop()
    println("peek of stack after pop ${stack.peek()}")
}