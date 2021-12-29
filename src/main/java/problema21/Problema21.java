package problema21;

public class Problema21 {

    //todo: sterge spatiile de la start in sir si de la final
    public static String stergeSpatiiV1(String s){

        return s.trim();
    }

    public static String stergeSpatiiV2(String s){
        return s.strip();
    }

    public static String stergeSpatiiV3(String s){
        int m=0,n=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                m=i;
                break;
            }
        }

        for(int i=s.length()-1;i>-1;i--){
            System.out.println("i="+i);
            if(s.charAt(i)!=' '){
                n=i;
                break;
            }
        }
        return s.substring(m,n);
    }

}
