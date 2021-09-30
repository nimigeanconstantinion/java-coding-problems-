package problema1;

public class MyMap{
    private char k;
    private int v;
    public MyMap(){}
    public MyMap(char k,int v){
        this.k=k;
        this.v=v;
    }

    public char getK() {
        return k;
    }

    public void setK(char k) {
        this.k = k;
    }

    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }



    @Override
    public boolean equals(Object o){
        MyMap m=(MyMap) o;
        return k==m.getK();
    }
}

