package problema3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Problema3 {
  //todo: reverse word
  public static String reverseWord(String s){
      String ret="";
      for(int i=s.length()-1;i>=0;i--){
          ret+=s.charAt(i);
      }
      return ret;
  }

    public static String reverseString(String s){
        String[] words=s.split(" ");
        String rs="";
        for(int i=words.length-1;i>=0;i--){
            rs+=reverseWord(words[i])+" ";
        }
        return rs;
    }

}
