package problema15;


import java.util.*;
import java.util.stream.Collectors;

public class Problema15 {
    //todo: sortarea unui array de siruri dupa lungime

    public static ArrayList<String> sortArrayJ8(ArrayList<String> as) {
        return new ArrayList<>(as.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList()));
    }

    public static ArrayList<String> sortArrayV1(ArrayList<String> as) {
        int lmin = 0;
        String tmps = "";
        for (int i = 0; i < as.size() - 1; i++) {
            for (int j = i + 1; j < as.size(); j++) {
                if (as.get(j).length() < as.get(i).length()) {
                    tmps = as.get(i);
                    as.set(i, as.get(j));
                    as.set(j, tmps);
                }
            }
        }
        return as;
    }

    public static ArrayList<String> sortArray2(ArrayList<String> al) {
        Collections.sort(al,new CompLungime());
        return al;
    }


}
