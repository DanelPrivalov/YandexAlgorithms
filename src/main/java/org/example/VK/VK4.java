package org.example.VK;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class VK4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int ans = lengthOfLongestSubstring(input);
        System.out.println(ans);
    }

    public static int lengthOfLongestSubstring(String s) {
        String test = "";
        int maxLength = -1;

        if (s.isEmpty()) {
            return 0;
        }
        else if (s.length() == 1) {
            return 1;
        }
        for (char c : s.toCharArray()) {
            String current = String.valueOf(c);

            if (test.contains(current)) {
                test = test.substring(test.indexOf(current)
                        + 1);
            }
            test = test + c;
            maxLength = Math.max(test.length(), maxLength);
        }

        return maxLength;
    }
}


//    HashSet<Character>s=new HashSet();
//    int max=0;
//    int i=0,j=0;
//        while(j<a.length())
//        {
//        if(!s.contains(a.charAt(j)))
//        {
//
//        s.add(a.charAt(j));
//        j++;
//        max=Math.max(max,s.size());
//
//        }
//        else
//        {
//        s.remove(a.charAt(i));
//        i++;
//        }
//
//
//        }
//        return max;
//        }