package Intermediate.Encapsulation;

public class thisObject {
    String name;
    int age;

    thisObject(String name, int age){
        this.name=name;
        this.age=age;
    }

    void display(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    public static void main(String[] args){
        thisObject s1 = new thisObject("harsh",22);
        thisObject s2 = new thisObject("harsh",21);

        s1.display();
        s2.display();
    }
}
