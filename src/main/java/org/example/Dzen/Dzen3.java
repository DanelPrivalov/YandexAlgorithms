package org.example.Dzen;
//443
public class Dzen3 {
    public static void main(String[] args) {
        char[] initial = new char[]{'a','a','b','b','c','c','c'};
        System.out.println(compress(initial));
    }
    public static int compress(char[] chars) {
        StringBuilder resultString = new StringBuilder();
        int count = 0;
        char last = chars[0];
        for (int i=0; i<chars.length; i++){
            if (chars[i] == last){
                count++;
            }
            else {
                resultString.append(last);
                if(count>1) {
                    resultString.append(count);
                }
                last = chars[i];
                count=1;
            }
        }
        resultString.append(last);
        resultString.append(count);
        char[] result = resultString.toString().toCharArray();
        return result.length;
    }
}
