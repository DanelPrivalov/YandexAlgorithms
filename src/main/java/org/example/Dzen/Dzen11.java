package org.example.Dzen;

import java.util.HashMap;
//290
public class Dzen11 {
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat fish";
        System.out.println(wordPattern(pattern, s));
    }
    public static boolean wordPattern(String pattern, String s) {
        String[] strings = s.split(" ");
        String[] pat = pattern.split("");
        if (pat.length!=strings.length){
            return false;
        }
        HashMap<String, String> myMap = new HashMap<>();
        for (int i = 0; i<pat.length; i++){
            if (!myMap.containsKey(strings[i])){
                if(myMap.containsValue(pat[i])){
                    return false;
                }
                else {
                    myMap.put(strings[i], pat[i]);
                }
            }
            else {
                String a = myMap.get(strings[i]);
                String b = pat[i];
                if(!a.equals(b)){
                    return false;
                }
            }
        }
        return true;
    }
}
