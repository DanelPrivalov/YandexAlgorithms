package org.example.YandexWarmongUp;

import java.util.Arrays;
import java.util.Scanner;

//Диего увлекается коллекционированием наклеек. На каждой из них написано число, и каждый коллекционер мечтает собрать наклейки со всеми встречающимися числами.
//Диего собрал N наклеек, некоторые из которых, возможно, совпадают. Как-то раз к нему пришли K коллекционеров. i-й из них собрал все наклейки с номерами не меньшими,
// чем pi. Напишите программу, которая поможет каждому из коллекционеров определить, сколько недостающих ему наклеек есть у Диего. Разумеется, гостей Диего не
// интересуют повторные экземпляры наклеек.

public class Yandex1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int diegoAmount = scanner.nextInt();
        scanner.nextLine();
        String diegoStr = scanner.nextLine();
        int[] diegoArr = Arrays.stream(diegoStr.split(" ")).mapToInt(Integer::parseInt).distinct().toArray();
        Arrays.sort(diegoArr);


        int guestsAmount = scanner.nextInt();
        scanner.nextLine();
        String guestsStr = scanner.nextLine();
        int[] guestsArr = Arrays.stream(guestsStr.split(" ")).mapToInt(Integer::parseInt).toArray();

        for(int i = 0; i <guestsAmount; i++){
            for (int j = 0; j<diegoArr.length; j++){
                if(guestsArr[i] <= diegoArr[j]) {
                    System.out.println(j);
                    break;
                }
                if (j == diegoArr.length - 1){
                    System.out.println(diegoArr.length);
                    break;
                }
            }

        }
    }
}
