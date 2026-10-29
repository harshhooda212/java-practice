package Intermediate.Inheitance;

class Animal{
    void sound(){
        System.out.println("Animal makes a sound");
    }
}


class Dog extends Animal {
    // @Override 
    void sound(){
        System.out.println("Dog Barks");
    }
}
public class methodOverloading {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.sound();
    }
}
