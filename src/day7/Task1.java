package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane plane1 = new Airplane("Boeing", 2010,45, 30);
        Airplane plane2 = new Airplane("Airbus", 2011,48, 28);
        Airplane.compareAirplanes(plane1, plane2);
    }
}
