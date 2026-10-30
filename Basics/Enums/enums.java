package Enums;

enum Signal{
    RED,
    YELLOW,
    GREEN
}
public class enums {
    public static void main(String[] args) {
        Signal s = Signal.RED;

        if(s == Signal.RED){
            System.out.println("Stop!");
        } else if(s == Signal.YELLOW){
            System.out.println("Get ready!");
        } else if(s == Signal.GREEN){
            System.out.println("GO");
        }

        Signal[] ss = Signal.values();

        for(Signal i : ss){
            System.out.println(i);
        }
    }
}
