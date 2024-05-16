import java.util.HashSet;
import java.util.Set;

public class DifferentStrings {
    public static void main(String[] args) {
        String S = "10201";
        System.out.println("Different string comb are: " + findDifferentStrings(S.length(), S));
    }

    public static String findDifferentStrings(int n, String S){
        Set<String> uniqueStr = new HashSet<>();
        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j < n; j++){
                if(S.charAt(i) != S.charAt(j)){
                    uniqueStr.add(S.substring(i, j+1));
                }
            }
        }
        return Integer.toString(uniqueStr.size());
    }
}
