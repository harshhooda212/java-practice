package Intermediate.Inheitance;

class Calc
{
    public int add(int n1,int n2){
        return n1+n2;
    }
    public int sub(int n1,int n2){
        return n1-n2;
    }
}
public class inheritance {
    public static void main(String[] args) {
        VeryAdvCalc obj = new VeryAdvCalc();

        int r1 = obj.add(4,5);
        int r2 = obj.sub(5,4);
        int r3 = obj.mult(5,4);
        int r4 = obj.div(5,4);
        double r5 = obj.pow(5,2);
        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5);
    }
}
