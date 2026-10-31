package Intermediate.ExceptionHandling;

public class exceptionThrow {
    public static void main(String[] args) {
        int age = 20;

        try{
            if(age<18){
                throw new ArithmeticException("Cant Vote");
            } else if(age>65){
                throw new ArithmeticException("Too Old");
            }
            System.out.println("You can vote");
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        
    }
}
