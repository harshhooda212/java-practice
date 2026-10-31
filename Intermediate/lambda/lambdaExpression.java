package Intermediate.lambda;

@FunctionalInterface 
interface A
{
    // void show();
    void show(int i);
}
public class lambdaExpression {
    public static void main(String[] args) {
        // A obj = () -> System.out.println("Show");
        // obj.show();

        A obj = (i) -> System.out.println("Show" + i);
        obj.show(5);
    }
}
