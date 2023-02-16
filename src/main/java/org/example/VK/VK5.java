package org.example.VK;

public class VK5 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 5, 4, 6};
        System.out.println(validMountainArray(arr));
    }
    public static boolean validMountainArray(int[] arr) {
        if(arr.length<3){
            return false;
        }
        int max = arr[0];
        int index = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max=arr[i];
                index = i;
            }
        }
        if(index==0 || index==arr.length-1){
            return false;
        }

        for (int i=0; i<index; i++){
            if(arr[i]>=arr[i+1]){
                return false;
            }
        }
        for (int i=index; i<arr.length-1; i++){
            if(arr[i]<=arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
