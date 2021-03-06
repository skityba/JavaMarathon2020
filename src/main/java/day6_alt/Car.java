package day6_alt;

public class Car {
    private int year;
    private String color;
    private String model;

    public void setYear(int year) {
        if (year < 0) {
            System.out.println("Недопустимое значение года");
        } else {
            this.year = year;
        }
    }

    public int getYear() {
        return year;
    }

    public void setColor(String color) {
        if (color.isEmpty()) {
            System.out.println("Недопустимое значение цвета");
        } else {
            this.color = color;
        }
    }

    public String getColor() {
        return color;
    }

    public void setModel(String model) {
        if (model.isEmpty()) {
            System.out.println("Недопустимое значение модели");
        } else {
            this.model = model;
        }
    }

    public String getModel() {
        return model;
    }

    public int yearDiffirent(int inputYear) {
        return Math.abs((year - inputYear));
    }

    public void info() {
        System.out.println("Это автомобиль");
    }

}
