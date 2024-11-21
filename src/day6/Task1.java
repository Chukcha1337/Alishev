package day6;


public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("Red");
        car.setYear(2010);
        car.setModel("BMW");
        car.info();
        System.out.println(car.yearDifference(2024));

        Motorbike bike = new Motorbike(2019, "Ducatti", "green");
        bike.info();
        System.out.println(bike.yearDifference(2024));

    }
}
