import java.util.*;

class Engineer {
    int id;
    String name;

    Engineer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;          // same reference
        if (obj == null) return false;        // null check
        if (getClass() != obj.getClass()) return false; // type check

        Engineer other = (Engineer) obj;

        return id == other.id &&
                Objects.equals(name, other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

public class Set_Interface {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(12,3,4,4,5,2,2,1,1);
        Set<Integer> set = new HashSet<>(list);

        System.out.println(set);
        for(Integer num : set){
            System.out.println(num);
        }
        //
        set.forEach((num)-> System.out.println(num));
        Iterator<Set<Integer>> iterator = new
                while(iterator.hasNext()){
                    System.out.println(iterator.next());
                }

//        Engineer eng1 = new Engineer(101, "rishabh");
//        Engineer eng2 = new Engineer(101, "rishabh");
//        Engineer eng3 = new Engineer(101, "dinesh");
//
//        System.out.println(eng1.equals(eng2));  // true
//        System.out.println(eng1.equals(eng3));  // false
//
//        System.out.println(eng1.hashCode());
//        System.out.println(eng2.hashCode());
    }
}
