package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse(0, 0);
        Warehouse warehouse2 = new Warehouse(0, 0);
        Picker picker = new Picker(0, false, warehouse);
        Courier courier = new Courier(0, false, warehouse);
        Picker picker2 = new Picker(0, false, warehouse2);
        Courier courier2 = new Courier(0, false, warehouse2);

        businessProcess(picker);
        businessProcess(courier);
        picker2.doWork();
        System.out.println(picker2.toString());
        courier2.doWork();
        System.out.println(courier2.toString());


    }

    static void businessProcess(Worker worker) {

        for (int i = 0; i < 20000; i++) {
            worker.doWork();
        }
        worker.bonus();
        System.out.println(worker);
    }
}


