
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of crew members (N >= 1): ");
        int crewCount = scanner.nextInt();
        scanner.nextLine();

        if (crewCount < 1) {
            System.out.println("Crew count must be at least 1.");
            return;
        }

        for (int i = 1; i <= crewCount; i++) {
            System.out.print("Enter last name of crew member " + i + ": ");
            String lastName = scanner.nextLine();
            System.out.println("Hello " + lastName);
        }


    }
}
