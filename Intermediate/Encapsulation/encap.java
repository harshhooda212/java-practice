package Intermediate.Encapsulation;

class Human{
    // private int age=11;;  // for showing if the we dont assign values here how we will solve
    // private String name="harsh";

    private int age;
    private String name;

    public int getAge(){
        return age;
    }
    public void setAge(int a){
        age = a;
    }
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
}
public class encap {
    public static void main(String[] args) {
        Human obj = new Human();

        obj.setAge(12);
        obj.setName("Harsh");

        System.out.println(obj.getAge() + " : " + obj.getName());

        // System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
