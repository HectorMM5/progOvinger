import java.util.ArrayList;

public class overview {
    private ArrayList<student> students = new ArrayList<>();
    private int studentAmount = 0;

    public int amountOfStudents() {
        this.studentAmount = students.size();
        return this.studentAmount;
    }

    public int exercisesSolvedBy(String name) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equals(name)) {
                return students.get(i).getExerciseAmount();
            }   
        }

        return -1;
        
    }    

    public void register(String name) {
        students.add(new student(name, 0));
    }

    public boolean increaseExercisesBy(String name, int amount) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equals(name)) {
                students.get(i).incrementEA(amount);

                return true;
            }   
        }

        return false;
    } 
}