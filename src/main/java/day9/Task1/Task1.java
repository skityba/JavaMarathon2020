package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Alexey", "First");
        Teacher teacher = new Teacher("Victor", "Biology");
        System.out.println("Учебная группа  " + student.getGroup() + " предмет " + teacher.getSubjectName());
        student.printInfo();
        teacher.printInfo();
    }
}
