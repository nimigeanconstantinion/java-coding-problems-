package problema7;

import java.text.DecimalFormat;

public class Problema7 {
    //todo: convert string to int,long,float,double
    public static int stringToInt(String s) {
        int decim = isOnlyDigit(s);
        if (decim > -2) {
            String r = s.replace(".", "");
            long n = 0;
            int putere = 1;
            for (int i = r.length() - 1; i >= 0; i--) {
                n = n + (Integer.parseInt(r.charAt(i) + "") * putere);
                putere = putere * 10;
            }
            int cat = 1;
            if (decim >= 0) {
                cat = (int) Math.pow(10.00, r.length() - decim);
            }
            return (int)n/cat;
        }else{
            return 0;
        }
    }

    public static double stringToDouble(String s) {
        int decim = isOnlyDigit(s);
        if (decim > -2) {
            String r = s.replace(".", "");
            long n = 0;
            int putere = 1;
            for (int i = r.length() - 1; i >= 0; i--) {
                n = n + (Integer.parseInt(r.charAt(i) + "") * putere);
                putere = putere * 10;
            }
            int cat = 1;
            if (decim >= 0) {
                cat = (int) Math.pow(10.00, r.length() - decim);
            }
            return n/cat;
        }else{
            return 0.00;
        }
    }

    public static float stringToFloat(String s) {
        int decim = isOnlyDigit(s);
        if (decim > -2) {
            String r = s.replace(".", "");
            long n = 0;
            int putere = 1;
            for (int i = r.length() - 1; i >= 0; i--) {
                n = n + (Integer.parseInt(r.charAt(i) + "") * putere);
                putere = putere * 10;
            }
            int cat = 1;
            if (decim >= 0) {
                cat = (int) Math.pow(10.00, r.length() - decim);
            }
            return n/cat;
        }else{
            return 0;
        }
    }


    public static int isOnlyDigit(String s) {
        int ret = -1;
        boolean is = true;
        int contp = 0;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i)) || s.charAt(i) == '.') {
                if (s.charAt(i) == '.') {
                    System.out.println("in");
                    if (++contp < 2) {
                        ret = i;
                    } else {
                        return -2;
                    }
                }
            } else {
                return -2;
            }
        }
        return ret;
    }
}
