package org.example.Recursion;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Factorial of " + n + " via functional way is:" + fact(n));

        fact(5, 1);
    }

    private static int fact(int num) {
        if (num == 1) return 1;
        else
            return num * fact(num - 1);
    }

    private static void fact(int num, int res){
        if(num < 1) {
            System.out.println("Result of factorial by parameterised way is :"+res);
            return;
        }else
            fact(num-1, res*num);
    }
}
