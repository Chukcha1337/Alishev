package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane plane = new Airplane("Boeing", 2010, 205, 20);
        plane.setLength(216);
        plane.setYear(2005);
        plane.fillUp(20);
        plane.fillUp(34);
        plane.info();
    }
}
