
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of crews (C >= 1): ");
        int crewCount = scanner.nextInt();

       
        System.out.print("Enter number of astronauts per crew (N >= 1): ");
        int astronautsPerCrew = scanner.nextInt();

        for (int crew = 1; crew <= crewCount; crew++) {
            System.out.println("\nEntering data for Crew #" + crew);

            String youngestLastName = "";
            int youngestAge = Integer.MAX_VALUE;

            for (int i = 1; i <= astronautsPerCrew; i++) {
                System.out.print("Enter last name of astronaut " + i + ": ");
                String lastName = scanner.nextLine();

                System.out.print("Enter age of " + lastName + ": ");
                int age = scanner.nextInt();
                scanner.nextLine();


                if (age <= youngestAge) {
                    youngestAge = age;
                    youngestLastName = lastName;
                }
            }

            System.out.println("Youngest astronaut in Crew #" + crew + ": " + youngestLastName);
        }


    }

}
