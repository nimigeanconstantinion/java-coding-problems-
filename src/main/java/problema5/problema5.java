package problema5;

import java.util.List;

public class problema5 {
//todo: numara vocalele si consoanele unui sir
        public static void s1(String s) {
            List<Character> vocale = List.of('a', 'e', 'i', 'o', 'u');
            int contV = 0, contC = 0;
            for (int i = 0; i < s.length(); i++) {
                if (vocale.contains(s.charAt(i))) {
                    contV++;
                } else if(s.charAt(i)!=' ') contC++;
            }
            System.out.println(" Vocale="+contV+" , Consoane="+contC);
        }
 }
