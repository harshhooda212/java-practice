package Intermediate;

public class classAndObjects {
    public static void main(String[] args) {
          int n1=4;
          int n2=5;
        
          Calculator calc = new Calculator();
          int result = calc.add(4,5);
          int mult = calc.mult(4,5);
          System.out.println(result);
          System.out.println(mult);
    }
}

class Calculator
{

    int a;

    public int add(int n1, int n2)
    {
        int r = n1 + n2;
        return r;
    };

    public int mult(int n1,int n2)
    {
        int r =n1*n2;
        return r;
    }
}
