package Intermediate.User_Inputs;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bufferReader {
    public static void main(String[] args) throws IOException {
        System.out.print("Give name");

        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in);
        // or
        BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));

        String name = bf.readLine();
        System.out.println(name);
        bf.close();
    }
    

}
