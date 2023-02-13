package org.example;

import java.util.HashSet;
import java.util.Scanner;
import java.util.stream.Stream;

//Найти 2 различных числа A и В из поледовательности, что б в сумме они давали Х

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input X: ");
        int x = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Input sequence: ");
        String data = scanner.nextLine();
        String[] stringNumbers = data.split(",");
        
        scanner.close();



        int[] numbers = Stream.of(stringNumbers).mapToInt(Integer::parseInt).toArray();
        int[] res = test(x, numbers);
        for(int i: res){
            System.out.print(i + " ");
        }
    }

    public static int[] test (int x, int[] numbers) {
        int[] res = new int[2];
        HashSet<Integer> mySet = new HashSet<>();
        for (Integer i : numbers) {
            mySet.add(i);
        }
        for (int nownum : numbers) {
            if (mySet.contains(x - nownum)) {
                res[0]=nownum;
                res[1]=x-nownum;
                return res;
            }
        }
        return res;
    }
}
