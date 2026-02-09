package ComparableInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ComparableDemo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("rishabh1",132));
        list.add(new Student("rishabh2",54));
        list.add(new Student("rishabh3",75));
        list.add(new Student("rishabh4",76));

        Collections.sort(list);
        System.out.println(list);
    }
}
