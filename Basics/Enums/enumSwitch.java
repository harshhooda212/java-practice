package Enums;

enum Status{
    PROGRESS,
    RUNNING,
    COMPLETED;
}
public class enumSwitch {
    public static void main(String[] args) {
        Status started = Status.PROGRESS;

        switch (started) {
            case PROGRESS:
                System.out.print("Started the task");
                break;
            case RUNNING:
                System.err.println("Running the task");
                break;
            case COMPLETED:
                System.out.println("Completed the task");
                break;    
        
            default:
                break;
        }
    }
}
