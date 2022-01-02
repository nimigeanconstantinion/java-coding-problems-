package problema22;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//todo returneaza cel mai lung prefix dintr-o lista de siruri
public class Problema22 {
    public static String getPrefixV1(String[] s){
        String[] ns=Arrays.stream(s).sorted().toArray(String[]::new);
        if(s.length==1){
            return s[0];
        }

        for(int pref=0;pref<ns[0].length();pref++){
            Character c=ns[0].charAt(pref);
            for(int j=0;j<s.length;j++){
                if(s[j].charAt(pref)!=c||pref>=ns[0].length()){
                    return s[j].substring(0,pref);
                }
            }
        }
        return s[0];


    }


}
