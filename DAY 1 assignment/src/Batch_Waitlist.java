import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;

public class Batch_Waitlist {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] seats = new String[3];
        Queue<String> waiting = new ArrayDeque<>();
        int option = 0;
        while (option != 4) {
            System.out.println("BATCH WAITLIST MENU");
            System.out.println("1. Add Learner");
            System.out.println("2. Drop Learner");
            System.out.println("3. Display Batch Details");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            option = Integer.parseInt(scan.nextLine());
            if (option == 1) {
                System.out.print("Enter learner name: ");
                String name = scan.nextLine().trim();
                if (name.isEmpty()) {
                    System.out.println("Name cannot be empty.");
                } else {
                    boolean added = false;
                    for (int i = 0; i < seats.length; i++) {
                        if (seats[i] == null) {
                            seats[i] = name;
                            added = true;
                            System.out.println(name + " enrolled successfully!");
                            break;
                        }
                    }
                    if (!added) {
                        waiting.offer(name);
                        System.out.println(name + " added to waitlist.");
                    }
                }
            } else if (option == 2) {
                System.out.print("Enter learner name to drop: ");
                String dropName = scan.nextLine().trim();
                boolean found = false;
                for (int i = 0; i < seats.length; i++) {
                    if (seats[i] != null && seats[i].equalsIgnoreCase(dropName)) {
                        found = true;
                        System.out.println(seats[i] + " dropped out.");
                        if (waiting.isEmpty()) {
                            seats[i] = null;
                            System.out.println("Seat is now vacant.");
                        } else {
                            seats[i] = waiting.poll();
                            System.out.println(seats[i] + " got the vacant seat.");
                        }
                        break;
                    }
                }
                if (!found) {
                    for (String person : waiting) {
                        if (person.equalsIgnoreCase(dropName)) {
                            waiting.remove(person);
                            found = true;
                            System.out.println(person + " removed from waitlist.");
                            break;
                        }
                    }
                }
                if (!found) {
                    System.out.println("Learner not found in batch or waitlist.");
                }
            } else if (option == 3) {
                System.out.println("===== BATCH DETAILS =====");
                System.out.println("Seats: " + Arrays.toString(seats));
                System.out.println("Waiting List: " + waiting);
            } else if (option == 4) {
                System.out.println("Exiting program...");
            } else {
                System.out.println("Invalid menu choice!");
            }
        }
        scan.close();
    }
}