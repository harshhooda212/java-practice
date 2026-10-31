package Intermediate.ExceptionHandling;

// import conditionalStatement.ternary;

public class exceptionCatchChaining {
    public static void main(String[] args) {
        int i =2;
        int j =0;

        int[] nums = {1,2,3,4,5};

        try
        {
            j=18/i;
            System.out.println(nums[1]);
            System.out.println(nums[5]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannont Divide by Zero");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Stay in you limits");
        }

        System.out.println(j);
    }
    

}
