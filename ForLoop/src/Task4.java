import java.util.Scanner;
public class Task4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of astronauts (N >= 1): ");
        int n = scanner.nextInt();
        scanner.nextLine();

        boolean found = false;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter last name of astronaut " + i + ": ");
            String lastName = scanner.nextLine();

            System.out.print("Enter age of " + lastName + ": ");
            int age = scanner.nextInt();
            scanner.nextLine();

            if (age == 50) {
                System.out.println("First astronaut celebrating an anniversary: " + lastName);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("There is no astronaut celebrating an anniversary.");
        }


    }
}
