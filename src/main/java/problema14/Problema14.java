package problema14;

import java.util.*;
import java.util.List;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.groupingBy;

public class Problema14 {
    //todo: sterge caracterul cu cele mai multe aparitii intr-un sir

    public static String removeMaxChar(String s) {
        Map<Character, Integer> keys = new HashMap<>();
        char mchar = 0;
        for (Character c : s.toCharArray()) {
            if (keys.containsKey(c)) {
                int cnt = keys.get(c);
                keys.put(c, cnt + 1);
            } else {
                keys.put(c, 1);
            }
        }
        int mv=keys.entrySet().stream().max(comparingByValue()).map(p->p.getValue()).orElseThrow();
        System.out.println("ce am scos eu "+mv);
        List<Integer> valori = new ArrayList<Integer>(keys.values());
        List<Integer> sortval = valori.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        //System.out.println(valori.get(0));
        for (int i : sortval) {
            System.out.println(i);
        }
        int maxc = sortval.get(0);
        int cnt = 0;

        for (Character q : keys.keySet()) {
            if (keys.get(q) == maxc) {
                System.out.println("Caracterul este " + q + " cu " + maxc + " aparitii");
                mchar = q;
                cnt++;
            }
        }
        if(cnt==1) {
            return s.replace("" + mchar, "");
        }else{
            return s;
        }
    }


    public static Character maxOccurenceCharacter(String str) {
        Map<Character,Long> m1=new HashMap<>();
        m1= str.chars()
                .filter(c -> Character.isWhitespace(c) == false) // ignoring space
                .mapToObj(c -> (char) c)
                .collect(groupingBy(c -> c,Collectors.counting()))
                .entrySet()
                .stream()
                .max(comparingByValue())
                .map(p -> Map.of(p.getKey(), p.getValue()))
                .orElse(Map.of(Character.MIN_VALUE, -1L));
    return (Character) m1.keySet().toArray()[0];
    }
}
