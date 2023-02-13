package org.example;

import java.util.Scanner;

public class Task0 {

//    Вывод ромба со сторонами Х и Y за один цикл
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input height: ");
        int height = scanner.nextInt();
        System.out.print("Input width: ");
        int width = scanner.nextInt();
        Task0.printDiamond(height, width);
    }

    private static void printDiamond(int height, int width){

        System.out.println(makeSpace("#", width/2));

        for (int i=1; i<height-1; i++){
            int spaceBefore = Math.abs(width/2-i);
            if (spaceBefore+2>=width){
                spaceBefore = (width-2)/2;
            }
            int spaceIn = width - 2 * spaceBefore - 2;
            if (spaceIn<0){
                spaceIn = 0;
            }
            System.out.println(makeSpace("#", spaceBefore) + makeSpace("#", spaceIn));
        }
        System.out.println(makeSpace("#", width/2));
    }

    public static String makeSpace(String s, int n) {
        return String.format("%1$" + (n+1) + "s", s);
    }
}