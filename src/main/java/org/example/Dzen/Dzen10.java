package org.example.Dzen;

import java.util.Arrays;
//242
public class Dzen10 {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
    }
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char[] sch = s.toCharArray();
        Arrays.sort(sch);
        char[] tch = t.toCharArray();
        Arrays.sort(tch);
        for (int i=0; i<sch.length; i++){
            if (!(sch[i]==tch[i])){
                return false;
            }
        }
        return true;
    }
}
