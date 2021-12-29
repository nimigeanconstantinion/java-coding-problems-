package Problema18;

import java.util.ArrayList;

public class Problema18 {
    //todo: Verifica daca doua siruri
    public static boolean verificaAnagramaV1(String s1,String s2){
        s1=s1.replace(" ","");
        s2=s2.replace(" ","");
        String s="";
        boolean ret=true;
        for(Character x:s1.toCharArray()){
            if(!s.contains(x+"")){
                s+=x+"";
                if(nrAparitii(x,s1)!=nrAparitii(x,s2)){
                    ret=false;
                    break;
                }
            }
        }
        return ret;
    }

    public static int nrAparitii(Character c,String s){
        return s.length()-s.replace(c+"","").length();
    }



}
