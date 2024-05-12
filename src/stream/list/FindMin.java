package stream.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMin {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 2, 1 , -5, 30);
        int minVal = list.stream().mapToInt(x -> x.intValue()).min().orElse(Integer.MIN_VALUE);

        System.out.println("min value is :" + minVal);
    }
}
