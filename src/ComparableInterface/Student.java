package ComparableInterface;
//Comparable is an interface in Java used to define the natural ordering of objects of a class.
//Located in java.lang
//Contains one method:
//int compareTo(T o);
public class Student implements Comparable<Student>{
    String name;
    int marks;

    Student(String name,int marks){
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student s){
        return this.marks-s.marks;
    }
    @Override
    public String toString(){
        return "name: "+name+" marks: "+marks;
    }
}
