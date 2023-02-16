package org.example.VK;

//Палиндром
import java.util.Scanner;

public class VK1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(isPalindrome(s));

    }

    public static boolean isPalindrome(String s) {
        String m = s.toLowerCase().replaceAll("[^\\da-zA-Zа-яёА-ЯЁ]", "");
        char[] syms = m.toCharArray();
        for(int i = 0; i<syms.length/2; i++){
            if (syms[i]!=syms[syms.length-1-i]){
                return false;
            }
        }
        return true;
    }
}
