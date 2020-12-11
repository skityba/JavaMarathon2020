package day11.task1;

public interface Worker {
    int SALARYOFCOURIER = 100;
    int SALARYOFPICKER = 80;
    int BONUSOFCOURIER = 50000;
    int BONUSOFPICKER = 70000;

    public void doWork();

    public void bonus();
}
