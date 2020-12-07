package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Alexey Vinogradov", "Geometry");
        Student student = new Student("Vasiliy");
        teacher.evaluate(student.getName());
    }
}
