package problema13;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Problema13 {

    //todo:sterge un caracter din sir
    public static String removeChar1(String s,char c){
        String ns="";
        for(char x:s.toCharArray()){
            if(x!=c){
                ns+=x;
            }
        }
        return ns;
    }

    public static String removeChar2(String s,char c){
        return s.chars().filter(x->x!=c).mapToObj(j->String.valueOf(j)).collect(Collectors.joining());
    }
}
