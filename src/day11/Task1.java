package day11;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Courier courier = new Courier(warehouse);
        Picker picker = new Picker(warehouse);

        for (int i = 0; i < 1499; i++) {
            courier.doWork();
            picker.doWork();
            courier.bonus();
            picker.bonus();
        }
        System.out.println(warehouse);
        System.out.println(courier.getSalary());
        System.out.println(picker.getSalary());

        Warehouse warehouse1 = new Warehouse();
        Courier courier1 = new Courier(warehouse1);
        Picker picker1 = new Picker(warehouse1);
        courier1.doWork();
        picker1.doWork();
        courier1.bonus();
        picker1.bonus();


        System.out.println(warehouse1);
        System.out.println(courier1.getSalary());
        System.out.println(picker1.getSalary());



        System.out.println(warehouse);
        System.out.println(courier.getSalary());
        System.out.println(picker.getSalary());
    }
}
