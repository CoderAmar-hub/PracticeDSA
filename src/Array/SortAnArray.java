package Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SortAnArray {
    public static void main(String[] args) {
        int[] arr = new int[]{55,44,99,88,11,33,0};
        Arrays.sort(arr);
        System.out.println("Array in ascending order: ");
        Arrays.stream(arr).forEach(System.out::println);

        //this does not work because first should be wrapper not primitive array
        //Arrays.sort(arr, Collections.reverseOrder());

        int[] arrDesc = Arrays.stream(arr).boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
        Arrays.stream(arrDesc).forEach(System.out::println);
    }
}
