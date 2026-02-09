class Address1{
    String city;
    Address1(String city){
        this.city = city;
    }
}
class Student{
    int id;
    String name;
    Address1 address;
    Student(int id, String name,Address1 address){
        this.id = id;
        this.name = name;
        this.address = address;
    }
}
public class ShallowCopy {
    static void main(String[] args) {
        Address1 addr = new Address1("Delhi");
        Student obj = new Student(1,"rishabh",addr);
        Student obj2 = obj;
        obj2.address.city  = "bangalore";
        System.out.println(obj.address.city);

    }
}
