package Problema19;

public class Problema19 {
    //todo: declarare stringuri pe mai multe linii;
    private static final String LS=System.lineSeparator();
    private String sir;

    public Problema19(String sir){
        this.sir=sir+LS;

    }
    public void addString(String newSir){
        sir+=newSir+LS;
    }

    public String getSir() {
        return sir;
    }
}
