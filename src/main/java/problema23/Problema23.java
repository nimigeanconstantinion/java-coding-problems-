package problema23;

public class Problema23 {
    public static String indentV1(String s,int indent){
        return String.format("%05d",0).replace("0"," ")+s;
    }

    public static String indentV2(String sir,int indent){
        return sir.indent(3);
    }
}
