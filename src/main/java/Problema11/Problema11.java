package Problema11;

public class Problema11 {

    //11. Checking whether a string is a palindrome: Write a program that
    //determines whether the given string is a palindrome or not.
    public static boolean isPalindrome(String s){
        for(int i=0;i<(s.length()/2)+(s.length()%2);i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}
