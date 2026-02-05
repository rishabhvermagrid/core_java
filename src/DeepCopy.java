class Address {
    String city;

    Address(String city) {
        this.city = city;
    }
}

class Student {
    int id;
    String name;
    Address address;

    Student(int id, String name, Address addr) {
        this.id = id;
        this.name = name;
        this.address = new Address(addr.city); // deep copy
    }

    Student(Student s) {
        this.id = s.id;
        this.name = s.name;
        this.address = new Address(s.address.city); // deep copy
    }
}

public class DeepCopy {
    public static void main(String[] args) {
        Address addr = new Address("Delhi");
        Student obj = new Student(1, "rishabh", addr);
        Student obj2 = new Student(obj);

        obj2.address.city = "bangalore";

        System.out.println(obj.address.city);   // Delhi
        System.out.println(obj2.address.city);  // bangalore
    }
}
