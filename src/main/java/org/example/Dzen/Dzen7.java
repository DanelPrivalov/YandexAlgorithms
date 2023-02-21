package org.example.Dzen;

import java.util.Arrays;
//66
public class Dzen7 {
    public static void main(String[] args) {
        int [] digits = new int[]{9,7,9,8};
        System.out.println(Arrays.toString(plusOne(digits)));
    }
    public static int[] plusOne(int[] digits) {
        if(digits[digits.length-1]==9){
            int i = digits.length-1;
            while (i>=0 && digits[i]==9){
                digits[i]=0;
                i--;
            }
            if(digits[0]==0){
                int[] res = new int[digits.length+1];
                res[0]=1;
                return res;
            }
            else {
                digits[i]++;
            }
        }
        else{
            digits[digits.length-1]++;
        }
        return digits;
    }
}
