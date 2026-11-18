import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Enrollment_Undo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<String> stack = new ArrayDeque<>();
        int choice = 0;

        // while loop to show options
        while (choice != 4) {
            System.out.println("Enrollment Menu");
            System.out.println("1. Enroll learner");
            System.out.println("2. Undo last enrollment");
            System.out.println("3. Show last enrollment");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(sc.nextLine());
            if (choice == 1) {
                System.out.print("Enter learner name: ");
                String name = sc.nextLine();
                stack.push(name);
                System.out.println("Enrolled: " + name);
            } else if (choice == 2) {
                if (stack.isEmpty()) {
                    System.out.println("No Data.");
                } else {
                    System.out.println("Removed: " + stack.pop());
                }
            } else if (choice == 3) {
                if (stack.isEmpty()) {
                    System.out.println("No enrollments yet.");
                } else {
                    System.out.println("Last enrollment: " + stack.peek());
                }
            } else if (choice == 4) {
                System.out.println("Exiting program...");
            } else {
                System.out.println("Invalid menu choice!");
            }
        }
        sc.close();
    }
}