package org.example.Dzen;
//1385
public class Dzen8 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{2,1,100,3};
        int[] arr2 = new int[]{-5,-2,10,-3,7};
        int d = 6;
        System.out.println(findTheDistanceValue(arr1, arr2, d));
    }
    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;
        for(int i : arr1){
            boolean m = true;
            for (int j: arr2){
                if (Math.abs(i-j)<=d) {
                    m=false;
                    break;
                }
            }
            if(m){count++;}
        }
        return count;
    }
}
