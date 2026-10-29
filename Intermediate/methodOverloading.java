package Intermediate;

public class methodOverloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int result = calc.add(1,2);
        int result1 = calc.add(1,2,3);
        System.out.println(result);
        System.out.println(result1);

    }
}

class Calculator
{
    public int add(int n1, int n2, int n3)
    {
        return n1+n2+n3;
    }

    public int add(int n1 , int n2)
    {
        return n1+n2;
    }
}
