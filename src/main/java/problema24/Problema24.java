package problema24;

import java.util.stream.Stream;

public class Problema24 {
    //todo trasformare siruri
    public static void transform(String sir){
        System.out.println(Stream.of(sir).map(s->"hello "+sir).findFirst().get());
        System.out.println(Stream.of(sir).map(s->s.repeat(2)).findFirst().get());
    }
}
