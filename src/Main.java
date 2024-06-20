
    public class Main {
    public static void main(String[] args) {
        StudentDataBase registry = new StudentDataBase();
        Student student1 = new Student("Иван", 20, "Информатика");
        Student student2 = new Student("Мария", 19, "Математика");
        registry.addStudent(student1);
        registry.addStudent(student2);
        student1.addGrade(3);
        student1.addGrade(5);
        student2.addGrade(4);
        student2.addGrade(4);
        registry.printAllStudents();
        }
    }
