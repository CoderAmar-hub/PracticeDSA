package trial;

// Java program to Convert a List to an Array
// Using get() method in a loop

// Importing required classes
import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

// Main class
public class ListToArray {

    // Main driver method
    public static void main(String[] args)
    {

        // Creating a dsa.LinkedList.dsa.LinkedList of string type by
        // declaring object of List
        List<String> list = new LinkedList<String>();

        // Adding elements to above dsa.LinkedList.dsa.LinkedList
        // using add() method
        list.add("Geeks");
        list.add("for");
        list.add("Geeks");
        list.add("Practice");

        // Converting List to array
        // using toArray() method
//        String[] arr = list.toArray(new String[0]);
        String[] arr = list.toArray(new String[0]);

        // Printing elements of array
        // using for-each loop
        System.out.println(Arrays.deepToString(arr));

    }
}
