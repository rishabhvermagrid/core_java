package Project;

public class Main {

    public static void main(String[] args) {

        StudentService s = new StudentService();

        try {
            // Add students
            s.addStudent(new Student(1, "rishabh", 25, 89.5));
            s.addStudent(new Student(2, "anshika", 23, 81.5));
//            s.addStudent(new Student(3, null, 150, -100));

            // Try duplicate
            // s.addStudent(new Student(1, "rishabh", 25, 89.5));

            // Sort and print
            System.out.println("Sorted by marks desc:");
            System.out.println(s.getAllStudentsSortedByMarksDesc());

            // Remove student
            s.removeStudentById(3);

            System.out.println("Sorted by name then marks:");
            System.out.println(s.getAllStudentsSortedByNameThenMarks());

            // Try removing non-existing student
            // s.removeStudentById(10);

        } catch (DuplicateStudentException | StudentNotFoundException  | StudentDetailsNotCorrect e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
