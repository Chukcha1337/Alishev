package day9.task2;

public class Triangle extends Figure{
    private double firstSide;
    private double secondSide;
    private double thirdSide;


    public Triangle(String color, double firstSide, double secondSide, double thirdSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }
    @Override
    public double perimeter() {
        return firstSide + secondSide + thirdSide;
    }
    @Override
    public double area() {
        return Math.sqrt((this.perimeter()/2) * ((this.perimeter()/2) - firstSide ) *
                ((this.perimeter()/2) - secondSide ) *((this.perimeter()/2) - thirdSide ) );
    }
}
