
import java.util.Scanner;
import java.util.Stack;

public class Enrollment_Undo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<String> enrollments = new Stack<>();

        int choice;

        do {
            System.out.println("\n--- Enrollment Menu ---");
            System.out.println("1. Enroll learner");
            System.out.println("2. Undo last enrollment");
            System.out.println("3. Show last enrollment");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter learner name: ");
                    String name = sc.nextLine();

                    enrollments.push(name);
                    System.out.println("Enrolled: " + name);
                    break;

                case 2:
                    if (!enrollments.isEmpty()) {
                        String undone = enrollments.pop();
                        System.out.println("Undone: " + undone);
                    } else {
                        System.out.println("Nothing to undo.");
                    }
                    break;

                case 3:
                    if (!enrollments.isEmpty()) {
                        System.out.println("Last enrollment: "
                                + enrollments.peek());
                    } else {
                        System.out.println("Nothing to undo.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid menu choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}
