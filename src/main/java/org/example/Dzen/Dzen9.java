package org.example.Dzen;

public class Dzen9 {
    public static void main(String[] args) {
        String quryIP = "123.22.1454.12";
        System.out.println(validIPAddress(quryIP));
    }
    public static String validIPAddress(String queryIP) {
        if (queryIP.contains(".")){
            String[] validation = queryIP.split("\\.", -1);
            if(validation.length!=4){
                return "Neither";
            }
            for(String s: validation){
                char[] charS = s.toCharArray();
                if (s.isEmpty()){
                    return "Neither";
                }
                if (s.charAt(0) == '0' && s.length()>1){
                    return "Neither";
                }

                for (Character ch : charS){
                    if(!Character.isDigit(ch)){
                        return "Neither";
                    }
                }
                if(s.length()>3 || Integer.parseInt(s)>255){
                    return "Neither";
                }
            }
            return "IPv4";
        }

        else if (queryIP.contains(":")){
            String hexadecimal = "0123456789ABCDEFabcdef";
            String[] validation = queryIP.split(":", -1);
            if(validation.length!=8){
                return "Neither";
            }
            for (String s : validation){
                if(s.length()==0 | s.length()>4){
                    return "Neither";
                }
                for(Character ch: s.toCharArray()){
                    if (!hexadecimal.contains(ch.toString())){
                        return "Neither";
                    }
                }
            }
            return "IPv6";
        }
        return "Neither";
    }

}
