package org.example.Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Fibonnaci digit in 4th place is: " + fib(4));

        System.out.println("Fibonnaci digit in 5th place is: " + fib(5));

        System.out.println("Fibonnaci digit in 7th place is: " + fib(7));

        System.out.println("Fibonnaci digit in 11th place is: " + fib(11));
    }

    private static int fib(int num) {
        if (num <= 1) return num;
        int first = fib(num - 1);
        int second = fib(num - 2);
        return first + second;
    }
}
