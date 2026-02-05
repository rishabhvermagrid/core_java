//creating custom checked exception
class InvalidAgeException extends Exception{
    InvalidAgeException(String message){
        super(message);
    }
}
// Class that uses the custom exception
class AgeValidator{
    static void validateAge(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("age must be greater than or equal 18");
        }
        System.out.println("age validated");
    }
}

public class CustomException {
    //caller is main here
    public static void main(String[] args) {
        try{
            AgeValidator.validateAge(1);
        }catch(InvalidAgeException e){
            // Class that uses the custom exception
            System.out.println("Exception caught : " + e.getMessage());
        }
        //main() handles the declared exception by enclosing the method call
        // in a try-catch block or by declaring the exception using throws.
    }
}
