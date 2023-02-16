package org.example.VK;

import java.util.Arrays;

public class VK6 {
    public static void main(String[] args) {
        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        System.out.println(Arrays.toString(removeDuplicates(nums)));
    }
    public static int[] removeDuplicates(int[] nums) {
        int empty = 0;
        for(int i=0; i<nums.length-1-empty;){
            if(nums[i]==nums[i+1]){
                for(int j = i; j< nums.length-1-empty; j++){
                    nums[j] = nums[j+1];
                }
                nums[nums.length-empty-1] = 0;
                empty++;
            }
            else {
                i++;
            }
        }
        return nums;
    }
}
