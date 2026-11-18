import java.util.*;
public class Batch_Waitlist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] seats = new String[3];
        Queue<String> waitlist = new LinkedList<>();
        String[] learners = {"Asha", "Ravi", "Meena", "Kiran", "Pooja"};
        System.out.println("Joining learners:");
        for (String name : learners) {
            System.out.println("Join: " + name);
            boolean added = false;
            for (int i = 0; i < seats.length; i++) {
                if (seats[i] == null) {
                    seats[i] = name;
                    added = true;
                    break;
                }
            }
            if (!added) {
                waitlist.add(name);
            }
            printStatus(seats, waitlist);
        }

        // Learner drops out
        System.out.print("\nEnter learner name to drop out: ");
        String dropout = sc.nextLine();
        boolean found = false;
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] != null && seats[i].equalsIgnoreCase(dropout)) {
                found = true;
                if (!waitlist.isEmpty()) {
                    seats[i] = waitlist.remove();
                } else {
                    seats[i] = null;
                }
                break;
            }
        }
        if (found) {
            System.out.println("\n" + dropout + " drops out.");
        } else {
            System.out.println("\nLearner not found in the batch.");
        }
        printStatus(seats, waitlist);
        sc.close();
    }
    static void printStatus(String[] seats, Queue<String> waitlist) {
        System.out.print("Seats:   [");
        for (int i = 0; i < seats.length; i++) {
            System.out.print(seats[i] == null ? "Empty" : seats[i]);
            if (i < seats.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.println("Waiting: " + waitlist);
    }
}
