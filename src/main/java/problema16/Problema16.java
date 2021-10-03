package problema16;

public class Problema16 {
    //todo: gaseste daca un  string contiune un substring
    public static boolean isSubstringV1(String s, String sub){
        return s.contains(sub);
    }

    public static boolean isSubstringV2(String s,String sub){
        return s.matches(sub);
    }


    public static boolean isSubstringV3(String s,String sub){
        return s.indexOf(sub)>=0;
    }

}
