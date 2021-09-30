package problema1;

import java.util.*;
import java.util.stream.Collectors;

public class Problema1 {

    public static Map<Character,Integer> PS1(String s){
        Map<Character,Integer> result=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            result.compute(c,(k,v)->(v==null)?1:++v);
        }
        return result;
    }

    public static Map<Character,Integer> PS2(String s){
        Map<Character,Integer> rezultat=new HashMap<>();
        int i=0;
        for(char c:s.toCharArray()){
            i++;
            if(rezultat.containsKey(c)){
                int x=rezultat.get(c);
                rezultat.replace(c,x,++x);
            }else{
                rezultat.put(c,1);
            }
        }
        return rezultat;
    }

    public static List<MyMap> PS3(String s){
        List<MyMap> rezultat=new ArrayList<>();
        for(char c:s.toCharArray()){
            MyMap m=new MyMap();
            m.setK(c);
            m.setV(1);
            if(rezultat.contains(m)){
                int index=rezultat.indexOf(m);
                MyMap mm=rezultat.get(index);
                int v=mm.getV();;
                rezultat.get(index).setV(++v);
            }else{
                rezultat.add(m);
                int x=rezultat.indexOf(m);
            }
        }
        return rezultat;
    }
    public static Map<Character,Long> PS4(String s){
        Map<Character,Long> rezultat=new HashMap<>();
        rezultat=s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()));
        return rezultat;

    }
}
