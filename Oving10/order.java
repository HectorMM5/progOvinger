
public class order {

    private final String name;
    private final String type;
    private final int price;

    public order(String name, String type, int price) {
        this.name = name;
        this.type = type;
        this.price = price;

    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

    public String getType() {
        return this.type;
    }
       


}