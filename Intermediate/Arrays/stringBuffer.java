package Intermediate.Arrays;

public class stringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer(" Hello");
        sb.append(" reddy");
        sb.insert(0,"Hi");
        sb.delete(0,2);
;        System.out.print(sb);

    }
}
