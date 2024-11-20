public class student {
    private String name;
    private int exerciseAmount;

    public student(String name, int exerciseAmount) {
        this.name = name;
        this.exerciseAmount = exerciseAmount;
    }

    public String getName() {
        return name;
    }

    public int getExerciseAmount() {
        return exerciseAmount;
    }

    public void incrementEA(int amount) {
        this.exerciseAmount += amount;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', exerciseAmount=" + exerciseAmount + "}";
    }

}