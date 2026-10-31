package Intermediate.User_Inputs;

import java.io.IOException;
import java.util.Scanner;

public class scannerInput {
    public static void main(String[] args) throws IOException{
        System.out.print("Name :- ");

        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        System.out.println(num);
    }
}
