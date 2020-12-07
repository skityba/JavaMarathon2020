package day6;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void evaluate(String nameStudent) {
        int random = (int) (Math.random() * ((5 - 2) + 1)) + 2;
        String randomName = null;
        if (random == 2) {
            randomName = "\"неудовлетворительно\"";
        } else if (random == 3) {
            randomName = "\"удовлетворительно\"";
        } else if (random == 4) {
            randomName = "\"хорошо\"";
        }
        if (random == 5) {
            randomName = "\"отлично\"";
        }
        System.out.println("Преподаватель " + name + " оценил студента с именем " + nameStudent + " по предмету " +
                subject + " на оценку " + randomName + ".");
    }

}