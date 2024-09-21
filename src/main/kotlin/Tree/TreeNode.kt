package Tree


// data class provides some inbuilt functions such as hashcode or toString or .copy function to objects
data class TreeNode<T>(val value:T,val children:MutableList<TreeNode<T>>)

/*
*           1    -> value/root  1 is value  4,5 are children which are mutable list of T
*       4        5
*    1   1  3  7  5  8
*
* */

fun main() {

    val leftTreeNode = TreeNode<Int>(
        value = 4,
        children = mutableListOf(TreeNode(1,mutableListOf()),TreeNode(1,mutableListOf()),TreeNode(3,mutableListOf()))
    )
    val rightTreeNode = TreeNode<Int>(
        value = 5,
        children = mutableListOf(TreeNode(7,mutableListOf()),TreeNode(5,mutableListOf()),TreeNode(8,mutableListOf()))
    )
    val Tree = TreeNode(value = 1, mutableListOf(leftTreeNode,rightTreeNode))


    fun findOccurrenceOfNode(tree:TreeNode<Int>,value:Int):Int{
        //base condition  for recursion
        val hasOccurence = if(tree.value == value) return 1 else 0
       return if(tree.children.isEmpty()) {
           return hasOccurence
       }else {
           var counter = 0
           tree.children.forEach { tree ->
              counter = counter + findOccurrenceOfNode(tree,value)
           }

           hasOccurence+counter
       }


    }

    print(findOccurrenceOfNode(Tree,1))
}