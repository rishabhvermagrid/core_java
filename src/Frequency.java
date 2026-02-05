import java.util.LinkedHashMap;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;


public class Frequency {
    public static void main(String[] args){
        Map<Character,Integer> map = new HashMap<>();
        String s = "programming";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }

    }
}
