package Intermediate.lambda;

interface B{
    int add(int i, int j);
}
public class lambdaReturn {
    public static void main(String[] args) {
        B obj = (i,j) -> i+j;
        int result1 = obj.add(5,5);
        System.out.println(result1);
    }
    
}
