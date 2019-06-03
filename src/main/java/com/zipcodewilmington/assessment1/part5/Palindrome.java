package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    public Integer countPalindromes(String input){

        int palindromes=input.length();
        String s ;

        for ( int x =0; x<input.length();x++){

            for(int y = x+2; y<=input.length(); y++){
                s= input.substring(x,y);
                palindromes += isitaPalindrome(s);
            }
        }
            return palindromes;

    }
    public static int isitaPalindrome(String s){

        int x = 0;
        int y = s.length();
        for (x = 0; x < y; x++) {
            if (!(s.charAt(x) == s.charAt(s.length()-1-x)))
                return 0;
        }
        return 1;
    }




}
