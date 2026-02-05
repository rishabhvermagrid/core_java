@FunctionalInterface
interface MyInterface{
    void show();
}
interface Calculator{
    int add(int a,int b);
}
public class FunctInter {
    static void main(String[] args) {
        MyInterface obj = () -> {
            System.out.println("hey i am functional interface");
        };
        Calculator obj1 = (a,b) -> a+b;
        System.out.println(obj1.add(4,5));
        obj.show();
    }
}

