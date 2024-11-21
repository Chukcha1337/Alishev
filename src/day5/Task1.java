package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("Red");
        car.setYear(2010);
        car.setModel("BMW");
        System.out.println(car.getYear());
        System.out.println(car.getModel());
        System.out.println(car.getColor());

    }
}
