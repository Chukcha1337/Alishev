package day6;

public class Car {
    private int year;
    private String model;
    private String color;

    public void setYear(int year) {
        this.year = year;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getYear() {
        return this.year;
    }
    public String getModel() {
        return this.model;
    }
    public String getColor() {
        return this.color;
    }

    public void info(){
        System.out.println("It is a car");
    }
    int yearDifference (int differenceYear ){
        return differenceYear - year;
    }
}
