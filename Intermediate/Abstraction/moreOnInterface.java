package Intermediate.Abstraction;


interface X{
    void start();
    void code ();
}
interface Y{
    void run();
}

interface Z extends Y{

}

class B implements X,Z{
    public void start(){
        System.out.print("Start");
    }
    public void code(){
        System.out.print("Code");
    }
    public void run(){
        System.out.print("Run");
    }
}
public class moreOnInterface {
    public static void main(String[] args) {
        B obj = new B();
        obj.run();
        obj.start();
        obj.code();

        X obj1 = new B();
        obj1.start();
    }
}
