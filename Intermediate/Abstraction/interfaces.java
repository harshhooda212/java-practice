package Intermediate.Abstraction;


interface Car{
    String name="Super car";
    void start();
}

class WagonR implements Car{
    public void start(){
        System.out.println("Engine Starts");
    }
}

class Tesla implements Car{
    public void start(){
        System.out.println("Battery Starts");
    }
}
public class interfaces {

    public static void main(String[] args){
        Car obj = new WagonR();
        Car obj1 = new Tesla();

        obj.start();
        obj1.start();

    }
    
}
