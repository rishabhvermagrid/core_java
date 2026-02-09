package Project;
import java.util.*;

public class StudentService {
    private Set<Student> students = new HashSet<>();
    public void addStudent(Student s){
        boolean check = students.add(s);
        if(!check){
            throw new DuplicateStudentException(
                    "student with id " + s.getId() + "already exists"
            );
        }
    }
    public void removeStudentById(int id){
        Iterator<Student> iterator = students.iterator();
        while(iterator.hasNext()){
            Student s = iterator.next();
            if(s.getId() == id){
                iterator.remove();
                return;
            }
        }
        throw new StudentNotFoundException(
                "Student with id " + id + "not found"
        );
    }
    public Student getStudentById(int id){
        Iterator<Student> iterator = students.iterator();
        while(iterator.hasNext()){
            Student s = iterator.next();
            if(s.getId() == id){
                return s;
            }
        }
        throw new StudentNotFoundException(
                "Student with id " + id + "not found"
        );
    }
    public List<Student> getAllStudentsSortedByMarksDesc(){
        List<Student> list = new ArrayList<>(students);
        list.sort((s1,s2)-> Double.compare(s2.getMarks(),s1.getMarks()));
        return list;
    }
    public List<Student> getAllStudentsSortedByNameThenMarks(){
        List<Student> list = new ArrayList<>(students);
        list.sort((s1,s2)-> {
            int nc = s1.getName().compareTo(s2.getName());
            if(nc!=0){
                return nc;
            }else{
                return Double.compare(s1.getMarks(),s2.getMarks());
            }
        });
        return list;
    }

}
