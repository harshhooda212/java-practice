package Intermediate;


class A{
    int name;
    public void play(){
        System.out.println("Play..");
    }

    static class B{ //innner Class
        public void hello(){
            System.out.println("Hello..");
        }
    }
}
public class innerClass {
    public static void main(String[] args) {
        A.B obj1 = new A.B();
        obj1.hello();
    }
}
