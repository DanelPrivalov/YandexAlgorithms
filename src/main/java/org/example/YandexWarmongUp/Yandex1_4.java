package org.example.YandexWarmongUp;

import java.util.Scanner;

public class Yandex1_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int var = scanner.nextInt();
        int row = scanner.nextInt();
        int place = scanner.nextInt();

        if ((row-1)*2+place + var > N){
            System.out.println(-1);
            return;
        }
        if (var == 1){
            System.out.println((row+1) + " " + place);
        }
        if (var % 2 == 0){
            System.out.println((var/2+row) + " " + place);
        }
        else{
            if(place==1) {
                System.out.println((var / 2 + row) + " " + 2);
            }
            else {
                System.out.println((var / 2 + row) + " " + 1);
            }
        }
    }
}
