import java.util.*;
public class StringPeriods {
    public static String stringPeriods(String str) {
        LinkedHashSet<Character> lhs = new LinkedHashSet<>();
        for(int i = 0; i < str.length(); i++){
            lhs.add(str.charAt(i));
        }
        StringBuilder rword = new StringBuilder();
        for(char s: lhs){
            rword.append(s);
        }
        if((double)str.length() % (double)rword.length() != 0){
            return "-1";
        }
        for(int j = 0; j < str.length(); j = j + rword.length()){
            if(!rword.toString().equals(str.substring(j,j + rword.length()))){
                return "-1";
            }
        }
        return rword.toString();
    }
}