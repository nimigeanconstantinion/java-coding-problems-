package Problema12;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class Problema12 {
    //12. Removing duplicate characters: Write a program that removes the
    //duplicate characters from the given string.

    public static String removeDouble(String s){
        String ns=" ";
        for(char c:s.toCharArray()){
            if(!ns.contains(c+"")){
                ns=ns+c;
            }
        }
        return ns;
    }

    public static String removeDoubleJ8(String s){
        return Arrays.asList(s.split("")).stream().distinct().collect(Collectors.joining());
    }
}
