package Intermediate.Static;

class Mobile{
    static String name;

    public void show(){
        System.out.println("the name is " + name);
    }
}

public class staticVariable {
    public static void main(String[] args) {

        Mobile obj = new Mobile();
        Mobile.name = "smartPhone";

        obj.show();

        
    }
}
