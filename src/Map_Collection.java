import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Map_Collection {
    static void main(String[] args) {

        Map<Integer,Integer> map = new HashMap<>();
        //does not maintain order
        //can have one null key and multiple null values
        //implemented using hashing

        System.out.println(map.put(1,2));
        System.out.println(map.put(1,1));
        System.out.println(map.put(2,4));
        System.out.println(map.put(3,9));
        //put will check that this key exist or not with the help of containsKey() if true then it will already exist
        //so it will replace the value if false then it will make new entry with k,v
        System.out.println(map.get(3));

        //Iterating on map
        //entrySet
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        //using iterator for removal
        Iterator<Map.Entry<Integer,Integer>> it = map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<Integer,Integer> entry = it.next();
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        //forEach(java8)
        map.forEach((k,v)-> System.out.println(k+"::"+v));


        //frequeny counter using map
        String string = "apple banana orange banana apple";
        Map<String,Integer> mp = new HashMap<>();
        for(String word:string.split(" ")){
            mp.put(word,mp.getOrDefault(word,0)+1);
        }
        mp.forEach((k,v)-> System.out.println(k+" "+v));

    }
}

