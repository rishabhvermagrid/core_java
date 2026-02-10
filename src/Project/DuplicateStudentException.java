package Project;

public class DuplicateStudentException extends RuntimeException {
    public DuplicateStudentException(String msg) {
        super(msg);
    }
}


/*
throw new DuplicateStudentException("student with id " + s.getId() + "already exists");
 */
