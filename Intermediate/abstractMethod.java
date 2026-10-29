package Intermediate;

abstract class Car{
    public abstract void fly();
    public abstract void drive();

    public void music()
    {
        System.out.println("Playing Music...");
    }
}

class WagonR extends Car{
    public void fly(){
        System.out.println("Car Flying..");
    }
    public void drive(){
        System.out.println("Car Driving..");
    }
}
public class abstractMethod {
    public static void main(String[] args) {
        Car obj = new WagonR();
        obj.fly();
        obj.drive();
        obj.music();
    }
}
