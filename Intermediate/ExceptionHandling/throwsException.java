package Intermediate.ExceptionHandling;

class A
{
    public void show() throws ClassNotFoundException
    {
            Class.forName("Car");
    }
}
public class throwsException {
    public static void main(String[] args) {
        A obj = new A();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
