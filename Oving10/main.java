import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        eventRegister register = new eventRegister();
        
        while (true) {
            System.out.println("\nEvent Register Menu:");
            System.out.println("1. Register a new event");
            System.out.println("2. Find events in a specific place");
            System.out.println("3. Find events on a specific date");
            System.out.println("4. Find events between two dates");
            System.out.println("5. Find events by type");
            System.out.println("6. Exit");
            System.out.print("Choose an option (1-6): ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            
            switch (choice) {
                case 1:
                    register.registerEvent();
                    break;
                case 2:
                    System.out.print("Enter the place to search for events: ");
                    String place = scanner.nextLine();
                    register.findEventsIn(place);
                    break;
                case 3:
                    System.out.print("Enter the date to search for events (YYYYMMDDHHMM): ");
                    Long date = scanner.nextLong();
                    scanner.nextLine(); // Consume the newline character
                    register.findEventsWhen(date);
                    break;
                case 4:
                    System.out.print("Enter the start date (YYYYMMDDHHMM): ");
                    Long fromDate = scanner.nextLong();
                    System.out.print("Enter the end date (YYYYMMDDHHMM): ");
                    Long toDate = scanner.nextLong();
                    scanner.nextLine(); // Consume the newline character
                    register.findEventsBetween(fromDate, toDate);
                    break;
                case 5:
                    System.out.print("Enter the type of event to search for: ");
                    String type = scanner.nextLine();
                    register.findEventsOfType(type);
                    break;
                case 6:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    return; // Exit the main method and end the program
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
