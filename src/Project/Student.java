package Project;


import java.util.Objects;

public class Student {
    private int id;
    private String name;
    private int age;
    private double marks;
    public Student(int id,String name,int age,double marks){
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }
    public int getId(){
        return id;
    }
    public double getMarks(){
        return marks;
    }
    public String getName(){
        return name;
    }
    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null) return false;
        if(getClass() != obj.getClass()) return false; //*************************
        Student other = (Student)obj;
        return this.id == other.id;
    }
    @Override
    public int hashCode(){
        // must use same fields as equals
        return Objects.hash(id);//***********************
    }
    @Override
    public String toString(){
        return "id: " + id +" name: " + name + " age: " + age + " marks: "+ marks;
    }
}
