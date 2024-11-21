package day6;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public int getFuel() {
        return fuel;
    }

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    void info () {
        System.out.println("производитель: " + producer + ", год выпуска: " + year + ", длина: "+ length + ", вес: " + weight + ", количество топлива в баке: " + fuel);
    }

    void fillUp (int additionalFuel){
        fuel += additionalFuel;
    }

}
