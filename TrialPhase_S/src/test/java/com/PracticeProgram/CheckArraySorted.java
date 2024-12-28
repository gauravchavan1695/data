package com.PracticeProgram;

import java.util.stream.IntStream;

public class CheckArraySorted {
	
	
	public static boolean isSorted(int[] arr) {
        // Edge case: An array with 0 or 1 element is always sorted
        if (arr.length <= 1) {
            return true;
        }

        // Iterate through the array and check if each element is less than or equal to the next element
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                // If any element is greater than the next one, array is not sorted
                return false;
            }
        }
        // If we reach here, the array is sorted
        return true;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5}; // Example array
        boolean result = isSorted(array);
        
        if (result) {
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is not sorted.");
        }
        
        
//        Using streams ===========================================================================================
        
        int[] array2 = {1, 2, 3, 4, 5};
        
       boolean b2 = IntStream.range(0,array2.length-1).allMatch(i -> array2[i]<=array2[i+1]);
       System.out.println(b2);
    }

}
