import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        overview overview = new overview();
        boolean running = true;
        while (running) {
            System.out.println("\nUser menu:");
            System.out.println("1 - Registrer new student");
            System.out.println("2 - Show student amount");
            System.out.println("3 - Show amount of tasks solved by a student");
            System.out.println("4 - Increment tasks solved by student");
            System.out.println("5 - Finish");
            System.out.print("Make a choice: ");
            
            int valg = scanner.nextInt();
            scanner.nextLine(); 

            String name = "";

            switch (valg) {
                case 1:
                    System.out.print("Type in the student's name ");
                    name = scanner.nextLine();
                    overview.register(name);
                    System.out.println("Student registered: " + name);
                    break;

                case 2:
                    System.out.println("Amount of students: " + overview.amountOfStudents());
                    break;

                case 3:
                    System.out.print("Type in the student's name ");
                    name = scanner.nextLine();
                    int exercises = overview.exercisesSolvedBy(name);
                    
                    if (exercises != -1) {
                        System.out.println("The student " + name + " has solved " + exercises + " exercises.");
                    }
                    else {
                        System.out.println("Student was not found.");
                    }
                    break;

                case 4:
                    System.out.print("Type in the student's name: ");
                    name = scanner.nextLine();

                    System.out.print("How many exercises to add? ");
                    int amount = scanner.nextInt();
                    scanner.nextLine();

                    boolean success = overview.increaseExercisesBy(name, amount);

                    if (success) {
                        System.out.println("Exercises for " + name + " increased by " + amount + ".");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;


                case 5:
                    System.out.println("Terminating program.");
                    running = false;
                    break;

                default:
                    System.out.println("Illegal choice, try again:");
                    break;
            }
        }
    }
}