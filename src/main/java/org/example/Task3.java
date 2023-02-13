package org.example;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


//        for(Map.Entry<String, Integer> entry: map.entrySet()){
//            System.out.println(entry.getKey() + entry.getValue());
//        }

//Вовочка ломает систему безопасности Пентагона. Для этого ему понадобилось узнать, какие символы
// в секретных зашифрованных посланиях употребляются чаще других. Для удобства изучения
// Вовочка хочет получить графическое представление встречаемости символов.
// Поэтому он хочет построить гистограмму количества символов в сообщении.
// Гистограмма — это график, в котором каждому символу, встречающемуся в сообщении хотя бы один раз, соответствует столбик,
// высота которого пропорциональна количеству этих символов в сообщении.

public class Task3 {
    public static void main(String[] args) throws IOException{
        HashMap<String, Integer> map = new HashMap<>();
        int maxSymCount = 0;

        StringBuilder s = new StringBuilder();

        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        String line = reader.readLine();
        while (line != null) {
            s.append(line.replaceAll(" ",""));
            line = reader.readLine();
        }
        reader.close();

//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            String line = scanner.nextLine().replaceAll(" ","");
//            if ("".equals(line)) {
//                break;
//            }
//            s.append(line);
//        }
//        scanner.close();

        char[] syms = s.toString().toCharArray();

        for (char sym : syms){
            if (!map.containsKey(String.valueOf(sym))){
                map.put(String.valueOf(sym), 0);
            }
            map.put(String.valueOf(sym), map.get(String.valueOf(sym))+1);
            maxSymCount = Math.max(maxSymCount, map.get(String.valueOf(sym)));
        }

        ArrayList<String> arrayKeys = new ArrayList<>((map.keySet()));
        Collections.sort(arrayKeys);


        for(int i = maxSymCount; i > 0; i--){
            for(String unicKey : arrayKeys){
                if(map.get(unicKey) >= i){
                    System.out.print("#");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
        for(String i: arrayKeys){
            System.out.print(i);
        }

    }
}
