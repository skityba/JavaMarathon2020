package day11.task1;

public class Courier implements Worker {
    private int salary;
    private boolean isPlayed;
    private Warehouse warehouse;

    public Courier(int salary, boolean isPlayed, Warehouse warehouse) {
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

        if (warehouse.getCountDeliveredOrders() > 10000 && warehouse.getCountDeliveredOrders() % 10000 == 0) {
            return "Общий заработок курьера " + salary +
                    ", бонус уже был выплачен" +
                    ", развезено заказов " + warehouse.getCountDeliveredOrders();
        } else if (warehouse.getCountDeliveredOrders() >= 10000) {
            return "Общий заработок курьера " + salary +
                    ", бонус начислен " +
                    ", развезено заказов " + warehouse.getCountDeliveredOrders();
        } else {
            return "Общий заработок курьера " + salary +
                    ", бонус пока недоступен" +
                    ", развезено заказов " + warehouse.getCountDeliveredOrders();
        }
    }

    public void doWork() {
        salary += SALARYOFCOURIER;
        warehouse.setCountDeliveredOrders(salary / SALARYOFCOURIER);
    }

    public void bonus() {
        if (warehouse.getCountDeliveredOrders() >= 10000) {
            isPlayed = true;
            salary = salary + BONUSOFCOURIER;
        }
    }
}
