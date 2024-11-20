
public class event {

    private final int number;
    private final String name;
    private final String place;
    private final String host;
    private final Long date;
    private final String type;

    public event(int number, String name, String place, String host, Long date, String type) {
        this.number = number;
        this.name = name;
        this.place = place;
        this.host = host;
        this.date = date;
        this.type = type;
    }

    public String getPlace() {
        return this.place;
    }

    public String getName() {
        return this.name;
    }

    public Long getDate() {
        return this.date;
    }

    public String getType() {
        return this.type;
    }
    


    


}