import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*



/*
 * Complete the 'findMedian' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun findMedian(arr: Array<Int>): Int {
    // Write your code here
    var sortedArray = mutableListOf<Int>()
    arr.forEach {
        sortedArray.add(it)
    }
    var temp:Int

     for(i in 0.. sortedArray.size-1){
         for (j in i+1 .. sortedArray.size-1){
             if(sortedArray[j] < sortedArray[i]){
                 temp = sortedArray[j]
                 sortedArray[j]= sortedArray[i]
                 sortedArray[i] = temp
             }
         }
     }
    var medianIndex =sortedArray.size/2
    var median = sortedArray[medianIndex]

    return median

    // Second way

    var medianIndex1=arr.size/2
    var median1 = arr.sorted()[medianIndex1]
    println(median1)

}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()
    if(n in 1 .. 1000001 && n%2!= 0) {
        val arr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()
        val result = findMedian(arr)
        println(result)
    }
    else{
       println("Out of Range or n is even")
    }

}