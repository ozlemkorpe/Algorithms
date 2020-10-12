/*
Project: Insertion Sort Algorithm
Date: 12.10.2020
Author: OzlemKorpe
*/
import java.util.Arrays;
public class InsertionSort{

     public static void main(String []args){
        Integer[] intArray = {5,7,1,10,2,100,40,43,92,70,8};
        insertionSort(intArray);
     }
     
     public static void insertionSort(Integer[] numbers){
         for(int j=1; j<numbers.length ; j++){
             int key = numbers[j];
             int i = j - 1;
              while( i>=0 &&  numbers[i] > key){
                 numbers[i+1] = numbers[i];
                 i = i-1;
              }
              numbers[i+1] = key;
              // Print ordering of array elements for each iteration
              System.out.println(Arrays.toString(numbers));
             
         }
         
     }
}

