package problema6;

public class Problema6 {
    public static void s1(Character c,String s){
        int k=0;
        for(int i=0;i<s.length();i++){
            if(c==s.charAt(i)) k++;
        }
        System.out.println("Caracterul "+c+" apare de "+k+" ori");
    }
    //varianta din carte

    public static void s2(Character c,String s){
        int k=s.length()-s.replaceAll(c.toString(),"").length();
        System.out.println("Caracterul "+c+" apare de "+k+" ori");
    }

    //varianta functional programming
    public static void s3(Character c,String s){
        System.out.println("Caracterul "+c+" apare de "+s.chars().filter(p->p==c).count()+" ori");
    }

}
