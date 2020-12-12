package day11.task1;

public class Picker implements Worker {
    private int salary;
    private boolean isPlayed;
    private Warehouse warehouse;
    private String bonusResult = null;

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
                bonusResult = ", бонус уже был выплачен";
            } else if (warehouse.getCountPickedOrders() >= 10000) {
                bonusResult = ", бонус начислен ";
            } else {
                bonusResult = ", бонус пока недоступен";
            }
            return "Общий заработок сборщика " + salary +
                    bonusResult +
                    ", развезено заказов " + warehouse.getCountPickedOrders();
        }

    public void doWork() {
        salary += SALARYOFPICKER;
        warehouse.setCountPickedOrders(warehouse.getCountPickedOrders() + 1);
    }

    public void bonus() {
        if (warehouse.getCountPickedOrders() >= 10000) {
            isPlayed = true;
            salary += BONUSOFPICKER;
        }
    }
}

