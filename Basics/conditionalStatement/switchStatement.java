package conditionalStatement;

public class switchStatement {
    public static void main(String[] args) {
        int n = 5;

        switch (n) {
            case 1,5: //we can give multiple parameters here
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
        
            default:
                break;
        }
    }
}
