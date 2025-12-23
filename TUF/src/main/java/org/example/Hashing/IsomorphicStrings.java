package org.example.Hashing;

import java.util.HashMap;
import java.util.Map;


public class IsomorphicStrings {
    public static void main(String[] args) {
        SolutionToIsomorphicStrings solution = new SolutionToIsomorphicStrings();
        boolean res = solution.isIsomorphic("eqq", "add");
        System.out.println("Given Strings are : "+(res ? "Isomorphic" : "not Isomorphic"));

        res = solution.isIsomorphic("foo", "bar");
        System.out.println("Given Strings are : "+(res ? "Isomorphic" : "not Isomorphic"));

        res = solution.isIsomorphic("paper", "title");
        System.out.println("Given Strings are : "+(res ? "Isomorphic" : "not Isomorphic"));

        res = solution.isIsomorphic("badc", "baba");
        System.out.println("Given Strings are : "+(res ? "Isomorphic" : "not Isomorphic"));
    }
}

class SolutionToIsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        boolean result = true;
        Map<Character, Character> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            if(!map.containsKey(s.charAt(i)))
                map.put(s.charAt(i), t.charAt(i));
            else
            {
                if(map.get(s.charAt(i)) != t.charAt(i)){
                    return result;
                }
            }
        }

        map.clear();
        for(int i = 0; i < t.length(); i++){
            if(!map.containsKey(t.charAt(i)))
                map.put(t.charAt(i), s.charAt(i));
            else
            {
                if(map.get(t.charAt(i)) != s.charAt(i)){
                    return result;
                }
            }
        }
        return result;
    }
}
