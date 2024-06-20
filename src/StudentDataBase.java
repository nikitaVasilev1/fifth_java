import java.util.ArrayList;
import java.util.List;

public class StudentDataBase {
    private List<Student> students;

    public StudentDataBase() {
        this.students = new ArrayList<>();
    }
    public void addStudent(Student student) {
        students.add(student);
    }


    public void printAllStudents() {
        for (Student student : students) {
            System.out.println("Имя: " + student.getName());
            System.out.println("Возраст: " + student.getAge());
            System.out.println("Специальность: " + student.getSpecially());
            System.out.println("Оценки: " + student.getGrades());
            System.out.println("Средний балл: " + student.calculateAverageGrade());
            System.out.println("--------------------");
        }
    }
}

