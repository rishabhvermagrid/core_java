import com.sun.source.tree.Tree;

import java.util.*;

public class Unique {
    public static void main(String[] args) {
//        Set<String> set = new HashSet<>();
//        Set<String> set = new LinkedHashSet<>();
        Set<String> set = new TreeSet<>();
        set.add("rishabh");
        set.add("gaurab");
        set.add("rishabh");//return false
        set.add("dinesh");
        set.add("rishabh");

        //iterating using forEach
        for(String s:set){
            System.out.println(s);
        }
        //iterating using iterator

        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
