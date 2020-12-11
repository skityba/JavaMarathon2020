package day11.task1;

public class Picker implements Worker {
    private int salary;
    private boolean isPlayed;
    private Warehouse warehouse;

    public Picker(int salary, boolean isPlayed, Warehouse warehouse) {
        this.salary = salary;
        this.isPlayed = isPlayed;
        this.warehouse = warehouse;
    }

    public void setPlayed(boolean played) {
        isPlayed = played;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPlayed() {
        return isPlayed;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    @Override
    public String toString() {
        if (warehouse.getCountPickedOrders() > 10000 && warehouse.getCountPickedOrders() % 10000 == 0) {
            return "Общий заработок сборщика " + salary +
                    ", бонус уже был выплачен" +
                    ", собрано заказов " + warehouse.getCountPickedOrders();
        } else if (warehouse.getCountPickedOrders() >= 10000) {
            return "Общий заработок сборщика " + salary +
                    ", бонус начислен " +
                    ", собрано заказов " + warehouse.getCountPickedOrders();
        } else {
            return "Общий заработок сборщика " + salary +
                    ", бонус пока недоступен" +
                    ", собрано заказов " + warehouse.getCountPickedOrders();
        }
    }


    public void doWork() {
        salary += SALARYOFPICKER;
        warehouse.setCountPickedOrders(salary / SALARYOFPICKER);
    }

    public void bonus() {
        if (warehouse.getCountPickedOrders() >= 10000) {
            isPlayed = true;
            salary += BONUSOFPICKER;
        }
    }
}

