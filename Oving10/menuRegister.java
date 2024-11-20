
import java.util.ArrayList;
import java.util.Scanner;

public class menuRegister {

    Scanner scanner = new Scanner(System.in);
    ArrayList<order> availableFoods = new ArrayList<>();

    ArrayList<menu> menus = new ArrayList<>();

    public void findFoodsOfType(menu menu, String type) {

        ArrayList<order> foodsOfType = new ArrayList<>();

        for (int i = 0; i < menu.foods.size(); i++) {
            if (menu.foods.get(i).getType().equalsIgnoreCase(type)) {
                foodsOfType.add(menu.foods.get(i));
            }

        }

        System.out.println("Foods of type " + type + ":");

        for (int i = 0; i < foodsOfType.size(); i++) {
            System.out.println(foodsOfType.get(i).getName());

        }

    }

    public order findOrder(String name) {

        for (int i = 0; i < availableFoods.size(); i++) {
            if (availableFoods.get(i).getName().equalsIgnoreCase(name)) {
                System.out.println(name + " was found, the type is " + availableFoods.get(i).getType() + " and it costs " + availableFoods.get(i).getPrice());
                return availableFoods.get(i);
            }

        }

        return null;

    }

    public void registerOrder() {
        System.out.println("Type in the event info in the following format: name, type, price");

        String input = scanner.nextLine();

        String[] inputSplitted = input.split(",");
        for (int i = 0; i < inputSplitted.length; i++) {
            inputSplitted[i] = inputSplitted[i].trim();

        }

        availableFoods.add(new order(inputSplitted[0], inputSplitted[1], Integer.parseInt(inputSplitted[2])));

        System.out.println("Event " + inputSplitted[0] + " has been created.");

    }

    public void registerMenu() {
        ArrayList<order> foods = new ArrayList<>();

        System.out.println("Write in the name of the dishes, separated by comma:");
        String input = scanner.nextLine();
        String[] inputSplitted = input.split(",");

        for (String foodName : inputSplitted) {
            foodName = foodName.trim();

            // Call findOrder once
            order foodOrder = findOrder(foodName);

            if (foodOrder != null) {
                foods.add(foodOrder);
            } else {
                System.out.println("One or more foods were not found. Please try again.");
                return;
            }
        }

        menus.add(new menu(foods));
        System.out.println("Menu has been registered.");

    }

    public void findMenusWithin(int from, int to) {

        ArrayList<Integer> prices = new ArrayList<>();

        int sum = 0;

        for (int i = 0; i < menus.size(); i++) {
            for (int j = 0; j < menus.get(i).foods.size(); j++) {
                sum += menus.get(i).foods.get(j).getPrice();

            }

            prices.add(sum);
            sum = 0;

        }

        System.out.println("Within the given price range, you can choose between menus:");

        for (int i = 0; i < prices.size(); i++) {
            if ((prices.get(i) >= from) && (prices.get(i) <= to)) {
                System.out.println("Menu: " + i + 1);
            }

        }

    }

}
