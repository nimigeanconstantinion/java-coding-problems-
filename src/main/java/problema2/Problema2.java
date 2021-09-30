package problema2;

import java.util.*;

public class Problema2 {
//todo: gaseste primul caracter care nu se repeta

    public static void s1(String s){
        char rez=0;
        for(int i=0;i<s.length();i++){
            String c=String.valueOf(s.charAt(i));
            String tmp= s.substring(i+1);
            if(!tmp.contains(c)){
                rez=c.charAt(0);
                break;
            }
        }
        System.out.println("Primul caracter care nu se repeta este "+rez);
    }

    public static void s2(String s){
        Map<Character,Integer> struct=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(struct.containsKey(c)){
                struct.replace(c,-1);
            }else{
                struct.put(c,i);
            }
        }
        int min=s.length();
        char ch=0;
        for(Map.Entry<Character,Integer> kv:struct.entrySet()){
            int v=kv.getValue();
            if(v>=0&&v<min){
                min=v;
                ch=kv.getKey();
            }
        }
        System.out.println("Caracterul este "+ch+" pe poz "+min);
    }

}
