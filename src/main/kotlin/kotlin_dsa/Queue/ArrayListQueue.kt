package kotlin_dsa.Queue

class ArrayListQueue<T>:Queue<T> {

    private val storage = arrayListOf<T>()
    override val count: Int
        get() = storage.size
    override val isEmpty: Boolean
        get() = count == 0

    override fun peek(): T? {
        return storage[storage.size-1]
    }

    override fun dequeue(): T? {
       if(storage.isEmpty())
           return null
        else
            return storage.removeAt(storage.size-1)
    }

    override fun enqueue(element: T):Boolean {
        return storage.add(element)
    }
}

fun main() {
    val queue = ArrayListQueue<Int>()
    queue.enqueue(1)
    queue.enqueue(2)
    queue.enqueue(3)
    queue.enqueue(4)
    queue.dequeue()
    queue.dequeue()
    queue.dequeue()
    println("is queue empty ${queue.isEmpty}")
    println("number of elements in queue is ${queue.count}")

    println("the peek of queue is ${queue.peek()}")
}