import java.util.ArrayList;
import java.util.Scanner;


public class menu {

    Scanner scanner = new Scanner(System.in);

    public ArrayList<order> foods = new ArrayList<>();

    public menu(ArrayList<order> foods) {
        this.foods = foods;
    }


    public void findOrder(String name) {

        for (int i = 0; i < foods.size(); i++) {
            if (foods.get(i).getName().equalsIgnoreCase(name)) {
                System.out.println(name + "was found, the type is " + foods.get(i).getType() + " and it costs " + foods.get(i).getPrice());
            }

        }

    }

}