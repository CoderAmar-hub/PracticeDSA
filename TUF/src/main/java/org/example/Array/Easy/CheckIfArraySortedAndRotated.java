package org.example.Array.Easy;

/*
Note: An array A rotated by x positions results in an array B of the same length
such that B[i] == A[(i+x) % A.length] for every valid index i.
 */
public class CheckIfArraySortedAndRotated {
    public static void main(String[] args) {
        CheckIfArraySortedAndRotatedSolution solution = new CheckIfArraySortedAndRotatedSolution();
        int[] nums1 = {3,4,5,1,2};
        System.out.println("The given array is rotated and sorted: "+solution.check(nums1));

        int[] nums2 = {2,1,3,4};
        System.out.println("The given array is rotated and sorted: "+solution.check(nums2));
    }
}

class CheckIfArraySortedAndRotatedSolution {

    // here we compare all the neighbouring elemnts and check whether they are in somewhat sorted
    // there will be a small change due to rotation in the array at only one place.
    // so if there are irregularities more than once, return false
    public boolean check(int[] nums) {
        int irregularities = 0, length = nums.length;

        for(int i = 0; i < length; i++){
            if(nums[i] > nums[(i+1) % length])
                irregularities++;
        }

        return irregularities <= 1;
    }
}