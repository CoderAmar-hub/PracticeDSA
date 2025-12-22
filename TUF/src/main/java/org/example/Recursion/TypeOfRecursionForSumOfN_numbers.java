package org.example.Recursion;

public class TypeOfRecursionForSumOfN_numbers { //Sum of n nums
    public static void main(String[] args) {
        sumThroughParameterisedRecursion(5, 0);

        int sum = sumThroughFunctionalRecursion(5);
        System.out.println("2nd sum is :" + sum);
    }

    //Parameterised
    private static void sumThroughParameterisedRecursion(int num, int sum) {
        if (num < 1) {
            System.out.println("1st sum is :" + sum);
            return;
        }
        sumThroughParameterisedRecursion(num - 1, sum + num);
    }

    //Functional
    private static int sumThroughFunctionalRecursion(int num) {
        if (num == 0) {
            return 0;
        } else
            return num + sumThroughFunctionalRecursion(num-1);
    }
}
