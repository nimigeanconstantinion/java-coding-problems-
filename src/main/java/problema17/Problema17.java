package problema17;

public class Problema17 {
    //todo:numarul de aparitii ale unui substring intr-un string

    public static int countSubV1(String ss, String s) {
        int nrAp = 0;
        Boolean sw=true;
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == ss.charAt(0)) {
                sw=true;
                for (int j = 0; j < ss.length(); j++) {
                    if (s.charAt(i) == ss.charAt(j)) {
                        i++;
                    } else {
                        sw=false;
                        break;
                    }
                }
                if(sw){
                    nrAp++;
                }
            }


        }
        return nrAp;

    }

    public static int countSubV2(String ssir,String sir){

        return (sir.length()-sir.replace(ssir,"").length())/ssir.length();
    }
}


