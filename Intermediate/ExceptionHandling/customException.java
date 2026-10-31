package Intermediate.ExceptionHandling;

class HarshException extends Exception
{
    public HarshException(String string){
        super(string);
    }
}
public class customException {
    public static void main(String[] args) {
        int age =16;

        try
        {
            if(age<18){
                throw new HarshException("Age is less than 18");
            }
            System.out.println("age is okay");
        }
        catch(HarshException e)
        {
            System.out.println("Error" + e.getMessage());
        }
    }
}
