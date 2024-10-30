
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the person's first name:");
        String firstName = scanner.nextLine();
        System.out.println("Enter the person's last name:");
        String lastName = scanner.nextLine();
        System.out.println("Enter the person's birth year:");
        int birthYear = scanner.nextInt();

        Person person = new Person(firstName, lastName, birthYear);

        System.out.println("Enter the worker's number:");
        int workerNumber = scanner.nextInt();
        System.out.println("Enter the worker's sign year:");
        int signYear = scanner.nextInt();
        System.out.println("Enter the worker's salary:");
        int salary = scanner.nextInt();
        System.out.println("Enter the worker's tax percentage:");
        int tax = scanner.nextInt();

        Worker worker = new Worker(person, workerNumber, signYear, salary, tax);

        int choice;

        while (true) {
            System.out.println("\nMAIN MENU:");
            System.out.println("1. Print Information");
            System.out.println("2. Change Worker Attributes");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case (1):
                    System.out.println("\n--- Worker Information ---");
                    System.out.println("Name: " + person.getName());
                    System.out.println("Surname: " + person.getSurname());
                    System.out.println("Birth Year: " + person.getYear());
                    System.out.println("Worker Number: " + worker.getWorkerNumber());
                    System.out.println("Sign Year: " + worker.getSignYear());
                    System.out.println("Salary: " + worker.getSalary());
                    System.out.println("Tax Percentage: " + worker.getTax());
                    System.out.println("Age: " + worker.age());
                    System.out.println("Years Signed: " + worker.yearsSigned());
                    System.out.println("Yearly Salary (before tax): " + worker.yearSalary());
                    System.out.println("Yearly Tax: " + worker.yearTax());
                    break;

                case (2):

                    int changeChoice = -1;

                    while (changeChoice != 0) {
                        System.out.println("\nCHANGE ATTRIBUTES MENU:");
                        System.out.println("1. Change worker's salary");
                        System.out.println("2. Change worker's tax percentage");
                        System.out.println("3. Change worker's number");
                        System.out.println("0. Return to Main Menu");
                        System.out.print("Enter your choice: ");

                        changeChoice = scanner.nextInt();

                        switch (changeChoice) {
                            case 1:
                                System.out.println("Enter new salary:");
                                int newSalary = scanner.nextInt();
                                worker.setSalary(newSalary);
                                System.out.println("Salary updated to: " + worker.getSalary());
                                break;

                            case 2:
                                System.out.println("Enter new tax percentage:");
                                int newTax = scanner.nextInt();
                                worker.setTax(newTax);
                                System.out.println("Tax percentage updated to: " + worker.getTax() + " %");
                                break;

                            case 3:
                                System.out.println("Enter new worker number:");
                                int newWorkerNumber = scanner.nextInt();
                                worker.setWorkerNumber(newWorkerNumber);
                                System.out.println("Worker number updated to: " + worker.getWorkerNumber());

                            case 0:
                                System.out.println("Returning to Main Menu.");
                                break;

                            default:
                                System.out.println("Invalid choice. Please try again.");
                                break;
                        }
                    }
            }
        }
    }
}
