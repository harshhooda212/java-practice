package Intermediate;

public class methods {
    public static void main(String[] args) {
         Computer com = new Computer();
         com.music();
         String str = com.pen(8);
         System.out.println(str);
    }
}

class Computer 
{
    public void music(){
        System.out.println("Music");
    }

    public String pen(int n){
        if(n>=10){
            return "Pen";
        }
        else
            return "Nothing";
    }

}
