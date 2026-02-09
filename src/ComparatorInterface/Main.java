package ComparatorInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class NameComparator implements Comparator<Student>{
    @Override
    public int compare(Student s1, Student s2){
        return s1.name.compareTo(s2.name);
    }
}

public class Main {
    static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Krishabh", 19));
        list.add(new Student("Krishabh", 9));
        list.add(new Student("Rishu", 29));
        list.add(new Student("Hrishabh", 13));
        list.add(new Student("Hrishabh", 23));
        //Collections.sort(list, new NameComparator());
        //Collections.sort(list, (s1,s2)->s1.name.compareTo(s2.name));
        //multiple sorting
        Collections.sort(list,(s1,s2)->{
            int nc = s1.name.compareTo(s2.name);
            if(nc!=0){
                return nc;
            }else{
                return Integer.compare(s1.age,s2.age);
            }
        });
        System.out.println(list);

    }
}
