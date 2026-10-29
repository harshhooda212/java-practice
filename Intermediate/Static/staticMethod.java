package Intermediate.Static;

class Mobile{
    static String name;
    String brand;

    public void show(){
        System.out.println("the name is " + name);
    }

    public static void show1(Mobile obj){
        System.out.print("IN static method " + name + " : " + obj.brand);
    }
}

public class staticMethod {
    public static void main(String[] args) {

        Mobile obj = new Mobile();
        obj.brand = "Apple";
        Mobile.name = "smartPhone";

        Mobile.show1(obj);

        
    }
}
