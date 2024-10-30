public class Person {
    private final String name;
    private final String surname;
    private final int year;


    Person(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getYear() {
        return year;
    }
}