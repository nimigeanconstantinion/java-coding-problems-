package problema10;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Problema10 {
    public static void permutaT(String s) {
        solutia1("", s);
    }

    public static void solutia1(String prefix,String sir){
        if(sir.length()==0){
        }else{
            for(int i=0;i<sir.length();i++){
                solutia1(prefix+sir.charAt(i),sir.substring(i+1,sir.length())+sir.substring(0,i));
            }
        }
    }
}


