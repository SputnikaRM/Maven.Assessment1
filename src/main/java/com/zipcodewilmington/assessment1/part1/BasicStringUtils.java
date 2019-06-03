package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        str = str.substring(0,1).toUpperCase() + str.substring(1);
        return str;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {

        String rev = "";
        for(int x = str.length()-1; x>=0; x--){
            rev = rev + str.charAt(x);

        }
        return rev;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        String s = "";
        for(int x = str.length()-1; x>=0; x--)
            s = s + str.charAt(x);


        s = s.substring(0,1).toUpperCase()+s.substring(1);

        return s;
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        str = str.substring(1,str.length()-1);
        return str;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        for (int x=0; x<str.length(); x++){
            char invert = str.charAt(x);
            if(Character.isUpperCase(invert)){
               invert= Character.toLowerCase(invert);
            } else if (Character.isLowerCase(invert)) {
             invert =   Character.toUpperCase(invert);
            }
        }
        return str;
    }


}
