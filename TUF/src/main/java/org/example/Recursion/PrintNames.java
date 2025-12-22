package org.example.Recursion;

public class PrintNames {
    public static void main(String[] args) {
        String name = "Amar Ashish";
        System.out.println("\nPrint Name 5 times:");
        printName(name, 0, 5);

        System.out.println("\nPrint 1 to 5 linearly:");
        printNumLinearly(1, 5);

        System.out.println("\nPrint 1 to 5 in reverse:");
        printNumInReverse(5);

        System.out.println("\nPrint 1 to 5 while backtracking:");
        printNumByBacktracking(5);

        System.out.println("\nPrint 5 to 1 while backtracking:");
        printAscNumsByBacktracking(1, 5);
    }

    private static void printAscNumsByBacktracking(int run, int n) {
        if(run > n) return;
        printAscNumsByBacktracking(run+1, n);
        System.out.println(run);
    }

    private static void printNumByBacktracking(int run) {
        if(run < 1) return;
        printNumByBacktracking(run-1);
        System.out.println(run);
    }

    private static void printNumInReverse(int run) {
        if(run < 1) return;
        System.out.println(run);
        printNumInReverse(run-1);
    }

    private static void printName(String name, int run, int n) {
        if(run >= n) return;
        System.out.println(name);
        printName(name, run+1, n);
    }

    private static void printNumLinearly(int run, int n) {
        if(run > n) return;
        System.out.println(run);
        printNumLinearly(run+1, n);
    }
}
