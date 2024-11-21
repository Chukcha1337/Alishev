package day6;

public class Motorbike {
    private int year;
    private String model;
    private String color = "red";

    public Motorbike(int year, String model, String color) {
        this.year = year;
        this.model = model;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
    public void info(){
        System.out.println("It is a motorbike");
    }
    int yearDifference (int differenceYear ){
        return differenceYear - year;
    }
}
