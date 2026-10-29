package Intermediate.Abstraction;

interface Computer{
    void code();
}

class Laptop implements Computer{
    public void code(){
        System.out.print("Coding...");
    }
}

class Desktop implements Computer{
    public void code(){
        System.out.print("Coding Faster ...");
    }
}

class Developer{
    public void devApp(Computer lap){
        lap.code();
    }
}
public class needOfInterface {
    public static void main(String[] args) {
        Computer obj = new Laptop();
        Computer obj1 = new Desktop();

        Developer harsh = new Developer();
        harsh.devApp(obj);
        obj1.code();
        obj.code();
    }
}
