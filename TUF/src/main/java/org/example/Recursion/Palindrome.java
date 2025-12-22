package org.example.Recursion;

import java.util.Locale;

public class Palindrome {
    public static boolean isPalindrome(String s) {
        if(s.length() <=1 ) return true;
        if(s.charAt(0) != s.charAt(s.length()-1)) return false;
        return isPalindrome(s.substring(1, s.length()-1));
    }

    public static void main(String[] args) {
        String s = "race a car";//"A man, a plan, a canal: Panama";

        boolean isPalindrome = isPalindrome(s.toLowerCase().replaceAll("[^a-zA-Z0-9]", ""));

        System.out.println("The string \""+s+"\" is " + (isPalindrome ? "Palindrome" : "Not a Palindrome"));
    }
}
