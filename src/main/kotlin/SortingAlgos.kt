class SortingAlgos {

    // Compare adjacent elements and swap them if the one at the higher index is lower than the one at the lower index,
    // keep iterating through the array until no swaps are needed. Every additional element in the array has the potential to add several more
    // traversals through the array so it has a time complexity of O(n²)
    fun bubbleSort(array:IntArray):IntArray{

        var swap = true //value that holds whether or not a a value has been swapped/if the array needs to be traversed again
        while(swap){
            swap = false //reset value
            for(i in 0 until array.size-1){ // Traverses entire array from element 0 to the last element)
                if(array[i] > array[i+1]){ //Compares current element to following element
                    val temp = array[i] // if current element is greater than next and they need to be swapped need to be swapped, put the value of the current element in a variable
                    array[i] = array[i+1]// sets value of current element to the value of the one following it
                    array[i + 1] = temp//sets the value of the following element to the one of the current element, which we saved in the "temp" variable for this occasion

                    swap = true // Set the swap variable to true to indicate that we made a swap and need to continue checking
                }
            }
        }
        return array // If swap is ever false at the end of a traversal it means that no elements were swapped and the sort is complete, at which point we will break out of the
        // loop and return the sorted array

    }
}