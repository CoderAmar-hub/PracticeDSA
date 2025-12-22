package org.example.Recursion;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5, 6};

        reverse(intArr, 0);

        for (int x : intArr) System.out.print(x + " ");
    }

    private static void reverse(int[] arr, int index) {
        int n = arr.length;
        if (index >= arr.length / 2) return;

        swap(arr, index, n - index - 1);

        reverse(arr, index + 1);
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
