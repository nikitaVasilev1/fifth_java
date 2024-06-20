import java.util.ArrayList;
import java.util.List;

public class Student {
        private String name;
        private int age;
        private String specially;
        private List<Integer> grades;

        public Student(String name, int age, String specially) {
            this.name = name;
            this.age = age;
            this.specially = specially;
            this.grades = new ArrayList<>();
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getSpecially() {
            return specially;
        }

        public List<Integer> getGrades() {
            return grades;
        }

        public void addGrade(int grade) {
            grades.add(grade);
        }

        public double calculateAverageGrade() {
            if (grades.isEmpty()) {
                return 0.0;
            }
            int sum = 0;
            for (int grade : grades) {
                sum += grade;
            }
            return (double) sum / grades.size();
        }

}
