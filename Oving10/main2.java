import java.util.Scanner;

public class main2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        menuRegister menuRegister = new menuRegister();

        while (true) {
            System.out.println("\nMenu Register System:");
            System.out.println("1. Register a new order");
            System.out.println("2. Register a new menu");
            System.out.println("3. Find foods of a specific type in a menu");
            System.out.println("4. Find a specific order by name");
            System.out.println("5. Find menus within a price range");
            System.out.println("6. Exit");
            System.out.print("Choose an option (1-6): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    menuRegister.registerOrder();
                    break;

                case 2:
                    menuRegister.registerMenu();
                    break;

                case 3:
                    System.out.print("Enter the type of food you want to find: ");
                    String type = scanner.nextLine();
                    System.out.print("Enter the menu index to search in (starting from 1): ");
                    int menuIndex = scanner.nextInt() - 1;
                    scanner.nextLine(); // Consume the newline character
                    if (menuIndex >= 0 && menuIndex < menuRegister.menus.size()) {
                        menuRegister.findFoodsOfType(menuRegister.menus.get(menuIndex), type);
                    } else {
                        System.out.println("Invalid menu index. Please try again.");
                    }
                    break;

                case 4:
                    System.out.print("Enter the name of the order to find: ");
                    String orderName = scanner.nextLine();
                    menuRegister.findOrder(orderName);
                    break;

                case 5:
                    System.out.print("Enter the minimum price: ");
                    int fromPrice = scanner.nextInt();
                    System.out.print("Enter the maximum price: ");
                    int toPrice = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    menuRegister.findMenusWithin(fromPrice, toPrice);
                    break;

                case 6:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    return; // Exit the main method, ending the program

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}