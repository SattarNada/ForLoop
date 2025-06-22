
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of astronauts (N >= 1): ");
        int n = scanner.nextInt();
        scanner.nextLine();

        if (n < 1) {
            System.out.println("There must be at least one astronaut.");
            return;
        }

        String mostExperiencedName = "";
        long maxSeconds = -1;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter name of astronaut " + i + ": ");
            String name = scanner.nextLine();

            System.out.print("Enter experience in seconds for " + name + ": ");
            long seconds = scanner.nextLong();
            scanner.nextLine();

            if (seconds > maxSeconds) {
                maxSeconds = seconds;
                mostExperiencedName = name;
            }
        }

        System.out.println("Most experienced astronaut: " + mostExperiencedName);

    }

}
