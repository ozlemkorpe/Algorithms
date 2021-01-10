/******************************************************************************
Title: Algorithms Question 1
Author: @OzlemKorpe
Date: 09.01.2021
*******************************************************************************/

/*
Question 1. You are given a sorted array A of n distinct integers, drawn from 1 to m where n<m. 
That is, A is a subset of [1,2,...,m]. Implement an O(logn) time algorithm (i.e., write a function)
 to find the smallest non-negative integer that is missing in A given as a parameter. 
For example, when A is [1, 2, 3, 5, 7, 8, 10], the function must return 4.
*/

class QuestionOne  { 
    /* given a sorted array A of n distinct integers */
    
    public static void main(String[] args)  
    { 
        QuestionOne number = new QuestionOne(); 
        int nNumbers[] = {1, 2, 5, 6, 7, 8, 10, 11, 12}; 
        int length = nNumbers.length; 
        System.out.println("Missing number is : " + number.firstMissing(nNumbers, 0, length - 1)); 
    } 
    
    /* Binary Search method can be applied to obtain O(logn) time complexity */
    int firstMissing(int array[], int first, int last)  
    {   int missingNum = 0;
        if (first > last){
            missingNum = last + 1;
            return missingNum; }
        if (first != array[first]){
             missingNum = first;
            return missingNum;}
        
        int middle = (first + last) / 2; 
  
        /* If the middle value matches its index, then missing number must be on 
        the right side of the middle index */
        if (array[middle] == middle) { return firstMissing(array, middle+1, last);}
        
        return firstMissing(array, first, middle); 
    } 

} 