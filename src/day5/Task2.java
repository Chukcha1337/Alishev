package day5;

public class Task2 {
    public static void main(String[] args) {

        Motorbike bike = new Motorbike(2019, "Ducatti", "green");
        System.out.println(bike.getYear());
        System.out.println(bike.getModel());
        System.out.println(bike.getColor());

        Motorbike bike2 = new Motorbike(2020, "Popo", "blue");
        System.out.println(bike2.getYear());
        System.out.println(bike2.getModel());
        System.out.println(bike2.getColor());
    }
}
