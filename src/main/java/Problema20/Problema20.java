package Problema20;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Problema20 {
    public static String replicateStringV1(String s){
        return Stream.generate(()->s).limit(5).collect(Collectors.joining());
    }
    public static String replicateStringV2(String s){
        return String.format("%05d",0).replace("0",s);
    }

    public static String replicateStringV3(String s){
        String x="";
        for(int i=0;i<5;i++){
            x+=s;
        }
        return x;
    }
}
