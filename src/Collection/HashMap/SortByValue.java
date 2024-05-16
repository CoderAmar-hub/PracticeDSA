package Collection.HashMap;

import java.util.*;

public class SortByValue {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("Amar", 12);
        map.put("Ashish", 5);
        map.put("Harsh", 65);
        map.put("Satish", 55);
        map.put("Nisha", 53);
        map.put("Amrita", 34);

        printMap(map);
        Thread thread = new Thread();

        List<Map.Entry<String, Integer>> list = new LinkedList<>(map.entrySet());

        Collections.sort(list, (i1, i2) -> i1.getValue().compareTo(i2.getValue()));

        HashMap<String, Integer> result = new LinkedHashMap<>();

        for(Map.Entry<String, Integer> each : list){
            result.put(each.getKey(), each.getValue());
        }
        printMap(result);
    }

    private static void printMap(HashMap<String, Integer> map) {
        System.out.println("The map is :");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key : "+entry.getKey()+" , Value : "+entry.getValue());
        }
    }
}
