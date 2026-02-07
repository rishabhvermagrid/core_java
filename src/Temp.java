import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.lang.Object;


final class Student{
    private final int id;
    private final String name;
    private final List<String> subjects;
    private final Date dob;

    public Student(int id,String name,List<String> subjects,Date dob){
        if(name == null || subjects == null || dob == null){
            throw new IllegalArgumentException("Arguments can not be null");
        }
        this.id = id;
        this.name = name;
        this.dob = new Date(dob.getTime());
        this.subjects = List.copyOf(subjects);
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public List<String> getSubjects(){
        return subjects;
    }
    public Date getDob(){
        return new Date(dob.getTime());
    }
    @Override
    public String toString(){
        return "Student{ id: " + id + " name : " + name+ " dob: "+ dob + " subjects: " + subjects +"}";
    }
}
public class Temp {
    public static void main() {

        List<String> subjects = new ArrayList<>();
        subjects.add("math");
        subjects.add("chemistry");
        subjects.add("physics");

        Date date = new Date();
        Student student = new Student(101,"rishabh",subjects,date);

        // Try to break immutability
//        subjects.add("History");
//        date.setTime(0);
//        student.getSubjects().add("Biology");
//        student.getDob().setTime(0);

        System.out.println(student);
        System.out.println(student.getName());
        System.out.println(student.getDob());
        System.out.println(student.getId());
        System.out.println(student.getSubjects());

    }
}
