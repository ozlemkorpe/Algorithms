/******************************************************************************
Title: Algorithms Question 2
Author: @OzlemKorpe
Date: 09.01.2021
*******************************************************************************/
import java.util.PriorityQueue;
import java.util.Arrays;
import java.util.List;

/* 
Question 2. Given an unsorted array, the array has this property that every element
in array is at most k distance from its position in sorted array where k is a positive
integer smaller than size of array. For example, let us consider k is 2, an element at
index 7 in the sorted array, can be at indexes 5, 6, 7, 8, 9 in the given array. We can
sort such arrays more efficiently with the help of Heap data structure. Implement the
following algorithm that uses a Heap:
- Create a Min Heap of size k+1 with first k+1 elements.
- One by one remove min element from heap, put it in result array, and add a new 
element to heap from remaining elements.
*/

class QuestionTwo{
    // Function to sort a K-Sorted Array
    public static void sortKSortedArray(List<Integer> list, int k){
        int index = 0;
        
        // - Create a Min Heap of size k+1 with first k+1 elements.
        PriorityQueue<Integer> myheap = new PriorityQueue<>(list.subList(0, k+1));
        
        /* For loop for One by one remove min element from heap, put it in result array, and add a new 
element to heap from remaining elements. */
        for (int i = k + 1; i < list.size(); i++){
            // Pop the top min element from the heap and store it in the index
            list.set(index++, myheap.poll());
            // Push next element into the heap
            myheap.add(list.get(i));
        }
 
        // Pop last elements and store it in the next indexes 
        while (!myheap.isEmpty()) {
            list.set(index++, myheap.poll());
        }
    }