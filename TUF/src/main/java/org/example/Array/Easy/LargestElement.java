package org.example.Array.Easy;

/*
//Approach with Streams
public class LargestElement {
    public static void main(String[] args) {
        int[] nums = {3, 3, 6, 1, 3, 0, 99, -40};
        System.out.println("The largest element in the given array is :" + largestElement(nums));
    }

    public static int largestElement(int[] nums) {
        Optional<Integer> integerOptional = Arrays.stream(nums).boxed().max(java.util.Comparator.naturalOrder());
        return integerOptional.orElse(-1);
    }
}*/

class Solution1 {

    // Function to find the largest element in the array
    public static int findLargestElement(int[] arr, int n) {
        int max = arr[0];  // Initialize max with the first element in the array

        // Iterate through the array to find the maximum element
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {  // If the current element is greater than max, update max
                max = arr[i];
            }
        }

        return max;  // Return the largest element found
    }
}

public class LargestElement {

    public static void main(String[] args) {
        // Array 1
        int[] arr1 = {2, 5, 1, 3, 0};
        int n = arr1.length;  // Size of the array
        int max = Solution1.findLargestElement(arr1, n);  // Call the function to find the largest element
        System.out.println("The largest element in the array is: " + max);  // Output the result

        // Array 2
        int[] arr2 = {8, 10, 5, 7, 9};
        n = arr2.length;  // Size of the array
        max = Solution1.findLargestElement(arr2, n);  // Call the function to find the largest element
        System.out.println("The largest element in the array is: " + max);  // Output the result
    }
}