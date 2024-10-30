public class Worker {
    private Person person;
    private int workerNumber;
    private int signYear;
    private int salary;
    private int tax;

    public Worker(Person person, int workerNumber, int signYear, int salary, int tax) {
        this.person = person;
        this.workerNumber = workerNumber;
        this.signYear = signYear;
        this.salary = salary;
        this.tax = tax;
    }

    public Person getPerson() {
        return person;
    }

    public int getWorkerNumber() {
        return workerNumber;
    }

    public int getSignYear() {
        return signYear;
    }

    public int getSalary() {
        return salary;
    }

    public int getTax() {
        return tax;
    }


    public void setWorkerNumber(int workerNumber) {
        this.workerNumber = workerNumber;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }


    public float calculateTax() {
        return this.salary*(this.tax/100f);
    }

    public int yearSalary() {
        return this.salary*12;
    }
    
    public float yearTax() {
        return this.salary*(this.tax/100f)*10 + this.salary*(this.tax/200f);
    }

    public String presentation() {
        return (person.getSurname() + ", " + person.getName());
    }

    public int age() {
        return 2024 - person.getYear();
    }

    public int yearsSigned() {
        return 2024 - this.signYear;
    }

    public boolean signedMoreThan(int years) {
        if (this.yearsSigned() >= years) {
            return true;
        }

        else {
            return false;
        }

    }

}